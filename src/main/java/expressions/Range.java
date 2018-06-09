package expressions;

import java.util.List;

public class Range implements Expression {

	private String startRange;

	private String endRange;

	public Range(String startRange, String endRange) {
		super();
		this.startRange = startRange;
		this.endRange = endRange;
	}

	public String getStartRange() {
		return startRange;
	}

	public void setStartRange(String startRange) {
		this.startRange = startRange;
	}

	public String getEndRange() {
		return endRange;
	}

	public void setEndRange(String endRange) {
		this.endRange = endRange;
	}

	@Override
	public void addExpression(Expression expression) {

	}

	@Override
	public List<Expression> getExpressions() {
		return null;
	}

	@Override
	public void setExpressions(List<Expression> expressions) {

	}

	@Override
	public String toString() {
		return startRange + "-" + endRange;
	}

}
