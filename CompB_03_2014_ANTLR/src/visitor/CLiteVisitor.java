// Generated from CLite.g4 by ANTLR 4.2.2
package visitor;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import cLiteParser.CLiteParser;
import cLiteParser.CLiteParser.AdditionContext;
import cLiteParser.CLiteParser.AssignmentContext;
import cLiteParser.CLiteParser.BlockContext;
import cLiteParser.CLiteParser.ConjunctionContext;
import cLiteParser.CLiteParser.DeclarationContext;
import cLiteParser.CLiteParser.DeclarationsContext;
import cLiteParser.CLiteParser.EqualityContext;
import cLiteParser.CLiteParser.ExpressionContext;
import cLiteParser.CLiteParser.FactorContext;
import cLiteParser.CLiteParser.IfStatementContext;
import cLiteParser.CLiteParser.PrimaryContext;
import cLiteParser.CLiteParser.ProgramContext;
import cLiteParser.CLiteParser.RelationContext;
import cLiteParser.CLiteParser.StatementContext;
import cLiteParser.CLiteParser.StatementsContext;
import cLiteParser.CLiteParser.TermContext;
import cLiteParser.CLiteParser.TypeContext;
import cLiteParser.CLiteParser.WhileStatementContext;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CLiteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CLiteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull CLiteParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull CLiteParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull CLiteParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull CLiteParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull CLiteParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull CLiteParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull CLiteParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(@NotNull CLiteParser.DeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(@NotNull CLiteParser.RelationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull CLiteParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(@NotNull CLiteParser.ConjunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull CLiteParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull CLiteParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull CLiteParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull CLiteParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(@NotNull CLiteParser.EqualityContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(@NotNull CLiteParser.AdditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CLiteParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull CLiteParser.PrimaryContext ctx);
}