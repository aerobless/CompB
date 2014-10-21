// Generated from CLiteSave.g4 by ANTLR 4.2.2
package cLite;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLiteSaveParser}.
 */
public interface CLiteSaveListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull CLiteSaveParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull CLiteSaveParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CLiteSaveParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CLiteSaveParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull CLiteSaveParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull CLiteSaveParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull CLiteSaveParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull CLiteSaveParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull CLiteSaveParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull CLiteSaveParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull CLiteSaveParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull CLiteSaveParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull CLiteSaveParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull CLiteSaveParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull CLiteSaveParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull CLiteSaveParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull CLiteSaveParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull CLiteSaveParser.DeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull CLiteSaveParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull CLiteSaveParser.RelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull CLiteSaveParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull CLiteSaveParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull CLiteSaveParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull CLiteSaveParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(@NotNull CLiteSaveParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(@NotNull CLiteSaveParser.ConjunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CLiteSaveParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CLiteSaveParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull CLiteSaveParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull CLiteSaveParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull CLiteSaveParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull CLiteSaveParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull CLiteSaveParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull CLiteSaveParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(@NotNull CLiteSaveParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(@NotNull CLiteSaveParser.EqualityContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(@NotNull CLiteSaveParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(@NotNull CLiteSaveParser.AdditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CLiteSaveParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull CLiteSaveParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLiteSaveParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull CLiteSaveParser.PrimaryContext ctx);
}