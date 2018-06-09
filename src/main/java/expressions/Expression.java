package expressions;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

public interface Expression {

	public void addExpression(Expression expression);
	
	public List<Expression> getExpressions();
	
	public void setExpressions(List<Expression> expressions);
	
}
