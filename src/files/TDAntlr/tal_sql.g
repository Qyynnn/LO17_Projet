grammar tal_sql;
//SELECT
SELECT : 'vouloir'
;
// Colonne √† s√©lecter
ARTICLE : 'article'
;

BULLETIN : 'bulletin'
;

AUTEUR : 'auteur'
	;
// Contraints
TITRE : 'titre'
;
	
RUBRIQUE : 'rubrique'
;

NOMBRE	:'nombre'
	;

STR_MOIS	:	'mois'
	;

	
MOT : 'mot'
;

DATE :	'date'
;

NUMERO	:'num®¶ro'
;


MONTH : 'janvier' | 'fevrier'| 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre'
;


DIGIT4	:	DIGIT DIGIT DIGIT DIGIT
;

DIGIT2	:	DIGIT DIGIT
;

INT : DIGIT+
;


VAR_DATE :  (DIGIT2' '(DIGIT2|MONTH)' 'DIGIT4)|(DIGIT2'/'(DIGIT2|MONTH)'/'DIGIT4)|((MONTH|DIGIT2)'/'DIGIT4)|((MONTH|DIGIT2)' 'DIGIT4)
;


// Autres param√®tres
CONJ : 'et' | 'ou'
;

EN : 'en'
	;

DANS :'dans'
	;

PONC : '.'|'?'
;


WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR : ('a'..'z'|'®¶'|'®®'|'®§'|'®π')+
;

fragment DIGIT  : ('0' .. '9');

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete PONC
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;




requete returns [Arbre req_arbre = new Arbre("")]
	scope {String tableNames;}
	@init {Arbre ps_arbre;Arbre tableArbre=new Arbre("");} : 
		{$requete::tableNames="";}
		SELECT* 
			{
				req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
			}
		(((ARTICLE 
		| BULLETIN)
			{
				
				req_arbre.ajouteFils(new Arbre("","tt.fichier,tt.rubrique"));
				
			})
		|(AUTEUR
			{
				req_arbre.ajouteFils(new Arbre("","email"));
			})
		|(NOMBRE
		ARTICLE
			{
				req_arbre.ajouteFils(new Arbre("","COUNT(*)"));
			}
		))
			{
				req_arbre.ajouteFils(new Arbre("","FROM"));
				req_arbre.ajouteFils(tableArbre);
				req_arbre.ajouteFils(new Arbre("","WHERE"));
			}
		ps = params 
			{
				String result="titretexte tt";
				if (!$requete::tableNames.isEmpty()){
					ArrayList<String> tab=new ArrayList(Arrays.asList($requete::tableNames.trim().split(" ")));
					if (tab.size()>0){
						int ind=1;
						if (tab.contains("titre")){
							result="titre tt";
							tab.remove("titre");
						}
						for (String s: tab){
							result+=" INNER JOIN "+s+" t"+ind+" ON tt.numero=t"+ind+".numero ";
							ind++;
						}
					}				
					
				}	
				tableArbre.mot=result;
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);		
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par_arbre;int flag=0;String conj="";} : 
		((c=CONJ
				{
					conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
				})?
		(par= motEnTitreParam
		|par = dateParam
		|par = motParam
		|par=rubriqueParam
		|par=numeroParam
		)
				{
				par_arbre = $par.lepar_arbre;
				if(flag==1){
					les_pars_arbre.ajouteFils(new Arbre("", conj.isEmpty()?"AND":conj));
				}
				flag=1;
				les_pars_arbre.ajouteFils(par_arbre);
				conj="";
				}
		)+
;


numeroParam returns [Arbre lepar_arbre = new Arbre("")]:
		NUMERO
		value = (INT|DIGIT2|DIGIT4)
			{
				lepar_arbre.ajouteFils(new Arbre("", "tt.numero = '"+value.getText()+"'"));		
			}
			;
		
rubriqueParam returns [Arbre lepar_arbre = new Arbre("")]:
		(DANS|EN)?
		RUBRIQUE
		value = VAR+
			{
				lepar_arbre.ajouteFils(new Arbre("", "("));	
				lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));		
			}
		(c=CONJ 
		value = VAR+
			{
				String conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
				lepar_arbre.ajouteFils(new Arbre("", conj));	
				lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));		
			})*
			{
				lepar_arbre.ajouteFils(new Arbre("", ")"));	
			}
		;
		
motParam returns [Arbre lepar_arbre = new Arbre("")]:
		MOT
		value = VAR+
			{
				lepar_arbre.ajouteFils(new Arbre("", "("));	
				lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));		
			}
		(c=CONJ 
		value = VAR+
			{
				String conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
				lepar_arbre.ajouteFils(new Arbre("", conj));	
				lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));		
			})*
			{
				lepar_arbre.ajouteFils(new Arbre("", ")"));	
			}
			;

	
dateParam returns [Arbre lepar_arbre = new Arbre("")]:
	DATE?
	(EN|STR_MOIS)?
	value=(VAR_DATE|DIGIT4|MONTH)
	{
		String[] dateStr=value.getText().trim().replace(" ","/")
			.replace("janvier","01")
			.replace("fevrier","02")
			.replace("mars","03")
			.replace("avril","04")
			.replace("mai","05")
			.replace("juin","06")
			.replace("juillet","07")
			.replace("aout","08")
			.replace("septembre","09")
			.replace("octobre","10")
			.replace("novembre","11")
			.replace("decembre","12")
			.split("/");
		int n=dateStr.length;
		String annee;
		String jour;
		String mois;
		switch(n){
			case 1:
				if (dateStr[0].length()==4){
					annee=dateStr[0];
					lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
				}
				else{
					mois=dateStr[0];
					lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
				}
				break;
			case 2:
				if (dateStr[1].length()==4){
					annee=dateStr[1];
					mois=dateStr[0];
					lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
					lepar_arbre.ajouteFils(new Arbre("","AND"));
					lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
				}
				else{
					mois=dateStr[1];
					jour=dateStr[0];
					lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
					lepar_arbre.ajouteFils(new Arbre("","AND"));
					lepar_arbre.ajouteFils(new Arbre("", "jour = '"+jour+"'"));
				}
				break;
			default:
				annee=dateStr[2];
				mois=dateStr[1];
				jour=dateStr[0];
				lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
				lepar_arbre.ajouteFils(new Arbre("","AND"));
				lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
				lepar_arbre.ajouteFils(new Arbre("","AND"));
				lepar_arbre.ajouteFils(new Arbre("", "jour = '"+jour+"'"));
				break;
		}
		if (!$requete::tableNames.contains("date")){
			$requete::tableNames+= " date";
		}	
	};
	
motEnTitreParam returns [Arbre lepar_arbre = new Arbre("")]:
		((TITRE
		MOT+
		value = VAR+)
		|
		(MOT+
		value=VAR+
		(EN|DANS)
		TITRE))
			{
				lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));
				if (!$requete::tableNames.contains("titre")){
					$requete::tableNames+= " titre";
				}	
			}
			;
