// Generated from RegexRules.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegexRulesParser}.
 */
public interface RegexRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#parentheseExpression}.
	 * @param ctx the parse tree
	 */
	void enterParentheseExpression(@NotNull RegexRulesParser.ParentheseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#parentheseExpression}.
	 * @param ctx the parse tree
	 */
	void exitParentheseExpression(@NotNull RegexRulesParser.ParentheseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#matchCountExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchCountExpression(@NotNull RegexRulesParser.MatchCountExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#matchCountExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchCountExpression(@NotNull RegexRulesParser.MatchCountExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull RegexRulesParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull RegexRulesParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpression(@NotNull RegexRulesParser.BasicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpression(@NotNull RegexRulesParser.BasicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(@NotNull RegexRulesParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(@NotNull RegexRulesParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull RegexRulesParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull RegexRulesParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#rangeOccurence}.
	 * @param ctx the parse tree
	 */
	void enterRangeOccurence(@NotNull RegexRulesParser.RangeOccurenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#rangeOccurence}.
	 * @param ctx the parse tree
	 */
	void exitRangeOccurence(@NotNull RegexRulesParser.RangeOccurenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#alternativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAlternativeExpression(@NotNull RegexRulesParser.AlternativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#alternativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAlternativeExpression(@NotNull RegexRulesParser.AlternativeExpressionContext ctx);
}