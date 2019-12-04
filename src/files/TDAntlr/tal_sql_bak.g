grammar tal_sql;

SELECT : 'vouloir'
;

ARTICLE : 'article'
;

BULLETIN : 'bulletin'
;

AUTEUR 	: 'auteur'
;

CONJ : 'et' | 'ou'
;

POINT : '.'
;

RUBRIQUE : 'rubrique'
;

MOT : 'mot' | 'contenir' | 'parler' | 'traiter' | 'porter' | 'écrire'
;

WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;Arbre tableArbre=new Arbre("");} : 
		SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
			} 
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","article"));
			}
		 | BULLETIN
			{
			req_arbre.ajouteFils(new Arbre("","bulletin"));
			}
		 | AUTEUR
		 	{
			req_arbre.ajouteFils(new Arbre("","auteur"));
			})
		
		(MOT
			{
				tableArbre=new Arbre("","FROM ");
				req_arbre.ajouteFils(tableArbre);
				req_arbre.ajouteFils(new Arbre("","WHERE"));
			})?
			
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				tableArbre.mot+=$ps.les_pars_arbre.table.trim().replace(" "," INNER JOIN ");
				req_arbre.ajouteFils(ps_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
				les_pars_arbre.table+=par1_arbre.table;
			}
		((CONJ |MOT)+
		par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
				if (!les_pars_arbre.table.contains(par2_arbre.table)){
					les_pars_arbre.table+=par2_arbre.table;
				}	
			}
		)*
;

param returns [Arbre lepar_arbre = new Arbre("")]:
	a=((BULLETIN b = VAR)?{lepar_arbre.ajouteFils(new Arbre("bulletin =", "'"+b.getText()+"'"));lepar_arbre.table="bulletin ";} 
	|(RUBRIQUE b = VAR)?{lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+b.getText()+"'"));lepar_arbre.table="rubrique ";} 
	|VAR { lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));lepar_arbre.table="mot ";});

