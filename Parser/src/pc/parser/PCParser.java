// Generated from PC.g4 by ANTLR 4.5.1
package pc.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, DIGIT=23, DECIMAL=24, 
		STRING=25, IDENTIFIER=26, WHITESPACE=27;
	public static final int
		RULE_program = 0, RULE_programPart = 1, RULE_printStatement = 2, RULE_variableDefinition = 3, 
		RULE_conditionStatement = 4, RULE_block = 5, RULE_conditionExpression = 6, 
		RULE_expressions = 7, RULE_stringExpression = 8, RULE_stringConcat = 9, 
		RULE_stringConcatAdd = 10, RULE_stringMultiply = 11, RULE_stringRead = 12, 
		RULE_expression = 13, RULE_newLine = 14;
	public static final String[] ruleNames = {
		"program", "programPart", "printStatement", "variableDefinition", "conditionStatement", 
		"block", "conditionExpression", "expressions", "stringExpression", "stringConcat", 
		"stringConcatAdd", "stringMultiply", "stringRead", "expression", "newLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print('", "')'", "'println('", "'='", "','", "'if '", "':'", "'else:'", 
		"' null'", "'!null'", "'!'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", 
		"'+'", "'*'", "'/'", "'-'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "DIGIT", 
		"DECIMAL", "STRING", "IDENTIFIER", "WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "PC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ProgramPartContext> programPart() {
			return getRuleContexts(ProgramPartContext.class);
		}
		public ProgramPartContext programPart(int i) {
			return getRuleContext(ProgramPartContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				programPart();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__21) | (1L << IDENTIFIER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramPartContext extends ParserRuleContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public ProgramPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitProgramPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramPartContext programPart() throws RecognitionException {
		ProgramPartContext _localctx = new ProgramPartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programPart);
		try {
			setState(39);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				printStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				variableDefinition();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				newLine();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				conditionStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends PrintStatementContext {
		public ExpressionsContext exp;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public PrintContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnContext extends PrintStatementContext {
		public ExpressionsContext exp;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public PrintlnContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printStatement);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__0);
				setState(42);
				((PrintContext)_localctx).exp = expressions();
				setState(43);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__2);
				setState(46);
				((PrintlnContext)_localctx).exp = expressions();
				setState(47);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	 
		public VariableDefinitionContext() { }
		public void copyFrom(VariableDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleVariableContext extends VariableDefinitionContext {
		public Token var;
		public ExpressionsContext exp;
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PCParser.IDENTIFIER, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public MultipleVariableContext(VariableDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitMultipleVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastVariableContext extends VariableDefinitionContext {
		public Token var;
		public ExpressionsContext exp;
		public TerminalNode IDENTIFIER() { return getToken(PCParser.IDENTIFIER, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public LastVariableContext(VariableDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitLastVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDefinition);
		try {
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new MultipleVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((MultipleVariableContext)_localctx).var = match(IDENTIFIER);
				setState(52);
				match(T__3);
				setState(53);
				((MultipleVariableContext)_localctx).exp = expressions();
				setState(54);
				match(T__4);
				setState(55);
				variableDefinition();
				}
				break;
			case 2:
				_localctx = new LastVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				((LastVariableContext)_localctx).var = match(IDENTIFIER);
				setState(58);
				match(T__3);
				setState(59);
				((LastVariableContext)_localctx).exp = expressions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionStatementContext extends ParserRuleContext {
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
	 
		public ConditionStatementContext() { }
		public void copyFrom(ConditionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseContext extends ConditionStatementContext {
		public ExpressionsContext exp;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfElseContext(ConditionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditionStatement);
		try {
			_localctx = new IfElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__5);
			setState(63);
			((IfElseContext)_localctx).exp = expressions();
			setState(64);
			match(T__6);
			setState(65);
			((IfElseContext)_localctx).onTrue = block();
			setState(66);
			match(T__7);
			setState(67);
			((IfElseContext)_localctx).onFalse = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<ProgramPartContext> programPart() {
			return getRuleContexts(ProgramPartContext.class);
		}
		public ProgramPartContext programPart(int i) {
			return getRuleContext(ProgramPartContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(69);
					programPart();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionExpressionContext extends ParserRuleContext {
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
	 
		public ConditionExpressionContext() { }
		public void copyFrom(ConditionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HighContext extends ConditionExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HighContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitHigh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends ConditionExpressionContext {
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NullContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ConditionExpressionContext {
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualContext extends ConditionExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ConditionExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HighEqualContext extends ConditionExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HighEqualContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitHighEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualContext extends ConditionExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessEqualContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotNullContext extends ConditionExpressionContext {
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotNullContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitNotNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends ConditionExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessContext(ConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionExpression);
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((NullContext)_localctx).exp = expression(0);
				setState(75);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new NotNullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((NotNullContext)_localctx).exp = expression(0);
				setState(78);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(T__10);
				setState(81);
				((NotContext)_localctx).exp = expression(0);
				}
				break;
			case 4:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				((EqualContext)_localctx).left = expression(0);
				setState(83);
				match(T__11);
				setState(84);
				((EqualContext)_localctx).right = expression(0);
				}
				break;
			case 5:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				((NotEqualContext)_localctx).left = expression(0);
				setState(87);
				match(T__12);
				setState(88);
				((NotEqualContext)_localctx).right = expression(0);
				}
				break;
			case 6:
				_localctx = new LessEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				((LessEqualContext)_localctx).left = expression(0);
				setState(91);
				match(T__13);
				setState(92);
				((LessEqualContext)_localctx).right = expression(0);
				}
				break;
			case 7:
				_localctx = new HighEqualContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				((HighEqualContext)_localctx).left = expression(0);
				setState(95);
				match(T__14);
				setState(96);
				((HighEqualContext)_localctx).right = expression(0);
				}
				break;
			case 8:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				((LessContext)_localctx).left = expression(0);
				setState(99);
				match(T__15);
				setState(100);
				((LessContext)_localctx).right = expression(0);
				}
				break;
			case 9:
				_localctx = new HighContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				((HighContext)_localctx).left = expression(0);
				setState(103);
				match(T__16);
				setState(104);
				((HighContext)_localctx).right = expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public List<ConditionExpressionContext> conditionExpression() {
			return getRuleContexts(ConditionExpressionContext.class);
		}
		public ConditionExpressionContext conditionExpression(int i) {
			return getRuleContext(ConditionExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressions);
		try {
			int _alt;
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(108);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(111); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(113);
						stringExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(116); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(118);
						conditionExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(121); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringExpressionContext extends ParserRuleContext {
		public StringReadContext stringRead() {
			return getRuleContext(StringReadContext.class,0);
		}
		public StringMultiplyContext stringMultiply() {
			return getRuleContext(StringMultiplyContext.class,0);
		}
		public StringConcatContext stringConcat() {
			return getRuleContext(StringConcatContext.class,0);
		}
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringExpression);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				stringRead();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				stringMultiply();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				stringConcat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConcatContext extends ParserRuleContext {
		public StringConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConcat; }
	 
		public StringConcatContext() { }
		public void copyFrom(StringConcatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringAddVariableContext extends StringConcatContext {
		public Token var;
		public StringConcatAddContext right;
		public TerminalNode IDENTIFIER() { return getToken(PCParser.IDENTIFIER, 0); }
		public StringConcatAddContext stringConcatAdd() {
			return getRuleContext(StringConcatAddContext.class,0);
		}
		public StringAddVariableContext(StringConcatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringAddVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAddContext extends StringConcatContext {
		public Token str;
		public StringConcatAddContext right;
		public TerminalNode STRING() { return getToken(PCParser.STRING, 0); }
		public StringConcatAddContext stringConcatAdd() {
			return getRuleContext(StringConcatAddContext.class,0);
		}
		public StringAddContext(StringConcatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConcatContext stringConcat() throws RecognitionException {
		StringConcatContext _localctx = new StringConcatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stringConcat);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new StringAddVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((StringAddVariableContext)_localctx).var = match(IDENTIFIER);
				setState(131);
				match(T__17);
				setState(132);
				((StringAddVariableContext)_localctx).right = stringConcatAdd(0);
				}
				break;
			case STRING:
				_localctx = new StringAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((StringAddContext)_localctx).str = match(STRING);
				setState(134);
				match(T__17);
				setState(135);
				((StringAddContext)_localctx).right = stringConcatAdd(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConcatAddContext extends ParserRuleContext {
		public StringConcatAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConcatAdd; }
	 
		public StringConcatAddContext() { }
		public void copyFrom(StringConcatAddContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringAddConcatContext extends StringConcatAddContext {
		public StringConcatAddContext left;
		public StringConcatAddContext right;
		public List<StringConcatAddContext> stringConcatAdd() {
			return getRuleContexts(StringConcatAddContext.class);
		}
		public StringConcatAddContext stringConcatAdd(int i) {
			return getRuleContext(StringConcatAddContext.class,i);
		}
		public StringAddConcatContext(StringConcatAddContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringAddConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAddStringContext extends StringConcatAddContext {
		public Token str;
		public TerminalNode STRING() { return getToken(PCParser.STRING, 0); }
		public StringAddStringContext(StringConcatAddContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringAddString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAddVarContext extends StringConcatAddContext {
		public Token var;
		public TerminalNode IDENTIFIER() { return getToken(PCParser.IDENTIFIER, 0); }
		public StringAddVarContext(StringConcatAddContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringAddVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAddDigitContext extends StringConcatAddContext {
		public Token digit;
		public TerminalNode DIGIT() { return getToken(PCParser.DIGIT, 0); }
		public StringAddDigitContext(StringConcatAddContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringAddDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAddDecimalContext extends StringConcatAddContext {
		public Token decimal;
		public TerminalNode DECIMAL() { return getToken(PCParser.DECIMAL, 0); }
		public StringAddDecimalContext(StringConcatAddContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringAddDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConcatAddContext stringConcatAdd() throws RecognitionException {
		return stringConcatAdd(0);
	}

	private StringConcatAddContext stringConcatAdd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringConcatAddContext _localctx = new StringConcatAddContext(_ctx, _parentState);
		StringConcatAddContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_stringConcatAdd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new StringAddVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(139);
				((StringAddVarContext)_localctx).var = match(IDENTIFIER);
				}
				break;
			case STRING:
				{
				_localctx = new StringAddStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				((StringAddStringContext)_localctx).str = match(STRING);
				}
				break;
			case DIGIT:
				{
				_localctx = new StringAddDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				((StringAddDigitContext)_localctx).digit = match(DIGIT);
				}
				break;
			case DECIMAL:
				{
				_localctx = new StringAddDecimalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				((StringAddDecimalContext)_localctx).decimal = match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StringAddConcatContext(new StringConcatAddContext(_parentctx, _parentState));
					((StringAddConcatContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_stringConcatAdd);
					setState(145);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(146);
					match(T__17);
					setState(147);
					((StringAddConcatContext)_localctx).right = stringConcatAdd(6);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StringMultiplyContext extends ParserRuleContext {
		public StringMultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringMultiply; }
	 
		public StringMultiplyContext() { }
		public void copyFrom(StringMultiplyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringRepeatStringContext extends StringMultiplyContext {
		public Token str;
		public Token digit;
		public TerminalNode STRING() { return getToken(PCParser.STRING, 0); }
		public TerminalNode DIGIT() { return getToken(PCParser.DIGIT, 0); }
		public StringRepeatStringContext(StringMultiplyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringRepeatString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringRepeatVarContext extends StringMultiplyContext {
		public Token var;
		public Token digit;
		public TerminalNode IDENTIFIER() { return getToken(PCParser.IDENTIFIER, 0); }
		public TerminalNode DIGIT() { return getToken(PCParser.DIGIT, 0); }
		public StringRepeatVarContext(StringMultiplyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitStringRepeatVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringMultiplyContext stringMultiply() throws RecognitionException {
		StringMultiplyContext _localctx = new StringMultiplyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringMultiply);
		try {
			setState(159);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new StringRepeatVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((StringRepeatVarContext)_localctx).var = match(IDENTIFIER);
				setState(154);
				match(T__18);
				setState(155);
				((StringRepeatVarContext)_localctx).digit = match(DIGIT);
				}
				break;
			case STRING:
				_localctx = new StringRepeatStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				((StringRepeatStringContext)_localctx).str = match(STRING);
				setState(157);
				match(T__18);
				setState(158);
				((StringRepeatStringContext)_localctx).digit = match(DIGIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringReadContext extends ParserRuleContext {
		public StringReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringRead; }
	 
		public StringReadContext() { }
		public void copyFrom(StringReadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends StringReadContext {
		public Token str;
		public TerminalNode STRING() { return getToken(PCParser.STRING, 0); }
		public StringContext(StringReadContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringReadContext stringRead() throws RecognitionException {
		StringReadContext _localctx = new StringReadContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringRead);
		try {
			_localctx = new StringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((StringContext)_localctx).str = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExpressionContext {
		public ExpressionContext leftExp;
		public ExpressionContext rightExp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends ExpressionContext {
		public ExpressionContext leftExp;
		public ExpressionContext rightExp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivideContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitContext extends ExpressionContext {
		public Token digit;
		public TerminalNode DIGIT() { return getToken(PCParser.DIGIT, 0); }
		public DigitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token var;
		public TerminalNode IDENTIFIER() { return getToken(PCParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalContext extends ExpressionContext {
		public Token decimal;
		public TerminalNode DECIMAL() { return getToken(PCParser.DECIMAL, 0); }
		public DecimalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends ExpressionContext {
		public ExpressionContext leftExp;
		public ExpressionContext rightExp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractContext extends ExpressionContext {
		public ExpressionContext leftExp;
		public ExpressionContext rightExp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubtractContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitSubtract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				_localctx = new DigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164);
				((DigitContext)_localctx).digit = match(DIGIT);
				}
				break;
			case DECIMAL:
				{
				_localctx = new DecimalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				((DecimalContext)_localctx).decimal = match(DECIMAL);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				((VariableContext)_localctx).var = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						((DivideContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(170);
						match(T__19);
						setState(171);
						((DivideContext)_localctx).rightExp = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(173);
						match(T__18);
						setState(174);
						((MultiplyContext)_localctx).rightExp = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						((SubtractContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(176);
						match(T__20);
						setState(177);
						((SubtractContext)_localctx).rightExp = expression(6);
						}
						break;
					case 4:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						((AddContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(179);
						match(T__17);
						setState(180);
						((AddContext)_localctx).rightExp = expression(5);
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewLineContext extends ParserRuleContext {
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
	 
		public NewLineContext() { }
		public void copyFrom(NewLineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LineContext extends NewLineContext {
		public LineContext(NewLineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCVisitor ) return ((PCVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_newLine);
		try {
			_localctx = new LineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return stringConcatAdd_sempred((StringConcatAddContext)_localctx, predIndex);
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stringConcatAdd_sempred(StringConcatAddContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00bf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\6\7I\n\7\r\7\16\7J\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\6\tp\n\t\r\t\16\tq\3\t\6\tu\n\t\r\t"+
		"\16\tv\3\t\6\tz\n\t\r\t\16\t{\5\t~\n\t\3\n\3\n\3\n\5\n\u0083\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0092"+
		"\n\f\3\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00a2\n\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00aa\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b8\n\17"+
		"\f\17\16\17\u00bb\13\17\3\20\3\20\3\20\2\4\26\34\21\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36\2\2\u00d1\2!\3\2\2\2\4)\3\2\2\2\6\63\3\2\2\2\b>"+
		"\3\2\2\2\n@\3\2\2\2\fH\3\2\2\2\16l\3\2\2\2\20}\3\2\2\2\22\u0082\3\2\2"+
		"\2\24\u008a\3\2\2\2\26\u0091\3\2\2\2\30\u00a1\3\2\2\2\32\u00a3\3\2\2\2"+
		"\34\u00a9\3\2\2\2\36\u00bc\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3"+
		"\2\2\2#$\3\2\2\2$\3\3\2\2\2%*\5\6\4\2&*\5\b\5\2\'*\5\36\20\2(*\5\n\6\2"+
		")%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\7\3\2\2,-\5\20"+
		"\t\2-.\7\4\2\2.\64\3\2\2\2/\60\7\5\2\2\60\61\5\20\t\2\61\62\7\4\2\2\62"+
		"\64\3\2\2\2\63+\3\2\2\2\63/\3\2\2\2\64\7\3\2\2\2\65\66\7\34\2\2\66\67"+
		"\7\6\2\2\678\5\20\t\289\7\7\2\29:\5\b\5\2:?\3\2\2\2;<\7\34\2\2<=\7\6\2"+
		"\2=?\5\20\t\2>\65\3\2\2\2>;\3\2\2\2?\t\3\2\2\2@A\7\b\2\2AB\5\20\t\2BC"+
		"\7\t\2\2CD\5\f\7\2DE\7\n\2\2EF\5\f\7\2F\13\3\2\2\2GI\5\4\3\2HG\3\2\2\2"+
		"IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LM\5\34\17\2MN\7\13\2\2Nm\3\2"+
		"\2\2OP\5\34\17\2PQ\7\f\2\2Qm\3\2\2\2RS\7\r\2\2Sm\5\34\17\2TU\5\34\17\2"+
		"UV\7\16\2\2VW\5\34\17\2Wm\3\2\2\2XY\5\34\17\2YZ\7\17\2\2Z[\5\34\17\2["+
		"m\3\2\2\2\\]\5\34\17\2]^\7\20\2\2^_\5\34\17\2_m\3\2\2\2`a\5\34\17\2ab"+
		"\7\21\2\2bc\5\34\17\2cm\3\2\2\2de\5\34\17\2ef\7\22\2\2fg\5\34\17\2gm\3"+
		"\2\2\2hi\5\34\17\2ij\7\23\2\2jk\5\34\17\2km\3\2\2\2lL\3\2\2\2lO\3\2\2"+
		"\2lR\3\2\2\2lT\3\2\2\2lX\3\2\2\2l\\\3\2\2\2l`\3\2\2\2ld\3\2\2\2lh\3\2"+
		"\2\2m\17\3\2\2\2np\5\34\17\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r"+
		"~\3\2\2\2su\5\22\n\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w~\3\2\2\2"+
		"xz\5\16\b\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}o\3\2\2"+
		"\2}t\3\2\2\2}y\3\2\2\2~\21\3\2\2\2\177\u0083\5\32\16\2\u0080\u0083\5\30"+
		"\r\2\u0081\u0083\5\24\13\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\23\3\2\2\2\u0084\u0085\7\34\2\2\u0085\u0086\7\24"+
		"\2\2\u0086\u008b\5\26\f\2\u0087\u0088\7\33\2\2\u0088\u0089\7\24\2\2\u0089"+
		"\u008b\5\26\f\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\25\3\2\2"+
		"\2\u008c\u008d\b\f\1\2\u008d\u0092\7\34\2\2\u008e\u0092\7\33\2\2\u008f"+
		"\u0092\7\31\2\2\u0090\u0092\7\32\2\2\u0091\u008c\3\2\2\2\u0091\u008e\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0098\3\2\2\2\u0093"+
		"\u0094\f\7\2\2\u0094\u0095\7\24\2\2\u0095\u0097\5\26\f\b\u0096\u0093\3"+
		"\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\27\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\34\2\2\u009c\u009d\7\25"+
		"\2\2\u009d\u00a2\7\31\2\2\u009e\u009f\7\33\2\2\u009f\u00a0\7\25\2\2\u00a0"+
		"\u00a2\7\31\2\2\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\31\3\2\2"+
		"\2\u00a3\u00a4\7\33\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\b\17\1\2\u00a6\u00aa"+
		"\7\31\2\2\u00a7\u00aa\7\32\2\2\u00a8\u00aa\7\34\2\2\u00a9\u00a5\3\2\2"+
		"\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00b9\3\2\2\2\u00ab\u00ac"+
		"\f\t\2\2\u00ac\u00ad\7\26\2\2\u00ad\u00b8\5\34\17\n\u00ae\u00af\f\b\2"+
		"\2\u00af\u00b0\7\25\2\2\u00b0\u00b8\5\34\17\t\u00b1\u00b2\f\7\2\2\u00b2"+
		"\u00b3\7\27\2\2\u00b3\u00b8\5\34\17\b\u00b4\u00b5\f\6\2\2\u00b5\u00b6"+
		"\7\24\2\2\u00b6\u00b8\5\34\17\7\u00b7\u00ab\3\2\2\2\u00b7\u00ae\3\2\2"+
		"\2\u00b7\u00b1\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\35\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7\30\2\2\u00bd\37\3\2\2\2\24#)\63>Jlqv{}\u0082\u008a\u0091\u0098"+
		"\u00a1\u00a9\u00b7\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}