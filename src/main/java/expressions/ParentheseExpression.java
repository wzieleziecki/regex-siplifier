package expressions;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ParentheseExpression implements Expression, LastTokenExpression {

	private String lastSymbol;

	private List<Expression> expressions;

	public ParentheseExpression() {
		this.expressions = new ArrayList<>();
	}

	public ParentheseExpression(String lastSymbol, List<Expression> expressions) {
		super();
		this.lastSymbol = lastSymbol;
		this.expressions = expressions;
	}

	@Override
	public void addExpression(Expression expression) {
		expressions.add(expression);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expressions == null) ? 0 : expressions.hashCode());
		result = prime * result + ((lastSymbol == null) ? 0 : lastSymbol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParentheseExpression other = (ParentheseExpression) obj;
		if (expressions == null) {
			if (other.expressions != null)
				return false;
		} else if (!expressions.equals(other.expressions))
			return false;
		if (lastSymbol == null) {
			if (other.lastSymbol != null)
				return false;
		} else if (!lastSymbol.equals(other.lastSymbol))
			return false;
		return true;
	}

	public List<Expression> getExpressions() {
		return expressions;
	}

	public void setExpressions(List<Expression> expressions) {
		this.expressions = expressions;
	}

	@Override
	public void setLastSymbol(String endSymbol) {
		this.lastSymbol = endSymbol;
	}

	@Override
	public void setLastSymbol(TerminalNode lastToken) {
		this.lastSymbol = lastToken.getText();
	}

	@Override
	public String getLastSymbol() {
		return lastSymbol;
	}

	@Override
	public void removeLastSymbol() {
		this.lastSymbol = null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(");
		expressions.stream().forEach(expr -> {
			if (expr != null)
				builder.append(expr.toString());
		});
		builder.append(")");
		if (lastSymbol != null)
			builder.append(lastSymbol);
		return builder.toString();
	}

}
