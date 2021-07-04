package ANTLR;
// Generated from ParserDND.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserDNDParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserDNDVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserDNDParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(ParserDNDParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(ParserDNDParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(ParserDNDParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(ParserDNDParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#readSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadSentence(ParserDNDParser.ReadSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#printSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSentence(ParserDNDParser.PrintSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(ParserDNDParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#reformular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReformular(ParserDNDParser.ReformularContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#pregunta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPregunta(ParserDNDParser.PreguntaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#sinElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinElse(ParserDNDParser.SinElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(ParserDNDParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#iteracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracion(ParserDNDParser.IteracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#iter_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIter_while(ParserDNDParser.Iter_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#iter_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIter_for(ParserDNDParser.Iter_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ParserDNDParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#recorrer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecorrer(ParserDNDParser.RecorrerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(ParserDNDParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(ParserDNDParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserDNDParser#nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre(ParserDNDParser.NombreContext ctx);
}