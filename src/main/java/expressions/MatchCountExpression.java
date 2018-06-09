package expressions;

import java.util.Arrays;
import java.util.List;

public class MatchCountExpression implements Expression {
	
	private List<Expression>expressions;
	
	private RangeOccurence rangeOccurence;
	
	public MatchCountExpression(Expression expression, RangeOccurence rangeOccurence) {
		super();
		this.expressions = Arrays.asList(expression);
		this.rangeOccurence = rangeOccurence;
	}


	public RangeOccurence getRangeOccurence() {
		return rangeOccurence;
	}

	public void setRangeOccurence(RangeOccurence rangeOccurence) {
		this.rangeOccurence = rangeOccurence;
	}

	@Override
	public void addExpression(Expression expression) {
		this.expressions.add(expression);
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
	public String toString() {
		if(expressions.size()>1){
			StringBuilder builder = new StringBuilder();
			for(Expression expr : expressions){
				builder.append(expr.toString());
			}
			return "("+builder.toString()+")"+rangeOccurence.toString();
		}
		return expressions.get(0).toString()+rangeOccurence.toString();
	}

}
