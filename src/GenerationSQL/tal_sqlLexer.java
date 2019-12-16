// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g 2019-12-16 12:29:04
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:26:6: ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre' | ( ( ( '0' )? ( '1' .. '9' ) ) | '10' | '11' | '12' ) )
			int alt3=13;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='a') ) {
					alt3=1;
				}
				else if ( (LA3_1=='u') ) {
					int LA3_11 = input.LA(3);
					if ( (LA3_11=='i') ) {
						int LA3_15 = input.LA(4);
						if ( (LA3_15=='n') ) {
							alt3=6;
						}
						else if ( (LA3_15=='l') ) {
							alt3=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 15, input);
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
								new NoViableAltException("", 3, 11, input);
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
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt3=2;
				}
				break;
			case 'm':
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3=='a') ) {
					int LA3_12 = input.LA(3);
					if ( (LA3_12=='r') ) {
						alt3=3;
					}
					else if ( (LA3_12=='i') ) {
						alt3=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 12, input);
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
							new NoViableAltException("", 3, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA3_4 = input.LA(2);
				if ( (LA3_4=='v') ) {
					alt3=4;
				}
				else if ( (LA3_4=='o') ) {
					alt3=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt3=9;
				}
				break;
			case 'o':
				{
				alt3=10;
				}
				break;
			case 'n':
				{
				alt3=11;
				}
				break;
			case 'd':
				{
				alt3=12;
				}
				break;
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
				alt3=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
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
				case 13 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:2: ( ( ( '0' )? ( '1' .. '9' ) ) | '10' | '11' | '12' )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:2: ( ( ( '0' )? ( '1' .. '9' ) ) | '10' | '11' | '12' )
					int alt2=4;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='0'||(LA2_0 >= '2' && LA2_0 <= '9')) ) {
						alt2=1;
					}
					else if ( (LA2_0=='1') ) {
						switch ( input.LA(2) ) {
						case '0':
							{
							alt2=2;
							}
							break;
						case '1':
							{
							alt2=3;
							}
							break;
						case '2':
							{
							alt2=4;
							}
							break;
						default:
							alt2=1;
						}
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:2: ( ( '0' )? ( '1' .. '9' ) )
							{
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:2: ( ( '0' )? ( '1' .. '9' ) )
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:3: ( '0' )? ( '1' .. '9' )
							{
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:3: ( '0' )?
							int alt1=2;
							int LA1_0 = input.LA(1);
							if ( (LA1_0=='0') ) {
								alt1=1;
							}
							switch (alt1) {
								case 1 :
									// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:3: '0'
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
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:19: '10'
							{
							match("10"); 

							}
							break;
						case 3 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:24: '11'
							{
							match("11"); 

							}
							break;
						case 4 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:27:29: '12'
							{
							match("12"); 

							}
							break;

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
	// $ANTLR end "MOIS"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:30:7: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:30:9: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:33:6: ( ( ( '0' .. '2' )? ( '0' .. '9' ) ) | '30' | '31' )
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '0' && LA5_0 <= '2')||(LA5_0 >= '4' && LA5_0 <= '9')) ) {
				alt5=1;
			}
			else if ( (LA5_0=='3') ) {
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
				default:
					alt5=1;
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:33:8: ( ( '0' .. '2' )? ( '0' .. '9' ) )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:33:8: ( ( '0' .. '2' )? ( '0' .. '9' ) )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:33:9: ( '0' .. '2' )? ( '0' .. '9' )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:33:9: ( '0' .. '2' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= '0' && LA4_0 <= '2')) ) {
						int LA4_1 = input.LA(2);
						if ( ((LA4_1 >= '0' && LA4_1 <= '9')) ) {
							alt4=1;
						}
					}
					switch (alt4) {
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
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:33:32: '30'
					{
					match("30"); 

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:33:37: '31'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:36:10: ( ( JOUR ' ' MOIS ' ' ANNEE ) | ( JOUR '/' MOIS '/' ANNEE ) )
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
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:36:13: ( JOUR ' ' MOIS ' ' ANNEE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:36:13: ( JOUR ' ' MOIS ' ' ANNEE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:36:14: JOUR ' ' MOIS ' ' ANNEE
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
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:36:35: ( JOUR '/' MOIS '/' ANNEE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:36:35: ( JOUR '/' MOIS '/' ANNEE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:36:36: JOUR '/' MOIS '/' ANNEE
					{
					mJOUR(); 

					match('/'); 
					mMOIS(); 

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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:39:6: ( 'et' | 'ou' )
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
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:39:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:39:15: 'ou'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:42:5: ( 'en' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:42:7: 'en'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:45:7: ( 'dans' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:45:9: 'dans'
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

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:48:7: ( '.' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:48:9: '.'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
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
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
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
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:51:62: '\\n'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:54:6: ( ( 'a' .. 'z' | 'é' | 'è' | 'ê' | 'ù' | 'î' | 'à' | 'û' | 'ç' | 'ï' | 'ü' )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:54:8: ( 'a' .. 'z' | 'é' | 'è' | 'ê' | 'ù' | 'î' | 'à' | 'û' | 'ç' | 'ï' | 'ü' )+
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:54:8: ( 'a' .. 'z' | 'é' | 'è' | 'ê' | 'ù' | 'î' | 'à' | 'û' | 'ç' | 'ï' | 'ü' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= 'a' && LA10_0 <= 'z')||LA10_0=='\u00E0'||(LA10_0 >= '\u00E7' && LA10_0 <= '\u00EA')||(LA10_0 >= '\u00EE' && LA10_0 <= '\u00EF')||LA10_0=='\u00F9'||(LA10_0 >= '\u00FB' && LA10_0 <= '\u00FC')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E7' && input.LA(1) <= '\u00EA')||(input.LA(1) >= '\u00EE' && input.LA(1) <= '\u00EF')||input.LA(1)=='\u00F9'||(input.LA(1) >= '\u00FB' && input.LA(1) <= '\u00FC') ) {
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
		// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | TITRE | RUBRIQUE | MOT | DATE | MOIS | ANNEE | JOUR | VAR_DATE | CONJ | EN | DANS | POINT | WS | VAR )
		int alt11=17;
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
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:88: EN
				{
				mEN(); 

				}
				break;
			case 14 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:91: DANS
				{
				mDANS(); 

				}
				break;
			case 15 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:96: POINT
				{
				mPOINT(); 

				}
				break;
			case 16 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:102: WS
				{
				mWS(); 

				}
				break;
			case 17 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/TDAntlr/tal_sql.g:1:105: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\1\uffff\14\26\1\55\4\62\1\26\2\uffff\1\26\1\uffff\16\26\1\24\3\26\1\114"+
		"\1\26\1\62\1\55\2\uffff\3\62\1\uffff\2\55\1\uffff\1\114\1\116\10\26\1"+
		"\127\1\26\1\62\11\26\1\uffff\1\26\1\uffff\1\24\3\26\1\62\3\26\1\uffff"+
		"\1\62\1\152\1\153\1\26\1\24\1\26\1\62\7\26\1\62\1\26\1\166\1\26\2\uffff"+
		"\12\26\1\uffff\10\26\1\u008a\1\u008b\3\26\3\62\1\26\1\62\1\26\2\uffff"+
		"\1\u0091\1\u0092\1\62\1\26\1\62\2\uffff\1\62";
	static final String DFA11_eofS =
		"\u0094\uffff";
	static final String DFA11_minS =
		"\1\11\2\157\1\165\1\151\1\165\3\141\2\145\1\143\1\157\5\40\1\156\2\uffff"+
		"\1\165\1\uffff\1\165\1\164\1\162\1\165\1\154\1\164\1\142\1\164\1\151\1"+
		"\156\1\143\2\156\1\151\1\141\1\166\1\160\1\164\1\141\1\166\2\40\2\uffff"+
		"\3\40\1\uffff\2\40\1\uffff\2\141\1\151\1\154\2\151\1\164\1\154\2\162\1"+
		"\141\1\163\1\141\1\145\1\163\1\145\1\164\1\166\1\154\1\162\1\164\1\157"+
		"\1\uffff\1\145\1\uffff\1\141\1\157\1\143\1\154\1\141\2\145\1\151\1\uffff"+
		"\3\141\1\155\1\141\1\151\1\141\1\154\1\151\1\145\1\142\1\155\1\151\1\154"+
		"\1\141\1\164\1\141\1\161\2\uffff\1\142\3\145\1\155\1\162\1\142\1\162\1"+
		"\145\1\151\1\uffff\1\165\2\162\1\164\1\162\1\142\1\145\1\162\2\141\1\156"+
		"\2\145\3\141\1\162\1\141\1\145\2\uffff\3\141\1\145\1\141\2\uffff\1\141";
	static final String DFA11_maxS =
		"\1\u00fc\1\157\1\166\1\165\1\151\1\165\2\157\1\165\2\145\1\165\1\157\5"+
		"\71\1\164\2\uffff\1\165\1\uffff\1\165\1\164\1\162\1\165\1\154\1\164\1"+
		"\142\1\164\1\162\1\164\1\143\2\156\1\151\1\u00fc\1\166\1\160\1\164\1\u00fc"+
		"\1\166\2\71\2\uffff\3\71\1\uffff\2\71\1\uffff\2\u00fc\1\151\1\154\2\151"+
		"\1\164\1\154\2\162\1\u00fc\1\163\1\u00fc\1\145\1\163\1\145\1\164\1\166"+
		"\1\156\1\162\1\164\1\157\1\uffff\1\145\1\uffff\1\u00fc\1\157\1\143\1\154"+
		"\1\u00fc\2\145\1\151\1\uffff\3\u00fc\1\155\1\u00fc\1\151\1\u00fc\1\154"+
		"\1\151\1\145\1\142\1\155\1\151\1\154\1\u00fc\1\164\1\u00fc\1\161\2\uffff"+
		"\1\142\3\145\1\155\1\162\1\142\1\162\1\145\1\151\1\uffff\1\165\2\162\1"+
		"\164\1\162\1\142\1\145\1\162\2\u00fc\1\156\2\145\3\u00fc\1\162\1\u00fc"+
		"\1\145\2\uffff\3\u00fc\1\145\1\u00fc\2\uffff\1\u00fc";
	static final String DFA11_acceptS =
		"\23\uffff\1\17\1\20\1\uffff\1\21\26\uffff\1\12\1\13\3\uffff\1\10\2\uffff"+
		"\1\11\26\uffff\1\14\1\uffff\1\15\10\uffff\1\6\22\uffff\1\7\1\16\12\uffff"+
		"\1\4\23\uffff\1\1\1\2\5\uffff\1\3\1\5\1\uffff";
	static final String DFA11_specialS =
		"\u0094\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\24\2\uffff\1\24\22\uffff\1\24\15\uffff\1\23\1\uffff\1\15\1\16\1\17"+
			"\1\20\6\21\47\uffff\1\2\1\3\1\26\1\7\1\22\1\11\3\26\1\10\2\26\1\6\1\14"+
			"\1\13\1\26\1\25\1\5\1\12\1\4\1\26\1\1\4\26\145\uffff\1\26\6\uffff\4\26"+
			"\3\uffff\2\26\11\uffff\1\26\1\uffff\2\26",
			"\1\27",
			"\1\32\2\uffff\1\30\3\uffff\1\31",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\37\15\uffff\1\36",
			"\1\40\3\uffff\1\41\11\uffff\1\42",
			"\1\43\3\uffff\1\45\17\uffff\1\44",
			"\1\46",
			"\1\47",
			"\1\50\21\uffff\1\51",
			"\1\52",
			"\1\56\16\uffff\1\56\1\54\11\53",
			"\1\56\16\uffff\1\56\1\57\1\60\1\61\7\54",
			"\1\56\16\uffff\1\56\12\54",
			"\1\56\16\uffff\1\56\1\63\1\64\10\65",
			"\1\56\16\uffff\1\56\12\65",
			"\1\67\5\uffff\1\66",
			"",
			"",
			"\1\70",
			"",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\102\10\uffff\1\101",
			"\1\104\5\uffff\1\103",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\111",
			"\1\112",
			"\1\113",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\115",
			"\1\56\16\uffff\1\56\12\65",
			"\1\56\16\uffff\1\56\12\65",
			"",
			"",
			"\1\56\16\uffff\1\56\12\65",
			"\1\56\16\uffff\1\56\12\65",
			"\1\56\16\uffff\1\56\12\65",
			"",
			"\1\56\16\uffff\1\56\12\65",
			"\1\56\16\uffff\1\56\12\65",
			"",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\130",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\137\1\uffff\1\136",
			"\1\140",
			"\1\141",
			"\1\142",
			"",
			"\1\143",
			"",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\144",
			"\1\145",
			"\1\146",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\147",
			"\1\150",
			"\1\151",
			"",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\154",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\155",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\165",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\167",
			"",
			"",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\u008f",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\u0090",
			"",
			"",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"\1\u0093",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26",
			"",
			"",
			"\32\26\145\uffff\1\26\6\uffff\4\26\3\uffff\2\26\11\uffff\1\26\1\uffff"+
			"\2\26"
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
			return "1:1: Tokens : ( SELECT | ARTICLE | BULLETIN | TITRE | RUBRIQUE | MOT | DATE | MOIS | ANNEE | JOUR | VAR_DATE | CONJ | EN | DANS | POINT | WS | VAR );";
		}
	}

}
