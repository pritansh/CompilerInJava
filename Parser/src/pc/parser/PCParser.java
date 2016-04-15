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
		T__9=10, DIGIT=11, DECIMAL=12, STRING=13, IDENTIFIER=14, WHITESPACE=15;
	public static final int
		RULE_program = 0, RULE_programPart = 1, RULE_printStatement = 2, RULE_variableDefinition = 3, 
		RULE_expressions = 4, RULE_stringExpression = 5, RULE_stringConcat = 6, 
		RULE_stringConcatAdd = 7, RULE_stringMultiply = 8, RULE_stringRead = 9, 
		RULE_expression = 10, RULE_newLine = 11;
	public static final String[] ruleNames = {
		"program", "programPart", "printStatement", "variableDefinition", "expressions", 
		"stringExpression", "stringConcat", "stringConcatAdd", "stringMultiply", 
		"stringRead", "expression", "newLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print('", "')'", "'println('", "'='", "','", "'+'", "'*'", "'/'", 
		"'-'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				programPart();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__9) | (1L << IDENTIFIER))) != 0) );
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
			setState(32);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				printStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				variableDefinition();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				newLine();
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
			setState(42);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__0);
				setState(35);
				((PrintContext)_localctx).exp = expressions();
				setState(36);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__2);
				setState(39);
				((PrintlnContext)_localctx).exp = expressions();
				setState(40);
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
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new MultipleVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				((MultipleVariableContext)_localctx).var = match(IDENTIFIER);
				setState(45);
				match(T__3);
				setState(46);
				((MultipleVariableContext)_localctx).exp = expressions();
				setState(47);
				match(T__4);
				setState(48);
				variableDefinition();
				}
				break;
			case 2:
				_localctx = new LastVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((LastVariableContext)_localctx).var = match(IDENTIFIER);
				setState(51);
				match(T__3);
				setState(52);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 8, RULE_expressions);
		try {
			int _alt;
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(55);
						stringExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(58); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(60);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(63); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 10, RULE_stringExpression);
		try {
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				stringRead();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				stringMultiply();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
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
		enterRule(_localctx, 12, RULE_stringConcat);
		try {
			setState(78);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new StringAddVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				((StringAddVariableContext)_localctx).var = match(IDENTIFIER);
				setState(73);
				match(T__5);
				setState(74);
				((StringAddVariableContext)_localctx).right = stringConcatAdd(0);
				}
				break;
			case STRING:
				_localctx = new StringAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((StringAddContext)_localctx).str = match(STRING);
				setState(76);
				match(T__5);
				setState(77);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_stringConcatAdd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new StringAddVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(81);
				((StringAddVarContext)_localctx).var = match(IDENTIFIER);
				}
				break;
			case STRING:
				{
				_localctx = new StringAddStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				((StringAddStringContext)_localctx).str = match(STRING);
				}
				break;
			case DIGIT:
				{
				_localctx = new StringAddDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				((StringAddDigitContext)_localctx).digit = match(DIGIT);
				}
				break;
			case DECIMAL:
				{
				_localctx = new StringAddDecimalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				((StringAddDecimalContext)_localctx).decimal = match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StringAddConcatContext(new StringConcatAddContext(_parentctx, _parentState));
					((StringAddConcatContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_stringConcatAdd);
					setState(87);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(88);
					match(T__5);
					setState(89);
					((StringAddConcatContext)_localctx).right = stringConcatAdd(6);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 16, RULE_stringMultiply);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new StringRepeatVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				((StringRepeatVarContext)_localctx).var = match(IDENTIFIER);
				setState(96);
				match(T__6);
				setState(97);
				((StringRepeatVarContext)_localctx).digit = match(DIGIT);
				}
				break;
			case STRING:
				_localctx = new StringRepeatStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				((StringRepeatStringContext)_localctx).str = match(STRING);
				setState(99);
				match(T__6);
				setState(100);
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
		enterRule(_localctx, 18, RULE_stringRead);
		try {
			_localctx = new StringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				_localctx = new DigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(106);
				((DigitContext)_localctx).digit = match(DIGIT);
				}
				break;
			case DECIMAL:
				{
				_localctx = new DecimalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				((DecimalContext)_localctx).decimal = match(DECIMAL);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				((VariableContext)_localctx).var = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						((DivideContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(112);
						match(T__7);
						setState(113);
						((DivideContext)_localctx).rightExp = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(115);
						match(T__6);
						setState(116);
						((MultiplyContext)_localctx).rightExp = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						((SubtractContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(118);
						match(T__8);
						setState(119);
						((SubtractContext)_localctx).rightExp = expression(6);
						}
						break;
					case 4:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						((AddContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(121);
						match(T__5);
						setState(122);
						((AddContext)_localctx).rightExp = expression(5);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 22, RULE_newLine);
		try {
			_localctx = new LineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__9);
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
		case 7:
			return stringConcatAdd_sempred((StringConcatAddContext)_localctx, predIndex);
		case 10:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\5\3#\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\58\n\5\3\6\6\6;\n\6\r\6\16\6<\3\6\6\6@\n\6\r\6\16\6A\5\6D\n"+
		"\6\3\7\3\7\3\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\tX\n\t\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nh\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\fp\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081\13\f\3\r\3\r\3\r"+
		"\2\4\20\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u008e\2\33\3\2\2\2\4\""+
		"\3\2\2\2\6,\3\2\2\2\b\67\3\2\2\2\nC\3\2\2\2\fH\3\2\2\2\16P\3\2\2\2\20"+
		"W\3\2\2\2\22g\3\2\2\2\24i\3\2\2\2\26o\3\2\2\2\30\u0082\3\2\2\2\32\34\5"+
		"\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3"+
		"\2\2\2\37#\5\6\4\2 #\5\b\5\2!#\5\30\r\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2"+
		"\2\2#\5\3\2\2\2$%\7\3\2\2%&\5\n\6\2&\'\7\4\2\2\'-\3\2\2\2()\7\5\2\2)*"+
		"\5\n\6\2*+\7\4\2\2+-\3\2\2\2,$\3\2\2\2,(\3\2\2\2-\7\3\2\2\2./\7\20\2\2"+
		"/\60\7\6\2\2\60\61\5\n\6\2\61\62\7\7\2\2\62\63\5\b\5\2\638\3\2\2\2\64"+
		"\65\7\20\2\2\65\66\7\6\2\2\668\5\n\6\2\67.\3\2\2\2\67\64\3\2\2\28\t\3"+
		"\2\2\29;\5\f\7\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=D\3\2\2\2>@\5"+
		"\26\f\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2C:\3\2\2\2C?"+
		"\3\2\2\2D\13\3\2\2\2EI\5\24\13\2FI\5\22\n\2GI\5\16\b\2HE\3\2\2\2HF\3\2"+
		"\2\2HG\3\2\2\2I\r\3\2\2\2JK\7\20\2\2KL\7\b\2\2LQ\5\20\t\2MN\7\17\2\2N"+
		"O\7\b\2\2OQ\5\20\t\2PJ\3\2\2\2PM\3\2\2\2Q\17\3\2\2\2RS\b\t\1\2SX\7\20"+
		"\2\2TX\7\17\2\2UX\7\r\2\2VX\7\16\2\2WR\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3"+
		"\2\2\2X^\3\2\2\2YZ\f\7\2\2Z[\7\b\2\2[]\5\20\t\b\\Y\3\2\2\2]`\3\2\2\2^"+
		"\\\3\2\2\2^_\3\2\2\2_\21\3\2\2\2`^\3\2\2\2ab\7\20\2\2bc\7\t\2\2ch\7\r"+
		"\2\2de\7\17\2\2ef\7\t\2\2fh\7\r\2\2ga\3\2\2\2gd\3\2\2\2h\23\3\2\2\2ij"+
		"\7\17\2\2j\25\3\2\2\2kl\b\f\1\2lp\7\r\2\2mp\7\16\2\2np\7\20\2\2ok\3\2"+
		"\2\2om\3\2\2\2on\3\2\2\2p\177\3\2\2\2qr\f\t\2\2rs\7\n\2\2s~\5\26\f\nt"+
		"u\f\b\2\2uv\7\t\2\2v~\5\26\f\twx\f\7\2\2xy\7\13\2\2y~\5\26\f\bz{\f\6\2"+
		"\2{|\7\b\2\2|~\5\26\f\7}q\3\2\2\2}t\3\2\2\2}w\3\2\2\2}z\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\27\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u0083\7\f\2\2\u0083\31\3\2\2\2\21\35\",\67<ACHPW^go}\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}