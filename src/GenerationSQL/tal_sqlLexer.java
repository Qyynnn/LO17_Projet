// $ANTLR 3.5.1 C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g 2019-12-17 01:31:20
package GenerationSQL;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:3:8: ( 'vouloir' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:3:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:6:9: ( 'article' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:6:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:9:10: ( 'bulletin' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:9:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:12:8: ( 'auteur' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:12:10: 'auteur'
			{
			match("auteur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:15:7: ( 'titre' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:15:9: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:18:10: ( 'rubrique' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:18:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "NOMBRE"
	public final void mNOMBRE() throws RecognitionException {
		try {
			int _type = NOMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:21:8: ( 'nombre' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:21:9: 'nombre'
			{
			match("nombre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOMBRE"

	// $ANTLR start "STR_MOIS"
	public final void mSTR_MOIS() throws RecognitionException {
		try {
			int _type = STR_MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:24:10: ( 'mois' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:24:12: 'mois'
			{
			match("mois"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STR_MOIS"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:28:5: ( 'mot' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:28:7: 'mot'
			{
			match("mot"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:31:6: ( 'date' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:31:8: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:34:8: ( 'num��ro' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:34:9: 'num��ro'
			{
			match("num��ro"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "MONTH"
	public final void mMONTH() throws RecognitionException {
		try {
			int _type = MONTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:7: ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre' )
			int alt1=12;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='a') ) {
					alt1=1;
				}
				else if ( (LA1_1=='u') ) {
					int LA1_10 = input.LA(3);
					if ( (LA1_10=='i') ) {
						int LA1_14 = input.LA(4);
						if ( (LA1_14=='n') ) {
							alt1=6;
						}
						else if ( (LA1_14=='l') ) {
							alt1=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt1=2;
				}
				break;
			case 'm':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='a') ) {
					int LA1_11 = input.LA(3);
					if ( (LA1_11=='r') ) {
						alt1=3;
					}
					else if ( (LA1_11=='i') ) {
						alt1=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='v') ) {
					alt1=4;
				}
				else if ( (LA1_4=='o') ) {
					alt1=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt1=9;
				}
				break;
			case 'o':
				{
				alt1=10;
				}
				break;
			case 'n':
				{
				alt1=11;
				}
				break;
			case 'd':
				{
				alt1=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:9: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:21: 'fevrier'
					{
					match("fevrier"); 

					}
					break;
				case 3 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:32: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:41: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:51: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:59: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:68: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:80: 'aout'
					{
					match("aout"); 

					}
					break;
				case 9 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:89: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:103: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:115: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:38:128: 'decembre'
					{
					match("decembre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MONTH"

	// $ANTLR start "DIGIT4"
	public final void mDIGIT4() throws RecognitionException {
		try {
			int _type = DIGIT4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:42:8: ( DIGIT DIGIT DIGIT DIGIT )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:42:10: DIGIT DIGIT DIGIT DIGIT
			{
			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT4"

	// $ANTLR start "DIGIT2"
	public final void mDIGIT2() throws RecognitionException {
		try {
			int _type = DIGIT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:45:8: ( DIGIT DIGIT )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:45:10: DIGIT DIGIT
			{
			mDIGIT(); 

			mDIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT2"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:48:5: ( ( DIGIT )+ )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:48:7: ( DIGIT )+
			{
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:48:7: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "VAR_DATE"
	public final void mVAR_DATE() throws RecognitionException {
		try {
			int _type = VAR_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:10: ( ( DIGIT2 ' ' ( DIGIT2 | MONTH ) ' ' DIGIT4 ) | ( DIGIT2 '/' ( DIGIT2 | MONTH ) '/' DIGIT4 ) | ( ( MONTH | DIGIT2 ) '/' DIGIT4 ) | ( ( MONTH | DIGIT2 ) ' ' DIGIT4 ) )
			int alt7=4;
			alt7 = dfa7.predict(input);
			switch (alt7) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:13: ( DIGIT2 ' ' ( DIGIT2 | MONTH ) ' ' DIGIT4 )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:13: ( DIGIT2 ' ' ( DIGIT2 | MONTH ) ' ' DIGIT4 )
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:14: DIGIT2 ' ' ( DIGIT2 | MONTH ) ' ' DIGIT4
					{
					mDIGIT2(); 

					match(' '); 
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:23: ( DIGIT2 | MONTH )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
						alt3=1;
					}
					else if ( (LA3_0=='a'||LA3_0=='d'||LA3_0=='f'||LA3_0=='j'||(LA3_0 >= 'm' && LA3_0 <= 'o')||LA3_0=='s') ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:24: DIGIT2
							{
							mDIGIT2(); 

							}
							break;
						case 2 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:31: MONTH
							{
							mMONTH(); 

							}
							break;

					}

					match(' '); 
					mDIGIT4(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:48: ( DIGIT2 '/' ( DIGIT2 | MONTH ) '/' DIGIT4 )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:48: ( DIGIT2 '/' ( DIGIT2 | MONTH ) '/' DIGIT4 )
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:49: DIGIT2 '/' ( DIGIT2 | MONTH ) '/' DIGIT4
					{
					mDIGIT2(); 

					match('/'); 
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:58: ( DIGIT2 | MONTH )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
						alt4=1;
					}
					else if ( (LA4_0=='a'||LA4_0=='d'||LA4_0=='f'||LA4_0=='j'||(LA4_0 >= 'm' && LA4_0 <= 'o')||LA4_0=='s') ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:59: DIGIT2
							{
							mDIGIT2(); 

							}
							break;
						case 2 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:66: MONTH
							{
							mMONTH(); 

							}
							break;

					}

					match('/'); 
					mDIGIT4(); 

					}

					}
					break;
				case 3 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:83: ( ( MONTH | DIGIT2 ) '/' DIGIT4 )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:83: ( ( MONTH | DIGIT2 ) '/' DIGIT4 )
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:84: ( MONTH | DIGIT2 ) '/' DIGIT4
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:84: ( MONTH | DIGIT2 )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='a'||LA5_0=='d'||LA5_0=='f'||LA5_0=='j'||(LA5_0 >= 'm' && LA5_0 <= 'o')||LA5_0=='s') ) {
						alt5=1;
					}
					else if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:85: MONTH
							{
							mMONTH(); 

							}
							break;
						case 2 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:91: DIGIT2
							{
							mDIGIT2(); 

							}
							break;

					}

					match('/'); 
					mDIGIT4(); 

					}

					}
					break;
				case 4 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:109: ( ( MONTH | DIGIT2 ) ' ' DIGIT4 )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:109: ( ( MONTH | DIGIT2 ) ' ' DIGIT4 )
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:110: ( MONTH | DIGIT2 ) ' ' DIGIT4
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:110: ( MONTH | DIGIT2 )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='a'||LA6_0=='d'||LA6_0=='f'||LA6_0=='j'||(LA6_0 >= 'm' && LA6_0 <= 'o')||LA6_0=='s') ) {
						alt6=1;
					}
					else if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:111: MONTH
							{
							mMONTH(); 

							}
							break;
						case 2 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:52:117: DIGIT2
							{
							mDIGIT2(); 

							}
							break;

					}

					match(' '); 
					mDIGIT4(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_DATE"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:57:6: ( 'et' | 'ou' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='e') ) {
				alt8=1;
			}
			else if ( (LA8_0=='o') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:57:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:57:15: 'ou'
					{
					match("ou"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ"

	// $ANTLR start "EN"
	public final void mEN() throws RecognitionException {
		try {
			int _type = EN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:60:4: ( 'en' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:60:6: 'en'
			{
			match("en"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EN"

	// $ANTLR start "DANS"
	public final void mDANS() throws RecognitionException {
		try {
			int _type = DANS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:63:6: ( 'dans' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:63:7: 'dans'
			{
			match("dans"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DANS"

	// $ANTLR start "PONC"
	public final void mPONC() throws RecognitionException {
		try {
			int _type = PONC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:66:6: ( '.' | '?' )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:
			{
			if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PONC"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\t'||LA10_0=='\r'||LA10_0==' '||LA10_0=='d'||LA10_0=='j'||LA10_0=='q') ) {
				alt10=1;
			}
			else if ( (LA10_0=='\n') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt9=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt9=1;
						}
						break;
					case '\t':
						{
						alt9=2;
						}
						break;
					case '\r':
						{
						alt9=3;
						}
						break;
					case 'j':
						{
						alt9=4;
						}
						break;
					case 'q':
						{
						alt9=5;
						}
						break;
					case 'd':
						{
						alt9=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:70:62: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:73:5: ( ( 'a' .. 'z' | '��' | '��' | '��' | '��' )+ )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:73:7: ( 'a' .. 'z' | '��' | '��' | '��' | '��' )+
			{
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:73:7: ( 'a' .. 'z' | '��' | '��' | '��' | '��' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= 'a' && LA11_0 <= 'z')||LA11_0=='\u00E0'||(LA11_0 >= '\u00E8' && LA11_0 <= '\u00E9')||LA11_0=='\u00FC') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00FC' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:76:17: ( ( '0' .. '9' ) )
			// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | AUTEUR | TITRE | RUBRIQUE | NOMBRE | STR_MOIS | MOT | DATE | NUMERO | MONTH | DIGIT4 | DIGIT2 | INT | VAR_DATE | CONJ | EN | DANS | PONC | WS | VAR )
		int alt12=22;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:34: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 5 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:41: TITRE
				{
				mTITRE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:47: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 7 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:56: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 8 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:63: STR_MOIS
				{
				mSTR_MOIS(); 

				}
				break;
			case 9 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:72: MOT
				{
				mMOT(); 

				}
				break;
			case 10 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:76: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:81: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 12 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:88: MONTH
				{
				mMONTH(); 

				}
				break;
			case 13 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:94: DIGIT4
				{
				mDIGIT4(); 

				}
				break;
			case 14 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:101: DIGIT2
				{
				mDIGIT2(); 

				}
				break;
			case 15 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:108: INT
				{
				mINT(); 

				}
				break;
			case 16 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:112: VAR_DATE
				{
				mVAR_DATE(); 

				}
				break;
			case 17 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:121: CONJ
				{
				mCONJ(); 

				}
				break;
			case 18 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:126: EN
				{
				mEN(); 

				}
				break;
			case 19 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:129: DANS
				{
				mDANS(); 

				}
				break;
			case 20 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:134: PONC
				{
				mPONC(); 

				}
				break;
			case 21 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:139: WS
				{
				mWS(); 

				}
				break;
			case 22 :
				// C:\\Users\\Administrator\\IdeaProjects\\LO17_Projet\\src\\files\\TDAntlr\\tal_sql.g:1:142: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA7_eotS =
		"\117\uffff";
	static final String DFA7_eofS =
		"\117\uffff";
	static final String DFA7_minS =
		"\2\60\1\141\1\145\1\141\1\157\1\145\1\143\1\157\1\145\1\40\1\156\1\151"+
		"\1\166\1\151\1\162\1\165\1\160\1\164\1\166\1\143\2\60\1\166\1\154\1\162"+
		"\1\163\1\40\1\151\2\164\1\157\2\145\1\60\1\uffff\1\60\1\uffff\1\151\1"+
		"\40\1\154\1\151\1\40\2\uffff\1\154\1\40\1\145\1\142\2\155\1\40\1\57\3"+
		"\145\1\40\1\155\1\162\2\142\1\162\1\164\1\162\1\142\1\145\2\162\3\40\1"+
		"\162\1\40\3\145\3\40";
	static final String DFA7_maxS =
		"\1\163\1\71\1\165\1\145\1\141\1\166\1\145\1\143\1\157\1\145\1\57\1\156"+
		"\1\151\1\166\2\162\1\165\1\160\1\164\1\166\1\143\2\163\1\166\1\156\1\162"+
		"\1\163\1\57\1\151\2\164\1\157\2\145\1\71\1\uffff\1\71\1\uffff\1\151\1"+
		"\57\1\154\1\151\1\57\2\uffff\1\154\1\57\1\145\1\142\2\155\2\71\3\145\1"+
		"\57\1\155\1\162\2\142\1\162\1\164\1\162\1\142\1\145\2\162\3\57\1\162\1"+
		"\57\3\145\3\57";
	static final String DFA7_acceptS =
		"\43\uffff\1\1\1\uffff\1\2\5\uffff\1\3\1\4\42\uffff";
	static final String DFA7_specialS =
		"\117\uffff}>";
	static final String[] DFA7_transitionS = {
			"\12\1\47\uffff\1\5\2\uffff\1\11\1\uffff\1\3\3\uffff\1\2\2\uffff\1\4\1"+
			"\10\1\7\3\uffff\1\6",
			"\12\12",
			"\1\13\23\uffff\1\14",
			"\1\15",
			"\1\16",
			"\1\20\6\uffff\1\17",
			"\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25\16\uffff\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\33\10\uffff\1\32",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\12\42\47\uffff\1\43\2\uffff\1\43\1\uffff\1\43\3\uffff\1\43\2\uffff"+
			"\3\43\3\uffff\1\43",
			"\12\44\47\uffff\1\45\2\uffff\1\45\1\uffff\1\45\3\uffff\1\45\2\uffff"+
			"\3\45\3\uffff\1\45",
			"\1\46",
			"\1\50\1\uffff\1\47",
			"\1\51",
			"\1\52",
			"\1\54\16\uffff\1\53",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\12\63",
			"",
			"\12\64",
			"",
			"\1\65",
			"\1\54\16\uffff\1\53",
			"\1\66",
			"\1\67",
			"\1\54\16\uffff\1\53",
			"",
			"",
			"\1\70",
			"\1\54\16\uffff\1\53",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\43\17\uffff\12\54",
			"\1\45\12\53",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\54\16\uffff\1\53",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\54\16\uffff\1\53",
			"\1\54\16\uffff\1\53",
			"\1\54\16\uffff\1\53",
			"\1\113",
			"\1\54\16\uffff\1\53",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\54\16\uffff\1\53",
			"\1\54\16\uffff\1\53",
			"\1\54\16\uffff\1\53"
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "52:1: VAR_DATE : ( ( DIGIT2 ' ' ( DIGIT2 | MONTH ) ' ' DIGIT4 ) | ( DIGIT2 '/' ( DIGIT2 | MONTH ) '/' DIGIT4 ) | ( ( MONTH | DIGIT2 ) '/' DIGIT4 ) | ( ( MONTH | DIGIT2 ) ' ' DIGIT4 ) );";
		}
	}

	static final String DFA12_eotS =
		"\1\uffff\14\22\1\51\1\22\2\uffff\1\22\1\uffff\21\22\1\20\3\22\1\106\1"+
		"\uffff\1\107\1\106\1\112\15\22\1\130\1\22\1\132\11\22\2\uffff\1\51\2\uffff"+
		"\1\20\4\22\1\132\6\22\1\160\1\uffff\1\132\1\uffff\1\161\1\162\1\22\1\20"+
		"\1\22\1\132\4\22\1\171\3\22\1\132\1\22\1\176\4\22\3\uffff\6\22\1\uffff"+
		"\2\22\1\u008b\1\22\1\uffff\1\22\1\u008e\1\22\1\u0090\6\22\1\u0097\1\u0098"+
		"\1\uffff\2\22\1\uffff\1\22\1\uffff\1\22\3\132\1\22\1\132\2\uffff\1\u009e"+
		"\1\u009f\2\132\1\22\2\uffff\1\132";
	static final String DFA12_eofS =
		"\u00a1\uffff";
	static final String DFA12_minS =
		"\1\11\2\157\1\165\1\151\1\165\1\157\3\141\2\145\1\143\1\60\1\156\2\uffff"+
		"\1\165\1\uffff\1\165\2\164\1\162\1\165\1\154\1\164\1\142\2\155\2\151\1"+
		"\156\1\143\2\156\1\151\1\141\1\166\1\160\1\164\1\141\1\uffff\1\40\2\141"+
		"\1\151\1\154\1\151\1\145\1\151\1\164\1\154\2\162\1\142\1\145\1\u00e9\1"+
		"\163\1\141\1\163\1\40\1\145\1\163\1\145\1\164\1\166\1\154\1\162\1\164"+
		"\1\157\2\uffff\1\60\2\uffff\1\141\1\157\1\143\1\165\1\154\1\40\2\145\1"+
		"\151\1\162\1\155\1\162\1\141\1\uffff\1\40\1\uffff\2\141\1\155\1\141\1"+
		"\151\1\40\1\154\1\151\1\145\1\142\1\60\1\151\1\154\1\162\1\40\1\164\1"+
		"\141\1\161\1\145\1\142\1\157\3\uffff\1\142\3\145\1\155\1\162\1\uffff\1"+
		"\162\1\145\1\141\1\151\1\uffff\1\165\1\141\1\162\1\141\2\162\1\164\1\162"+
		"\1\142\1\145\2\141\1\uffff\1\156\1\145\1\uffff\1\145\1\uffff\1\145\3\40"+
		"\1\162\1\40\2\uffff\2\141\2\40\1\145\2\uffff\1\40";
	static final String DFA12_maxS =
		"\1\u00fc\1\157\1\166\1\165\1\151\2\165\2\157\1\165\2\145\1\165\1\71\1"+
		"\164\2\uffff\1\165\1\uffff\1\165\2\164\1\162\1\165\1\154\1\164\1\142\1"+
		"\166\1\155\1\164\1\162\1\164\1\143\2\156\1\151\1\u00fc\1\166\1\160\1\164"+
		"\1\u00fc\1\uffff\1\71\2\u00fc\1\151\1\154\1\151\1\145\1\151\1\164\1\154"+
		"\2\162\1\142\1\145\1\u00e9\1\163\1\u00fc\1\163\1\u00fc\1\145\1\163\1\145"+
		"\1\164\1\166\1\156\1\162\1\164\1\157\2\uffff\1\71\2\uffff\1\u00fc\1\157"+
		"\1\143\1\165\1\154\1\u00fc\2\145\1\151\1\162\1\155\1\162\1\u00fc\1\uffff"+
		"\1\u00fc\1\uffff\2\u00fc\1\155\1\u00fc\1\151\1\u00fc\1\154\1\151\1\145"+
		"\1\142\1\71\1\151\1\154\1\162\1\u00fc\1\164\1\u00fc\1\161\1\145\1\142"+
		"\1\157\3\uffff\1\142\3\145\1\155\1\162\1\uffff\1\162\1\145\1\u00fc\1\151"+
		"\1\uffff\1\165\1\u00fc\1\162\1\u00fc\2\162\1\164\1\162\1\142\1\145\2\u00fc"+
		"\1\uffff\1\156\1\145\1\uffff\1\145\1\uffff\1\145\3\u00fc\1\162\1\u00fc"+
		"\2\uffff\4\u00fc\1\145\2\uffff\1\u00fc";
	static final String DFA12_acceptS =
		"\17\uffff\1\24\1\25\1\uffff\1\26\26\uffff\1\17\34\uffff\1\21\1\16\1\uffff"+
		"\1\20\1\22\15\uffff\1\11\1\uffff\1\14\25\uffff\1\10\1\12\1\23\6\uffff"+
		"\1\15\4\uffff\1\5\14\uffff\1\4\2\uffff\1\7\1\uffff\1\13\6\uffff\1\1\1"+
		"\2\5\uffff\1\3\1\6\1\uffff";
	static final String DFA12_specialS =
		"\u00a1\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\20\2\uffff\1\20\22\uffff\1\20\15\uffff\1\17\1\uffff\12\15\5\uffff"+
			"\1\17\41\uffff\1\2\1\3\1\22\1\10\1\16\1\12\3\22\1\11\2\22\1\7\1\6\1\14"+
			"\1\22\1\21\1\5\1\13\1\4\1\22\1\1\4\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\23",
			"\1\27\2\uffff\1\24\2\uffff\1\25\1\26",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33\5\uffff\1\34",
			"\1\36\15\uffff\1\35",
			"\1\37\3\uffff\1\40\11\uffff\1\41",
			"\1\42\3\uffff\1\44\17\uffff\1\43",
			"\1\45",
			"\1\46",
			"\1\47\21\uffff\1\50",
			"\12\52",
			"\1\54\5\uffff\1\53",
			"",
			"",
			"\1\55",
			"",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66\10\uffff\1\67",
			"\1\70",
			"\1\71\12\uffff\1\72",
			"\1\74\10\uffff\1\73",
			"\1\76\5\uffff\1\75",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\103",
			"\1\104",
			"\1\105",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"",
			"\1\111\16\uffff\1\111\12\110",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\131",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\141\1\uffff\1\140",
			"\1\142",
			"\1\143",
			"\1\144",
			"",
			"",
			"\12\145",
			"",
			"",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\163",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\164",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\12\51",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\175",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"",
			"",
			"",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"",
			"\1\u0089",
			"\1\u008a",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\u008c",
			"",
			"\1\u008d",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\u008f",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"",
			"\1\u0099",
			"\1\u009a",
			"",
			"\1\u009b",
			"",
			"\1\u009c",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\u009d",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"",
			"",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\32\22\145\uffff\1\22\7\uffff\2\22\22\uffff\1\22",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22",
			"\1\u00a0",
			"",
			"",
			"\1\111\16\uffff\1\111\61\uffff\32\22\145\uffff\1\22\7\uffff\2\22\22"+
			"\uffff\1\22"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | BULLETIN | AUTEUR | TITRE | RUBRIQUE | NOMBRE | STR_MOIS | MOT | DATE | NUMERO | MONTH | DIGIT4 | DIGIT2 | INT | VAR_DATE | CONJ | EN | DANS | PONC | WS | VAR );";
		}
	}

}
