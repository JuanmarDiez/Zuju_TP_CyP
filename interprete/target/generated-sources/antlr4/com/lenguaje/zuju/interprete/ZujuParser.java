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
		PARA=9, MAS=10, MENOS=11, MULT=12, DIV=13, COMENTARIO=14, COMENTARIO_COMPLETO=15, 
		Y=16, O=17, NO=18, MAYORQ=19, MENORQ=20, MAYORI=21, MENORI=22, IGUAL=23, 
		NOIGUAL=24, ASIGNAR=25, LLAVE_ABIERTA=26, LLAVE_CERRADA=27, PAR_ABIERTO=28, 
		PAR_CERRADO=29, PUNTO_COMA=30, COMILLAS=31, BOOLEAN=32, LITERAL_CADENA=33, 
		ID=34, ENTERO=35, NUMERO=36, WS=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'programa'", "'ent'", "'real'", "'cadena'", "'bool'", "'mostrar'", 
		"'si'", "'sino'", "'para'", "'+'", "'-'", "'*'", "'/'", "COMENTARIO", 
		"COMENTARIO_COMPLETO", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", 
		"'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'", "'\"'", "BOOLEAN", 
		"LITERAL_CADENA", "ID", "ENTERO", "NUMERO", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_var_decl = 2, RULE_tipo_dato = 3, 
		RULE_var_asignacion = 4, RULE_mostrar = 5, RULE_condicional = 6, RULE_bucle_para = 7, 
		RULE_enunciado = 8, RULE_proposicion = 9, RULE_expresion = 10, RULE_factor = 11, 
		RULE_term = 12;
	public static final String[] ruleNames = {
		"program", "sentencia", "var_decl", "tipo_dato", "var_asignacion", "mostrar", 
		"condicional", "bucle_para", "enunciado", "proposicion", "expresion", 
		"factor", "term"
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


		Map<String, SimboloVariable> symbolTable = new HashMap<String, SimboloVariable>();

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
			setState(26); match(PROGRAMA);
			setState(27); match(ID);
			setState(28); match(LLAVE_ABIERTA);

						List<ASTNode> body = new ArrayList<ASTNode>();
					
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << REAL) | (1L << CADENA) | (1L << BOOL) | (1L << MOSTRAR) | (1L << SI) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(30); ((ProgramContext)_localctx).sentencia = sentencia();
				body.add(((ProgramContext)_localctx).sentencia.node);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38); match(LLAVE_CERRADA);

						for(ASTNode n : body) {
							n.execute(symbolTable);
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
		public Var_declContext var_decl;
		public Var_asignacionContext var_asignacion;
		public MostrarContext mostrar;
		public CondicionalContext condicional;
		public Bucle_paraContext bucle_para;
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
		public Bucle_paraContext bucle_para() {
			return getRuleContext(Bucle_paraContext.class,0);
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
			setState(56);
			switch (_input.LA(1)) {
			case ENT:
			case REAL:
			case CADENA:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); ((SentenciaContext)_localctx).var_decl = var_decl();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).var_decl.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); ((SentenciaContext)_localctx).var_asignacion = var_asignacion();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).var_asignacion.node;
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(47); ((SentenciaContext)_localctx).mostrar = mostrar();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).mostrar.node;
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(50); ((SentenciaContext)_localctx).condicional = condicional();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).condicional.node;
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(53); ((SentenciaContext)_localctx).bucle_para = bucle_para();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).bucle_para.node;
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
		public ASTNode node;
		public Tipo_datoContext tipo_dato;
		public Token ID;
		public TerminalNode ID() { return getToken(ZujuParser.ID, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(ZujuParser.PUNTO_COMA, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); ((Var_declContext)_localctx).tipo_dato = tipo_dato();
			setState(59); ((Var_declContext)_localctx).ID = match(ID);
			setState(60); match(PUNTO_COMA);
			((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).tipo_dato!=null?_input.getText(((Var_declContext)_localctx).tipo_dato.start,((Var_declContext)_localctx).tipo_dato.stop):null), (((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
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

	public static class Tipo_datoContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode REAL() { return getToken(ZujuParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(ZujuParser.BOOL, 0); }
		public TerminalNode CADENA() { return getToken(ZujuParser.CADENA, 0); }
		public TerminalNode ENT() { return getToken(ZujuParser.ENT, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitTipo_dato(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << REAL) | (1L << CADENA) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public ASTNode node;
		public Token ID;
		public EnunciadoContext enunciado;
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
		enterRule(_localctx, 8, RULE_var_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); ((Var_asignacionContext)_localctx).ID = match(ID);
			setState(66); match(ASIGNAR);
			setState(67); ((Var_asignacionContext)_localctx).enunciado = enunciado();
			setState(68); match(PUNTO_COMA);
			((Var_asignacionContext)_localctx).node =  new VarAssign((((Var_asignacionContext)_localctx).ID!=null?((Var_asignacionContext)_localctx).ID.getText():null), ((Var_asignacionContext)_localctx).enunciado.node);
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
		enterRule(_localctx, 10, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(MOSTRAR);
			setState(72); ((MostrarContext)_localctx).enunciado = enunciado();
			setState(73); match(PUNTO_COMA);
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
		enterRule(_localctx, 12, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(SI);
			setState(77); match(PAR_ABIERTO);
			setState(78); ((CondicionalContext)_localctx).enunciado = enunciado();
			setState(79); match(PAR_CERRADO);

								List<ASTNode> body = new ArrayList<ASTNode>();
							
			setState(81); match(LLAVE_ABIERTA);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << REAL) | (1L << CADENA) | (1L << BOOL) | (1L << MOSTRAR) | (1L << SI) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(82); ((CondicionalContext)_localctx).s1 = sentencia();
				 body.add(((CondicionalContext)_localctx).s1.node);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); match(LLAVE_CERRADA);
			setState(91); match(SINO);

								List<ASTNode> elseBody = new ArrayList<ASTNode>();
							
			setState(93); match(LLAVE_ABIERTA);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << REAL) | (1L << CADENA) | (1L << BOOL) | (1L << MOSTRAR) | (1L << SI) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(94); ((CondicionalContext)_localctx).s2 = sentencia();
				elseBody.add(((CondicionalContext)_localctx).s2.node);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); match(LLAVE_CERRADA);

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

	public static class Bucle_paraContext extends ParserRuleContext {
		public ASTNode node;
		public Var_declContext decl;
		public Var_asignacionContext asig;
		public ProposicionContext proposicion;
		public Token id1;
		public EnunciadoContext en;
		public SentenciaContext sentencia;
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ZujuParser.LLAVE_CERRADA, 0); }
		public TerminalNode PARA() { return getToken(ZujuParser.PARA, 0); }
		public TerminalNode PAR_CERRADO() { return getToken(ZujuParser.PAR_CERRADO, 0); }
		public TerminalNode PAR_ABIERTO() { return getToken(ZujuParser.PAR_ABIERTO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ZujuParser.PUNTO_COMA, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_asignacionContext var_asignacion() {
			return getRuleContext(Var_asignacionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZujuParser.ID, 0); }
		public EnunciadoContext enunciado() {
			return getRuleContext(EnunciadoContext.class,0);
		}
		public TerminalNode LLAVE_ABIERTA() { return getToken(ZujuParser.LLAVE_ABIERTA, 0); }
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode ASIGNAR() { return getToken(ZujuParser.ASIGNAR, 0); }
		public ProposicionContext proposicion() {
			return getRuleContext(ProposicionContext.class,0);
		}
		public Bucle_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).enterBucle_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZujuListener ) ((ZujuListener)listener).exitBucle_para(this);
		}
	}

	public final Bucle_paraContext bucle_para() throws RecognitionException {
		Bucle_paraContext _localctx = new Bucle_paraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bucle_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(PARA);
			setState(106); match(PAR_ABIERTO);
			setState(107); ((Bucle_paraContext)_localctx).decl = var_decl();
			setState(108); ((Bucle_paraContext)_localctx).asig = var_asignacion();
			setState(109); ((Bucle_paraContext)_localctx).proposicion = proposicion();
			setState(110); match(PUNTO_COMA);
			setState(111); ((Bucle_paraContext)_localctx).id1 = match(ID);
			setState(112); match(ASIGNAR);
			setState(113); ((Bucle_paraContext)_localctx).en = enunciado();
			setState(114); match(PAR_CERRADO);
			List<ASTNode> body = new ArrayList<ASTNode>();
			setState(116); match(LLAVE_ABIERTA);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << REAL) | (1L << CADENA) | (1L << BOOL) | (1L << MOSTRAR) | (1L << SI) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(117); ((Bucle_paraContext)_localctx).sentencia = sentencia();
				body.add(((Bucle_paraContext)_localctx).sentencia.node);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125); match(LLAVE_CERRADA);
			((Bucle_paraContext)_localctx).node =  new BuclePara(((Bucle_paraContext)_localctx).decl.node, ((Bucle_paraContext)_localctx).asig.node, ((Bucle_paraContext)_localctx).proposicion.node, new VarAssign((((Bucle_paraContext)_localctx).id1!=null?((Bucle_paraContext)_localctx).id1.getText():null), ((Bucle_paraContext)_localctx).en.node), body);
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
		enterRule(_localctx, 16, RULE_enunciado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); ((EnunciadoContext)_localctx).t1 = proposicion();
			((EnunciadoContext)_localctx).node =  ((EnunciadoContext)_localctx).t1.node;
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y || _la==O) {
				{
				setState(138);
				switch (_input.LA(1)) {
				case O:
					{
					setState(130); match(O);
					setState(131); ((EnunciadoContext)_localctx).t2 = proposicion();
					((EnunciadoContext)_localctx).node =  new OLog(_localctx.node,((EnunciadoContext)_localctx).t2.node);
					}
					break;
				case Y:
					{
					setState(134); match(Y);
					setState(135); ((EnunciadoContext)_localctx).t2 = proposicion();
					((EnunciadoContext)_localctx).node =  new YLog(_localctx.node,((EnunciadoContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(142);
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
		enterRule(_localctx, 18, RULE_proposicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); ((ProposicionContext)_localctx).t1 = expresion();
			((ProposicionContext)_localctx).node =  ((ProposicionContext)_localctx).t1.node;
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYORQ) | (1L << MENORQ) | (1L << MAYORI) | (1L << MENORI) | (1L << IGUAL))) != 0)) {
				{
				setState(165);
				switch (_input.LA(1)) {
				case MAYORQ:
					{
					setState(145); match(MAYORQ);
					setState(146); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new Comparacion(_localctx.node,((ProposicionContext)_localctx).t2.node);
					}
					break;
				case MENORQ:
					{
					setState(149); match(MENORQ);
					setState(150); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new Comparacion(((ProposicionContext)_localctx).t2.node,_localctx.node);
					}
					break;
				case IGUAL:
					{
					setState(153); match(IGUAL);
					setState(154); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new Igualacion(_localctx.node, ((ProposicionContext)_localctx).t2.node);
					}
					break;
				case MAYORI:
					{
					setState(157); match(MAYORI);
					setState(158); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new ComparacionIg(_localctx.node,((ProposicionContext)_localctx).t2.node);
					}
					break;
				case MENORI:
					{
					setState(161); match(MENORI);
					setState(162); ((ProposicionContext)_localctx).t2 = expresion();
					((ProposicionContext)_localctx).node =  new ComparacionIg(((ProposicionContext)_localctx).t2.node,_localctx.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(169);
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
		enterRule(_localctx, 20, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); ((ExpresionContext)_localctx).t1 = factor();
			((ExpresionContext)_localctx).node =  ((ExpresionContext)_localctx).t1.node;
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAS || _la==MENOS) {
				{
				setState(180);
				switch (_input.LA(1)) {
				case MAS:
					{
					{
					setState(172); match(MAS);
					setState(173); ((ExpresionContext)_localctx).t2 = factor();
					((ExpresionContext)_localctx).node =  new Adicion(_localctx.node,((ExpresionContext)_localctx).t2.node);
					}
					}
					break;
				case MENOS:
					{
					setState(176); match(MENOS);
					setState(177); ((ExpresionContext)_localctx).t2 = factor();
					((ExpresionContext)_localctx).node =  new Sustraccion(_localctx.node,((ExpresionContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184);
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
		enterRule(_localctx, 22, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); ((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(195);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(187); match(MULT);
					setState(188); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplicacion(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				case DIV:
					{
					setState(191); match(DIV);
					setState(192); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(199);
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
		public Token LITERAL_CADENA;
		public TermContext t;
		public TerminalNode ID() { return getToken(ZujuParser.ID, 0); }
		public TerminalNode NO() { return getToken(ZujuParser.NO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(ZujuParser.NUMERO, 0); }
		public TerminalNode LITERAL_CADENA() { return getToken(ZujuParser.LITERAL_CADENA, 0); }
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
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); ((TermContext)_localctx).NUMERO = match(NUMERO);
				((TermContext)_localctx).node =  new Constante(Double.parseDouble((((TermContext)_localctx).NUMERO!=null?((TermContext)_localctx).NUMERO.getText():null)));
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(202); ((TermContext)_localctx).ENTERO = match(ENTERO);
				((TermContext)_localctx).node =  new Constante(Integer.parseInt((((TermContext)_localctx).ENTERO!=null?((TermContext)_localctx).ENTERO.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(204); ((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(206); ((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constante(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case PAR_ABIERTO:
				enterOuterAlt(_localctx, 5);
				{
				setState(208); match(PAR_ABIERTO);
				setState(209); ((TermContext)_localctx).expresion = expresion();
				((TermContext)_localctx).node =  ((TermContext)_localctx).expresion.node;
				setState(211); match(PAR_CERRADO);
				}
				break;
			case LITERAL_CADENA:
				enterOuterAlt(_localctx, 6);
				{
				setState(213); ((TermContext)_localctx).LITERAL_CADENA = match(LITERAL_CADENA);
				 
						        String texto = (((TermContext)_localctx).LITERAL_CADENA!=null?((TermContext)_localctx).LITERAL_CADENA.getText():null);        
						        texto = texto.substring(1, texto.length() - 1);         
						        ((TermContext)_localctx).node =  new Id(texto); 
				      			
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 7);
				{
				setState(215); match(NO);
				setState(216); ((TermContext)_localctx).t = term();
				((TermContext)_localctx).node =  new NoLog(((TermContext)_localctx).t.node);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2$\n\2\f\2"+
		"\16\2\'\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bX\n"+
		"\b\f\b\16\b[\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bd\n\b\f\b\16\bg\13\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00a8\n\13\f\13\16\13\u00ab\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b7\n\f\f\f\16\f\u00ba\13\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c6\n\r\f\r\16\r\u00c9\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00de\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\3\3\2\4\7\u00eb\2\34\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\bA\3\2\2\2"+
		"\nC\3\2\2\2\fI\3\2\2\2\16N\3\2\2\2\20k\3\2\2\2\22\u0082\3\2\2\2\24\u0091"+
		"\3\2\2\2\26\u00ac\3\2\2\2\30\u00bb\3\2\2\2\32\u00dd\3\2\2\2\34\35\7\3"+
		"\2\2\35\36\7$\2\2\36\37\7\34\2\2\37%\b\2\1\2 !\5\4\3\2!\"\b\2\1\2\"$\3"+
		"\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2("+
		")\7\35\2\2)*\b\2\1\2*\3\3\2\2\2+,\5\6\4\2,-\b\3\1\2-;\3\2\2\2./\5\n\6"+
		"\2/\60\b\3\1\2\60;\3\2\2\2\61\62\5\f\7\2\62\63\b\3\1\2\63;\3\2\2\2\64"+
		"\65\5\16\b\2\65\66\b\3\1\2\66;\3\2\2\2\678\5\20\t\289\b\3\1\29;\3\2\2"+
		"\2:+\3\2\2\2:.\3\2\2\2:\61\3\2\2\2:\64\3\2\2\2:\67\3\2\2\2;\5\3\2\2\2"+
		"<=\5\b\5\2=>\7$\2\2>?\7 \2\2?@\b\4\1\2@\7\3\2\2\2AB\t\2\2\2B\t\3\2\2\2"+
		"CD\7$\2\2DE\7\33\2\2EF\5\22\n\2FG\7 \2\2GH\b\6\1\2H\13\3\2\2\2IJ\7\b\2"+
		"\2JK\5\22\n\2KL\7 \2\2LM\b\7\1\2M\r\3\2\2\2NO\7\t\2\2OP\7\36\2\2PQ\5\22"+
		"\n\2QR\7\37\2\2RS\b\b\1\2SY\7\34\2\2TU\5\4\3\2UV\b\b\1\2VX\3\2\2\2WT\3"+
		"\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\35\2\2"+
		"]^\7\n\2\2^_\b\b\1\2_e\7\34\2\2`a\5\4\3\2ab\b\b\1\2bd\3\2\2\2c`\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\35\2\2ij\b\b"+
		"\1\2j\17\3\2\2\2kl\7\13\2\2lm\7\36\2\2mn\5\6\4\2no\5\n\6\2op\5\24\13\2"+
		"pq\7 \2\2qr\7$\2\2rs\7\33\2\2st\5\22\n\2tu\7\37\2\2uv\b\t\1\2v|\7\34\2"+
		"\2wx\5\4\3\2xy\b\t\1\2y{\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\35\2\2\u0080\u0081\b\t\1\2\u0081"+
		"\21\3\2\2\2\u0082\u0083\5\24\13\2\u0083\u008e\b\n\1\2\u0084\u0085\7\23"+
		"\2\2\u0085\u0086\5\24\13\2\u0086\u0087\b\n\1\2\u0087\u008d\3\2\2\2\u0088"+
		"\u0089\7\22\2\2\u0089\u008a\5\24\13\2\u008a\u008b\b\n\1\2\u008b\u008d"+
		"\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0092\5\26\f\2\u0092\u00a9\b\13\1\2\u0093\u0094\7\25\2\2\u0094"+
		"\u0095\5\26\f\2\u0095\u0096\b\13\1\2\u0096\u00a8\3\2\2\2\u0097\u0098\7"+
		"\26\2\2\u0098\u0099\5\26\f\2\u0099\u009a\b\13\1\2\u009a\u00a8\3\2\2\2"+
		"\u009b\u009c\7\31\2\2\u009c\u009d\5\26\f\2\u009d\u009e\b\13\1\2\u009e"+
		"\u00a8\3\2\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\b"+
		"\13\1\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\7\30\2\2\u00a4\u00a5\5\26\f\2"+
		"\u00a5\u00a6\b\13\1\2\u00a6\u00a8\3\2\2\2\u00a7\u0093\3\2\2\2\u00a7\u0097"+
		"\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\25\3\2\2"+
		"\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00b8\b\f\1\2\u00ae"+
		"\u00af\7\f\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\b\f\1\2\u00b1\u00b7\3"+
		"\2\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\b\f\1\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\27\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00bc\5\32\16\2\u00bc\u00c7\b\r\1\2\u00bd\u00be\7\16\2"+
		"\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\b\r\1\2\u00c0\u00c6\3\2\2\2\u00c1"+
		"\u00c2\7\17\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\b\r\1\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00c7\3\2\2"+
		"\2\u00ca\u00cb\7&\2\2\u00cb\u00de\b\16\1\2\u00cc\u00cd\7%\2\2\u00cd\u00de"+
		"\b\16\1\2\u00ce\u00cf\7$\2\2\u00cf\u00de\b\16\1\2\u00d0\u00d1\7\"\2\2"+
		"\u00d1\u00de\b\16\1\2\u00d2\u00d3\7\36\2\2\u00d3\u00d4\5\26\f\2\u00d4"+
		"\u00d5\b\16\1\2\u00d5\u00d6\7\37\2\2\u00d6\u00de\3\2\2\2\u00d7\u00d8\7"+
		"#\2\2\u00d8\u00de\b\16\1\2\u00d9\u00da\7\24\2\2\u00da\u00db\5\32\16\2"+
		"\u00db\u00dc\b\16\1\2\u00dc\u00de\3\2\2\2\u00dd\u00ca\3\2\2\2\u00dd\u00cc"+
		"\3\2\2\2\u00dd\u00ce\3\2\2\2\u00dd\u00d0\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd"+
		"\u00d7\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\33\3\2\2\2\20%:Ye|\u008c\u008e"+
		"\u00a7\u00a9\u00b6\u00b8\u00c5\u00c7\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}