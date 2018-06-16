package antlr;
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
	 * Visit a parse tree produced by {@link RegexRulesParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(RegexRulesParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#parentheseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheseExpression(RegexRulesParser.ParentheseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#alternativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternativeExpression(RegexRulesParser.AlternativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#matchCountExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchCountExpression(RegexRulesParser.MatchCountExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#rangeOccurence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeOccurence(RegexRulesParser.RangeOccurenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#bracketExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(RegexRulesParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(RegexRulesParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexRulesParser#basicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicExpression(RegexRulesParser.BasicExpressionContext ctx);
}