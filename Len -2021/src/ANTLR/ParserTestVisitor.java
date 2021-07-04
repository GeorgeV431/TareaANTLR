package ANTLR;

// Generated from ParserTest.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTestParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserTestParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ParserTestParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ParserTestParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ParserTestParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ParserTestParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(ParserTestParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(ParserTestParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(ParserTestParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#while_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_block(ParserTestParser.While_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTestParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParserTestParser.BlockContext ctx);
}