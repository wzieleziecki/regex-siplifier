// Generated from RegexRules.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RegexRulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RegexRulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#parentheseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheseExpression(@NotNull RegexRulesParser.ParentheseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#matchCountExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchCountExpression(@NotNull RegexRulesParser.MatchCountExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull RegexRulesParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#basicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicExpression(@NotNull RegexRulesParser.BasicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#bracketExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(@NotNull RegexRulesParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull RegexRulesParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#rangeOccurence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeOccurence(@NotNull RegexRulesParser.RangeOccurenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#alternativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternativeExpression(@NotNull RegexRulesParser.AlternativeExpressionContext ctx);
}