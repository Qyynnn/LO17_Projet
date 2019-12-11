// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g 2019-12-10 16:11:43
package GenerationSQL;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:4:8: ( 'vouloir' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:4:10: 'vouloir'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:7:9: ( 'article' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:7:11: 'article'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:10:10: ( 'bulletin' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:10:12: 'bulletin'
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

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:14:8: ( 'titre' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:14:10: 'titre'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:17:10: ( 'rubrique' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:17:12: 'rubrique'
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

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:20:5: ( 'mot' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:20:7: 'mot'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:23:6: ( 'date' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:23:8: 'date'
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

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:6: ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre' )
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
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:8: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:20: 'fevrier'
					{
					match("fevrier"); 

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:32: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:41: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:51: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:59: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:68: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:80: 'aout'
					{
					match("aout"); 

					}
					break;
				case 9 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:89: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:103: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:115: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:128: 'decembre'
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
	// $ANTLR end "MOIS"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:29:7: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:29:9: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
	// $ANTLR end "ANNEE"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:32:6: ( ( ( '0' .. '2' )? ( '0' .. '9' ) ) | '30' | '31' )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= '0' && LA3_0 <= '2')||(LA3_0 >= '4' && LA3_0 <= '9')) ) {
				alt3=1;
			}
			else if ( (LA3_0=='3') ) {
				switch ( input.LA(2) ) {
				case '0':
					{
					alt3=2;
					}
					break;
				case '1':
					{
					alt3=3;
					}
					break;
				default:
					alt3=1;
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:32:8: ( ( '0' .. '2' )? ( '0' .. '9' ) )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:32:8: ( ( '0' .. '2' )? ( '0' .. '9' ) )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:32:9: ( '0' .. '2' )? ( '0' .. '9' )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:32:9: ( '0' .. '2' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( ((LA2_0 >= '0' && LA2_0 <= '2')) ) {
						int LA2_1 = input.LA(2);
						if ( ((LA2_1 >= '0' && LA2_1 <= '9')) ) {
							alt2=1;
						}
					}
					switch (alt2) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '2') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

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
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:32:32: '30'
					{
					match("30"); 

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:32:37: '31'
					{
					match("31"); 

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
	// $ANTLR end "JOUR"

	// $ANTLR start "VAR_DATE"
	public final void mVAR_DATE() throws RecognitionException {
		try {
			int _type = VAR_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:10: ( ( JOUR ' ' MOIS ' ' ANNEE ) | ( JOUR '/' ( ( ( '0' )? ( '1' .. '9' ) ) | '10' | '11' | '12' ) '/' ANNEE ) )
			int alt6=2;
			switch ( input.LA(1) ) {
			case '0':
			case '1':
			case '2':
				{
				switch ( input.LA(2) ) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					int LA6_3 = input.LA(3);
					if ( (LA6_3==' ') ) {
						alt6=1;
					}
					else if ( (LA6_3=='/') ) {
						alt6=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ' ':
					{
					alt6=1;
					}
					break;
				case '/':
					{
					alt6=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '3':
				{
				switch ( input.LA(2) ) {
				case '0':
					{
					int LA6_6 = input.LA(3);
					if ( (LA6_6==' ') ) {
						alt6=1;
					}
					else if ( (LA6_6=='/') ) {
						alt6=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case '1':
					{
					int LA6_7 = input.LA(3);
					if ( (LA6_7==' ') ) {
						alt6=1;
					}
					else if ( (LA6_7=='/') ) {
						alt6=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ' ':
					{
					alt6=1;
					}
					break;
				case '/':
					{
					alt6=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3==' ') ) {
					alt6=1;
				}
				else if ( (LA6_3=='/') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:13: ( JOUR ' ' MOIS ' ' ANNEE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:13: ( JOUR ' ' MOIS ' ' ANNEE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:14: JOUR ' ' MOIS ' ' ANNEE
					{
					mJOUR(); 

					match(' '); 
					mMOIS(); 

					match(' '); 
					mANNEE(); 

					}

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:35: ( JOUR '/' ( ( ( '0' )? ( '1' .. '9' ) ) | '10' | '11' | '12' ) '/' ANNEE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:35: ( JOUR '/' ( ( ( '0' )? ( '1' .. '9' ) ) | '10' | '11' | '12' ) '/' ANNEE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:36: JOUR '/' ( ( ( '0' )? ( '1' .. '9' ) ) | '10' | '11' | '12' ) '/' ANNEE
					{
					mJOUR(); 

					match('/'); 
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:43: ( ( ( '0' )? ( '1' .. '9' ) ) | '10' | '11' | '12' )
					int alt5=4;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='0'||(LA5_0 >= '2' && LA5_0 <= '9')) ) {
						alt5=1;
					}
					else if ( (LA5_0=='1') ) {
						switch ( input.LA(2) ) {
						case '0':
							{
							alt5=2;
							}
							break;
						case '1':
							{
							alt5=3;
							}
							break;
						case '2':
							{
							alt5=4;
							}
							break;
						case '/':
							{
							alt5=1;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:44: ( ( '0' )? ( '1' .. '9' ) )
							{
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:44: ( ( '0' )? ( '1' .. '9' ) )
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:45: ( '0' )? ( '1' .. '9' )
							{
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:45: ( '0' )?
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0=='0') ) {
								alt4=1;
							}
							switch (alt4) {
								case 1 :
									// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:45: '0'
									{
									match('0'); 
									}
									break;

							}

							if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}

							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:61: '10'
							{
							match("10"); 

							}
							break;
						case 3 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:66: '11'
							{
							match("11"); 

							}
							break;
						case 4 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:35:71: '12'
							{
							match("12"); 

							}
							break;

					}

					match('/'); 
					mANNEE(); 

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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:38:6: ( 'et' | 'ou' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='e') ) {
				alt7=1;
			}
			else if ( (LA7_0=='o') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:38:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:38:15: 'ou'
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

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:41:7: ( '.' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:41:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\t'||LA9_0=='\r'||LA9_0==' '||LA9_0=='d'||LA9_0=='j'||LA9_0=='q') ) {
				alt9=1;
			}
			else if ( (LA9_0=='\n') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt8=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt8=1;
						}
						break;
					case '\t':
						{
						alt8=2;
						}
						break;
					case '\r':
						{
						alt8=3;
						}
						break;
					case 'j':
						{
						alt8=4;
						}
						break;
					case 'q':
						{
						alt8=5;
						}
						break;
					case 'd':
						{
						alt8=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:44:62: '\\n'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:47:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:47:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:47:30: ( 'a' .. 'z' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | TITRE | RUBRIQUE | MOT | DATE | MOIS | ANNEE | JOUR | VAR_DATE | CONJ | POINT | WS | VAR )
		int alt11=15;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:34: TITRE
				{
				mTITRE(); 

				}
				break;
			case 5 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:40: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 6 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:49: MOT
				{
				mMOT(); 

				}
				break;
			case 7 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:53: DATE
				{
				mDATE(); 

				}
				break;
			case 8 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:58: MOIS
				{
				mMOIS(); 

				}
				break;
			case 9 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:63: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 10 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:69: JOUR
				{
				mJOUR(); 

				}
				break;
			case 11 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:74: VAR_DATE
				{
				mVAR_DATE(); 

				}
				break;
			case 12 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:83: CONJ
				{
				mCONJ(); 

				}
				break;
			case 13 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:88: POINT
				{
				mPOINT(); 

				}
				break;
			case 14 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:94: WS
				{
				mWS(); 

				}
				break;
			case 15 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:97: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\15\uffff\3\52\5\uffff\16\24\1\22\3\24\1\103\1\24\1\52\2\uffff\2\52\1"+
		"\uffff\1\103\10\24\1\115\1\24\1\117\10\24\1\uffff\1\24\1\22\3\24\1\117"+
		"\3\24\1\uffff\1\117\1\uffff\1\140\1\24\1\22\1\24\1\117\7\24\1\117\1\24"+
		"\1\153\1\24\1\uffff\12\24\1\uffff\10\24\1\177\1\u0080\3\24\3\117\1\24"+
		"\1\117\1\24\2\uffff\1\u0086\1\u0087\1\117\1\24\1\117\2\uffff\1\117";
	static final String DFA11_eofS =
		"\u0089\uffff";
	static final String DFA11_minS =
		"\1\11\14\141\3\40\1\141\2\uffff\1\141\1\uffff\1\165\1\164\1\162\1\165"+
		"\1\154\1\164\1\142\1\164\1\151\1\164\1\143\2\156\1\151\1\141\1\166\1\160"+
		"\1\164\1\141\1\166\1\40\2\uffff\2\40\1\uffff\1\141\1\151\1\154\2\151\1"+
		"\164\1\154\2\162\1\141\1\163\1\141\2\145\1\164\1\166\1\154\1\162\1\164"+
		"\1\157\1\uffff\1\145\1\141\1\157\1\143\1\154\1\141\2\145\1\151\1\uffff"+
		"\1\141\1\uffff\1\141\1\155\1\141\1\151\1\141\1\154\1\151\1\145\1\142\1"+
		"\155\1\151\1\154\1\141\1\164\1\141\1\161\1\uffff\1\142\3\145\1\155\1\162"+
		"\1\142\1\162\1\145\1\151\1\uffff\1\165\2\162\1\164\1\162\1\142\1\145\1"+
		"\162\2\141\1\156\2\145\3\141\1\162\1\141\1\145\2\uffff\3\141\1\145\1\141"+
		"\2\uffff\1\141";
	static final String DFA11_maxS =
		"\15\172\3\71\1\172\2\uffff\1\172\1\uffff\1\165\1\164\1\162\1\165\1\154"+
		"\1\164\1\142\1\164\1\162\1\164\1\143\2\156\1\151\1\172\1\166\1\160\1\164"+
		"\1\172\1\166\1\71\2\uffff\2\71\1\uffff\1\172\1\151\1\154\2\151\1\164\1"+
		"\154\2\162\1\172\1\163\1\172\2\145\1\164\1\166\1\156\1\162\1\164\1\157"+
		"\1\uffff\1\145\1\172\1\157\1\143\1\154\1\172\2\145\1\151\1\uffff\1\172"+
		"\1\uffff\1\172\1\155\1\172\1\151\1\172\1\154\1\151\1\145\1\142\1\155\1"+
		"\151\1\154\1\172\1\164\1\172\1\161\1\uffff\1\142\3\145\1\155\1\162\1\142"+
		"\1\162\1\145\1\151\1\uffff\1\165\2\162\1\164\1\162\1\142\1\145\1\162\2"+
		"\172\1\156\2\145\3\172\1\162\1\172\1\145\2\uffff\3\172\1\145\1\172\2\uffff"+
		"\1\172";
	static final String DFA11_acceptS =
		"\21\uffff\1\15\1\16\1\uffff\1\17\25\uffff\1\12\1\13\2\uffff\1\11\24\uffff"+
		"\1\14\11\uffff\1\6\1\uffff\1\10\20\uffff\1\7\12\uffff\1\4\23\uffff\1\1"+
		"\1\2\5\uffff\1\3\1\5\1\uffff";
	static final String DFA11_specialS =
		"\u0089\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\15\uffff\1\21\1\uffff\3\15\1\16\6\17"+
			"\7\uffff\32\24\6\uffff\1\2\1\3\1\24\1\7\1\20\1\11\3\24\1\10\2\24\1\6"+
			"\1\14\1\13\1\24\1\23\1\5\1\12\1\4\1\24\1\1\4\24",
			"\16\24\1\25\13\24",
			"\16\24\1\30\2\24\1\26\3\24\1\27\4\24",
			"\24\24\1\31\5\24",
			"\10\24\1\32\21\24",
			"\24\24\1\33\5\24",
			"\1\35\15\24\1\34\13\24",
			"\1\36\3\24\1\37\11\24\1\40\13\24",
			"\1\41\3\24\1\43\17\24\1\42\5\24",
			"\4\24\1\44\25\24",
			"\4\24\1\45\25\24",
			"\2\24\1\46\21\24\1\47\5\24",
			"\16\24\1\50\13\24",
			"\1\53\16\uffff\1\53\12\51",
			"\1\53\16\uffff\1\53\1\54\1\55\10\56",
			"\1\53\16\uffff\1\53\12\56",
			"\23\24\1\57\6\24",
			"",
			"",
			"\24\24\1\60\5\24",
			"",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\72\10\uffff\1\71",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\32\24",
			"\1\100",
			"\1\101",
			"\1\102",
			"\32\24",
			"\1\104",
			"\1\53\16\uffff\1\53\12\56",
			"",
			"",
			"\1\53\16\uffff\1\53\12\56",
			"\1\53\16\uffff\1\53\12\56",
			"",
			"\32\24",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\32\24",
			"\1\116",
			"\32\24",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\125\1\uffff\1\124",
			"\1\126",
			"\1\127",
			"\1\130",
			"",
			"\1\131",
			"\32\24",
			"\1\132",
			"\1\133",
			"\1\134",
			"\32\24",
			"\1\135",
			"\1\136",
			"\1\137",
			"",
			"\32\24",
			"",
			"\32\24",
			"\1\141",
			"\32\24",
			"\1\142",
			"\32\24",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\32\24",
			"\1\152",
			"\32\24",
			"\1\154",
			"",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\32\24",
			"\32\24",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\32\24",
			"\32\24",
			"\32\24",
			"\1\u0084",
			"\32\24",
			"\1\u0085",
			"",
			"",
			"\32\24",
			"\32\24",
			"\32\24",
			"\1\u0088",
			"\32\24",
			"",
			"",
			"\32\24"
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | BULLETIN | TITRE | RUBRIQUE | MOT | DATE | MOIS | ANNEE | JOUR | VAR_DATE | CONJ | POINT | WS | VAR );";
		}
	}

}
