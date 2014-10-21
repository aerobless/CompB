// Generated from Demo.g4 by ANTLR 4.2.2
package demo;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(@NotNull DemoParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(@NotNull DemoParser.AdditionContext ctx);
}