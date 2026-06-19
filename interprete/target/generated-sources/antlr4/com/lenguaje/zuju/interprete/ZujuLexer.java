// Generated from com\lenguaje\zuju\interprete\Zuju.g4 by ANTLR 4.5.1
package com.lenguaje.zuju.interprete;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ZujuLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, ENT=2, REAL=3, CADENA=4, BOOL=5, MOSTRAR=6, SI=7, SINO=8, 
		PARA=9, MAS=10, MENOS=11, MULT=12, DIV=13, COMENTARIO=14, COMENTARIO_COMPLETO=15, 
		Y=16, O=17, NO=18, MAYORQ=19, MENORQ=20, MAYORI=21, MENORI=22, IGUAL=23, 
		NOIGUAL=24, ASIGNAR=25, LLAVE_ABIERTA=26, LLAVE_CERRADA=27, PAR_ABIERTO=28, 
		PAR_CERRADO=29, PUNTO_COMA=30, COMILLAS=31, BOOLEAN=32, LITERAL_CADENA=33, 
		ID=34, ENTERO=35, NUMERO=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAMA", "ENT", "REAL", "CADENA", "BOOL", "MOSTRAR", "SI", "SINO", 
		"PARA", "MAS", "MENOS", "MULT", "DIV", "COMENTARIO", "COMENTARIO_COMPLETO", 
		"Y", "O", "NO", "MAYORQ", "MENORQ", "MAYORI", "MENORI", "IGUAL", "NOIGUAL", 
		"ASIGNAR", "LLAVE_ABIERTA", "LLAVE_CERRADA", "PAR_ABIERTO", "PAR_CERRADO", 
		"PUNTO_COMA", "COMILLAS", "BOOLEAN", "LITERAL_CADENA", "ID", "ENTERO", 
		"NUMERO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'ent'", "'real'", "'cadena'", "'bool'", "'mostrar'", 
		"'si'", "'sino'", "'para'", "'+'", "'-'", "'*'", "'/'", null, null, "'&&'", 
		"'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", "'{'", 
		"'}'", "'('", "')'", "';'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAMA", "ENT", "REAL", "CADENA", "BOOL", "MOSTRAR", "SI", "SINO", 
		"PARA", "MAS", "MENOS", "MULT", "DIV", "COMENTARIO", "COMENTARIO_COMPLETO", 
		"Y", "O", "NO", "MAYORQ", "MENORQ", "MAYORI", "MENORI", "IGUAL", "NOIGUAL", 
		"ASIGNAR", "LLAVE_ABIERTA", "LLAVE_CERRADA", "PAR_ABIERTO", "PAR_CERRADO", 
		"PUNTO_COMA", "COMILLAS", "BOOLEAN", "LITERAL_CADENA", "ID", "ENTERO", 
		"NUMERO", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ZujuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Zuju.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u00f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\7\17\u008d\n\17\f\17\16\17\u0090\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\7\20\u0098\n\20\f\20\16\20\u009b\13\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u00d1\n!\3\"\3\"\7\"\u00d5\n\"\f\"\16\"\u00d8\13\"\3"+
		"\"\3\"\3#\3#\7#\u00de\n#\f#\16#\u00e1\13#\3$\6$\u00e4\n$\r$\16$\u00e5"+
		"\3%\6%\u00e9\n%\r%\16%\u00ea\3%\3%\6%\u00ef\n%\r%\16%\u00f0\3&\6&\u00f4"+
		"\n&\r&\16&\u00f5\3&\3&\3\u0099\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\b\4\2\f\f\17"+
		"\17\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u0101\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5V\3\2\2\2\7Z\3\2\2\2\t_\3\2\2\2\13"+
		"f\3\2\2\2\rk\3\2\2\2\17s\3\2\2\2\21v\3\2\2\2\23{\3\2\2\2\25\u0080\3\2"+
		"\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u0088\3\2\2"+
		"\2\37\u0093\3\2\2\2!\u00a1\3\2\2\2#\u00a4\3\2\2\2%\u00a7\3\2\2\2\'\u00a9"+
		"\3\2\2\2)\u00ab\3\2\2\2+\u00ad\3\2\2\2-\u00b0\3\2\2\2/\u00b3\3\2\2\2\61"+
		"\u00b6\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf"+
		"\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2?\u00c5\3\2\2\2A\u00d0\3\2\2\2C"+
		"\u00d2\3\2\2\2E\u00db\3\2\2\2G\u00e3\3\2\2\2I\u00e8\3\2\2\2K\u00f3\3\2"+
		"\2\2MN\7r\2\2NO\7t\2\2OP\7q\2\2PQ\7i\2\2QR\7t\2\2RS\7c\2\2ST\7o\2\2TU"+
		"\7c\2\2U\4\3\2\2\2VW\7g\2\2WX\7p\2\2XY\7v\2\2Y\6\3\2\2\2Z[\7t\2\2[\\\7"+
		"g\2\2\\]\7c\2\2]^\7n\2\2^\b\3\2\2\2_`\7e\2\2`a\7c\2\2ab\7f\2\2bc\7g\2"+
		"\2cd\7p\2\2de\7c\2\2e\n\3\2\2\2fg\7d\2\2gh\7q\2\2hi\7q\2\2ij\7n\2\2j\f"+
		"\3\2\2\2kl\7o\2\2lm\7q\2\2mn\7u\2\2no\7v\2\2op\7t\2\2pq\7c\2\2qr\7t\2"+
		"\2r\16\3\2\2\2st\7u\2\2tu\7k\2\2u\20\3\2\2\2vw\7u\2\2wx\7k\2\2xy\7p\2"+
		"\2yz\7q\2\2z\22\3\2\2\2{|\7r\2\2|}\7c\2\2}~\7t\2\2~\177\7c\2\2\177\24"+
		"\3\2\2\2\u0080\u0081\7-\2\2\u0081\26\3\2\2\2\u0082\u0083\7/\2\2\u0083"+
		"\30\3\2\2\2\u0084\u0085\7,\2\2\u0085\32\3\2\2\2\u0086\u0087\7\61\2\2\u0087"+
		"\34\3\2\2\2\u0088\u0089\7~\2\2\u0089\u008a\7/\2\2\u008a\u008e\3\2\2\2"+
		"\u008b\u008d\n\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\b\17\2\2\u0092\36\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095\7/\2\2"+
		"\u0095\u0099\3\2\2\2\u0096\u0098\13\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009d\7/\2\2\u009d\u009e\7/\2\2\u009e\u009f\3\2\2"+
		"\2\u009f\u00a0\b\20\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7(\2\2\u00a2\u00a3"+
		"\7(\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7~\2\2\u00a5\u00a6\7~\2\2\u00a6$\3"+
		"\2\2\2\u00a7\u00a8\7#\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa(\3\2"+
		"\2\2\u00ab\u00ac\7>\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae\u00af"+
		"\7?\2\2\u00af,\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b2\7?\2\2\u00b2.\3"+
		"\2\2\2\u00b3\u00b4\7?\2\2\u00b4\u00b5\7?\2\2\u00b5\60\3\2\2\2\u00b6\u00b7"+
		"\7#\2\2\u00b7\u00b8\7?\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\64"+
		"\3\2\2\2\u00bb\u00bc\7}\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7\177\2\2\u00be"+
		"8\3\2\2\2\u00bf\u00c0\7*\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7+\2\2\u00c2<"+
		"\3\2\2\2\u00c3\u00c4\7=\2\2\u00c4>\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6@\3"+
		"\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7w\2\2\u00ca"+
		"\u00d1\7g\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2"+
		"\u00ce\u00cf\7u\2\2\u00cf\u00d1\7g\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00cb"+
		"\3\2\2\2\u00d1B\3\2\2\2\u00d2\u00d6\7$\2\2\u00d3\u00d5\n\3\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7$\2\2\u00daD\3\2\2\2\u00db"+
		"\u00df\t\4\2\2\u00dc\u00de\t\5\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0F\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e4\t\6\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6H\3\2\2\2\u00e7\u00e9\t\6\2\2"+
		"\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\7\60\2\2\u00ed\u00ef\t\6\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1J\3\2\2\2\u00f2\u00f4\t\7\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\b&\2\2\u00f8L\3\2\2\2\f\2\u008e\u0099\u00d0\u00d6\u00df"+
		"\u00e5\u00ea\u00f0\u00f5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}