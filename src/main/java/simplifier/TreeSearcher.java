package simplifier;

import expressions.AlternativeExpression;
import expressions.Expression;
import expressions.RegularExpr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TreeSearcher {
	private boolean foundRule;
	public TreeSearcher() {
		new Simplifier();
	}

	public void simplifyProg(RegularExpr regularExpr) {
		regularExpr.getExpressions();
		List<Expression> copyExpressions = new ArrayList<>();
		foundRule = true;
		while(foundRule){//for (int j = 0; j < 10; j++) {
			doSimplify(regularExpr, copyExpressions);

		}
		System.out.println("Simplified Regex: " + regularExpr.toString());
	}

	/**
	 * 
	 * @param expression
	 *            - expression that will be simplifier. First its children would
	 *            get simplified by recurence
	 * @param copyExpressions
	 *            - list that
	 */
	protected void doSimplify(Expression expression, List<Expression> copyExpressions) {
		if (expression instanceof AlternativeExpression){
			List<Expression> firstExpressions = ((AlternativeExpression) expression).getFirstExpression();
			List<Expression> copyFirstExpressions = new LinkedList<>();
			List<Expression> secondExpression = ((AlternativeExpression) expression).getSecondExpression();
			List<Expression> copySecondExpressions = new LinkedList<>();
			simplifySubExpressions(firstExpressions, copyFirstExpressions);
			simplifySubExpressions(secondExpression, copySecondExpressions);
			((AlternativeExpression) expression).setFirstExpression(copyFirstExpressions);
			((AlternativeExpression) expression).setSecondExpression(copySecondExpressions);
			if(!copyFirstExpressions.equals(firstExpressions) || !copySecondExpressions.equals(secondExpression)) foundRule =true;
			else foundRule = false;

		}
		else if (!(expression instanceof AlternativeExpression)) {
			List<Expression> subExpressions = expression.getExpressions();
			List<Expression> copySubExpressions = new ArrayList<>();
			simplifySubExpressions(subExpressions, copySubExpressions);
			expression.setExpressions(copySubExpressions);
			if(!copySubExpressions.equals(subExpressions)) foundRule =true;
			else foundRule = false;
		}
		// invoke method on expression
		Method[] simplifierMethods = Simplifier.class.getDeclaredMethods();
		for (Method method : simplifierMethods) {
			try {
				int copyExprSize = copyExpressions.size();
				Object returnedValue = method.invoke(new Simplifier(), expression);
				List<Expression> returnedList = (List<Expression>) returnedValue;
				if (returnedList.size() > 1) {
					copyExpressions.clear();
					copyExpressions.addAll(returnedList);
					break;
				} else if (returnedList.size() == 1) {
					if (copyExprSize == 0) {
						copyExpressions.addAll(returnedList);
					} else if (!(returnedList.get(0).equals(expression)))
						copyExpressions.set(copyExprSize - 1, returnedList.get(0));
				}
				// check if returnedList is bigger than one
				/*
				 * if yes then changes has been made,add changes to
				 * copyExpression break the loop else if(list.size()==1 copy the
				 * list to the last element of copyExpressions
				 */
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				System.out.println("ERROR in method invoking");
				e.printStackTrace();
			}
		}
	}

	private void simplifySubExpressions(List<Expression> subExpressions, List<Expression> copySubExpressions) {
		if (subExpressions != null) {
			ListIterator<Expression> iterator = subExpressions.listIterator();
			while (iterator.hasNext()) {
				List<Expression> tmpList = new ArrayList<>();
				iterator.nextIndex();
				Expression subExpression = iterator.next();
				new TreeSearcher();
				doSimplify(subExpression, tmpList);
				copySubExpressions.addAll(tmpList);
			}
		}
	}

}
