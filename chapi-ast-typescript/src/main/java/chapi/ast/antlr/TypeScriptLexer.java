// Generated from TypeScriptLexer.g4 by ANTLR 4.8
package chapi.ast.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeScriptLexer extends TypeScriptBaseLexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, RegularExpressionLiteral=3, OpenBracket=4, 
		CloseBracket=5, OpenParen=6, CloseParen=7, OpenBrace=8, CloseBrace=9, 
		SemiColon=10, Comma=11, Assign=12, QuestionMark=13, Colon=14, Ellipsis=15, 
		Dot=16, PlusPlus=17, MinusMinus=18, Plus=19, Minus=20, BitNot=21, Not=22, 
		Multiply=23, Divide=24, Modulus=25, RightShiftArithmetic=26, LeftShiftArithmetic=27, 
		RightShiftLogical=28, LessThan=29, MoreThan=30, LessThanEquals=31, GreaterThanEquals=32, 
		Equals_=33, NotEquals=34, IdentityEquals=35, IdentityNotEquals=36, BitAnd=37, 
		BitXOr=38, BitOr=39, And=40, Or=41, MultiplyAssign=42, DivideAssign=43, 
		ModulusAssign=44, PlusAssign=45, MinusAssign=46, LeftShiftArithmeticAssign=47, 
		RightShiftArithmeticAssign=48, RightShiftLogicalAssign=49, BitAndAssign=50, 
		BitXorAssign=51, BitOrAssign=52, ARROW=53, Lodash=54, Dollar=55, NullLiteral=56, 
		BooleanLiteral=57, DecimalLiteral=58, HexIntegerLiteral=59, OctalIntegerLiteral=60, 
		OctalIntegerLiteral2=61, BinaryIntegerLiteral=62, Break=63, Do=64, Instanceof=65, 
		Typeof=66, Case=67, Else=68, New=69, Var=70, Catch=71, Finally=72, Return=73, 
		Void=74, Continue=75, For=76, Switch=77, While=78, Debugger=79, Function=80, 
		This=81, With=82, Default=83, If=84, Throw=85, Delete=86, In=87, Try=88, 
		As=89, From=90, ReadOnly=91, Async=92, Class=93, Enum=94, Extends=95, 
		Super=96, Const=97, Export=98, Import=99, Implements=100, Let=101, Private=102, 
		Public=103, Interface=104, Package=105, Protected=106, Static=107, Yield=108, 
		Any=109, Number=110, Boolean=111, String=112, Symbol=113, TypeAlias=114, 
		Get=115, Set=116, Constructor=117, Namespace=118, Require=119, Module=120, 
		Declare=121, Abstract=122, Is=123, At=124, Identifier=125, StringLiteral=126, 
		TemplateStringLiteral=127, WhiteSpaces=128, LineTerminator=129, HtmlComment=130, 
		CDataComment=131, UnexpectedCharacter=132;
	public static final int
		ERROR=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "ERROR"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MultiLineComment", "SingleLineComment", "RegularExpressionLiteral", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
			"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", 
			"Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", 
			"RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
			"Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", 
			"BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"ARROW", "Lodash", "Dollar", "NullLiteral", "BooleanLiteral", "DecimalLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "OctalIntegerLiteral2", "BinaryIntegerLiteral", 
			"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", 
			"Catch", "Finally", "Return", "Void", "Continue", "For", "Switch", "While", 
			"Debugger", "Function", "This", "With", "Default", "If", "Throw", "Delete", 
			"In", "Try", "As", "From", "ReadOnly", "Async", "Class", "Enum", "Extends", 
			"Super", "Const", "Export", "Import", "Implements", "Let", "Private", 
			"Public", "Interface", "Package", "Protected", "Static", "Yield", "Any", 
			"Number", "Boolean", "String", "Symbol", "TypeAlias", "Get", "Set", "Constructor", 
			"Namespace", "Require", "Module", "Declare", "Abstract", "Is", "At", 
			"Identifier", "StringLiteral", "TemplateStringLiteral", "WhiteSpaces", 
			"LineTerminator", "HtmlComment", "CDataComment", "UnexpectedCharacter", 
			"DoubleStringCharacter", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", 
			"HexEscapeSequence", "UnicodeEscapeSequence", "ExtendedUnicodeEscapeSequence", 
			"SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "LineContinuation", 
			"HexDigit", "DecimalIntegerLiteral", "ExponentPart", "IdentifierPart", 
			"IdentifierStart", "UnicodeLetter", "UnicodeCombiningMark", "UnicodeDigit", 
			"UnicodeConnectorPunctuation", "RegularExpressionFirstChar", "RegularExpressionChar", 
			"RegularExpressionClassChar", "RegularExpressionBackslashSequence"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", 
			"','", "'='", "'?'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'-'", 
			"'~'", "'!'", "'*'", "'/'", "'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", 
			"'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
			"'>>>='", "'&='", "'^='", "'|='", "'=>'", "'_'", "'$'", "'null'", null, 
			null, null, null, null, null, "'break'", "'do'", "'instanceof'", "'typeof'", 
			"'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'", 
			"'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'", 
			"'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", 
			"'in'", "'try'", "'as'", "'from'", "'readonly'", "'async'", "'class'", 
			"'enum'", "'extends'", "'super'", "'const'", "'export'", "'import'", 
			"'implements'", "'let'", "'private'", "'public'", "'interface'", "'package'", 
			"'protected'", "'static'", "'yield'", "'any'", "'number'", "'boolean'", 
			"'string'", "'symbol'", "'type'", "'get'", "'set'", "'constructor'", 
			"'namespace'", "'require'", "'module'", "'declare'", "'abstract'", "'is'", 
			"'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "RegularExpressionLiteral", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
			"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", 
			"Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", 
			"RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
			"Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", 
			"BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"ARROW", "Lodash", "Dollar", "NullLiteral", "BooleanLiteral", "DecimalLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "OctalIntegerLiteral2", "BinaryIntegerLiteral", 
			"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", 
			"Catch", "Finally", "Return", "Void", "Continue", "For", "Switch", "While", 
			"Debugger", "Function", "This", "With", "Default", "If", "Throw", "Delete", 
			"In", "Try", "As", "From", "ReadOnly", "Async", "Class", "Enum", "Extends", 
			"Super", "Const", "Export", "Import", "Implements", "Let", "Private", 
			"Public", "Interface", "Package", "Protected", "Static", "Yield", "Any", 
			"Number", "Boolean", "String", "Symbol", "TypeAlias", "Get", "Set", "Constructor", 
			"Namespace", "Require", "Module", "Declare", "Abstract", "Is", "At", 
			"Identifier", "StringLiteral", "TemplateStringLiteral", "WhiteSpaces", 
			"LineTerminator", "HtmlComment", "CDataComment", "UnexpectedCharacter"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public TypeScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeScriptLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7:
			OpenBrace_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			CloseBrace_action((RuleContext)_localctx, actionIndex);
			break;
		case 125:
			StringLiteral_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OpenBrace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			this.ProcessOpenBrace();
			break;
		}
	}
	private void CloseBrace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			this.ProcessCloseBrace();
			break;
		}
	}
	private void StringLiteral_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			this.ProcessStringLiteral();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return RegularExpressionLiteral_sempred((RuleContext)_localctx, predIndex);
		case 59:
			return OctalIntegerLiteral_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean RegularExpressionLiteral_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.IsRegexPossible();
		}
		return true;
	}
	private boolean OctalIntegerLiteral_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !this.IsStrictMode();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u0086\u04a5\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\3\2\3\2\3\2\3\2\7\2\u0140\n\2"+
		"\f\2\16\2\u0143\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u014e\n\3"+
		"\f\3\16\3\u0151\13\3\3\3\3\3\3\4\3\4\3\4\7\4\u0158\n\4\f\4\16\4\u015b"+
		"\13\4\3\4\3\4\3\4\7\4\u0160\n\4\f\4\16\4\u0163\13\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3."+
		"\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u01ff\n:\3"+
		";\3;\3;\7;\u0204\n;\f;\16;\u0207\13;\3;\5;\u020a\n;\3;\3;\6;\u020e\n;"+
		"\r;\16;\u020f\3;\5;\u0213\n;\3;\3;\5;\u0217\n;\5;\u0219\n;\3<\3<\3<\6"+
		"<\u021e\n<\r<\16<\u021f\3=\3=\6=\u0224\n=\r=\16=\u0225\3=\3=\3>\3>\3>"+
		"\6>\u022d\n>\r>\16>\u022e\3?\3?\3?\6?\u0234\n?\r?\16?\u0235\3@\3@\3@\3"+
		"@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3"+
		"O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3"+
		"R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3V\3V\3V\3V\3V\3"+
		"V\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3[\3[\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3"+
		"^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3b\3b\3b\3"+
		"b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3"+
		"h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\3"+
		"o\3o\3o\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3r\3"+
		"r\3r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3t\3t\3t\3t\3u\3u\3u\3u\3v\3v\3v\3v\3"+
		"v\3v\3v\3v\3v\3v\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z\3z\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3|\3|\3|\3}\3}\3~\3~\7~\u03ca\n~\f~\16~\u03cd\13~\3\177\3\177"+
		"\7\177\u03d1\n\177\f\177\16\177\u03d4\13\177\3\177\3\177\3\177\7\177\u03d9"+
		"\n\177\f\177\16\177\u03dc\13\177\3\177\5\177\u03df\n\177\3\177\3\177\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u03e7\n\u0080\f\u0080\16\u0080"+
		"\u03ea\13\u0080\3\u0080\3\u0080\3\u0081\6\u0081\u03ef\n\u0081\r\u0081"+
		"\16\u0081\u03f0\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u03ff\n\u0083\f\u0083"+
		"\16\u0083\u0402\13\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\7\u0084\u0415\n\u0084\f\u0084\16\u0084\u0418\13\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0428\n\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u042e\n\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\5\u0088\u0435\n\u0088\3\u0089\3\u0089\5\u0089\u0439\n"+
		"\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\6\u008c\u0448\n\u008c\r\u008c"+
		"\16\u008c\u0449\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\5\u008f\u0454\n\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0092\3\u0092\3\u0092\7\u0092\u045e\n\u0092\f\u0092\16\u0092\u0461"+
		"\13\u0092\5\u0092\u0463\n\u0092\3\u0093\3\u0093\5\u0093\u0467\n\u0093"+
		"\3\u0093\6\u0093\u046a\n\u0093\r\u0093\16\u0093\u046b\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u0473\n\u0094\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\5\u0095\u0479\n\u0095\3\u0096\5\u0096\u047c\n\u0096\3\u0097\5"+
		"\u0097\u047f\n\u0097\3\u0098\5\u0098\u0482\n\u0098\3\u0099\5\u0099\u0485"+
		"\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u048b\n\u009a\f\u009a"+
		"\16\u009a\u048e\13\u009a\3\u009a\5\u009a\u0491\n\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\7\u009b\u0497\n\u009b\f\u009b\16\u009b\u049a\13\u009b"+
		"\3\u009b\5\u009b\u049d\n\u009b\3\u009c\3\u009c\5\u009c\u04a1\n\u009c\3"+
		"\u009d\3\u009d\3\u009d\5\u0141\u0400\u0416\2\u009e\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7"+
		"U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb"+
		"_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cf"+
		"i\u00d1j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3"+
		"s\u00e5t\u00e7u\u00e9v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5|\u00f7"+
		"}\u00f9~\u00fb\177\u00fd\u0080\u00ff\u0081\u0101\u0082\u0103\u0083\u0105"+
		"\u0084\u0107\u0085\u0109\u0086\u010b\2\u010d\2\u010f\2\u0111\2\u0113\2"+
		"\u0115\2\u0117\2\u0119\2\u011b\2\u011d\2\u011f\2\u0121\2\u0123\2\u0125"+
		"\2\u0127\2\u0129\2\u012b\2\u012d\2\u012f\2\u0131\2\u0133\2\u0135\2\u0137"+
		"\2\u0139\2\3\2\34\5\2\f\f\17\17\u202a\u202b\3\2\62;\4\2ZZzz\3\2\629\4"+
		"\2QQqq\4\2DDdd\3\2\62\63\3\2bb\6\2\13\13\r\16\"\"\u00a2\u00a2\6\2\f\f"+
		"\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$)"+
		")\62;^^ddhhppttvxzz\5\2\62;wwzz\5\2\62;CHch\3\2\63;\4\2GGgg\4\2--//\4"+
		"\2&&aa\u0101\2C\\c|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u0221\u0224\u0235\u0252\u02af\u02b2\u02ba\u02bd\u02c3\u02d2"+
		"\u02d3\u02e2\u02e6\u02f0\u02f0\u037c\u037c\u0388\u0388\u038a\u038c\u038e"+
		"\u038e\u0390\u03a3\u03a5\u03d0\u03d2\u03d9\u03dc\u03f5\u0402\u0483\u048e"+
		"\u04c6\u04c9\u04ca\u04cd\u04ce\u04d2\u04f7\u04fa\u04fb\u0533\u0558\u055b"+
		"\u055b\u0563\u0589\u05d2\u05ec\u05f2\u05f4\u0623\u063c\u0642\u064c\u0673"+
		"\u06d5\u06d7\u06d7\u06e7\u06e8\u06fc\u06fe\u0712\u0712\u0714\u072e\u0782"+
		"\u07a7\u0907\u093b\u093f\u093f\u0952\u0952\u095a\u0963\u0987\u098e\u0991"+
		"\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09de\u09df\u09e1"+
		"\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34"+
		"\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87"+
		"\u0a8d\u0a8f\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7"+
		"\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae2\u0b07\u0b0e\u0b11\u0b12\u0b15"+
		"\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b38\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61"+
		"\u0b63\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0"+
		"\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\u0bb9\u0bbb\u0c07\u0c0e\u0c10"+
		"\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90"+
		"\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0ce0\u0ce0\u0ce2\u0ce3\u0d07"+
		"\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c"+
		"\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42"+
		"\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96"+
		"\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf"+
		"\u0eb2\u0eb4\u0eb5\u0ebf\u0ec6\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42"+
		"\u0f6c\u0f8a\u0f8d\u1002\u1023\u1025\u1029\u102b\u102c\u1052\u1057\u10a2"+
		"\u10c7\u10d2\u10f8\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202\u1208\u120a"+
		"\u1248\u124a\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262"+
		"\u1288\u128a\u128a\u128c\u128f\u1292\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba"+
		"\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d0\u12d2\u12d8\u12da\u12f0\u12f2"+
		"\u1310\u1312\u1312\u1314\u1317\u131a\u1320\u1322\u1348\u134a\u135c\u13a2"+
		"\u13f6\u1403\u1678\u1683\u169c\u16a2\u16ec\u1782\u17b5\u1822\u1879\u1882"+
		"\u18aa\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a"+
		"\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82"+
		"\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8"+
		"\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2081\u2081\u2104\u2104\u2109"+
		"\u2109\u210c\u2115\u2117\u2117\u211b\u211f\u2126\u2126\u2128\u2128\u212a"+
		"\u212a\u212c\u212f\u2131\u2133\u2135\u213b\u2162\u2185\u3007\u3009\u3023"+
		"\u302b\u3033\u3037\u303a\u303c\u3043\u3096\u309f\u30a0\u30a3\u30fc\u30fe"+
		"\u3100\u3107\u312e\u3133\u3190\u31a2\u31b9\u3402\u4dc1\u4e02\ua48e\uac02"+
		"\uac02\ud7a5\ud7a5\uf902\ufa2f\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21"+
		"\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48"+
		"\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe74\ufe76"+
		"\ufe76\ufe78\ufefe\uff23\uff3c\uff43\uff5c\uff68\uffc0\uffc4\uffc9\uffcc"+
		"\uffd1\uffd4\uffd9\uffdc\uffdef\2\u0302\u0350\u0362\u0364\u0485\u0488"+
		"\u0593\u05a3\u05a5\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6\u05c6"+
		"\u064d\u0657\u0672\u0672\u06d8\u06de\u06e1\u06e6\u06e9\u06ea\u06ec\u06ef"+
		"\u0713\u0713\u0732\u074c\u07a8\u07b2\u0903\u0905\u093e\u093e\u0940\u094f"+
		"\u0953\u0956\u0964\u0965\u0983\u0985\u09be\u09c6\u09c9\u09ca\u09cd\u09cf"+
		"\u09d9\u09d9\u09e4\u09e5\u0a04\u0a04\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a"+
		"\u0a4d\u0a4f\u0a72\u0a73\u0a83\u0a85\u0abe\u0abe\u0ac0\u0ac7\u0ac9\u0acb"+
		"\u0acd\u0acf\u0b03\u0b05\u0b3e\u0b3e\u0b40\u0b45\u0b49\u0b4a\u0b4d\u0b4f"+
		"\u0b58\u0b59\u0b84\u0b85\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9"+
		"\u0c03\u0c05\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c84\u0c85"+
		"\u0cc0\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0d04\u0d05\u0d40\u0d45"+
		"\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6"+
		"\u0dd8\u0dd8\u0dda\u0de1\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50"+
		"\u0eb3\u0eb3\u0eb6\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0f1a\u0f1b\u0f37\u0f37"+
		"\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f41\u0f73\u0f86\u0f88\u0f89\u0f92\u0f99"+
		"\u0f9b\u0fbe\u0fc8\u0fc8\u102e\u1034\u1038\u103b\u1058\u105b\u17b6\u17d5"+
		"\u18ab\u18ab\u20d2\u20de\u20e3\u20e3\u302c\u3031\u309b\u309c\ufb20\ufb20"+
		"\ufe22\ufe25\26\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8\u09f1"+
		"\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8\u0cf1"+
		"\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042\u104b\u136b\u1373"+
		"\u17e2\u17eb\u1812\u181b\uff12\uff1b\t\2aa\u2041\u2042\u30fd\u30fd\ufe35"+
		"\ufe36\ufe4f\ufe51\uff41\uff41\uff67\uff67\b\2\f\f\17\17,,\61\61]^\u202a"+
		"\u202b\7\2\f\f\17\17\61\61]^\u202a\u202b\6\2\f\f\17\17^_\u202a\u202b\2"+
		"\u04c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2"+
		"\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd"+
		"\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2"+
		"\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef"+
		"\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2"+
		"\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101"+
		"\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2"+
		"\2\3\u013b\3\2\2\2\5\u0149\3\2\2\2\7\u0154\3\2\2\2\t\u0164\3\2\2\2\13"+
		"\u0166\3\2\2\2\r\u0168\3\2\2\2\17\u016a\3\2\2\2\21\u016c\3\2\2\2\23\u016f"+
		"\3\2\2\2\25\u0172\3\2\2\2\27\u0174\3\2\2\2\31\u0176\3\2\2\2\33\u0178\3"+
		"\2\2\2\35\u017a\3\2\2\2\37\u017c\3\2\2\2!\u0180\3\2\2\2#\u0182\3\2\2\2"+
		"%\u0185\3\2\2\2\'\u0188\3\2\2\2)\u018a\3\2\2\2+\u018c\3\2\2\2-\u018e\3"+
		"\2\2\2/\u0190\3\2\2\2\61\u0192\3\2\2\2\63\u0194\3\2\2\2\65\u0196\3\2\2"+
		"\2\67\u0199\3\2\2\29\u019c\3\2\2\2;\u01a0\3\2\2\2=\u01a2\3\2\2\2?\u01a4"+
		"\3\2\2\2A\u01a7\3\2\2\2C\u01aa\3\2\2\2E\u01ad\3\2\2\2G\u01b0\3\2\2\2I"+
		"\u01b4\3\2\2\2K\u01b8\3\2\2\2M\u01ba\3\2\2\2O\u01bc\3\2\2\2Q\u01be\3\2"+
		"\2\2S\u01c1\3\2\2\2U\u01c4\3\2\2\2W\u01c7\3\2\2\2Y\u01ca\3\2\2\2[\u01cd"+
		"\3\2\2\2]\u01d0\3\2\2\2_\u01d3\3\2\2\2a\u01d7\3\2\2\2c\u01db\3\2\2\2e"+
		"\u01e0\3\2\2\2g\u01e3\3\2\2\2i\u01e6\3\2\2\2k\u01e9\3\2\2\2m\u01ec\3\2"+
		"\2\2o\u01ee\3\2\2\2q\u01f0\3\2\2\2s\u01fe\3\2\2\2u\u0218\3\2\2\2w\u021a"+
		"\3\2\2\2y\u0221\3\2\2\2{\u0229\3\2\2\2}\u0230\3\2\2\2\177\u0237\3\2\2"+
		"\2\u0081\u023d\3\2\2\2\u0083\u0240\3\2\2\2\u0085\u024b\3\2\2\2\u0087\u0252"+
		"\3\2\2\2\u0089\u0257\3\2\2\2\u008b\u025c\3\2\2\2\u008d\u0260\3\2\2\2\u008f"+
		"\u0264\3\2\2\2\u0091\u026a\3\2\2\2\u0093\u0272\3\2\2\2\u0095\u0279\3\2"+
		"\2\2\u0097\u027e\3\2\2\2\u0099\u0287\3\2\2\2\u009b\u028b\3\2\2\2\u009d"+
		"\u0292\3\2\2\2\u009f\u0298\3\2\2\2\u00a1\u02a1\3\2\2\2\u00a3\u02aa\3\2"+
		"\2\2\u00a5\u02af\3\2\2\2\u00a7\u02b4\3\2\2\2\u00a9\u02bc\3\2\2\2\u00ab"+
		"\u02bf\3\2\2\2\u00ad\u02c5\3\2\2\2\u00af\u02cc\3\2\2\2\u00b1\u02cf\3\2"+
		"\2\2\u00b3\u02d3\3\2\2\2\u00b5\u02d6\3\2\2\2\u00b7\u02db\3\2\2\2\u00b9"+
		"\u02e4\3\2\2\2\u00bb\u02ea\3\2\2\2\u00bd\u02f0\3\2\2\2\u00bf\u02f5\3\2"+
		"\2\2\u00c1\u02fd\3\2\2\2\u00c3\u0303\3\2\2\2\u00c5\u0309\3\2\2\2\u00c7"+
		"\u0310\3\2\2\2\u00c9\u0317\3\2\2\2\u00cb\u0322\3\2\2\2\u00cd\u0326\3\2"+
		"\2\2\u00cf\u032e\3\2\2\2\u00d1\u0335\3\2\2\2\u00d3\u033f\3\2\2\2\u00d5"+
		"\u0347\3\2\2\2\u00d7\u0351\3\2\2\2\u00d9\u0358\3\2\2\2\u00db\u035e\3\2"+
		"\2\2\u00dd\u0362\3\2\2\2\u00df\u0369\3\2\2\2\u00e1\u0371\3\2\2\2\u00e3"+
		"\u0378\3\2\2\2\u00e5\u037f\3\2\2\2\u00e7\u0384\3\2\2\2\u00e9\u0388\3\2"+
		"\2\2\u00eb\u038c\3\2\2\2\u00ed\u0398\3\2\2\2\u00ef\u03a2\3\2\2\2\u00f1"+
		"\u03aa\3\2\2\2\u00f3\u03b1\3\2\2\2\u00f5\u03b9\3\2\2\2\u00f7\u03c2\3\2"+
		"\2\2\u00f9\u03c5\3\2\2\2\u00fb\u03c7\3\2\2\2\u00fd\u03de\3\2\2\2\u00ff"+
		"\u03e2\3\2\2\2\u0101\u03ee\3\2\2\2\u0103\u03f4\3\2\2\2\u0105\u03f8\3\2"+
		"\2\2\u0107\u0409\3\2\2\2\u0109\u041f\3\2\2\2\u010b\u0427\3\2\2\2\u010d"+
		"\u042d\3\2\2\2\u010f\u0434\3\2\2\2\u0111\u0438\3\2\2\2\u0113\u043a\3\2"+
		"\2\2\u0115\u043e\3\2\2\2\u0117\u0444\3\2\2\2\u0119\u044d\3\2\2\2\u011b"+
		"\u044f\3\2\2\2\u011d\u0453\3\2\2\2\u011f\u0455\3\2\2\2\u0121\u0458\3\2"+
		"\2\2\u0123\u0462\3\2\2\2\u0125\u0464\3\2\2\2\u0127\u0472\3\2\2\2\u0129"+
		"\u0478\3\2\2\2\u012b\u047b\3\2\2\2\u012d\u047e\3\2\2\2\u012f\u0481\3\2"+
		"\2\2\u0131\u0484\3\2\2\2\u0133\u0490\3\2\2\2\u0135\u049c\3\2\2\2\u0137"+
		"\u04a0\3\2\2\2\u0139\u04a2\3\2\2\2\u013b\u013c\7\61\2\2\u013c\u013d\7"+
		",\2\2\u013d\u0141\3\2\2\2\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7,\2\2\u0145\u0146\7\61\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\b\2\2\2\u0148\4\3\2\2\2\u0149\u014a\7\61\2"+
		"\2\u014a\u014b\7\61\2\2\u014b\u014f\3\2\2\2\u014c\u014e\n\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\b\3\2\2\u0153"+
		"\6\3\2\2\2\u0154\u0155\7\61\2\2\u0155\u0159\5\u0133\u009a\2\u0156\u0158"+
		"\5\u0135\u009b\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3"+
		"\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\6\4\2\2\u015d\u0161\7\61\2\2\u015e\u0160\5\u0127\u0094\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\b\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7]\2\2\u0165\n\3"+
		"\2\2\2\u0166\u0167\7_\2\2\u0167\f\3\2\2\2\u0168\u0169\7*\2\2\u0169\16"+
		"\3\2\2\2\u016a\u016b\7+\2\2\u016b\20\3\2\2\2\u016c\u016d\7}\2\2\u016d"+
		"\u016e\b\t\3\2\u016e\22\3\2\2\2\u016f\u0170\7\177\2\2\u0170\u0171\b\n"+
		"\4\2\u0171\24\3\2\2\2\u0172\u0173\7=\2\2\u0173\26\3\2\2\2\u0174\u0175"+
		"\7.\2\2\u0175\30\3\2\2\2\u0176\u0177\7?\2\2\u0177\32\3\2\2\2\u0178\u0179"+
		"\7A\2\2\u0179\34\3\2\2\2\u017a\u017b\7<\2\2\u017b\36\3\2\2\2\u017c\u017d"+
		"\7\60\2\2\u017d\u017e\7\60\2\2\u017e\u017f\7\60\2\2\u017f \3\2\2\2\u0180"+
		"\u0181\7\60\2\2\u0181\"\3\2\2\2\u0182\u0183\7-\2\2\u0183\u0184\7-\2\2"+
		"\u0184$\3\2\2\2\u0185\u0186\7/\2\2\u0186\u0187\7/\2\2\u0187&\3\2\2\2\u0188"+
		"\u0189\7-\2\2\u0189(\3\2\2\2\u018a\u018b\7/\2\2\u018b*\3\2\2\2\u018c\u018d"+
		"\7\u0080\2\2\u018d,\3\2\2\2\u018e\u018f\7#\2\2\u018f.\3\2\2\2\u0190\u0191"+
		"\7,\2\2\u0191\60\3\2\2\2\u0192\u0193\7\61\2\2\u0193\62\3\2\2\2\u0194\u0195"+
		"\7\'\2\2\u0195\64\3\2\2\2\u0196\u0197\7@\2\2\u0197\u0198\7@\2\2\u0198"+
		"\66\3\2\2\2\u0199\u019a\7>\2\2\u019a\u019b\7>\2\2\u019b8\3\2\2\2\u019c"+
		"\u019d\7@\2\2\u019d\u019e\7@\2\2\u019e\u019f\7@\2\2\u019f:\3\2\2\2\u01a0"+
		"\u01a1\7>\2\2\u01a1<\3\2\2\2\u01a2\u01a3\7@\2\2\u01a3>\3\2\2\2\u01a4\u01a5"+
		"\7>\2\2\u01a5\u01a6\7?\2\2\u01a6@\3\2\2\2\u01a7\u01a8\7@\2\2\u01a8\u01a9"+
		"\7?\2\2\u01a9B\3\2\2\2\u01aa\u01ab\7?\2\2\u01ab\u01ac\7?\2\2\u01acD\3"+
		"\2\2\2\u01ad\u01ae\7#\2\2\u01ae\u01af\7?\2\2\u01afF\3\2\2\2\u01b0\u01b1"+
		"\7?\2\2\u01b1\u01b2\7?\2\2\u01b2\u01b3\7?\2\2\u01b3H\3\2\2\2\u01b4\u01b5"+
		"\7#\2\2\u01b5\u01b6\7?\2\2\u01b6\u01b7\7?\2\2\u01b7J\3\2\2\2\u01b8\u01b9"+
		"\7(\2\2\u01b9L\3\2\2\2\u01ba\u01bb\7`\2\2\u01bbN\3\2\2\2\u01bc\u01bd\7"+
		"~\2\2\u01bdP\3\2\2\2\u01be\u01bf\7(\2\2\u01bf\u01c0\7(\2\2\u01c0R\3\2"+
		"\2\2\u01c1\u01c2\7~\2\2\u01c2\u01c3\7~\2\2\u01c3T\3\2\2\2\u01c4\u01c5"+
		"\7,\2\2\u01c5\u01c6\7?\2\2\u01c6V\3\2\2\2\u01c7\u01c8\7\61\2\2\u01c8\u01c9"+
		"\7?\2\2\u01c9X\3\2\2\2\u01ca\u01cb\7\'\2\2\u01cb\u01cc\7?\2\2\u01ccZ\3"+
		"\2\2\2\u01cd\u01ce\7-\2\2\u01ce\u01cf\7?\2\2\u01cf\\\3\2\2\2\u01d0\u01d1"+
		"\7/\2\2\u01d1\u01d2\7?\2\2\u01d2^\3\2\2\2\u01d3\u01d4\7>\2\2\u01d4\u01d5"+
		"\7>\2\2\u01d5\u01d6\7?\2\2\u01d6`\3\2\2\2\u01d7\u01d8\7@\2\2\u01d8\u01d9"+
		"\7@\2\2\u01d9\u01da\7?\2\2\u01dab\3\2\2\2\u01db\u01dc\7@\2\2\u01dc\u01dd"+
		"\7@\2\2\u01dd\u01de\7@\2\2\u01de\u01df\7?\2\2\u01dfd\3\2\2\2\u01e0\u01e1"+
		"\7(\2\2\u01e1\u01e2\7?\2\2\u01e2f\3\2\2\2\u01e3\u01e4\7`\2\2\u01e4\u01e5"+
		"\7?\2\2\u01e5h\3\2\2\2\u01e6\u01e7\7~\2\2\u01e7\u01e8\7?\2\2\u01e8j\3"+
		"\2\2\2\u01e9\u01ea\7?\2\2\u01ea\u01eb\7@\2\2\u01ebl\3\2\2\2\u01ec\u01ed"+
		"\7a\2\2\u01edn\3\2\2\2\u01ee\u01ef\7&\2\2\u01efp\3\2\2\2\u01f0\u01f1\7"+
		"p\2\2\u01f1\u01f2\7w\2\2\u01f2\u01f3\7n\2\2\u01f3\u01f4\7n\2\2\u01f4r"+
		"\3\2\2\2\u01f5\u01f6\7v\2\2\u01f6\u01f7\7t\2\2\u01f7\u01f8\7w\2\2\u01f8"+
		"\u01ff\7g\2\2\u01f9\u01fa\7h\2\2\u01fa\u01fb\7c\2\2\u01fb\u01fc\7n\2\2"+
		"\u01fc\u01fd\7u\2\2\u01fd\u01ff\7g\2\2\u01fe\u01f5\3\2\2\2\u01fe\u01f9"+
		"\3\2\2\2\u01fft\3\2\2\2\u0200\u0201\5\u0123\u0092\2\u0201\u0205\7\60\2"+
		"\2\u0202\u0204\t\3\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0208"+
		"\u020a\5\u0125\u0093\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0219"+
		"\3\2\2\2\u020b\u020d\7\60\2\2\u020c\u020e\t\3\2\2\u020d\u020c\3\2\2\2"+
		"\u020e\u020f\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212"+
		"\3\2\2\2\u0211\u0213\5\u0125\u0093\2\u0212\u0211\3\2\2\2\u0212\u0213\3"+
		"\2\2\2\u0213\u0219\3\2\2\2\u0214\u0216\5\u0123\u0092\2\u0215\u0217\5\u0125"+
		"\u0093\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218"+
		"\u0200\3\2\2\2\u0218\u020b\3\2\2\2\u0218\u0214\3\2\2\2\u0219v\3\2\2\2"+
		"\u021a\u021b\7\62\2\2\u021b\u021d\t\4\2\2\u021c\u021e\5\u0121\u0091\2"+
		"\u021d\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220x\3\2\2\2\u0221\u0223\7\62\2\2\u0222\u0224\t\5\2\2\u0223"+
		"\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227\u0228\6=\3\2\u0228z\3\2\2\2\u0229\u022a"+
		"\7\62\2\2\u022a\u022c\t\6\2\2\u022b\u022d\t\5\2\2\u022c\u022b\3\2\2\2"+
		"\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f|\3"+
		"\2\2\2\u0230\u0231\7\62\2\2\u0231\u0233\t\7\2\2\u0232\u0234\t\b\2\2\u0233"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236~\3\2\2\2\u0237\u0238\7d\2\2\u0238\u0239\7t\2\2\u0239\u023a"+
		"\7g\2\2\u023a\u023b\7c\2\2\u023b\u023c\7m\2\2\u023c\u0080\3\2\2\2\u023d"+
		"\u023e\7f\2\2\u023e\u023f\7q\2\2\u023f\u0082\3\2\2\2\u0240\u0241\7k\2"+
		"\2\u0241\u0242\7p\2\2\u0242\u0243\7u\2\2\u0243\u0244\7v\2\2\u0244\u0245"+
		"\7c\2\2\u0245\u0246\7p\2\2\u0246\u0247\7e\2\2\u0247\u0248\7g\2\2\u0248"+
		"\u0249\7q\2\2\u0249\u024a\7h\2\2\u024a\u0084\3\2\2\2\u024b\u024c\7v\2"+
		"\2\u024c\u024d\7{\2\2\u024d\u024e\7r\2\2\u024e\u024f\7g\2\2\u024f\u0250"+
		"\7q\2\2\u0250\u0251\7h\2\2\u0251\u0086\3\2\2\2\u0252\u0253\7e\2\2\u0253"+
		"\u0254\7c\2\2\u0254\u0255\7u\2\2\u0255\u0256\7g\2\2\u0256\u0088\3\2\2"+
		"\2\u0257\u0258\7g\2\2\u0258\u0259\7n\2\2\u0259\u025a\7u\2\2\u025a\u025b"+
		"\7g\2\2\u025b\u008a\3\2\2\2\u025c\u025d\7p\2\2\u025d\u025e\7g\2\2\u025e"+
		"\u025f\7y\2\2\u025f\u008c\3\2\2\2\u0260\u0261\7x\2\2\u0261\u0262\7c\2"+
		"\2\u0262\u0263\7t\2\2\u0263\u008e\3\2\2\2\u0264\u0265\7e\2\2\u0265\u0266"+
		"\7c\2\2\u0266\u0267\7v\2\2\u0267\u0268\7e\2\2\u0268\u0269\7j\2\2\u0269"+
		"\u0090\3\2\2\2\u026a\u026b\7h\2\2\u026b\u026c\7k\2\2\u026c\u026d\7p\2"+
		"\2\u026d\u026e\7c\2\2\u026e\u026f\7n\2\2\u026f\u0270\7n\2\2\u0270\u0271"+
		"\7{\2\2\u0271\u0092\3\2\2\2\u0272\u0273\7t\2\2\u0273\u0274\7g\2\2\u0274"+
		"\u0275\7v\2\2\u0275\u0276\7w\2\2\u0276\u0277\7t\2\2\u0277\u0278\7p\2\2"+
		"\u0278\u0094\3\2\2\2\u0279\u027a\7x\2\2\u027a\u027b\7q\2\2\u027b\u027c"+
		"\7k\2\2\u027c\u027d\7f\2\2\u027d\u0096\3\2\2\2\u027e\u027f\7e\2\2\u027f"+
		"\u0280\7q\2\2\u0280\u0281\7p\2\2\u0281\u0282\7v\2\2\u0282\u0283\7k\2\2"+
		"\u0283\u0284\7p\2\2\u0284\u0285\7w\2\2\u0285\u0286\7g\2\2\u0286\u0098"+
		"\3\2\2\2\u0287\u0288\7h\2\2\u0288\u0289\7q\2\2\u0289\u028a\7t\2\2\u028a"+
		"\u009a\3\2\2\2\u028b\u028c\7u\2\2\u028c\u028d\7y\2\2\u028d\u028e\7k\2"+
		"\2\u028e\u028f\7v\2\2\u028f\u0290\7e\2\2\u0290\u0291\7j\2\2\u0291\u009c"+
		"\3\2\2\2\u0292\u0293\7y\2\2\u0293\u0294\7j\2\2\u0294\u0295\7k\2\2\u0295"+
		"\u0296\7n\2\2\u0296\u0297\7g\2\2\u0297\u009e\3\2\2\2\u0298\u0299\7f\2"+
		"\2\u0299\u029a\7g\2\2\u029a\u029b\7d\2\2\u029b\u029c\7w\2\2\u029c\u029d"+
		"\7i\2\2\u029d\u029e\7i\2\2\u029e\u029f\7g\2\2\u029f\u02a0\7t\2\2\u02a0"+
		"\u00a0\3\2\2\2\u02a1\u02a2\7h\2\2\u02a2\u02a3\7w\2\2\u02a3\u02a4\7p\2"+
		"\2\u02a4\u02a5\7e\2\2\u02a5\u02a6\7v\2\2\u02a6\u02a7\7k\2\2\u02a7\u02a8"+
		"\7q\2\2\u02a8\u02a9\7p\2\2\u02a9\u00a2\3\2\2\2\u02aa\u02ab\7v\2\2\u02ab"+
		"\u02ac\7j\2\2\u02ac\u02ad\7k\2\2\u02ad\u02ae\7u\2\2\u02ae\u00a4\3\2\2"+
		"\2\u02af\u02b0\7y\2\2\u02b0\u02b1\7k\2\2\u02b1\u02b2\7v\2\2\u02b2\u02b3"+
		"\7j\2\2\u02b3\u00a6\3\2\2\2\u02b4\u02b5\7f\2\2\u02b5\u02b6\7g\2\2\u02b6"+
		"\u02b7\7h\2\2\u02b7\u02b8\7c\2\2\u02b8\u02b9\7w\2\2\u02b9\u02ba\7n\2\2"+
		"\u02ba\u02bb\7v\2\2\u02bb\u00a8\3\2\2\2\u02bc\u02bd\7k\2\2\u02bd\u02be"+
		"\7h\2\2\u02be\u00aa\3\2\2\2\u02bf\u02c0\7v\2\2\u02c0\u02c1\7j\2\2\u02c1"+
		"\u02c2\7t\2\2\u02c2\u02c3\7q\2\2\u02c3\u02c4\7y\2\2\u02c4\u00ac\3\2\2"+
		"\2\u02c5\u02c6\7f\2\2\u02c6\u02c7\7g\2\2\u02c7\u02c8\7n\2\2\u02c8\u02c9"+
		"\7g\2\2\u02c9\u02ca\7v\2\2\u02ca\u02cb\7g\2\2\u02cb\u00ae\3\2\2\2\u02cc"+
		"\u02cd\7k\2\2\u02cd\u02ce\7p\2\2\u02ce\u00b0\3\2\2\2\u02cf\u02d0\7v\2"+
		"\2\u02d0\u02d1\7t\2\2\u02d1\u02d2\7{\2\2\u02d2\u00b2\3\2\2\2\u02d3\u02d4"+
		"\7c\2\2\u02d4\u02d5\7u\2\2\u02d5\u00b4\3\2\2\2\u02d6\u02d7\7h\2\2\u02d7"+
		"\u02d8\7t\2\2\u02d8\u02d9\7q\2\2\u02d9\u02da\7o\2\2\u02da\u00b6\3\2\2"+
		"\2\u02db\u02dc\7t\2\2\u02dc\u02dd\7g\2\2\u02dd\u02de\7c\2\2\u02de\u02df"+
		"\7f\2\2\u02df\u02e0\7q\2\2\u02e0\u02e1\7p\2\2\u02e1\u02e2\7n\2\2\u02e2"+
		"\u02e3\7{\2\2\u02e3\u00b8\3\2\2\2\u02e4\u02e5\7c\2\2\u02e5\u02e6\7u\2"+
		"\2\u02e6\u02e7\7{\2\2\u02e7\u02e8\7p\2\2\u02e8\u02e9\7e\2\2\u02e9\u00ba"+
		"\3\2\2\2\u02ea\u02eb\7e\2\2\u02eb\u02ec\7n\2\2\u02ec\u02ed\7c\2\2\u02ed"+
		"\u02ee\7u\2\2\u02ee\u02ef\7u\2\2\u02ef\u00bc\3\2\2\2\u02f0\u02f1\7g\2"+
		"\2\u02f1\u02f2\7p\2\2\u02f2\u02f3\7w\2\2\u02f3\u02f4\7o\2\2\u02f4\u00be"+
		"\3\2\2\2\u02f5\u02f6\7g\2\2\u02f6\u02f7\7z\2\2\u02f7\u02f8\7v\2\2\u02f8"+
		"\u02f9\7g\2\2\u02f9\u02fa\7p\2\2\u02fa\u02fb\7f\2\2\u02fb\u02fc\7u\2\2"+
		"\u02fc\u00c0\3\2\2\2\u02fd\u02fe\7u\2\2\u02fe\u02ff\7w\2\2\u02ff\u0300"+
		"\7r\2\2\u0300\u0301\7g\2\2\u0301\u0302\7t\2\2\u0302\u00c2\3\2\2\2\u0303"+
		"\u0304\7e\2\2\u0304\u0305\7q\2\2\u0305\u0306\7p\2\2\u0306\u0307\7u\2\2"+
		"\u0307\u0308\7v\2\2\u0308\u00c4\3\2\2\2\u0309\u030a\7g\2\2\u030a\u030b"+
		"\7z\2\2\u030b\u030c\7r\2\2\u030c\u030d\7q\2\2\u030d\u030e\7t\2\2\u030e"+
		"\u030f\7v\2\2\u030f\u00c6\3\2\2\2\u0310\u0311\7k\2\2\u0311\u0312\7o\2"+
		"\2\u0312\u0313\7r\2\2\u0313\u0314\7q\2\2\u0314\u0315\7t\2\2\u0315\u0316"+
		"\7v\2\2\u0316\u00c8\3\2\2\2\u0317\u0318\7k\2\2\u0318\u0319\7o\2\2\u0319"+
		"\u031a\7r\2\2\u031a\u031b\7n\2\2\u031b\u031c\7g\2\2\u031c\u031d\7o\2\2"+
		"\u031d\u031e\7g\2\2\u031e\u031f\7p\2\2\u031f\u0320\7v\2\2\u0320\u0321"+
		"\7u\2\2\u0321\u00ca\3\2\2\2\u0322\u0323\7n\2\2\u0323\u0324\7g\2\2\u0324"+
		"\u0325\7v\2\2\u0325\u00cc\3\2\2\2\u0326\u0327\7r\2\2\u0327\u0328\7t\2"+
		"\2\u0328\u0329\7k\2\2\u0329\u032a\7x\2\2\u032a\u032b\7c\2\2\u032b\u032c"+
		"\7v\2\2\u032c\u032d\7g\2\2\u032d\u00ce\3\2\2\2\u032e\u032f\7r\2\2\u032f"+
		"\u0330\7w\2\2\u0330\u0331\7d\2\2\u0331\u0332\7n\2\2\u0332\u0333\7k\2\2"+
		"\u0333\u0334\7e\2\2\u0334\u00d0\3\2\2\2\u0335\u0336\7k\2\2\u0336\u0337"+
		"\7p\2\2\u0337\u0338\7v\2\2\u0338\u0339\7g\2\2\u0339\u033a\7t\2\2\u033a"+
		"\u033b\7h\2\2\u033b\u033c\7c\2\2\u033c\u033d\7e\2\2\u033d\u033e\7g\2\2"+
		"\u033e\u00d2\3\2\2\2\u033f\u0340\7r\2\2\u0340\u0341\7c\2\2\u0341\u0342"+
		"\7e\2\2\u0342\u0343\7m\2\2\u0343\u0344\7c\2\2\u0344\u0345\7i\2\2\u0345"+
		"\u0346\7g\2\2\u0346\u00d4\3\2\2\2\u0347\u0348\7r\2\2\u0348\u0349\7t\2"+
		"\2\u0349\u034a\7q\2\2\u034a\u034b\7v\2\2\u034b\u034c\7g\2\2\u034c\u034d"+
		"\7e\2\2\u034d\u034e\7v\2\2\u034e\u034f\7g\2\2\u034f\u0350\7f\2\2\u0350"+
		"\u00d6\3\2\2\2\u0351\u0352\7u\2\2\u0352\u0353\7v\2\2\u0353\u0354\7c\2"+
		"\2\u0354\u0355\7v\2\2\u0355\u0356\7k\2\2\u0356\u0357\7e\2\2\u0357\u00d8"+
		"\3\2\2\2\u0358\u0359\7{\2\2\u0359\u035a\7k\2\2\u035a\u035b\7g\2\2\u035b"+
		"\u035c\7n\2\2\u035c\u035d\7f\2\2\u035d\u00da\3\2\2\2\u035e\u035f\7c\2"+
		"\2\u035f\u0360\7p\2\2\u0360\u0361\7{\2\2\u0361\u00dc\3\2\2\2\u0362\u0363"+
		"\7p\2\2\u0363\u0364\7w\2\2\u0364\u0365\7o\2\2\u0365\u0366\7d\2\2\u0366"+
		"\u0367\7g\2\2\u0367\u0368\7t\2\2\u0368\u00de\3\2\2\2\u0369\u036a\7d\2"+
		"\2\u036a\u036b\7q\2\2\u036b\u036c\7q\2\2\u036c\u036d\7n\2\2\u036d\u036e"+
		"\7g\2\2\u036e\u036f\7c\2\2\u036f\u0370\7p\2\2\u0370\u00e0\3\2\2\2\u0371"+
		"\u0372\7u\2\2\u0372\u0373\7v\2\2\u0373\u0374\7t\2\2\u0374\u0375\7k\2\2"+
		"\u0375\u0376\7p\2\2\u0376\u0377\7i\2\2\u0377\u00e2\3\2\2\2\u0378\u0379"+
		"\7u\2\2\u0379\u037a\7{\2\2\u037a\u037b\7o\2\2\u037b\u037c\7d\2\2\u037c"+
		"\u037d\7q\2\2\u037d\u037e\7n\2\2\u037e\u00e4\3\2\2\2\u037f\u0380\7v\2"+
		"\2\u0380\u0381\7{\2\2\u0381\u0382\7r\2\2\u0382\u0383\7g\2\2\u0383\u00e6"+
		"\3\2\2\2\u0384\u0385\7i\2\2\u0385\u0386\7g\2\2\u0386\u0387\7v\2\2\u0387"+
		"\u00e8\3\2\2\2\u0388\u0389\7u\2\2\u0389\u038a\7g\2\2\u038a\u038b\7v\2"+
		"\2\u038b\u00ea\3\2\2\2\u038c\u038d\7e\2\2\u038d\u038e\7q\2\2\u038e\u038f"+
		"\7p\2\2\u038f\u0390\7u\2\2\u0390\u0391\7v\2\2\u0391\u0392\7t\2\2\u0392"+
		"\u0393\7w\2\2\u0393\u0394\7e\2\2\u0394\u0395\7v\2\2\u0395\u0396\7q\2\2"+
		"\u0396\u0397\7t\2\2\u0397\u00ec\3\2\2\2\u0398\u0399\7p\2\2\u0399\u039a"+
		"\7c\2\2\u039a\u039b\7o\2\2\u039b\u039c\7g\2\2\u039c\u039d\7u\2\2\u039d"+
		"\u039e\7r\2\2\u039e\u039f\7c\2\2\u039f\u03a0\7e\2\2\u03a0\u03a1\7g\2\2"+
		"\u03a1\u00ee\3\2\2\2\u03a2\u03a3\7t\2\2\u03a3\u03a4\7g\2\2\u03a4\u03a5"+
		"\7s\2\2\u03a5\u03a6\7w\2\2\u03a6\u03a7\7k\2\2\u03a7\u03a8\7t\2\2\u03a8"+
		"\u03a9\7g\2\2\u03a9\u00f0\3\2\2\2\u03aa\u03ab\7o\2\2\u03ab\u03ac\7q\2"+
		"\2\u03ac\u03ad\7f\2\2\u03ad\u03ae\7w\2\2\u03ae\u03af\7n\2\2\u03af\u03b0"+
		"\7g\2\2\u03b0\u00f2\3\2\2\2\u03b1\u03b2\7f\2\2\u03b2\u03b3\7g\2\2\u03b3"+
		"\u03b4\7e\2\2\u03b4\u03b5\7n\2\2\u03b5\u03b6\7c\2\2\u03b6\u03b7\7t\2\2"+
		"\u03b7\u03b8\7g\2\2\u03b8\u00f4\3\2\2\2\u03b9\u03ba\7c\2\2\u03ba\u03bb"+
		"\7d\2\2\u03bb\u03bc\7u\2\2\u03bc\u03bd\7v\2\2\u03bd\u03be\7t\2\2\u03be"+
		"\u03bf\7c\2\2\u03bf\u03c0\7e\2\2\u03c0\u03c1\7v\2\2\u03c1\u00f6\3\2\2"+
		"\2\u03c2\u03c3\7k\2\2\u03c3\u03c4\7u\2\2\u03c4\u00f8\3\2\2\2\u03c5\u03c6"+
		"\7B\2\2\u03c6\u00fa\3\2\2\2\u03c7\u03cb\5\u0129\u0095\2\u03c8\u03ca\5"+
		"\u0127\u0094\2\u03c9\u03c8\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2"+
		"\2\2\u03cb\u03cc\3\2\2\2\u03cc\u00fc\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce"+
		"\u03d2\7$\2\2\u03cf\u03d1\5\u010b\u0086\2\u03d0\u03cf\3\2\2\2\u03d1\u03d4"+
		"\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4"+
		"\u03d2\3\2\2\2\u03d5\u03df\7$\2\2\u03d6\u03da\7)\2\2\u03d7\u03d9\5\u010d"+
		"\u0087\2\u03d8\u03d7\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da"+
		"\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03df\7)"+
		"\2\2\u03de\u03ce\3\2\2\2\u03de\u03d6\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"\u03e1\b\177\5\2\u03e1\u00fe\3\2\2\2\u03e2\u03e8\7b\2\2\u03e3\u03e4\7"+
		"^\2\2\u03e4\u03e7\7b\2\2\u03e5\u03e7\n\t\2\2\u03e6\u03e3\3\2\2\2\u03e6"+
		"\u03e5\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2"+
		"\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03ec\7b\2\2\u03ec"+
		"\u0100\3\2\2\2\u03ed\u03ef\t\n\2\2\u03ee\u03ed\3\2\2\2\u03ef\u03f0\3\2"+
		"\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2"+
		"\u03f3\b\u0081\2\2\u03f3\u0102\3\2\2\2\u03f4\u03f5\t\2\2\2\u03f5\u03f6"+
		"\3\2\2\2\u03f6\u03f7\b\u0082\2\2\u03f7\u0104\3\2\2\2\u03f8\u03f9\7>\2"+
		"\2\u03f9\u03fa\7#\2\2\u03fa\u03fb\7/\2\2\u03fb\u03fc\7/\2\2\u03fc\u0400"+
		"\3\2\2\2\u03fd\u03ff\13\2\2\2\u03fe\u03fd\3\2\2\2\u03ff\u0402\3\2\2\2"+
		"\u0400\u0401\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0403\3\2\2\2\u0402\u0400"+
		"\3\2\2\2\u0403\u0404\7/\2\2\u0404\u0405\7/\2\2\u0405\u0406\7@\2\2\u0406"+
		"\u0407\3\2\2\2\u0407\u0408\b\u0083\2\2\u0408\u0106\3\2\2\2\u0409\u040a"+
		"\7>\2\2\u040a\u040b\7#\2\2\u040b\u040c\7]\2\2\u040c\u040d\7E\2\2\u040d"+
		"\u040e\7F\2\2\u040e\u040f\7C\2\2\u040f\u0410\7V\2\2\u0410\u0411\7C\2\2"+
		"\u0411\u0412\7]\2\2\u0412\u0416\3\2\2\2\u0413\u0415\13\2\2\2\u0414\u0413"+
		"\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417"+
		"\u0419\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041a\7_\2\2\u041a\u041b\7_\2"+
		"\2\u041b\u041c\7@\2\2\u041c\u041d\3\2\2\2\u041d\u041e\b\u0084\2\2\u041e"+
		"\u0108\3\2\2\2\u041f\u0420\13\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\b"+
		"\u0085\6\2\u0422\u010a\3\2\2\2\u0423\u0428\n\13\2\2\u0424\u0425\7^\2\2"+
		"\u0425\u0428\5\u010f\u0088\2\u0426\u0428\5\u011f\u0090\2\u0427\u0423\3"+
		"\2\2\2\u0427\u0424\3\2\2\2\u0427\u0426\3\2\2\2\u0428\u010c\3\2\2\2\u0429"+
		"\u042e\n\f\2\2\u042a\u042b\7^\2\2\u042b\u042e\5\u010f\u0088\2\u042c\u042e"+
		"\5\u011f\u0090\2\u042d\u0429\3\2\2\2\u042d\u042a\3\2\2\2\u042d\u042c\3"+
		"\2\2\2\u042e\u010e\3\2\2\2\u042f\u0435\5\u0111\u0089\2\u0430\u0435\7\62"+
		"\2\2\u0431\u0435\5\u0113\u008a\2\u0432\u0435\5\u0115\u008b\2\u0433\u0435"+
		"\5\u0117\u008c\2\u0434\u042f\3\2\2\2\u0434\u0430\3\2\2\2\u0434\u0431\3"+
		"\2\2\2\u0434\u0432\3\2\2\2\u0434\u0433\3\2\2\2\u0435\u0110\3\2\2\2\u0436"+
		"\u0439\5\u0119\u008d\2\u0437\u0439\5\u011b\u008e\2\u0438\u0436\3\2\2\2"+
		"\u0438\u0437\3\2\2\2\u0439\u0112\3\2\2\2\u043a\u043b\7z\2\2\u043b\u043c"+
		"\5\u0121\u0091\2\u043c\u043d\5\u0121\u0091\2\u043d\u0114\3\2\2\2\u043e"+
		"\u043f\7w\2\2\u043f\u0440\5\u0121\u0091\2\u0440\u0441\5\u0121\u0091\2"+
		"\u0441\u0442\5\u0121\u0091\2\u0442\u0443\5\u0121\u0091\2\u0443\u0116\3"+
		"\2\2\2\u0444\u0445\7w\2\2\u0445\u0447\7}\2\2\u0446\u0448\5\u0121\u0091"+
		"\2\u0447\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u044a"+
		"\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\7\177\2\2\u044c\u0118\3\2\2\2"+
		"\u044d\u044e\t\r\2\2\u044e\u011a\3\2\2\2\u044f\u0450\n\16\2\2\u0450\u011c"+
		"\3\2\2\2\u0451\u0454\5\u0119\u008d\2\u0452\u0454\t\17\2\2\u0453\u0451"+
		"\3\2\2\2\u0453\u0452\3\2\2\2\u0454\u011e\3\2\2\2\u0455\u0456\7^\2\2\u0456"+
		"\u0457\t\2\2\2\u0457\u0120\3\2\2\2\u0458\u0459\t\20\2\2\u0459\u0122\3"+
		"\2\2\2\u045a\u0463\7\62\2\2\u045b\u045f\t\21\2\2\u045c\u045e\t\3\2\2\u045d"+
		"\u045c\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2"+
		"\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u045a\3\2\2\2\u0462"+
		"\u045b\3\2\2\2\u0463\u0124\3\2\2\2\u0464\u0466\t\22\2\2\u0465\u0467\t"+
		"\23\2\2\u0466\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2\2\2\u0468"+
		"\u046a\t\3\2\2\u0469\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u0469\3\2"+
		"\2\2\u046b\u046c\3\2\2\2\u046c\u0126\3\2\2\2\u046d\u0473\5\u0129\u0095"+
		"\2\u046e\u0473\5\u012d\u0097\2\u046f\u0473\5\u012f\u0098\2\u0470\u0473"+
		"\5\u0131\u0099\2\u0471\u0473\4\u200e\u200f\2\u0472\u046d\3\2\2\2\u0472"+
		"\u046e\3\2\2\2\u0472\u046f\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0471\3\2"+
		"\2\2\u0473\u0128\3\2\2\2\u0474\u0479\5\u012b\u0096\2\u0475\u0479\t\24"+
		"\2\2\u0476\u0477\7^\2\2\u0477\u0479\5\u0115\u008b\2\u0478\u0474\3\2\2"+
		"\2\u0478\u0475\3\2\2\2\u0478\u0476\3\2\2\2\u0479\u012a\3\2\2\2\u047a\u047c"+
		"\t\25\2\2\u047b\u047a\3\2\2\2\u047c\u012c\3\2\2\2\u047d\u047f\t\26\2\2"+
		"\u047e\u047d\3\2\2\2\u047f\u012e\3\2\2\2\u0480\u0482\t\27\2\2\u0481\u0480"+
		"\3\2\2\2\u0482\u0130\3\2\2\2\u0483\u0485\t\30\2\2\u0484\u0483\3\2\2\2"+
		"\u0485\u0132\3\2\2\2\u0486\u0491\n\31\2\2\u0487\u0491\5\u0139\u009d\2"+
		"\u0488\u048c\7]\2\2\u0489\u048b\5\u0137\u009c\2\u048a\u0489\3\2\2\2\u048b"+
		"\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048f\3\2"+
		"\2\2\u048e\u048c\3\2\2\2\u048f\u0491\7_\2\2\u0490\u0486\3\2\2\2\u0490"+
		"\u0487\3\2\2\2\u0490\u0488\3\2\2\2\u0491\u0134\3\2\2\2\u0492\u049d\n\32"+
		"\2\2\u0493\u049d\5\u0139\u009d\2\u0494\u0498\7]\2\2\u0495\u0497\5\u0137"+
		"\u009c\2\u0496\u0495\3\2\2\2\u0497\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498"+
		"\u0499\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u0498\3\2\2\2\u049b\u049d\7_"+
		"\2\2\u049c\u0492\3\2\2\2\u049c\u0493\3\2\2\2\u049c\u0494\3\2\2\2\u049d"+
		"\u0136\3\2\2\2\u049e\u04a1\n\33\2\2\u049f\u04a1\5\u0139\u009d\2\u04a0"+
		"\u049e\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1\u0138\3\2\2\2\u04a2\u04a3\7^"+
		"\2\2\u04a3\u04a4\n\2\2\2\u04a4\u013a\3\2\2\2\60\2\u0141\u014f\u0159\u0161"+
		"\u01fe\u0205\u0209\u020f\u0212\u0216\u0218\u021f\u0225\u022e\u0235\u03cb"+
		"\u03d2\u03da\u03de\u03e6\u03e8\u03f0\u0400\u0416\u0427\u042d\u0434\u0438"+
		"\u0449\u0453\u045f\u0462\u0466\u046b\u0472\u0478\u047b\u047e\u0481\u0484"+
		"\u048c\u0490\u0498\u049c\u04a0\7\2\3\2\3\t\2\3\n\3\3\177\4\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}