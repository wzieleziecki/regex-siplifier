package visitor;

import antlr.RegexRulesLexer;
import antlr.RegexRulesParser.*;
import antlr.RegexRulesVisitor;
import expressions.*;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

public class MyVisitor<T> extends AbstractParseTreeVisitor<T> implements RegexRulesVisitor<T> {

	@Override
	public T visitParentheseExpression(ParentheseExpressionContext ctx) {
		ParentheseExpression parentheseExpr = new ParentheseExpression();
		//System.out.println("VISITING PARENTEHESE Expression " + ctx.getText());
		for (int i = 0; i < ctx.getChildCount(); i++) {
			Expression expression = (Expression) super.visit(ctx.getChild(i));
			if (expression == null)
				continue;
			parentheseExpr.addExpression(expression);
		}
		List<TerminalNode> lastToken = ctx.getTokens(RegexRulesLexer.LAST_TOKEN);
		if (lastToken.size() > 1 || lastToken == null || lastToken.isEmpty()) {
			//DO nothing
		}
		else parentheseExpr.setLastSymbol(lastToken.get(0));
		return (T) parentheseExpr;
	}

	@Override
	public T visitMatchCountExpression(MatchCountExpressionContext ctx) {
		//System.out.println("VISITING MATCH COUNT Expression " + ctx.getText());

		Expression expression = (Expression) super.visit(ctx.getChild(0)); //FIRST CHiLD is always a basicExpression;
		RangeOccurence rangeOccurence = (RangeOccurence) super.visit(ctx.getChild(ctx.getChildCount()-1));
		MatchCountExpression matchCountExpr = new MatchCountExpression(expression, rangeOccurence);
		return (T) matchCountExpr;
	}

	@Override
	public T visitRange(RangeContext ctx) {
		List<TerminalNode> letters = ctx.getTokens(RegexRulesLexer.LETTER);
		String startRange = letters.get(0).getText();
		String endRange = letters.get(letters.size()-1).getText();
		Range range = new Range(startRange, endRange);
		RuleContext ruleContext = ctx.getRuleContext(RangeContext.class, 0);
		return (T) range;
	}

	@Override
	public T visitBasicExpression(BasicExpressionContext ctx) {
		BasicExpression basicExpr = new BasicExpression();
		for (int i = 0; i < ctx.getChildCount(); i++) {
			Expression expression = (Expression) super.visit(ctx.getChild(i));
			if (expression == null)
				continue;
			basicExpr.addExpression(expression);
		}
		List<TerminalNode> letter = ctx.getTokens(RegexRulesLexer.LETTER);
		TerminalNode lastToken = getLastToken(ctx);
		basicExpr.setLetters(letter);
		basicExpr.setLastSymbol(lastToken);
		return (T) basicExpr;
	}

	private TerminalNode getFirstToken(BracketExpressionContext ctx) {
		List<TerminalNode> caret = ctx.getTokens(RegexRulesLexer.CARET);
		if (caret.size() > 1) {
			return null; 
		}
		if (caret.size() == 0 || caret == null) {
			return null;  
		}
		return caret.get(0);
	}

	private TerminalNode getLastToken(BasicExpressionContext ctx) {
		List<TerminalNode> token = ctx.getTokens(RegexRulesLexer.LAST_TOKEN);
		if (token.size() > 1 || token == null || token.isEmpty()) {
			return null; // should not happen
		}
		else return token.get(0);
	}

	@Override
	public T visitBracketExpression(BracketExpressionContext ctx) {
		//bracketExpression:LEFT_BRACKET CARET? (range | matchCountExpression | basicExpression)* RIGHT_BRACKET; //no () basicExpression, neither Alternative basicExpression, no nested bracketExpression
		BracketExpression bracketExpr = new BracketExpression();
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			Expression expression = (Expression) super.visit(ctx.getChild(i));
			if (expression == null)
				continue;
			bracketExpr.addExpression(expression);
		}
		return (T) bracketExpr;
	}

	@Override
	public T visitProg(ProgContext ctx) {
		/*
		 * create RegularExpr Object then in all visit method create appropriate object
		 * iterate through all children get all children into List or Map
		 */
		RegularExpr regularExprRegex = new RegularExpr();
		//System.out.println("VISITING PROG Expression " + ctx.getText());
		for (int i = 0; i < ctx.getChildCount(); i++) {
			Expression expression = (Expression) super.visit(ctx.getChild(i));
			if (expression == null)
				continue;
			regularExprRegex.addExpression(expression);
		}
		int j = 0;
		return (T) regularExprRegex;
	}

	@Override
	public T visitRangeOccurence(RangeOccurenceContext ctx) {
		TerminalNode firstNumber = (TerminalNode) ctx.getChild(1); // ALWAYS a no.1 element is a first number
		TerminalNode secondNumber = (TerminalNode) ctx.getChild(3);
		RangeOccurence rangeOccurence = new RangeOccurence(firstNumber, secondNumber);
		ctx.getChildCount();
		 /* matchCountExpression:    basicExpression rangeOccurence ;
		   rangeOccurence: LEFT_BRACE NUMBER COMMA NUMBER RIGHT_BRACE 
			  | LEFT_BRACE COMMA NUMBER RIGHT_BRACE 
			  | LEFT_BRACE NUMBER COMMA  RIGHT_BRACE;
		 */
		return (T) rangeOccurence;
	}

	@Override
	public T visitAlternativeExpression(AlternativeExpressionContext ctx) {
		int childNumber = ctx.getChildCount();
		int alternativeSignPosition =0;
		List<Expression> leftExpressions = new LinkedList<>();
		List<Expression> rightExpressions = new LinkedList<>();
		boolean secondArgument = false;
		for(int i =0;i<childNumber;i++){
			Object potentialChild = ctx.getChild(i);
			if(potentialChild instanceof TerminalNode){
				secondArgument = true;
				continue;
			}
			if(!secondArgument){
				Expression firstExpression  = (Expression) super.visit(ctx.getChild(i));
				leftExpressions.add(firstExpression);
			}
			if(secondArgument){
				Expression secondExpression = (Expression) super.visit(ctx.getChild(i));
				rightExpressions.add(secondExpression);

			}
		}
		AlternativeExpression alternativeExpr = new AlternativeExpression(leftExpressions, rightExpressions);
		return (T) alternativeExpr;//return (T) alternativeExpr;
	}

}
