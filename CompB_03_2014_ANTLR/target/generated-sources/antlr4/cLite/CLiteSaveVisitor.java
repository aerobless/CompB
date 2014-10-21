// Generated from CLiteSave.g4 by ANTLR 4.2.2
package cLite;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CLiteSaveParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CLiteSaveVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull CLiteSaveParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull CLiteSaveParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull CLiteSaveParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull CLiteSaveParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull CLiteSaveParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull CLiteSaveParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull CLiteSaveParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull CLiteSaveParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(@NotNull CLiteSaveParser.DeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(@NotNull CLiteSaveParser.RelationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull CLiteSaveParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull CLiteSaveParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(@NotNull CLiteSaveParser.ConjunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull CLiteSaveParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull CLiteSaveParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull CLiteSaveParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull CLiteSaveParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(@NotNull CLiteSaveParser.EqualityContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(@NotNull CLiteSaveParser.AdditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteSaveParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull CLiteSaveParser.PrimaryContext ctx);
}