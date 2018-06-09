package expressions;

import java.util.ArrayList;
import java.util.List;

public class RegularExpr implements Expression {
	private List<Expression> expressions;

	public RegularExpr(List<Expression> expressions) {
		this.expressions = expressions;
	}

	public RegularExpr() {
		expressions = new ArrayList<>();
	}

	public void addExpression(Expression expression) {
		expressions.add(expression);
	}

	public List<Expression> getExpressions() {
		return expressions;
	}

	public void setExpressions(List<Expression> expressions) {
		this.expressions = expressions;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		expressions.stream().forEach(expr -> {
			if (expr != null)
				builder.append(expr.toString());
		});
		/*
		 * for(Expression expression : expressions){
		 * builder.append(expression.toString()); }
		 */
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expressions == null) ? 0 : expressions.hashCode());
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
		RegularExpr other = (RegularExpr) obj;
		if (expressions == null) {
			if (other.expressions != null)
				return false;
		} else if (!expressions.equals(other.expressions))
			return false;
		return true;
	}

}
