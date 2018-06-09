// Generated from /home/tk/IdeaProjects/regex-simplifier/RegexRules.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegexRulesParser}.
 */
public interface RegexRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RegexRulesParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RegexRulesParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#parentheseExpression}.
	 * @param ctx the parse tree
	 */
	void enterParentheseExpression(RegexRulesParser.ParentheseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#parentheseExpression}.
	 * @param ctx the parse tree
	 */
	void exitParentheseExpression(RegexRulesParser.ParentheseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#alternativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAlternativeExpression(RegexRulesParser.AlternativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#alternativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAlternativeExpression(RegexRulesParser.AlternativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#matchCountExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchCountExpression(RegexRulesParser.MatchCountExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#matchCountExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchCountExpression(RegexRulesParser.MatchCountExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#rangeOccurence}.
	 * @param ctx the parse tree
	 */
	void enterRangeOccurence(RegexRulesParser.RangeOccurenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#rangeOccurence}.
	 * @param ctx the parse tree
	 */
	void exitRangeOccurence(RegexRulesParser.RangeOccurenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(RegexRulesParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(RegexRulesParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(RegexRulesParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(RegexRulesParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexRulesParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpression(RegexRulesParser.BasicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexRulesParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpression(RegexRulesParser.BasicExpressionContext ctx);
}