// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g 2019-12-16 19:31:20
package GenerationSQL;
import org.antlr.runtime.*;

import java.util.Arrays;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "BULLETIN", 
		"CONJ", "DANS", "DATE", "EN", "JOUR", "MOIS", "MOT", "NUMERO", "POINT", 
		"RUBRIQUE", "SELECT", "TITRE", "VAR", "VAR_DATE", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int BULLETIN=6;
	public static final int CONJ=7;
	public static final int DANS=8;
	public static final int DATE=9;
	public static final int EN=10;
	public static final int JOUR=11;
	public static final int MOIS=12;
	public static final int MOT=13;
	public static final int NUMERO=14;
	public static final int POINT=15;
	public static final int RUBRIQUE=16;
	public static final int SELECT=17;
	public static final int TITRE=18;
	public static final int VAR=19;
	public static final int VAR_DATE=20;
	public static final int WS=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:59:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:60:25: (r= requete POINT )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:61:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes380);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes382); 

							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"


	protected static class requete_scope {
		String tableNames;
	}
	protected Stack<requete_scope> requete_stack = new Stack<requete_scope>();


	// $ANTLR start "requete"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:71:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE | BULLETIN ) ps= params ;
	public final Arbre requete() throws RecognitionException {
		requete_stack.push(new requete_scope());
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;Arbre tableArbre=new Arbre("");
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:73:57: ( SELECT ( ARTICLE | BULLETIN ) ps= params )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:74:3: SELECT ( ARTICLE | BULLETIN ) ps= params
			{
			requete_stack.peek().tableNames ="";
			match(input,SELECT,FOLLOW_SELECT_in_requete420); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
						
			if ( (input.LA(1) >= ARTICLE && input.LA(1) <= BULLETIN) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

							req_arbre.ajouteFils(new Arbre("","tt.fichier,tt.rubrique"));
							req_arbre.ajouteFils(new Arbre("","FROM"));
							req_arbre.ajouteFils(tableArbre);
							req_arbre.ajouteFils(new Arbre("","WHERE"));
						
			pushFollow(FOLLOW_params_in_requete453);
			ps=params();
			state._fsp--;


							String result="titretexte tt";
							if (!requete_stack.peek().tableNames.isEmpty()){
								ArrayList<String> tab=new ArrayList(Arrays.asList(requete_stack.peek().tableNames.trim().split(" ")));
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
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);		
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			requete_stack.pop();
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:111:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : ( (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam ) )+ ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par =null;

		Arbre par_arbre;int flag=0;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:112:38: ( ( (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam ) )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:113:3: ( (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam ) )+
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:113:3: ( (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam ) )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= DATE && LA2_0 <= EN)||LA2_0==MOT||LA2_0==RUBRIQUE||LA2_0==TITRE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:113:4: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:113:4: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam )
					int alt1=4;
					alt1 = dfa1.predict(input);
					switch (alt1) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:113:5: par= motEnTitreParam
							{
							pushFollow(FOLLOW_motEnTitreParam_in_params486);
							par=motEnTitreParam();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:114:4: par= dateParam
							{
							pushFollow(FOLLOW_dateParam_in_params495);
							par=dateParam();
							state._fsp--;

							}
							break;
						case 3 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:115:4: par= motParam
							{
							pushFollow(FOLLOW_motParam_in_params504);
							par=motParam();
							state._fsp--;

							}
							break;
						case 4 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:116:4: par= rubriqueParam
							{
							pushFollow(FOLLOW_rubriqueParam_in_params511);
							par=rubriqueParam();
							state._fsp--;

							}
							break;

					}


									par_arbre = par;
									if(flag==1){
										les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									}
									flag=1;
									les_pars_arbre.ajouteFils(par_arbre);
									
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "numeroParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:136:1: numeroParam returns [Arbre lepar_arbre = new Arbre(\"\")] : NUMERO (value= VAR )+ ;
	public final Arbre numeroParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:136:56: ( NUMERO (value= VAR )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:137:3: NUMERO (value= VAR )+
			{
			match(input,NUMERO,FOLLOW_NUMERO_in_numeroParam544); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:138:9: (value= VAR )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==VAR) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:138:9: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_numeroParam552); 
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}


							lepar_arbre.ajouteFils(new Arbre("", "tt.numero = '"+value.getText()+"'"));		
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "numeroParam"



	// $ANTLR start "rubriqueParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:144:1: rubriqueParam returns [Arbre lepar_arbre = new Arbre(\"\")] : RUBRIQUE (value= VAR )+ ;
	public final Arbre rubriqueParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:144:58: ( RUBRIQUE (value= VAR )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:145:3: RUBRIQUE (value= VAR )+
			{
			match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_rubriqueParam577); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:146:9: (value= VAR )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==VAR) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:146:9: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam585); 
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}


							lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));		
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "rubriqueParam"



	// $ANTLR start "motParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:152:1: motParam returns [Arbre lepar_arbre = new Arbre(\"\")] : MOT (value= VAR )+ ;
	public final Arbre motParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:152:53: ( MOT (value= VAR )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:153:3: MOT (value= VAR )+
			{
			match(input,MOT,FOLLOW_MOT_in_motParam610); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:154:9: (value= VAR )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==VAR) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:154:9: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam618); 
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}


							lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));		
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "motParam"



	// $ANTLR start "dateParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:160:1: dateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( DATE | EN ) value= ( VAR_DATE | ANNEE ) ;
	public final Arbre dateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:160:54: ( ( DATE | EN ) value= ( VAR_DATE | ANNEE ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:161:2: ( DATE | EN ) value= ( VAR_DATE | ANNEE )
			{
			if ( (input.LA(1) >= DATE && input.LA(1) <= EN) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			value=input.LT(1);
			if ( input.LA(1)==ANNEE||input.LA(1)==VAR_DATE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

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
					if (!requete_stack.peek().tableNames.contains("date")){
						requete_stack.peek().tableNames+= " date";
					}	
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "dateParam"



	// $ANTLR start "motEnTitreParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:196:1: motEnTitreParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) ) ;
	public final Arbre motEnTitreParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:196:60: ( ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:197:3: ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:197:3: ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==TITRE) ) {
				alt10=1;
			}
			else if ( (LA10_0==MOT) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:197:4: ( TITRE ( MOT )+ (value= VAR )+ )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:197:4: ( TITRE ( MOT )+ (value= VAR )+ )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:197:5: TITRE ( MOT )+ (value= VAR )+
					{
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam670); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:198:3: ( MOT )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==MOT) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:198:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam674); 
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:199:9: (value= VAR )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==VAR) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:199:9: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam683); 
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					}

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:201:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:201:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:201:4: ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:201:4: ( MOT )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==MOT) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:201:4: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam694); 
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:202:8: (value= VAR )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==VAR) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:202:8: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam701); 
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					if ( input.LA(1)==DANS||input.LA(1)==EN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam714); 
					}

					}
					break;

			}


							lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));
							if (!requete_stack.peek().tableNames.contains("titre")){
								requete_stack.peek().tableNames+= " titre";
							}	
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "motEnTitreParam"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\10\uffff";
	static final String DFA1_eofS =
		"\10\uffff";
	static final String DFA1_minS =
		"\1\11\1\uffff\1\15\2\uffff\1\10\1\4\1\uffff";
	static final String DFA1_maxS =
		"\1\22\1\uffff\1\23\2\uffff\1\23\1\24\1\uffff";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\1\4\2\uffff\1\3";
	static final String DFA1_specialS =
		"\10\uffff}>";
	static final String[] DFA1_transitionS = {
			"\2\3\2\uffff\1\2\2\uffff\1\4\1\uffff\1\1",
			"",
			"\1\1\5\uffff\1\5",
			"",
			"",
			"\1\1\1\7\1\6\2\uffff\1\7\1\uffff\2\7\1\uffff\1\7\1\5",
			"\1\7\15\uffff\1\1\1\uffff\1\7",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "113:4: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam )";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes380 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete420 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_set_in_requete431 = new BitSet(new long[]{0x0000000000052600L});
	public static final BitSet FOLLOW_params_in_requete453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_motEnTitreParam_in_params486 = new BitSet(new long[]{0x0000000000052602L});
	public static final BitSet FOLLOW_dateParam_in_params495 = new BitSet(new long[]{0x0000000000052602L});
	public static final BitSet FOLLOW_motParam_in_params504 = new BitSet(new long[]{0x0000000000052602L});
	public static final BitSet FOLLOW_rubriqueParam_in_params511 = new BitSet(new long[]{0x0000000000052602L});
	public static final BitSet FOLLOW_NUMERO_in_numeroParam544 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_VAR_in_numeroParam552 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_rubriqueParam577 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam585 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_MOT_in_motParam610 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_VAR_in_motParam618 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_set_in_dateParam640 = new BitSet(new long[]{0x0000000000100010L});
	public static final BitSet FOLLOW_set_in_dateParam649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam670 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam674 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam683 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam694 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam701 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_set_in_motEnTitreParam706 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam714 = new BitSet(new long[]{0x0000000000000002L});
}
