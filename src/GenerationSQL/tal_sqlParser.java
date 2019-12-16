// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g 2019-12-16 12:29:04
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
		"CONJ", "DANS", "DATE", "EN", "JOUR", "MOIS", "MOT", "POINT", "RUBRIQUE", 
		"SELECT", "TITRE", "VAR", "VAR_DATE", "WS"
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
	public static final int POINT=14;
	public static final int RUBRIQUE=15;
	public static final int SELECT=16;
	public static final int TITRE=17;
	public static final int VAR=18;
	public static final int VAR_DATE=19;
	public static final int WS=20;

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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:58:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:59:25: (r= requete POINT )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:60:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes361);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes363); 

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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:70:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE | BULLETIN | RUBRIQUE ) ps= params ;
	public final Arbre requete() throws RecognitionException {
		requete_stack.push(new requete_scope());
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;Arbre tableArbre=new Arbre("");
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:72:57: ( SELECT ( ARTICLE | BULLETIN | RUBRIQUE ) ps= params )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:73:3: SELECT ( ARTICLE | BULLETIN | RUBRIQUE ) ps= params
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete397); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
						
			if ( (input.LA(1) >= ARTICLE && input.LA(1) <= BULLETIN)||input.LA(1)==RUBRIQUE ) {
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
							requete_stack.peek().tableNames ="";
						
			pushFollow(FOLLOW_params_in_requete440);
			ps=params();
			state._fsp--;


							ArrayList<String> tab=new ArrayList(Arrays.asList(requete_stack.peek().tableNames.trim().split(" ")));
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:109:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : (par= motEnTitreParam |par= dateParam |par= motParam )+ ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par =null;

		Arbre par_arbre;int flag=0;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:110:38: ( (par= motEnTitreParam |par= dateParam |par= motParam )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:111:3: (par= motEnTitreParam |par= dateParam |par= motParam )+
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:111:3: (par= motEnTitreParam |par= dateParam |par= motParam )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=4;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:112:3: par= motEnTitreParam
					{
					pushFollow(FOLLOW_motEnTitreParam_in_params475);
					par=motEnTitreParam();
					state._fsp--;


								par_arbre = par;
									if(flag==1){
										les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									}
									flag=1;
									les_pars_arbre.ajouteFils(par_arbre);
							
					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:120:4: par= dateParam
					{
					pushFollow(FOLLOW_dateParam_in_params485);
					par=dateParam();
					state._fsp--;


									par_arbre = par;
									if(flag==1){
										les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									}
									flag=1;
									les_pars_arbre.ajouteFils(par_arbre);
								
					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:129:4: par= motParam
					{
					pushFollow(FOLLOW_motParam_in_params499);
					par=motParam();
					state._fsp--;


									par_arbre = par;
									if(flag==1){
										les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									}
									flag=1;
									les_pars_arbre.ajouteFils(par_arbre);
							
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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



	// $ANTLR start "motParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:148:1: motParam returns [Arbre lepar_arbre = new Arbre(\"\")] : MOT (value= VAR )+ ;
	public final Arbre motParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:148:53: ( MOT (value= VAR )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:149:3: MOT (value= VAR )+
			{
			match(input,MOT,FOLLOW_MOT_in_motParam528); 
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:150:9: (value= VAR )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:150:9: value= VAR
					{
					value=(Token)match(input,VAR,FOLLOW_VAR_in_motParam536); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}


							lepar_arbre.ajouteFils(new Arbre("", "mot = '"+value.getText()+"'"));
							if (!requete_stack.peek().tableNames.contains("mot")){
								requete_stack.peek().tableNames+= " titretexte";
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
	// $ANTLR end "motParam"



	// $ANTLR start "dateParam"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:159:1: dateParam returns [Arbre lepar_arbre = new Arbre(\"\")] : key= DATE value= ( VAR_DATE | ANNEE ) ;
	public final Arbre dateParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token key=null;
		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:159:54: (key= DATE value= ( VAR_DATE | ANNEE ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:160:2: key= DATE value= ( VAR_DATE | ANNEE )
			{
			key=(Token)match(input,DATE,FOLLOW_DATE_in_dateParam560); 
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
					if (!requete_stack.peek().tableNames.contains(key.getText())){
						requete_stack.peek().tableNames+= ' '+key.getText();
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:195:1: motEnTitreParam returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) );
	public final Arbre motEnTitreParam() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:195:60: ( ( TITRE ( MOT )+ (value= VAR )+ ) | ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==TITRE) ) {
				alt7=1;
			}
			else if ( (LA7_0==MOT) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:196:3: ( TITRE ( MOT )+ (value= VAR )+ )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:196:3: ( TITRE ( MOT )+ (value= VAR )+ )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:196:4: TITRE ( MOT )+ (value= VAR )+
					{
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam585); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:197:3: ( MOT )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==MOT) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:197:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam589); 
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:198:9: (value= VAR )+
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
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:198:9: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam598); 
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:200:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:200:3: ( ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:200:4: ( MOT )+ (value= VAR )+ ( EN | DANS ) TITRE
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:200:4: ( MOT )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==MOT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:200:4: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_motEnTitreParam609); 
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:201:8: (value= VAR )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==VAR) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:201:8: value= VAR
							{
							value=(Token)match(input,VAR,FOLLOW_VAR_in_motEnTitreParam616); 
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					if ( input.LA(1)==DANS||input.LA(1)==EN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,TITRE,FOLLOW_TITRE_in_motEnTitreParam629); 
					}


									lepar_arbre.ajouteFils(new Arbre("", "titre.mot = '"+value.getText()+"'"));
									if (!requete_stack.peek().tableNames.contains("titre")){
										requete_stack.peek().tableNames+= " titre";
									}	
								
					}
					break;

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
		"\7\uffff";
	static final String DFA1_eofS =
		"\7\uffff";
	static final String DFA1_minS =
		"\1\11\2\uffff\1\15\1\uffff\1\10\1\uffff";
	static final String DFA1_maxS =
		"\1\21\2\uffff\1\22\1\uffff\1\22\1\uffff";
	static final String DFA1_acceptS =
		"\1\uffff\1\4\1\1\1\uffff\1\2\1\uffff\1\3";
	static final String DFA1_specialS =
		"\7\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\4\3\uffff\1\3\1\1\2\uffff\1\2",
			"",
			"",
			"\1\2\4\uffff\1\5",
			"",
			"\1\2\1\6\1\2\2\uffff\2\6\2\uffff\1\6\1\5",
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
			return "()+ loopback of 111:3: (par= motEnTitreParam |par= dateParam |par= motParam )+";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes361 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete397 = new BitSet(new long[]{0x0000000000008060L});
	public static final BitSet FOLLOW_set_in_requete408 = new BitSet(new long[]{0x0000000000022200L});
	public static final BitSet FOLLOW_params_in_requete440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_motEnTitreParam_in_params475 = new BitSet(new long[]{0x0000000000022202L});
	public static final BitSet FOLLOW_dateParam_in_params485 = new BitSet(new long[]{0x0000000000022202L});
	public static final BitSet FOLLOW_motParam_in_params499 = new BitSet(new long[]{0x0000000000022202L});
	public static final BitSet FOLLOW_MOT_in_motParam528 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_motParam536 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_DATE_in_dateParam560 = new BitSet(new long[]{0x0000000000080010L});
	public static final BitSet FOLLOW_set_in_dateParam565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam585 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam589 = new BitSet(new long[]{0x0000000000042000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam598 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_MOT_in_motEnTitreParam609 = new BitSet(new long[]{0x0000000000042000L});
	public static final BitSet FOLLOW_VAR_in_motEnTitreParam616 = new BitSet(new long[]{0x0000000000040500L});
	public static final BitSet FOLLOW_set_in_motEnTitreParam621 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_TITRE_in_motEnTitreParam629 = new BitSet(new long[]{0x0000000000000002L});
}
