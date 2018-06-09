package visitor;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.RegexRulesListener;
import antlr.RegexRulesParser.AlternativeExpressionContext;
import antlr.RegexRulesParser.BasicExpressionContext;
import antlr.RegexRulesParser.BracketExpressionContext;
import antlr.RegexRulesParser.MatchCountExpressionContext;
import antlr.RegexRulesParser.ParentheseExpressionContext;
import antlr.RegexRulesParser.ProgContext;
import antlr.RegexRulesParser.RangeContext;
import antlr.RegexRulesParser.RangeOccurenceContext;

public class MyListener implements RegexRulesListener {

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterParentheseExpression(ParentheseExpressionContext ctx) {
		
		System.out.println("ENTERED PartentheseExpression in LISTENER"+ctx.getText());
	}

	@Override
	public void exitParentheseExpression(ParentheseExpressionContext ctx) {
		System.out.println("EXITED PartentheseExpression in LISTENER"+ctx.getText());

	}

	@Override
	public void enterMatchCountExpression(MatchCountExpressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMatchCountExpression(MatchCountExpressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterRange(RangeContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitRange(RangeContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterBasicExpression(BasicExpressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitBasicExpression(BasicExpressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterBracketExpression(BracketExpressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitBracketExpression(BracketExpressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterProg(ProgContext ctx) {
		System.out.println("ENTERED RegularExpr in LISTENER"+ctx.getText());

	}

	@Override
	public void exitProg(ProgContext ctx) {
		System.out.println("EXITED RegularExpr  in LISTENER"+ctx.getText());

	}

	@Override
	public void enterRangeOccurence(RangeOccurenceContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitRangeOccurence(RangeOccurenceContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAlternativeExpression(AlternativeExpressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAlternativeExpression(AlternativeExpressionContext ctx) {
		// TODO Auto-generated method stub

	}

}
