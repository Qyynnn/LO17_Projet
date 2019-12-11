// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g 2019-12-11 13:22:31
package GenerationSQL;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "BULLETIN", 
		"CONJ", "DATE", "JOUR", "MOIS", "MOT", "POINT", "RUBRIQUE", "SELECT", 
		"TITRE", "VAR", "VAR_DATE", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int BULLETIN=6;
	public static final int CONJ=7;
	public static final int DATE=8;
	public static final int JOUR=9;
	public static final int MOIS=10;
	public static final int MOT=11;
	public static final int POINT=12;
	public static final int RUBRIQUE=13;
	public static final int SELECT=14;
	public static final int TITRE=15;
	public static final int VAR=16;
	public static final int VAR_DATE=17;
	public static final int WS=18;

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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:52:25: (r= requete POINT )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:53:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes328);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes330); 

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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:63:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT selectItem= ( ARTICLE | BULLETIN | RUBRIQUE ) ps= params ;
	public final Arbre requete() throws RecognitionException {
		requete_stack.push(new requete_scope());
		Arbre req_arbre =  new Arbre("");


		Token selectItem=null;
		Arbre ps =null;

		Arbre ps_arbre;Arbre tableArbre=new Arbre("");
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:65:57: ( SELECT selectItem= ( ARTICLE | BULLETIN | RUBRIQUE ) ps= params )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:66:3: SELECT selectItem= ( ARTICLE | BULLETIN | RUBRIQUE ) ps= params
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete364); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
						
			selectItem=input.LT(1);
			if ( (input.LA(1) >= ARTICLE && input.LA(1) <= BULLETIN)||input.LA(1)==RUBRIQUE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

							req_arbre.ajouteFils(new Arbre("tt.fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM"));
							req_arbre.ajouteFils(tableArbre);
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							requete_stack.peek().tableNames ="";
						
			pushFollow(FOLLOW_params_in_requete404);
			ps=params();
			state._fsp--;


							String[] split=requete_stack.peek().tableNames.trim().split(" ");
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:115:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : (par2= param )+ ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;int flag=0;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:116:51: ( (par2= param )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:117:3: (par2= param )+
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:117:3: (par2= param )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BULLETIN||LA1_0==DATE||LA1_0==MOT||LA1_0==RUBRIQUE||LA1_0==TITRE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:117:4: par2= param
					{
					pushFollow(FOLLOW_param_in_params437);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									if(flag==1){
										les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									}
									flag=1;
									les_pars_arbre.ajouteFils(par2_arbre);
								
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



	// $ANTLR start "param"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:130:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : key= ( BULLETIN | RUBRIQUE | TITRE | DATE | MOT ) value= ( VAR | VAR_DATE | ANNEE ) ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token key=null;
		Token value=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:130:50: (key= ( BULLETIN | RUBRIQUE | TITRE | DATE | MOT ) value= ( VAR | VAR_DATE | ANNEE ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:131:3: key= ( BULLETIN | RUBRIQUE | TITRE | DATE | MOT ) value= ( VAR | VAR_DATE | ANNEE )
			{
			key=input.LT(1);
			if ( input.LA(1)==BULLETIN||input.LA(1)==DATE||input.LA(1)==MOT||input.LA(1)==RUBRIQUE||input.LA(1)==TITRE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			value=input.LT(1);
			if ( input.LA(1)==ANNEE||(input.LA(1) >= VAR && input.LA(1) <= VAR_DATE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

							lepar_arbre.ajouteFils(new Arbre(key.getText()+" = ", "'"+value.getText()+"'"));
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
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes328 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete364 = new BitSet(new long[]{0x0000000000002060L});
	public static final BitSet FOLLOW_set_in_requete378 = new BitSet(new long[]{0x000000000000A940L});
	public static final BitSet FOLLOW_params_in_requete404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params437 = new BitSet(new long[]{0x000000000000A942L});
	public static final BitSet FOLLOW_set_in_param464 = new BitSet(new long[]{0x0000000000030010L});
	public static final BitSet FOLLOW_set_in_param486 = new BitSet(new long[]{0x0000000000000002L});
}
