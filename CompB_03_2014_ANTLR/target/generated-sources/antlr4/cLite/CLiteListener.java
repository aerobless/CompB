// Generated from CLite.g4 by ANTLR 4.2.2
package cLite;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLiteParser}.
 */
public interface CLiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CLiteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CLiteParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull CLiteParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull CLiteParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull CLiteParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull CLiteParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull CLiteParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull CLiteParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull CLiteParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull CLiteParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull CLiteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull CLiteParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull CLiteParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull CLiteParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull CLiteParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull CLiteParser.DeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull CLiteParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull CLiteParser.RelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull CLiteParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull CLiteParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(@NotNull CLiteParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(@NotNull CLiteParser.ConjunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CLiteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CLiteParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull CLiteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull CLiteParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull CLiteParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull CLiteParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull CLiteParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull CLiteParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(@NotNull CLiteParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(@NotNull CLiteParser.EqualityContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(@NotNull CLiteParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(@NotNull CLiteParser.AdditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull CLiteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull CLiteParser.PrimaryContext ctx);
}