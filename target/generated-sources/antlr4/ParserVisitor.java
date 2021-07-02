// Generated from Parser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(ParserParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(ParserParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(ParserParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(ParserParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(ParserParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(ParserParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(ParserParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#reformular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReformular(ParserParser.ReformularContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#pregunta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPregunta(ParserParser.PreguntaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#sinElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinElse(ParserParser.SinElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(ParserParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#iteracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracion(ParserParser.IteracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#iter_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIter_while(ParserParser.Iter_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#iter_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIter_for(ParserParser.Iter_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(ParserParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#recorrer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecorrer(ParserParser.RecorrerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(ParserParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(ParserParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre(ParserParser.NombreContext ctx);
}