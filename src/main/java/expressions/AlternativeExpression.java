package expressions;

import java.util.List;

public class AlternativeExpression implements Expression {

	private List<Expression> firstExpression;
	private List<Expression> secondExpression;

	public AlternativeExpression(List<Expression> firstExpression, List<Expression> secondExpression) {
		super();
		this.firstExpression = firstExpression;
		this.secondExpression = secondExpression;
	}

	public List<Expression> getFirstExpression() {
		return firstExpression;
	}

	public void setFirstExpression(List<Expression> firstExpression) {
		this.firstExpression = firstExpression;
	}

	public List<Expression> getSecondExpression() {
		return secondExpression;
	}

	public void setSecondExpression(List<Expression> secondExpression) {
		this.secondExpression = secondExpression;
	}

	@Override
	public void addExpression(Expression expression) {

	}

	@Override
	public List<Expression> getExpressions() {
		return null; //should be null, to get subExpressions there are other getters
	}

	@Override
	public void setExpressions(List<Expression> expressions) {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstExpression == null) ? 0 : firstExpression.hashCode());
		result = prime * result + ((secondExpression == null) ? 0 : secondExpression.hashCode());
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
		AlternativeExpression other = (AlternativeExpression) obj;
		if (firstExpression == null) {
			if (other.firstExpression != null)
				return false;
		} else if (!firstExpression.equals(other.firstExpression))
			return false;
		if (secondExpression == null) {
			if (other.secondExpression != null)
				return false;
		} else if (!secondExpression.equals(other.secondExpression))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		firstExpression.stream().forEach(expr -> {
			if (expr != null)
				builder.append(expr.toString());
		});
		builder.append("|");
		secondExpression.stream().forEach(expr -> {
			if (expr != null)
				builder.append(expr.toString());
		});;
		return builder.toString();
	}

}
