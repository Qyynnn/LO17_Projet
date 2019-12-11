grammar tal_sql;

//SELECT
SELECT : 'vouloir'
;
// Colonne à sélecter
ARTICLE : 'article'
;

BULLETIN : 'bulletin'
;

// Contraints
TITRE 	: 'titre'
;
	
RUBRIQUE : 'rubrique'
;

MOT : 'mot'
;

DATE :	'date'
;
 
MOIS : 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre'
;

ANNEE : ('0'..'9')('0'..'9')('0'..'9')('0'..'9')
;

JOUR :	(('0'..'2')?('0'..'9'))|'30'|'31'
;

VAR_DATE :  (JOUR' 'MOIS' 'ANNEE)|(JOUR'/'(('0'?('1'..'9'))|'10'|'11'|'12')'/'ANNEE)
;
// Autres paramètres
CONJ : 'et' | 'ou'
;

POINT : '.'
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
	scope{String tableNames;}
	@init {Arbre ps_arbre;Arbre tableArbre=new Arbre("");} : 
		SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
			} 
		selectItem =(ARTICLE | BULLETIN | RUBRIQUE)
			{
				req_arbre.ajouteFils(new Arbre("tt.fichier"));
				req_arbre.ajouteFils(new Arbre("","FROM"));
				req_arbre.ajouteFils(tableArbre);
				req_arbre.ajouteFils(new Arbre("","WHERE"));
				$requete::tableNames="";
			}
		
		ps = params 
			{
				String[] split=$requete::tableNames.trim().split(" ");
				boolean first=true;
				String result="titretexte tt";
				ArrayList<String> tab=new ArrayList<>();
				for (String s : split){
					String tabName;
					switch(s){
						case "auteur":
							tabName="auteur";
							break;
						case "date":
							tabName="date";
							break;
						default:
							tabName="";
							break;
					}	
					if (!tabName.isEmpty() && !tab.contains(tabName)){
						tab.add(tabName);
					}
				}
				if (tab.size()>0){
					int ind=1;
					for (String s: tab){
						result+=" INNER JOIN "+s+" t"+ind+" ON tt.numero=t"+ind+".numero ";
						ind++;
					}
				}				
				tableArbre.mot=result;
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;int flag=0;} : 
		(par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				if(flag==1){
					les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				}
				flag=1;
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)+
;


param returns [Arbre lepar_arbre = new Arbre("")]:
		key=(BULLETIN| RUBRIQUE| TITRE| DATE| MOT)
		value = (VAR|VAR_DATE|ANNEE)
			{
				lepar_arbre.ajouteFils(new Arbre(key.getText()+" = ", "'"+value.getText()+"'"));
				if (!$requete::tableNames.contains(key.getText())){
					$requete::tableNames+= ' '+key.getText();
				}
				
			}
		;
			

