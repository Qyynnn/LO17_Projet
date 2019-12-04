// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g 2019-12-04 13:03:56

package GenerationSQL;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "AUTEUR", 
		"BULLETIN", "CONJ", "DATE", "JOUR", "MOIS", "MOT", "POINT", "RUBRIQUE", 
		"SELECT", "TITRE", "VAR", "VAR_DATE", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int AUTEUR=6;
	public static final int BULLETIN=7;
	public static final int CONJ=8;
	public static final int DATE=9;
	public static final int JOUR=10;
	public static final int MOIS=11;
	public static final int MOT=12;
	public static final int POINT=13;
	public static final int RUBRIQUE=14;
	public static final int SELECT=15;
	public static final int TITRE=16;
	public static final int VAR=17;
	public static final int VAR_DATE=18;
	public static final int WS=19;

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
	@Override public String getGrammarFileName() { return "/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:54:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:55:25: (r= requete POINT )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:56:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes329);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes331); 

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



	// $ANTLR start "requete"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:63:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE | BULLETIN | AUTEUR ) ( MOT )? ps= params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;Arbre tableArbre=new Arbre("");
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:64:57: ( SELECT ( ARTICLE | BULLETIN | AUTEUR ) ( MOT )? ps= params )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:65:3: SELECT ( ARTICLE | BULLETIN | AUTEUR ) ( MOT )? ps= params
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete358); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:69:3: ( ARTICLE | BULLETIN | AUTEUR )
			int alt1=3;
			switch ( input.LA(1) ) {
			case ARTICLE:
				{
				alt1=1;
				}
				break;
			case BULLETIN:
				{
				alt1=2;
				}
				break;
			case AUTEUR:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:69:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete370); 

								req_arbre.ajouteFils(new Arbre("","article"));
								
					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:73:6: BULLETIN
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete382); 

								req_arbre.ajouteFils(new Arbre("","bulletin"));
								
					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:77:6: AUTEUR
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete394); 

								req_arbre.ajouteFils(new Arbre("","auteur"));
								
					}
					break;

			}

			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:81:3: ( MOT )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==MOT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:81:4: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_requete406); 

									tableArbre=new Arbre("","FROM ");
									req_arbre.ajouteFils(tableArbre);
									req_arbre.ajouteFils(new Arbre("","WHERE"));
								
					}
					break;

			}

			pushFollow(FOLLOW_params_in_requete421);
			ps=params();
			state._fsp--;


							ps_arbre = ps;
							
							
							tableArbre.mot+=ps.table.trim().replace(" "," INNER JOIN ");
							req_arbre.ajouteFils(ps_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params"
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:97:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( (conj= CONJ |mot= MOT )+ par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token conj=null;
		Token mot=null;
		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:98:40: (par1= param ( (conj= CONJ |mot= MOT )+ par2= param )* )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:99:3: par1= param ( (conj= CONJ |mot= MOT )+ par2= param )*
			{
			pushFollow(FOLLOW_param_in_params453);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
							les_pars_arbre.table+=par1_arbre.table;
						
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:105:3: ( (conj= CONJ |mot= MOT )+ par2= param )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CONJ||LA4_0==MOT) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:105:4: (conj= CONJ |mot= MOT )+ par2= param
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:105:4: (conj= CONJ |mot= MOT )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=3;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==CONJ) ) {
							alt3=1;
						}
						else if ( (LA3_0==MOT) ) {
							alt3=2;
						}

						switch (alt3) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:105:5: conj= CONJ
							{
							conj=(Token)match(input,CONJ,FOLLOW_CONJ_in_params469); 
							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:105:19: mot= MOT
							{
							mot=(Token)match(input,MOT,FOLLOW_MOT_in_params477); 
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					pushFollow(FOLLOW_param_in_params487);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									if(conj.getText().equals("et")){
										les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									}
									else if(conj.getText().equals("ou")){
										les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									}
									les_pars_arbre.ajouteFils(par2_arbre);
									if (!les_pars_arbre.table.contains(par2_arbre.table)){
										les_pars_arbre.table+=par2_arbre.table;
									}	
								
					}
					break;

				default :
					break loop4;
				}
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
	// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:123:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ( ( BULLETIN b= VAR ) | ( RUBRIQUE b= VAR ) | ( TITRE b= VAR ) | ( DATE b= VAR_DATE ) | VAR ) ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token b=null;
		Token a=null;

		try {
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:123:50: (a= ( ( BULLETIN b= VAR ) | ( RUBRIQUE b= VAR ) | ( TITRE b= VAR ) | ( DATE b= VAR_DATE ) | VAR ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:124:2: a= ( ( BULLETIN b= VAR ) | ( RUBRIQUE b= VAR ) | ( TITRE b= VAR ) | ( DATE b= VAR_DATE ) | VAR )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:124:6: ( ( BULLETIN b= VAR ) | ( RUBRIQUE b= VAR ) | ( TITRE b= VAR ) | ( DATE b= VAR_DATE ) | VAR )
			int alt5=5;
			switch ( input.LA(1) ) {
			case BULLETIN:
				{
				alt5=1;
				}
				break;
			case RUBRIQUE:
				{
				alt5=2;
				}
				break;
			case TITRE:
				{
				alt5=3;
				}
				break;
			case DATE:
				{
				alt5=4;
				}
				break;
			case VAR:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:125:3: ( BULLETIN b= VAR )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:125:3: ( BULLETIN b= VAR )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:125:4: BULLETIN b= VAR
					{
					a=(Token)match(input,BULLETIN,FOLLOW_BULLETIN_in_param519); 
					b=(Token)match(input,VAR,FOLLOW_VAR_in_param525); 
					}

					lepar_arbre.ajouteFils(new Arbre("bulletin =", "'"+b.getText()+"'"));lepar_arbre.table="bulletin ";
					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:127:4: ( RUBRIQUE b= VAR )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:127:4: ( RUBRIQUE b= VAR )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:127:5: RUBRIQUE b= VAR
					{
					a=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_param538); 
					b=(Token)match(input,VAR,FOLLOW_VAR_in_param544); 
					}

					lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+b.getText()+"'"));lepar_arbre.table="rubrique ";
					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:129:4: ( TITRE b= VAR )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:129:4: ( TITRE b= VAR )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:129:5: TITRE b= VAR
					{
					a=(Token)match(input,TITRE,FOLLOW_TITRE_in_param557); 
					b=(Token)match(input,VAR,FOLLOW_VAR_in_param563); 
					}

					lepar_arbre.ajouteFils(new Arbre("titre =", "'"+b.getText()+"'"));lepar_arbre.table="titre ";
					}
					break;
				case 4 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:131:4: ( DATE b= VAR_DATE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:131:4: ( DATE b= VAR_DATE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:131:5: DATE b= VAR_DATE
					{
					a=(Token)match(input,DATE,FOLLOW_DATE_in_param575); 
					b=(Token)match(input,VAR_DATE,FOLLOW_VAR_DATE_in_param581); 
					}

					lepar_arbre.ajouteFils(new Arbre("date =", "'"+b.getText()+"'"));lepar_arbre.table="date ";
					}
					break;
				case 5 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:133:4: VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param593); 
					 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));lepar_arbre.table="mot ";
					}
					break;

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



	public static final BitSet FOLLOW_requete_in_listerequetes329 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete358 = new BitSet(new long[]{0x00000000000000E0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete370 = new BitSet(new long[]{0x0000000000035280L});
	public static final BitSet FOLLOW_BULLETIN_in_requete382 = new BitSet(new long[]{0x0000000000035280L});
	public static final BitSet FOLLOW_AUTEUR_in_requete394 = new BitSet(new long[]{0x0000000000035280L});
	public static final BitSet FOLLOW_MOT_in_requete406 = new BitSet(new long[]{0x0000000000034280L});
	public static final BitSet FOLLOW_params_in_requete421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params453 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_CONJ_in_params469 = new BitSet(new long[]{0x0000000000035380L});
	public static final BitSet FOLLOW_MOT_in_params477 = new BitSet(new long[]{0x0000000000035380L});
	public static final BitSet FOLLOW_param_in_params487 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_BULLETIN_in_param519 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_VAR_in_param525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_param538 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_VAR_in_param544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITRE_in_param557 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_VAR_in_param563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_param575 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_DATE_in_param581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param593 = new BitSet(new long[]{0x0000000000000002L});
}
