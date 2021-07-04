package ANTLR;

// Generated from ParserDND.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserDNDParser}.
 */
public interface ParserDNDListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#reformular}.
	 * @param ctx the parse tree
	 */
	void enterReformular(@NotNull ParserDNDParser.ReformularContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#reformular}.
	 * @param ctx the parse tree
	 */
	void exitReformular(@NotNull ParserDNDParser.ReformularContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull ParserDNDParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull ParserDNDParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(@NotNull ParserDNDParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(@NotNull ParserDNDParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(@NotNull ParserDNDParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(@NotNull ParserDNDParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(@NotNull ParserDNDParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(@NotNull ParserDNDParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ParserDNDParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ParserDNDParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(@NotNull ParserDNDParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(@NotNull ParserDNDParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(@NotNull ParserDNDParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(@NotNull ParserDNDParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(@NotNull ParserDNDParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(@NotNull ParserDNDParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#pregunta}.
	 * @param ctx the parse tree
	 */
	void enterPregunta(@NotNull ParserDNDParser.PreguntaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#pregunta}.
	 * @param ctx the parse tree
	 */
	void exitPregunta(@NotNull ParserDNDParser.PreguntaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#recorrer}.
	 * @param ctx the parse tree
	 */
	void enterRecorrer(@NotNull ParserDNDParser.RecorrerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#recorrer}.
	 * @param ctx the parse tree
	 */
	void exitRecorrer(@NotNull ParserDNDParser.RecorrerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#iter_while}.
	 * @param ctx the parse tree
	 */
	void enterIter_while(@NotNull ParserDNDParser.Iter_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#iter_while}.
	 * @param ctx the parse tree
	 */
	void exitIter_while(@NotNull ParserDNDParser.Iter_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull ParserDNDParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull ParserDNDParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#iteracion}.
	 * @param ctx the parse tree
	 */
	void enterIteracion(@NotNull ParserDNDParser.IteracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#iteracion}.
	 * @param ctx the parse tree
	 */
	void exitIteracion(@NotNull ParserDNDParser.IteracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ParserDNDParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ParserDNDParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#iter_for}.
	 * @param ctx the parse tree
	 */
	void enterIter_for(@NotNull ParserDNDParser.Iter_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#iter_for}.
	 * @param ctx the parse tree
	 */
	void exitIter_for(@NotNull ParserDNDParser.Iter_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#sinElse}.
	 * @param ctx the parse tree
	 */
	void enterSinElse(@NotNull ParserDNDParser.SinElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#sinElse}.
	 * @param ctx the parse tree
	 */
	void exitSinElse(@NotNull ParserDNDParser.SinElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#readSentence}.
	 * @param ctx the parse tree
	 */
	void enterReadSentence(@NotNull ParserDNDParser.ReadSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#readSentence}.
	 * @param ctx the parse tree
	 */
	void exitReadSentence(@NotNull ParserDNDParser.ReadSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#printSentence}.
	 * @param ctx the parse tree
	 */
	void enterPrintSentence(@NotNull ParserDNDParser.PrintSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#printSentence}.
	 * @param ctx the parse tree
	 */
	void exitPrintSentence(@NotNull ParserDNDParser.PrintSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserDNDParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(@NotNull ParserDNDParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserDNDParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(@NotNull ParserDNDParser.ComparacionContext ctx);
}