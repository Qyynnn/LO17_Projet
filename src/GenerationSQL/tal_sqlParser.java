// $ANTLR 3.5.1 C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g 2019-12-17 01:31:20
package GenerationSQL;
import org.antlr.runtime.*;

import java.util.Arrays;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AUTEUR", "BULLETIN", 
		"CONJ", "DANS", "DATE", "DIGIT", "DIGIT2", "DIGIT4", "EN", "INT", "MONTH", 
		"MOT", "NOMBRE", "NUMERO", "PONC", "RUBRIQUE", "SELECT", "STR_MOIS", "TITRE", 
		"VAR", "VAR_DATE", "WS"
	};
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int AUTEUR=5;
	public static final int BULLETIN=6;
	public static final int CONJ=7;
	public static final int DANS=8;
	public static final int DATE=9;
	public static final int DIGIT=10;
	public static final int DIGIT2=11;
	public static final int DIGIT4=12;
	public static final int EN=13;
	public static final int INT=14;
	public static final int MONTH=15;
	public static final int MOT=16;
	public static final int NOMBRE=17;
	public static final int NUMERO=18;
	public static final int PONC=19;
	public static final int RUBRIQUE=20;
	public static final int SELECT=21;
	public static final int STR_MOIS=22;
	public static final int TITRE=23;
	public static final int VAR=24;
	public static final int VAR_DATE=25;
	public static final int WS=26;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:78:1: listerequetes returns [String sql = \"\"] : r= requete PONC ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:79:25: (r= requete PONC )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:80:3: r= requete PONC
			{
			pushFollow(FOLLOW_requete_in_listerequetes395);
			r=requete();
			state._fsp--;

			match(input,PONC,FOLLOW_PONC_in_listerequetes397); 

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
	// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:90:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )* ( ( ( ARTICLE | BULLETIN ) ) | ( AUTEUR ) | ( NOMBRE ARTICLE ) ) ps= params ;
	public final Arbre requete() throws RecognitionException {
		requete_stack.push(new requete_scope());
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;Arbre tableArbre=new Arbre("");
		try {
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:92:57: ( ( SELECT )* ( ( ( ARTICLE | BULLETIN ) ) | ( AUTEUR ) | ( NOMBRE ARTICLE ) ) ps= params )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:93:3: ( SELECT )* ( ( ( ARTICLE | BULLETIN ) ) | ( AUTEUR ) | ( NOMBRE ARTICLE ) ) ps= params
			{
			requete_stack.peek().tableNames ="";
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:94:3: ( SELECT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==SELECT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:94:3: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete436); 
					}
					break;

				default :
					break loop1;
				}
			}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
						
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:98:3: ( ( ( ARTICLE | BULLETIN ) ) | ( AUTEUR ) | ( NOMBRE ARTICLE ) )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ARTICLE:
			case BULLETIN:
				{
				alt2=1;
				}
				break;
			case AUTEUR:
				{
				alt2=2;
				}
				break;
			case NOMBRE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:98:4: ( ( ARTICLE | BULLETIN ) )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:98:4: ( ( ARTICLE | BULLETIN ) )
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:98:5: ( ARTICLE | BULLETIN )
					{
					if ( input.LA(1)==ARTICLE||input.LA(1)==BULLETIN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

									
									req_arbre.ajouteFils(new Arbre("","tt.fichier,tt.rubrique"));
									
								
					}

					}
					break;
				case 2 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:105:4: ( AUTEUR )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:105:4: ( AUTEUR )
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:105:5: AUTEUR
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete470); 

									req_arbre.ajouteFils(new Arbre("","email"));
								
					}

					}
					break;
				case 3 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:109:4: ( NOMBRE ARTICLE )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:109:4: ( NOMBRE ARTICLE )
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:109:5: NOMBRE ARTICLE
					{
					match(input,NOMBRE,FOLLOW_NOMBRE_in_requete482); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete486); 

									req_arbre.ajouteFils(new Arbre("","COUNT(*)"));
								
					}

					}
					break;

			}


							req_arbre.ajouteFils(new Arbre("","FROM"));
							req_arbre.ajouteFils(tableArbre);
							req_arbre.ajouteFils(new Arbre("","WHERE"));
						
			pushFollow(FOLLOW_params_in_requete509);
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
	// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:144:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : ( (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam ) )+ ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token c=null;
		Arbre par =null;

		Arbre par_arbre;int flag=0;String conj="";
		try {
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:145:53: ( ( (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam ) )+ )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:146:3: ( (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam ) )+
			{
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:146:3: ( (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam ) )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= CONJ && LA5_0 <= DATE)||(LA5_0 >= DIGIT4 && LA5_0 <= EN)||(LA5_0 >= MONTH && LA5_0 <= MOT)||LA5_0==NUMERO||LA5_0==RUBRIQUE||(LA5_0 >= STR_MOIS && LA5_0 <= TITRE)||LA5_0==VAR_DATE) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:146:4: (c= CONJ )? (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:146:4: (c= CONJ )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==CONJ) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:146:5: c= CONJ
							{
							c=(Token)match(input,CONJ,FOLLOW_CONJ_in_params541); 

												conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
											
							}
							break;

					}

					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:150:3: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam )
					int alt4=5;
					alt4 = dfa4.predict(input);
					switch (alt4) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:150:4: par= motEnTitreParam
							{
							pushFollow(FOLLOW_motEnTitreParam_in_params557);
							par=motEnTitreParam();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:151:4: par= dateParam
							{
							pushFollow(FOLLOW_dateParam_in_params566);
							par=dateParam();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:152:4: par= motParam
							{
							pushFollow(FOLLOW_motParam_in_params575);
							par=motParam();
							state._fsp--;

							}
							break;
						case 4 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:153:4: par= rubriqueParam
							{
							pushFollow(FOLLOW_rubriqueParam_in_params582);
							par=rubriqueParam();
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:154:4: par= numeroParam
							{
							pushFollow(FOLLOW_numeroParam_in_params589);
							par=numeroParam();
							state._fsp--;

							}
							break;

					}


									par_arbre = par;
									if(flag==1){
										les_pars_arbre.ajouteFils(new Arbre("", conj.isEmpty()?"AND":conj));
									}
									flag=1;
									les_pars_arbre.ajouteFils(par_arbre);
									conj="";
									
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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
	// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:169:1: numeroParam returns [Arbre lepar_arbre = new Arbre(\"\")] : NUMERO value= ( INT | DIGIT2 | DIGIT4 ) ;
	public final Arbre numeroParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:169:56: ( NUMERO value= ( INT | DIGIT2 | DIGIT4 ) )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:170:3: NUMERO value= ( INT | DIGIT2 | DIGIT4 )
			{
			match(input,NUMERO,FOLLOW_NUMERO_in_numeroParam619); 
			value=input.LT(1);
			if ( (input.LA(1) >= DIGIT2 && input.LA(1) <= DIGIT4)||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:177:1: rubriqueParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( DANS | EN )? RUBRIQUE (value= VAR )+ (c= CONJ (value= VAR )+ )* ;
	public final Arbre rubriqueParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;
		Token c=null;

		try {
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:177:58: ( ( DANS | EN )? RUBRIQUE (value= VAR )+ (c= CONJ (value= VAR )+ )* )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:178:3: ( DANS | EN )? RUBRIQUE (value= VAR )+ (c= CONJ (value= VAR )+ )*
			{
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:178:3: ( DANS | EN )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==DANS||LA6_0==EN) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:
					{
					if ( input.LA(1)==DANS||input.LA(1)==EN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_rubriqueParam666); 
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:180:9: (value= VAR )+
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
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:180:9: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam674); 
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}


							lepar_arbre.ajouteFils(new Arbre("", "("));	
							lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));		
						
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:185:3: (c= CONJ (value= VAR )+ )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==CONJ) ) {
					int LA9_2 = input.LA(2);
					if ( (LA9_2==VAR) ) {
						alt9=1;
					}

				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:185:4: c= CONJ (value= VAR )+
					{
					c=(Token)match(input,CONJ,FOLLOW_CONJ_in_rubriqueParam687); 
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:186:9: (value= VAR )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==VAR) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:186:9: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_rubriqueParam696); 
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}


									String conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
									lepar_arbre.ajouteFils(new Arbre("", conj));	
									lepar_arbre.ajouteFils(new Arbre("", "tt.rubrique = '"+value.getText()+"'"));		
								
					}
					break;

				default :
					break loop9;
				}
			}


							lepar_arbre.ajouteFils(new Arbre("", ")"));	
						
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
	// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:197:1: motParam returns [Arbre lepar_arbre = new Arbre(\"\")] : MOT (value= VAR )+ (c= CONJ (value= VAR )+ )* ;
	public final Arbre motParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;
		Token c=null;

		try {
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:197:53: ( MOT (value= VAR )+ (c= CONJ (value= VAR )+ )* )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:198:3: MOT (value= VAR )+ (c= CONJ (value= VAR )+ )*
			{
			match(input,MOT,FOLLOW_MOT_in_motParam727); 
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:199:9: (value= VAR )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==VAR) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:199:9: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam735); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}


							lepar_arbre.ajouteFils(new Arbre("", "("));	
							lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));		
						
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:204:3: (c= CONJ (value= VAR )+ )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CONJ) ) {
					int LA12_2 = input.LA(2);
					if ( (LA12_2==VAR) ) {
						alt12=1;
					}

				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:204:4: c= CONJ (value= VAR )+
					{
					c=(Token)match(input,CONJ,FOLLOW_CONJ_in_motParam748); 
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:205:9: (value= VAR )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==VAR) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:205:9: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam757); 
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}


									String conj=c.getText().toUpperCase().equals("ET")?"AND":"OR";
									lepar_arbre.ajouteFils(new Arbre("", conj));	
									lepar_arbre.ajouteFils(new Arbre("", "tt.mot = '"+value.getText()+"'"));		
								
					}
					break;

				default :
					break loop12;
				}
			}


							lepar_arbre.ajouteFils(new Arbre("", ")"));	
						
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
	// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:217:1: dateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( DATE )? ( EN | STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) ;
	public final Arbre dateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:217:54: ( ( DATE )? ( EN | STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH ) )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:218:2: ( DATE )? ( EN | STR_MOIS )? value= ( VAR_DATE | DIGIT4 | MONTH )
			{
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:218:2: ( DATE )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==DATE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:218:2: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_dateParam788); 
					}
					break;

			}

			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:219:2: ( EN | STR_MOIS )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==EN||LA14_0==STR_MOIS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:
					{
					if ( input.LA(1)==EN||input.LA(1)==STR_MOIS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			value=input.LT(1);
			if ( input.LA(1)==DIGIT4||input.LA(1)==MONTH||input.LA(1)==VAR_DATE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

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
	// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:283:1: motEnTitreParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) ) ;
	public final Arbre motEnTitreParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:283:60: ( ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) ) )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:284:3: ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) )
			{
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:284:3: ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==TITRE) ) {
				alt19=1;
			}
			else if ( (LA19_0==MOT) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:284:4: ( TITRE ( MOT )+ (value= VAR )+ )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:284:4: ( TITRE ( MOT )+ (value= VAR )+ )
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:284:5: TITRE ( MOT )+ (value= VAR )+
					{
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam827); 
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:285:3: ( MOT )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==MOT) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:285:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam831); 
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:286:9: (value= VAR )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==VAR) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:286:9: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam840); 
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:288:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:288:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:288:4: ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:288:4: ( MOT )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==MOT) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:288:4: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam851); 
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:289:8: (value= VAR )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==VAR) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:289:8: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam858); 
							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					if ( input.LA(1)==DANS||input.LA(1)==EN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam871); 
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


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\13\uffff";
	static final String DFA4_eofS =
		"\13\uffff";
	static final String DFA4_minS =
		"\1\10\1\uffff\1\20\1\uffff\1\14\2\uffff\1\7\1\14\1\uffff\1\24";
	static final String DFA4_maxS =
		"\1\31\1\uffff\1\30\1\uffff\1\31\2\uffff\2\31\1\uffff\1\27";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\1\uffff\1\4\1\5\2\uffff\1\3\1\uffff";
	static final String DFA4_specialS =
		"\13\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\5\1\3\2\uffff\1\3\1\4\1\uffff\1\3\1\2\1\uffff\1\6\1\uffff\1\5\1\uffff"+
			"\1\3\1\1\1\uffff\1\3",
			"",
			"\1\1\7\uffff\1\7",
			"",
			"\1\3\2\uffff\1\3\4\uffff\1\5\4\uffff\1\3",
			"",
			"",
			"\1\11\1\12\1\11\2\uffff\1\11\1\10\1\uffff\2\11\1\uffff\3\11\1\uffff"+
			"\2\11\1\7\1\11",
			"\1\11\2\uffff\1\11\4\uffff\1\11\2\uffff\1\1\1\uffff\1\11",
			"",
			"\1\11\2\uffff\1\1"
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "150:3: (par= motEnTitreParam |par= dateParam |par= motParam |par= rubriqueParam |par= numeroParam )";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes395 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PONC_in_listerequetes397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete436 = new BitSet(new long[]{0x0000000000220070L});
	public static final BitSet FOLLOW_set_in_requete449 = new BitSet(new long[]{0x0000000002D5B380L});
	public static final BitSet FOLLOW_AUTEUR_in_requete470 = new BitSet(new long[]{0x0000000002D5B380L});
	public static final BitSet FOLLOW_NOMBRE_in_requete482 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete486 = new BitSet(new long[]{0x0000000002D5B380L});
	public static final BitSet FOLLOW_params_in_requete509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_in_params541 = new BitSet(new long[]{0x0000000002D5B300L});
	public static final BitSet FOLLOW_motEnTitreParam_in_params557 = new BitSet(new long[]{0x0000000002D5B382L});
	public static final BitSet FOLLOW_dateParam_in_params566 = new BitSet(new long[]{0x0000000002D5B382L});
	public static final BitSet FOLLOW_motParam_in_params575 = new BitSet(new long[]{0x0000000002D5B382L});
	public static final BitSet FOLLOW_rubriqueParam_in_params582 = new BitSet(new long[]{0x0000000002D5B382L});
	public static final BitSet FOLLOW_numeroParam_in_params589 = new BitSet(new long[]{0x0000000002D5B382L});
	public static final BitSet FOLLOW_NUMERO_in_numeroParam619 = new BitSet(new long[]{0x0000000000005800L});
	public static final BitSet FOLLOW_set_in_numeroParam627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_rubriqueParam666 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam674 = new BitSet(new long[]{0x0000000001000082L});
	public static final BitSet FOLLOW_CONJ_in_rubriqueParam687 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_rubriqueParam696 = new BitSet(new long[]{0x0000000001000082L});
	public static final BitSet FOLLOW_MOT_in_motParam727 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_motParam735 = new BitSet(new long[]{0x0000000001000082L});
	public static final BitSet FOLLOW_CONJ_in_motParam748 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_motParam757 = new BitSet(new long[]{0x0000000001000082L});
	public static final BitSet FOLLOW_DATE_in_dateParam788 = new BitSet(new long[]{0x000000000240B000L});
	public static final BitSet FOLLOW_set_in_dateParam802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam827 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam831 = new BitSet(new long[]{0x0000000001010000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam840 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam851 = new BitSet(new long[]{0x0000000001010000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam858 = new BitSet(new long[]{0x0000000001002100L});
	public static final BitSet FOLLOW_set_in_motEnTitreParam863 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam871 = new BitSet(new long[]{0x0000000000000002L});
}
