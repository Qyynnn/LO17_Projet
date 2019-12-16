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
 
MOIS : 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre'|
(('0'?('1'..'9'))|'10'|'11'|'12')
;

ANNEE : ('0'..'9')('0'..'9')('0'..'9')('0'..'9')
;

JOUR :	(('0'..'2')?('0'..'9'))|'30'|'31'
;

VAR_DATE :  (JOUR' 'MOIS' 'ANNEE)|(JOUR'/'MOIS'/'ANNEE)
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
		(ARTICLE 
		| BULLETIN 
		| RUBRIQUE)
			{
				req_arbre.ajouteFils(new Arbre("","tt.fichier,tt.rubrique"));
				req_arbre.ajouteFils(new Arbre("","FROM"));
				req_arbre.ajouteFils(tableArbre);
				req_arbre.ajouteFils(new Arbre("","WHERE"));
				$requete::tableNames="";
			}
		
		ps = params 
			{
				ArrayList<String> tab=new ArrayList(Arrays.asList($requete::tableNames.trim().split(" ")));
				String result="titretexte tt";
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
				tableArbre.mot=result;
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par_arbre;int flag=0;} : 
		(
		par= motEnTitreParam{
			par_arbre = $par.lepar_arbre;
				if(flag==1){
					les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				}
				flag=1;
				les_pars_arbre.ajouteFils(par_arbre);
		}
		|par = dateParam
			{
				par_arbre = $par.lepar_arbre;
				if(flag==1){
					les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				}
				flag=1;
				les_pars_arbre.ajouteFils(par_arbre);
			}
		|par = motParam
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
		
motParam returns [Arbre lepar_arbre = new Arbre("")]:
		MOT
		value = VAR+
			{
				lepar_arbre.ajouteFils(new Arbre("", "mot = '"+value.getText()+"'"));
				if (!$requete::tableNames.contains("mot")){
					$requete::tableNames+= " titretexte";
				}			
			}
			;

dateParam returns [Arbre lepar_arbre = new Arbre("")]:
	key=DATE
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
		if (!$requete::tableNames.contains(key.getText())){
			$requete::tableNames+= ' '+key.getText();
		}	
	};
	
motEnTitreParam returns [Arbre lepar_arbre = new Arbre("")]:
		(TITRE
		MOT+
		value = VAR+)
		|
		(MOT+
		value=VAR+
		(EN|DANS)
		TITRE)
			{
				lepar_arbre.ajouteFils(new Arbre("", "titre.mot = '"+value.getText()+"'"));
				if (!$requete::tableNames.contains("titre")){
					$requete::tableNames+= " titre";
				}	
			}
			;
