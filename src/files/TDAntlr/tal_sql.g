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

NUMERO	:	'numéro'
;


MOIS : 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre'
;


INT	:	DIGIT DIGIT
;


VAR_DATE :  (INT' 'INT' 'ANNEE)|(INT'/'MOIS'/'ANNEE)|(MOIS'/'ANNEE)
;
// Autres paramètres
CONJ : 'et' | 'ou'
;

EN 	: 'en'
	;

DANS 	:	'dans'
	;

POINT : '.'
;


WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR 	: ('a'..'z'|'é'|'è'|'ê'|'ù'|'î'|'à'|'û'|'ç'|'ï'|'ü')+
;

DIGIT	:	('0'..'9');

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;




requete returns [Arbre req_arbre = new Arbre("")]
	scope {String tableNames;}
	@init {Arbre ps_arbre;Arbre tableArbre=new Arbre("");} : 
		{$requete::tableNames="";}
		SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
			} 
		(ARTICLE 
		| BULLETIN)
			{
				req_arbre.ajouteFils(new Arbre("","tt.fichier,tt.rubrique"));
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
	@init	{Arbre par_arbre;int flag=0;} : 
		((par= motEnTitreParam
		|par = dateParam
		|par = motParam
		|par=rubriqueParam
		|par=numeroParam
		)
				{
				par_arbre = $par.lepar_arbre;
				if(flag==1){
					les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				}
				flag=1;
				les_pars_arbre.ajouteFils(par_arbre);
				}
		)+
;


/*param returns [Arbre lepar_arbre = new Arbre("")]:
		key= (stringParam|dateParam){
			lepar_arbre.ajouteFils($key.lepar_arbre);
		}
		;*/

numeroParam returns [Arbre lepar_arbre = new Arbre("")]:
		NUMERO
		value = INT
			{
				lepar_arbre.ajouteFils(new Arbre("", "tt.numero = '"+value.getText()+"'"));		
			}
			;
		
rubriqueParam returns [Arbre lepar_arbre = new Arbre("")]:
		RUBRIQUE
		value = VAR+
			{
				lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));		
			}
			;
		
motParam returns [Arbre lepar_arbre = new Arbre("")]:
		MOT
		value = VAR+
			{
				lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));		
			}
			;

dateParam returns [Arbre lepar_arbre = new Arbre("")]:
	(DATE|EN)
	value=(VAR_DATE|ANNEE){
		String[] dateStr=value.getText().trim().replace(" ","/").split("/");
		int n=dateStr.length;
		String annee;
		String jour;
		String mois;
		switch(n){
			case 1:
				annee=dateStr[0];
				lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
				break;
			case 2:
				annee=dateStr[1];
				mois=dateStr[0];
				lepar_arbre.ajouteFils(new Arbre("", "annee = '"+annee+"'"));
				lepar_arbre.ajouteFils(new Arbre("","AND"));
				lepar_arbre.ajouteFils(new Arbre("", "mois = '"+mois+"'"));
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
