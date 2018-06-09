package simplifier;

import expressions.AlternativeExpression;
import expressions.Expression;
import expressions.LastTokenExpression;

import java.util.Arrays;
import java.util.List;

public class SimplifierService {
	
	
	public static List<Expression> checkForNestedExpression(AlternativeExpression expression){
		
		List<Expression> firstExpression = expression.getFirstExpression();
		List<Expression> secondExpression = expression.getSecondExpression();
		if(firstExpression.size() == 1){
			Expression subExpression = firstExpression.get(0);
			if(subExpression instanceof AlternativeExpression){
				checkForNestedExpression((AlternativeExpression) subExpression);
			}
			if(subExpression instanceof LastTokenExpression){
				((LastTokenExpression) subExpression).removeLastSymbol();
			}
			
		}
		
		if(secondExpression.size() == 1){
			Expression subExpression = secondExpression.get(0);
			if(subExpression instanceof AlternativeExpression){
				checkForNestedExpression((AlternativeExpression) subExpression);
			}
			if(subExpression instanceof LastTokenExpression){
				((LastTokenExpression) subExpression).removeLastSymbol();
			}
			
		}

		return Arrays.asList(expression);
	}

}
