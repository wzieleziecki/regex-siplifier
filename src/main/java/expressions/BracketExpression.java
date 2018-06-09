package expressions;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BracketExpression implements Expression, LastTokenExpression {

	private List<Expression> expressions;
	private String lastSymbol;

	public BracketExpression(String lastSymbol, List<Expression> expressions) {
		this.lastSymbol = lastSymbol;
		this.expressions = expressions;
	}

	@Override
	public void addExpression(Expression expression) {
		this.expressions.add(expression);
	}

	public BracketExpression() {
		this.expressions = new ArrayList<>();
	}

	@Override
	public void setLastSymbol(String endSymbol) {
		this.lastSymbol = endSymbol;
	}

	@Override
	public void setLastSymbol(TerminalNode lastToken) {
		this.lastSymbol = lastToken.getText();
	}

	public String getLastSymbol() {
		return lastSymbol;
	}

	@Override
	public List<Expression> getExpressions() {
		return expressions;
	}

	@Override
	public void setExpressions(List<Expression> expressions) {
		this.expressions = expressions;
	}

	@Override
	public void removeLastSymbol() {
		this.lastSymbol = null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		expressions.stream().forEach(expr -> {
			if (expr != null)
				builder.append(expr.toString());
		});
		builder.append("]");
		if (lastSymbol != null)
			builder.append(lastSymbol);
		return builder.toString();
	}
}
