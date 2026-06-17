// Generated from Zuju.g4 by ANTLR 4.4
package com.lenguaje.zuju.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import com.lenguaje.zuju.interprete.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ZujuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, ENT=2, REAL=3, CADENA=4, BOOL=5, MOSTRAR=6, SI=7, SINO=8, 
		MAS=9, MENOS=10, MULT=11, DIV=12, Y=13, O=14, MAYORQ=15, MENORQ=16, MAYORI=17, 
		MENORI=18, IGUAL=19, NOIGUAL=20, ASIGNAR=21, LLAVE_ABIERTA=22, LLAVE_CERRADA=23, 
		PAR_ABIERTO=24, PAR_CERRADO=25, PUNTO_COMA=26, BOOLEAN=27, ID=28, ENTERO=29, 
		NUMERO=30, WS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'programa'", "'ent'", "'real'", "'cadena'", "'bool'", "'mostrar'", 
		"'si'", "'sino'", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'", 
		"BOOLEAN", "ID", "ENTERO", "NUMERO", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_var_decl = 2, RULE_var_asignacion = 3, 
		RULE_mostrar = 4, RULE_condicional = 5, RULE_enunciado = 6, RULE_proposicion = 7, 
		RULE_expresion = 8, RULE_factor = 9, RULE_term = 10;
	public static final String[] ruleNames = {
		"program", "sentencia", "var_decl", "var_asignacion", "mostrar", "condicional", 
		"enunciado", "proposicion", "expresion", "factor", "term"
	};

	@Override
	public String getGrammarFileName() { return "Zuju.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public ZujuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SentenciaContext sentencia;
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public TerminalNode ID() { return getToken(ZujuParser.ID, 0); }
		public TerminalNode LLAVE_CERRADA() { return getToken(ZujuParser.LLAVE_CERRADA, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(ZujuParser.LLAVE_ABIERTA, 0); }
		public TerminalNode PROGRAMA() { return getToken(ZujuParser.PROGRAMA, 0); }
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(PROGRAMA);
			setState(23); match(ID);
			setState(24); match(LLAVE_ABIERTA);

						List<ASTNode> body = new ArrayList<ASTNode>();
					
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << REAL) | (1L << CADENA) | (1L << BOOL) | (1L << MOSTRAR) | (1L << SI) | (1L << ID))) != 0)) {
				{
				{
				setState(26); ((ProgramContext)_localctx).sentencia = sentencia();
				body.add(((ProgramContext)_localctx).sentencia.node);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(LLAVE_CERRADA);

						for(ASTNode n : body) {
							n.execute();
						}
					
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

	public static class SentenciaContext extends ParserRuleContext {
		public ASTNode node;
		public MostrarContext mostrar;
		public CondicionalContext condicional;
		public Var_asignacionContext var_asignacion() {
			return getRuleContext(Var_asignacionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case ENT:
			case REAL:
			case CADENA:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); var_asignacion();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); ((SentenciaContext)_localctx).mostrar = mostrar();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).mostrar.node;
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(42); ((SentenciaContext)_localctx).condicional = condicional();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).condicional.node;
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

	public static class Var_declContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(ZujuParser.ID, 0); }
		public TerminalNode REAL() { return getToken(ZujuParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(ZujuParser.BOOL, 0); }
		public TerminalNode CADENA() { return getToken(ZujuParser.CADENA, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ZujuParser.PUNTO_COMA, 0); }
		public TerminalNode ENT() { return getToken(ZujuParser.ENT, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << REAL) | (1L << CADENA) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(48); ((Var_declContext)_localctx).ID = match(ID);
			setState(49); match(PUNTO_COMA);
			symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), 0);
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

	public static class Var_asignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ZujuParser.ID, 0); }
		public EnunciadoContext enunciado() {
			return getRuleContext(EnunciadoContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(ZujuParser.PUNTO_COMA, 0); }
		public TerminalNode ASIGNAR() { return getToken(ZujuParser.ASIGNAR, 0); }
		public Var_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterVar_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitVar_asignacion(this);
		}
	}

	public final Var_asignacionContext var_asignacion() throws RecognitionException {
		Var_asignacionContext _localctx = new Var_asignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(ID);
			setState(53); match(ASIGNAR);
			setState(54); enunciado();
			setState(55); match(PUNTO_COMA);

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

	public static class MostrarContext extends ParserRuleContext {
		public ASTNode node;
		public EnunciadoContext enunciado;
		public EnunciadoContext enunciado() {
			return getRuleContext(EnunciadoContext.class,0);
		}
		public TerminalNode MOSTRAR() { return getToken(ZujuParser.MOSTRAR, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ZujuParser.PUNTO_COMA, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitMostrar(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(MOSTRAR);
			setState(59); ((MostrarContext)_localctx).enunciado = enunciado();
			setState(60); match(PUNTO_COMA);
			((MostrarContext)_localctx).node =  new Mostrar(((MostrarContext)_localctx).enunciado.node);
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

	public static class CondicionalContext extends ParserRuleContext {
		public ASTNode node;
		public EnunciadoContext enunciado;
		public SentenciaContext s1;
		public SentenciaContext s2;
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public EnunciadoContext enunciado() {
			return getRuleContext(EnunciadoContext.class,0);
		}
		public List<TerminalNode> LLAVE_CERRADA() { return getTokens(ZujuParser.LLAVE_CERRADA); }
		public List<TerminalNode> LLAVE_ABIERTA() { return getTokens(ZujuParser.LLAVE_ABIERTA); }
		public TerminalNode PAR_CERRADO() { return getToken(ZujuParser.PAR_CERRADO, 0); }
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode SI() { return getToken(ZujuParser.SI, 0); }
		public TerminalNode PAR_ABIERTO() { return getToken(ZujuParser.PAR_ABIERTO, 0); }
		public TerminalNode LLAVE_ABIERTA(int i) {
			return getToken(ZujuParser.LLAVE_ABIERTA, i);
		}
		public TerminalNode SINO() { return getToken(ZujuParser.SINO, 0); }
		public TerminalNode LLAVE_CERRADA(int i) {
			return getToken(ZujuParser.LLAVE_CERRADA, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(SI);
			setState(64); match(PAR_ABIERTO);
			setState(65); ((CondicionalContext)_localctx).enunciado = enunciado();
			setState(66); match(PAR_CERRADO);

								List<ASTNode> body = new ArrayList<ASTNode>();
							
			setState(68); match(LLAVE_ABIERTA);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << REAL) | (1L << CADENA) | (1L << BOOL) | (1L << MOSTRAR) | (1L << SI) | (1L << ID))) != 0)) {
				{
				{
				setState(69); ((CondicionalContext)_localctx).s1 = sentencia();
				 body.add(((CondicionalContext)_localctx).s1.node);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); match(LLAVE_CERRADA);
			setState(78); match(SINO);

								List<ASTNode> elseBody = new ArrayList<ASTNode>();
							
			setState(80); match(LLAVE_ABIERTA);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << REAL) | (1L << CADENA) | (1L << BOOL) | (1L << MOSTRAR) | (1L << SI) | (1L << ID))) != 0)) {
				{
				{
				setState(81); ((CondicionalContext)_localctx).s2 = sentencia();
				elseBody.add(((CondicionalContext)_localctx).s2.node);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); match(LLAVE_CERRADA);

								((CondicionalContext)_localctx).node =  new Si(((CondicionalContext)_localctx).enunciado.node,body,elseBody);
							
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

	public static class EnunciadoContext extends ParserRuleContext {
		public ASTNode node;
		public ProposicionContext t1;
		public ProposicionContext t2;
		public ProposicionContext proposicion(int i) {
			return getRuleContext(ProposicionContext.class,i);
		}
		public TerminalNode O(int i) {
			return getToken(ZujuParser.O, i);
		}
		public List<TerminalNode> Y() { return getTokens(ZujuParser.Y); }
		public List<TerminalNode> O() { return getTokens(ZujuParser.O); }
		public TerminalNode Y(int i) {
			return getToken(ZujuParser.Y, i);
		}
		public List<ProposicionContext> proposicion() {
			return getRuleContexts(ProposicionContext.class);
		}
		public EnunciadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterEnunciado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitEnunciado(this);
		}
	}

	public final EnunciadoContext enunciado() throws RecognitionException {
		EnunciadoContext _localctx = new EnunciadoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enunciado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); ((EnunciadoContext)_localctx).t1 = proposicion();
			((EnunciadoContext)_localctx).node =  ((EnunciadoContext)_localctx).t1.node;
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y || _la==O) {
				{
				setState(102);
				switch (_input.LA(1)) {
				case O:
					{
					setState(94); match(O);
					setState(95); ((EnunciadoContext)_localctx).t2 = proposicion();
					((EnunciadoContext)_localctx).node =  new OLog(_localctx.node,((EnunciadoContext)_localctx).t2.node);
					}
					break;
				case Y:
					{
					setState(98); match(Y);
					setState(99); ((EnunciadoContext)_localctx).t2 = proposicion();
					((EnunciadoContext)_localctx).node =  new YLog(_localctx.node,((EnunciadoContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ProposicionContext extends ParserRuleContext {
		public ASTNode node;
		public ExpresionContext t1;
		public ExpresionContext t2;
		public TerminalNode MAYORQ(int i) {
			return getToken(ZujuParser.MAYORQ, i);
		}
		public TerminalNode MENORI(int i) {
			return getToken(ZujuParser.MENORI, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public TerminalNode MENORQ(int i) {
			return getToken(ZujuParser.MENORQ, i);
		}
		public List<TerminalNode> MENORQ() { return getTokens(ZujuParser.MENORQ); }
		public List<TerminalNode> MENORI() { return getTokens(ZujuParser.MENORI); }
		public List<TerminalNode> MAYORQ() { return getTokens(ZujuParser.MAYORQ); }
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode IGUAL(int i) {
			return getToken(ZujuParser.IGUAL, i);
		}
		public TerminalNode MAYORI(int i) {
			return getToken(ZujuParser.MAYORI, i);
		}
		public List<TerminalNode> MAYORI() { return getTokens(ZujuParser.MAYORI); }
		public List<TerminalNode> IGUAL() { return getTokens(ZujuParser.IGUAL); }
		public ProposicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterProposicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitProposicion(this);
		}
	}

	public final ProposicionContext proposicion() throws RecognitionException {
		ProposicionContext _localctx = new ProposicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_proposicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); ((ProposicionContext)_localctx).t1 = expresion();
			((ProposicionContext)_localctx).node =  ((ProposicionContext)_localctx).t1.node;
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYORQ) | (1L << MENORQ) | (1L << MAYORI) | (1L << MENORI) | (1L << IGUAL))) != 0)) {
				{
				setState(129);
				switch (_input.LA(1)) {
				case MAYORQ:
					{
					setState(109); match(MAYORQ);
					setState(110); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new Comparacion(_localctx.node,((ProposicionContext)_localctx).t2.node);
					}
					break;
				case MENORQ:
					{
					setState(113); match(MENORQ);
					setState(114); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new Comparacion(((ProposicionContext)_localctx).t2.node,_localctx.node);
					}
					break;
				case IGUAL:
					{
					setState(117); match(IGUAL);
					setState(118); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new Igualacion(_localctx.node, ((ProposicionContext)_localctx).t2.node);
					}
					break;
				case MAYORI:
					{
					setState(121); match(MAYORI);
					setState(122); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new ComparacionIg(_localctx.node,((ProposicionContext)_localctx).t2.node);
					}
					break;
				case MENORI:
					{
					setState(125); match(MENORI);
					setState(126); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new ComparacionIg(((ProposicionContext)_localctx).t2.node,_localctx.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ExpresionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public List<TerminalNode> MENOS() { return getTokens(ZujuParser.MENOS); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MENOS(int i) {
			return getToken(ZujuParser.MENOS, i);
		}
		public List<TerminalNode> MAS() { return getTokens(ZujuParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(ZujuParser.MAS, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); ((ExpresionContext)_localctx).t1 = factor();
			((ExpresionContext)_localctx).node =  ((ExpresionContext)_localctx).t1.node;
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAS || _la==MENOS) {
				{
				setState(144);
				switch (_input.LA(1)) {
				case MAS:
					{
					{
					setState(136); match(MAS);
					setState(137); ((ExpresionContext)_localctx).t2 = factor();
					((ExpresionContext)_localctx).node =  new Adicion(_localctx.node,((ExpresionContext)_localctx).t2.node);
					}
					}
					break;
				case MENOS:
					{
					setState(140); match(MENOS);
					setState(141); ((ExpresionContext)_localctx).t2 = factor();
					((ExpresionContext)_localctx).node =  new Sustraccion(_localctx.node,((ExpresionContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public TerminalNode MULT(int i) {
			return getToken(ZujuParser.MULT, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(ZujuParser.MULT); }
		public List<TerminalNode> DIV() { return getTokens(ZujuParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ZujuParser.DIV, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); ((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(159);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(151); match(MULT);
					setState(152); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplicacion(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				case DIV:
					{
					setState(155); match(DIV);
					setState(156); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMERO;
		public Token ENTERO;
		public Token ID;
		public Token BOOLEAN;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(ZujuParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(ZujuParser.NUMERO, 0); }
		public TerminalNode PAR_CERRADO() { return getToken(ZujuParser.PAR_CERRADO, 0); }
		public TerminalNode BOOLEAN() { return getToken(ZujuParser.BOOLEAN, 0); }
		public TerminalNode PAR_ABIERTO() { return getToken(ZujuParser.PAR_ABIERTO, 0); }
		public TerminalNode ENTERO() { return getToken(ZujuParser.ENTERO, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); ((TermContext)_localctx).NUMERO = match(NUMERO);
				((TermContext)_localctx).node =  new Constante(Double.parseDouble((((TermContext)_localctx).NUMERO!=null?((TermContext)_localctx).NUMERO.getText():null)));
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); ((TermContext)_localctx).ENTERO = match(ENTERO);
				((TermContext)_localctx).node =  new Constante(Integer.parseInt((((TermContext)_localctx).ENTERO!=null?((TermContext)_localctx).ENTERO.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); ((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new Id((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(170); ((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constante(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case PAR_ABIERTO:
				enterOuterAlt(_localctx, 5);
				{
				setState(172); match(PAR_ABIERTO);
				setState(173); ((TermContext)_localctx).expresion = expresion();
				((TermContext)_localctx).node =  ((TermContext)_localctx).expresion.node;
				setState(175); match(PAR_CERRADO);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7W\n"+
		"\7\f\7\16\7Z\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\bi\n\b\f\b\16\bl\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0084\n\t\f\t\16\t\u0087"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0093\n\n\f\n\16\n\u0096"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a2\n\13"+
		"\f\13\16\13\u00a5\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00b4\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\4\7"+
		"\u00bf\2\30\3\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b\66\3\2\2\2\n<\3\2\2\2\f"+
		"A\3\2\2\2\16^\3\2\2\2\20m\3\2\2\2\22\u0088\3\2\2\2\24\u0097\3\2\2\2\26"+
		"\u00b3\3\2\2\2\30\31\7\3\2\2\31\32\7\36\2\2\32\33\7\30\2\2\33!\b\2\1\2"+
		"\34\35\5\4\3\2\35\36\b\2\1\2\36 \3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3"+
		"\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\31\2\2%&\b\2\1\2&\3\3\2\2\2"+
		"\'\60\5\6\4\2(\60\5\b\5\2)*\5\n\6\2*+\b\3\1\2+\60\3\2\2\2,-\5\f\7\2-."+
		"\b\3\1\2.\60\3\2\2\2/\'\3\2\2\2/(\3\2\2\2/)\3\2\2\2/,\3\2\2\2\60\5\3\2"+
		"\2\2\61\62\t\2\2\2\62\63\7\36\2\2\63\64\7\34\2\2\64\65\b\4\1\2\65\7\3"+
		"\2\2\2\66\67\7\36\2\2\678\7\27\2\289\5\16\b\29:\7\34\2\2:;\b\5\1\2;\t"+
		"\3\2\2\2<=\7\b\2\2=>\5\16\b\2>?\7\34\2\2?@\b\6\1\2@\13\3\2\2\2AB\7\t\2"+
		"\2BC\7\32\2\2CD\5\16\b\2DE\7\33\2\2EF\b\7\1\2FL\7\30\2\2GH\5\4\3\2HI\b"+
		"\7\1\2IK\3\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3"+
		"\2\2\2OP\7\31\2\2PQ\7\n\2\2QR\b\7\1\2RX\7\30\2\2ST\5\4\3\2TU\b\7\1\2U"+
		"W\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2"+
		"[\\\7\31\2\2\\]\b\7\1\2]\r\3\2\2\2^_\5\20\t\2_j\b\b\1\2`a\7\20\2\2ab\5"+
		"\20\t\2bc\b\b\1\2ci\3\2\2\2de\7\17\2\2ef\5\20\t\2fg\b\b\1\2gi\3\2\2\2"+
		"h`\3\2\2\2hd\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\17\3\2\2\2lj\3\2\2"+
		"\2mn\5\22\n\2n\u0085\b\t\1\2op\7\21\2\2pq\5\22\n\2qr\b\t\1\2r\u0084\3"+
		"\2\2\2st\7\22\2\2tu\5\22\n\2uv\b\t\1\2v\u0084\3\2\2\2wx\7\25\2\2xy\5\22"+
		"\n\2yz\b\t\1\2z\u0084\3\2\2\2{|\7\23\2\2|}\5\22\n\2}~\b\t\1\2~\u0084\3"+
		"\2\2\2\177\u0080\7\24\2\2\u0080\u0081\5\22\n\2\u0081\u0082\b\t\1\2\u0082"+
		"\u0084\3\2\2\2\u0083o\3\2\2\2\u0083s\3\2\2\2\u0083w\3\2\2\2\u0083{\3\2"+
		"\2\2\u0083\177\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\21\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5\24\13\2\u0089"+
		"\u0094\b\n\1\2\u008a\u008b\7\13\2\2\u008b\u008c\5\24\13\2\u008c\u008d"+
		"\b\n\1\2\u008d\u0093\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\5\24\13\2"+
		"\u0090\u0091\b\n\1\2\u0091\u0093\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008e"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\23\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\5\26\f\2\u0098\u00a3\b\13"+
		"\1\2\u0099\u009a\7\r\2\2\u009a\u009b\5\26\f\2\u009b\u009c\b\13\1\2\u009c"+
		"\u00a2\3\2\2\2\u009d\u009e\7\16\2\2\u009e\u009f\5\26\f\2\u009f\u00a0\b"+
		"\13\1\2\u00a0\u00a2\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\25\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7 \2\2\u00a7\u00b4\b\f\1\2\u00a8\u00a9"+
		"\7\37\2\2\u00a9\u00b4\b\f\1\2\u00aa\u00ab\7\36\2\2\u00ab\u00b4\b\f\1\2"+
		"\u00ac\u00ad\7\35\2\2\u00ad\u00b4\b\f\1\2\u00ae\u00af\7\32\2\2\u00af\u00b0"+
		"\5\22\n\2\u00b0\u00b1\b\f\1\2\u00b1\u00b2\7\33\2\2\u00b2\u00b4\3\2\2\2"+
		"\u00b3\u00a6\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ac"+
		"\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\27\3\2\2\2\17!/LXhj\u0083\u0085\u0092"+
		"\u0094\u00a1\u00a3\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}