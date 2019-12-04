// $ANTLR 3.5.1 /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g 2019-12-04 13:03:57

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
	@Override public String getGrammarFileName() { return "/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:4:8: ( 'vouloir' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:4:10: 'vouloir'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:8:9: ( 'article' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:8:11: 'article'
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

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:11:9: ( 'auteur' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:11:11: 'auteur'
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

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:14:10: ( 'bulletin' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:14:12: 'bulletin'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:18:8: ( 'titre' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:18:10: 'titre'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:21:10: ( 'rubrique' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:21:12: 'rubrique'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:24:5: ( 'mot' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:24:7: 'mot'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:27:6: ( 'date' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:27:8: 'date'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:6: ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre' )
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
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:8: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:20: 'fevrier'
					{
					match("fevrier"); 

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:32: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:41: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:51: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:59: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:68: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:80: 'aout'
					{
					match("aout"); 

					}
					break;
				case 9 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:89: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:103: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:115: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:30:128: 'decembre'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:33:7: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:33:9: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:36:6: ( ( '0' .. '3' )? ( '0' .. '9' ) )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:36:8: ( '0' .. '3' )? ( '0' .. '9' )
			{
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:36:8: ( '0' .. '3' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= '0' && LA2_0 <= '3')) ) {
				int LA2_1 = input.LA(2);
				if ( ((LA2_1 >= '0' && LA2_1 <= '9')) ) {
					alt2=1;
				}
			}
			switch (alt2) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:39:10: ( ( JOUR ' ' MOIS ' ' ANNEE ) | ( JOUR '/' ( '0' .. '1' ) ( '0' .. '9' ) '/' ANNEE ) | ANNEE )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= '0' && LA3_0 <= '3')) ) {
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
					switch ( input.LA(3) ) {
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
						alt3=3;
						}
						break;
					case ' ':
						{
						alt3=1;
						}
						break;
					case '/':
						{
						alt3=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case ' ':
					{
					alt3=1;
					}
					break;
				case '/':
					{
					alt3=2;
					}
					break;
				default:
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
			else if ( ((LA3_0 >= '4' && LA3_0 <= '9')) ) {
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
					alt3=3;
					}
					break;
				case ' ':
					{
					alt3=1;
					}
					break;
				case '/':
					{
					alt3=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:39:12: ( JOUR ' ' MOIS ' ' ANNEE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:39:12: ( JOUR ' ' MOIS ' ' ANNEE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:39:13: JOUR ' ' MOIS ' ' ANNEE
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
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:39:35: ( JOUR '/' ( '0' .. '1' ) ( '0' .. '9' ) '/' ANNEE )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:39:35: ( JOUR '/' ( '0' .. '1' ) ( '0' .. '9' ) '/' ANNEE )
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:39:36: JOUR '/' ( '0' .. '1' ) ( '0' .. '9' ) '/' ANNEE
					{
					mJOUR(); 

					match('/'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
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
					match('/'); 
					mANNEE(); 

					}

					}
					break;
				case 3 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:39:75: ANNEE
					{
					mANNEE(); 

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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:42:6: ( 'et' | 'ou' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='e') ) {
				alt4=1;
			}
			else if ( (LA4_0=='o') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:42:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:42:15: 'ou'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:45:7: ( '.' )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:45:9: '.'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='\t'||LA6_0=='\r'||LA6_0==' '||LA6_0=='d'||LA6_0=='j'||LA6_0=='q') ) {
				alt6=1;
			}
			else if ( (LA6_0=='\n') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt5=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt5=1;
						}
						break;
					case '\t':
						{
						alt5=2;
						}
						break;
					case '\r':
						{
						alt5=3;
						}
						break;
					case 'j':
						{
						alt5=4;
						}
						break;
					case 'q':
						{
						alt5=5;
						}
						break;
					case 'd':
						{
						alt5=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:48:62: '\\n'
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
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:51:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:51:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:51:30: ( 'a' .. 'z' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
		// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:8: ( SELECT | ARTICLE | AUTEUR | BULLETIN | TITRE | RUBRIQUE | MOT | DATE | MOIS | ANNEE | JOUR | VAR_DATE | CONJ | POINT | WS | VAR )
		int alt8=16;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:25: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 4 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:32: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 5 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:41: TITRE
				{
				mTITRE(); 

				}
				break;
			case 6 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:47: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 7 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:56: MOT
				{
				mMOT(); 

				}
				break;
			case 8 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:60: DATE
				{
				mDATE(); 

				}
				break;
			case 9 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:65: MOIS
				{
				mMOIS(); 

				}
				break;
			case 10 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:70: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 11 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:76: JOUR
				{
				mJOUR(); 

				}
				break;
			case 12 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:81: VAR_DATE
				{
				mVAR_DATE(); 

				}
				break;
			case 13 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:90: CONJ
				{
				mCONJ(); 

				}
				break;
			case 14 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:95: POINT
				{
				mPOINT(); 

				}
				break;
			case 15 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:101: WS
				{
				mWS(); 

				}
				break;
			case 16 :
				// /Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/TDAntlr/tal_sql.g:1:104: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\15\uffff\2\52\5\uffff\17\23\1\21\3\23\1\102\1\23\1\52\3\uffff\1\102\11"+
		"\23\1\116\1\23\1\120\10\23\1\uffff\1\23\1\uffff\1\21\4\23\1\120\3\23\1"+
		"\uffff\1\120\1\uffff\1\143\1\23\1\21\1\23\1\120\5\23\1\uffff\3\23\1\120"+
		"\1\23\1\160\1\23\1\uffff\7\23\1\uffff\2\23\1\173\1\23\1\uffff\10\23\1"+
		"\u0085\1\u0086\1\uffff\3\23\3\120\1\23\1\120\1\23\2\uffff\1\u008c\1\u008d"+
		"\1\120\1\23\1\120\2\uffff\1\120";
	static final String DFA8_eofS =
		"\u008f\uffff";
	static final String DFA8_minS =
		"\1\11\14\141\2\40\1\141\2\uffff\1\141\1\uffff\1\165\2\164\1\162\1\165"+
		"\1\154\1\164\1\142\1\164\1\151\1\164\1\143\2\156\1\151\1\141\1\166\1\160"+
		"\1\164\1\141\1\166\1\40\2\uffff\1\60\1\141\1\151\1\154\1\151\1\145\1\151"+
		"\1\164\1\154\2\162\1\141\1\163\1\141\2\145\1\164\1\166\1\154\1\162\1\164"+
		"\1\157\1\uffff\1\145\1\60\1\141\1\157\1\143\1\165\1\154\1\141\2\145\1"+
		"\151\1\uffff\1\141\1\uffff\1\141\1\155\1\141\1\151\1\141\1\154\1\151\1"+
		"\145\1\142\1\155\1\uffff\1\151\1\154\1\162\1\141\1\164\1\141\1\161\1\uffff"+
		"\1\142\3\145\1\155\1\162\1\142\1\uffff\1\162\1\145\1\141\1\151\1\uffff"+
		"\1\165\2\162\1\164\1\162\1\142\1\145\1\162\2\141\1\uffff\1\156\2\145\3"+
		"\141\1\162\1\141\1\145\2\uffff\3\141\1\145\1\141\2\uffff\1\141";
	static final String DFA8_maxS =
		"\15\172\2\71\1\172\2\uffff\1\172\1\uffff\1\165\2\164\1\162\1\165\1\154"+
		"\1\164\1\142\1\164\1\162\1\164\1\143\2\156\1\151\1\172\1\166\1\160\1\164"+
		"\1\172\1\166\1\71\2\uffff\1\71\1\172\1\151\1\154\1\151\1\145\1\151\1\164"+
		"\1\154\2\162\1\172\1\163\1\172\2\145\1\164\1\166\1\156\1\162\1\164\1\157"+
		"\1\uffff\1\145\1\71\1\172\1\157\1\143\1\165\1\154\1\172\2\145\1\151\1"+
		"\uffff\1\172\1\uffff\1\172\1\155\1\172\1\151\1\172\1\154\1\151\1\145\1"+
		"\142\1\155\1\uffff\1\151\1\154\1\162\1\172\1\164\1\172\1\161\1\uffff\1"+
		"\142\3\145\1\155\1\162\1\142\1\uffff\1\162\1\145\1\172\1\151\1\uffff\1"+
		"\165\2\162\1\164\1\162\1\142\1\145\1\162\2\172\1\uffff\1\156\2\145\3\172"+
		"\1\162\1\172\1\145\2\uffff\3\172\1\145\1\172\2\uffff\1\172";
	static final String DFA8_acceptS =
		"\20\uffff\1\16\1\17\1\uffff\1\20\26\uffff\1\13\1\14\26\uffff\1\15\13\uffff"+
		"\1\7\1\uffff\1\11\12\uffff\1\12\7\uffff\1\10\7\uffff\1\12\4\uffff\1\5"+
		"\12\uffff\1\3\11\uffff\1\1\1\2\5\uffff\1\4\1\6\1\uffff";
	static final String DFA8_specialS =
		"\u008f\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\21\2\uffff\1\21\22\uffff\1\21\15\uffff\1\20\1\uffff\4\15\6\16\7\uffff"+
			"\32\23\6\uffff\1\2\1\3\1\23\1\7\1\17\1\11\3\23\1\10\2\23\1\6\1\14\1\13"+
			"\1\23\1\22\1\5\1\12\1\4\1\23\1\1\4\23",
			"\16\23\1\24\13\23",
			"\16\23\1\30\2\23\1\25\2\23\1\26\1\27\4\23",
			"\24\23\1\31\5\23",
			"\10\23\1\32\21\23",
			"\24\23\1\33\5\23",
			"\1\35\15\23\1\34\13\23",
			"\1\36\3\23\1\37\11\23\1\40\13\23",
			"\1\41\3\23\1\43\17\23\1\42\5\23",
			"\4\23\1\44\25\23",
			"\4\23\1\45\25\23",
			"\2\23\1\46\21\23\1\47\5\23",
			"\16\23\1\50\13\23",
			"\1\53\16\uffff\1\53\12\51",
			"\1\53\16\uffff\1\53\12\54",
			"\23\23\1\55\6\23",
			"",
			"",
			"\24\23\1\56\5\23",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\71\10\uffff\1\70",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\32\23",
			"\1\77",
			"\1\100",
			"\1\101",
			"\32\23",
			"\1\103",
			"\1\53\16\uffff\1\53\12\104",
			"",
			"",
			"\12\104",
			"\32\23",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\32\23",
			"\1\117",
			"\32\23",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\126\1\uffff\1\125",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"\1\132",
			"\12\133",
			"\32\23",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\32\23",
			"\1\140",
			"\1\141",
			"\1\142",
			"",
			"\32\23",
			"",
			"\32\23",
			"\1\144",
			"\32\23",
			"\1\145",
			"\32\23",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"",
			"\1\154",
			"\1\155",
			"\1\156",
			"\32\23",
			"\1\157",
			"\32\23",
			"\1\161",
			"",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"",
			"\1\171",
			"\1\172",
			"\32\23",
			"\1\174",
			"",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\32\23",
			"\32\23",
			"",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\32\23",
			"\32\23",
			"\32\23",
			"\1\u008a",
			"\32\23",
			"\1\u008b",
			"",
			"",
			"\32\23",
			"\32\23",
			"\32\23",
			"\1\u008e",
			"\32\23",
			"",
			"",
			"\32\23"
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | AUTEUR | BULLETIN | TITRE | RUBRIQUE | MOT | DATE | MOIS | ANNEE | JOUR | VAR_DATE | CONJ | POINT | WS | VAR );";
		}
	}

}
