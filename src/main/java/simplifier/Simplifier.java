package simplifier;

import expressions.*;

import java.util.*;

public class Simplifier {

	private String originalExpression;
	private String simplifiedExpression;

	public List<Expression> simplifyRule0(Expression expression) {
		/*
		 * ((SOME_OTHER_EXPRESSION)) -> (SOME_OTHER_EXPRESSION)
		 */
		if (expression instanceof ParentheseExpression) {
			List<Expression> subExpressions = expression.getExpressions();
			if (subExpressions.size() == 1 && subExpressions.get(0) instanceof ParentheseExpression) {
				return subExpressions;
			}
		}
		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule1(Expression expression) {
		// a|a -> a
		if (expression instanceof AlternativeExpression) {
			List<Expression> firstExpr = ((AlternativeExpression) expression).getFirstExpression();
			List<Expression> secondExpr = ((AlternativeExpression) expression).getSecondExpression();
			if (firstExpr.equals(secondExpr)) {
				return firstExpr;
			} else
				return Arrays.asList(expression);
		}
		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule2(Expression expression) {
		// (aaa|a)* => (a)*
		// (PAREN PAREN | PAREN PAREN PAREN
		if (expression instanceof ParentheseExpression) {
			String lastSymbol = ((ParentheseExpression) expression).getLastSymbol();
			Expression subExpression = expression.getExpressions().get(0);
			if (subExpression instanceof AlternativeExpression) {
				// (aa|a)
				if (lastSymbol != null && (lastSymbol.equals("+") || lastSymbol.equals("*"))) {
					// (aa|a)*
					List<Expression> firstExpressions = ((AlternativeExpression) subExpression).getFirstExpression();
					List<Expression> secondExpressions = ((AlternativeExpression) subExpression).getSecondExpression();
					if (firstExpressions.equals(secondExpressions)) {
						// (aa|aa)*=>(aa)*
						// set firstExpression as expression's child
						((ParentheseExpression) expression).setExpressions(firstExpressions);
						return Arrays.asList(expression);
					}
					// check if shorter list contains all element of bigger list
					// and check if longer list has all elements in order with
					// shorter list
					// attach shorter list to expressions list of
					// ParentheseExpresion
					int firstExprSize = firstExpressions.size();
					int secondExprSize = secondExpressions.size();
					// check if one list is bigger and if it is a multiplication
					// of other
					if (firstExprSize > secondExprSize && firstExprSize % secondExprSize == 0) {
						int index = Collections.indexOfSubList(firstExpressions, secondExpressions);
						boolean containsAll = secondExpressions.containsAll(firstExpressions);
						if (index != -1 && containsAll == true) {
							((ParentheseExpression) expression).setExpressions(secondExpressions);
						}
					}

					if (secondExprSize > firstExprSize && secondExprSize % firstExprSize == 0) {
						int index = Collections.indexOfSubList(secondExpressions, firstExpressions);
						boolean containsAll = firstExpressions.containsAll(secondExpressions);
						if (index != -1 && containsAll == true) {
							((ParentheseExpression) expression).setExpressions(firstExpressions);
						}
					}
				}
			}
		}
		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule3(Expression expression) {
		// (a|b*)* => (a|b)*
		// METHOD SIMILAR TO simplifyRule9
		/*
		 * one element on left or right side ([a-z]*(gds)|[sdr](sgdg)*)*
		 */
		if (expression instanceof ParentheseExpression) {
			String lastSymbol = ((ParentheseExpression) expression).getLastSymbol();
			Expression subExpression = expression.getExpressions().get(0);
			if (subExpression instanceof AlternativeExpression && lastSymbol != null
					&& (lastSymbol.equals("*") || lastSymbol.equals("+"))) {
				List<Expression> firstExpressions = ((AlternativeExpression) subExpression).getFirstExpression();
				List<Expression> secondExpressions = ((AlternativeExpression) subExpression).getSecondExpression();
				Expression firstExpression = firstExpressions.get(0);
				Expression secondExpression = secondExpressions.get(0);
				if (firstExpressions.size() == 1 && firstExpression instanceof LastTokenExpression) {
					String subLastSymbol = ((LastTokenExpression) firstExpression).getLastSymbol();
					if (subLastSymbol != null && subLastSymbol.equals(lastSymbol)) {
						((LastTokenExpression) firstExpression).removeLastSymbol();
					}

				}
				if (secondExpressions.size() == 1 && secondExpression instanceof LastTokenExpression) {
					String subLastSymbol = ((LastTokenExpression) secondExpression).getLastSymbol();
					if (subLastSymbol.equals(lastSymbol)) {
						((LastTokenExpression) secondExpression).removeLastSymbol();
					}

				}
			}
		}
		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule4(Expression expression) {
		// if ParentheseExpression has NO LastToken then omit the Paretheses and
		// get Parenthese children
		// (SOME_EXPRESSIONS) => SOME_EXPRESSIONS
		// toString method
		// and alternativeExpression inside parentheseExpression
		if (expression instanceof ParentheseExpression) {
			String lastSymbol = ((ParentheseExpression) expression).getLastSymbol();
			List<Expression> subExpressions = expression.getExpressions();
			if (lastSymbol == null && !(subExpressions.get(0) instanceof AlternativeExpression)) {
				return subExpressions;
			}
		}
		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule5(Expression expression) {
		// c{0,1} -> c?
		// if size is == 1 then add a endSymbol to expression
		/*
		 * if expressions.size()>1 then create parentheseExpression add
		 * expressions to created parentheseExpression as children then check
		 */
		if (expression instanceof MatchCountExpression) {
			List<Expression> expressions = expression.getExpressions();
			RangeOccurence rangeOccurence = ((MatchCountExpression) expression).getRangeOccurence();
			String firstNumber = rangeOccurence.getFirstNumber();
			String secondNumber = rangeOccurence.getSecondNumber();
			if (firstNumber != null && secondNumber != null) {
				if (firstNumber.equals("0") && secondNumber.equals("1")) {
					if (expressions.size() > 1) {
						ParentheseExpression parentheseExpression = new ParentheseExpression("?", expressions);
						return Arrays.asList(parentheseExpression);
					}
					if (expressions.size() == 1) {
						Expression subExpression = expressions.get(0);
						((LastTokenExpression) subExpression).setLastSymbol("?");
						return Arrays.asList(subExpression);
					}
				}
			}
		}
		return Arrays.asList(expression);

	}

	public List<Expression> simplifyRule6(Expression expression) {
		// (abc){1,} -> abc+
		if (expression instanceof MatchCountExpression) {
			RangeOccurence rangeOccurence = ((MatchCountExpression) expression).getRangeOccurence();
			List<Expression> expressions = ((MatchCountExpression) expression).getExpressions();
			String firstNumber = rangeOccurence.getFirstNumber();
			String secondNumber = rangeOccurence.getSecondNumber();
			if (firstNumber.equals("1") && (secondNumber == null || secondNumber.equals(""))) {
				if (expressions.size() > 1) {
					ParentheseExpression parentheseExpression = new ParentheseExpression("+", expressions);
					return Arrays.asList(parentheseExpression);
				}
				if (expressions.size() == 1) {
					Expression subExpression = expressions.get(0);
					((LastTokenExpression) subExpression).setLastSymbol("+");
					return Arrays.asList(subExpression);
				}
			}
		}

		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule7(Expression expression) {
		// (abc){0,} -> abc*
		if (expression instanceof MatchCountExpression) {
			RangeOccurence rangeOccurence = ((MatchCountExpression) expression).getRangeOccurence();
			List<Expression> expressions = ((MatchCountExpression) expression).getExpressions();
			String firstNumber = rangeOccurence.getFirstNumber();
			String secondNumber = rangeOccurence.getSecondNumber();
			if (firstNumber.equals("0") && (secondNumber == null || secondNumber.equals(""))) {
				if (expressions.size() > 1) {
					ParentheseExpression parentheseExpression = new ParentheseExpression("*", expressions);
					return Arrays.asList(parentheseExpression);
				}
				if (expressions.size() == 1) {
					Expression subExpression = expressions.get(0);
					((LastTokenExpression) subExpression).setLastSymbol("*");
					return Arrays.asList(subExpression);
				}
			}
		}

		return Arrays.asList(expression);
	}

	/*
	 * public List<Expression> simplifyRule7(Expression expression) { //aa+ =>
	 * a{2,} if(!(expression instanceof MatchCountExpression)){ List<Expression>
	 * expressions = expression.getExpressions();
	 * Arrays.asList(expression); }
	 */
	public List<Expression> simplifyRule8(Expression expression) {
		// (ab+cb) => (a+c)b

		if (expression instanceof ParentheseExpression) {
			List<Expression> expressions = expression.getExpressions();
			Expression alternativeExpr = expressions.get(0);
			if (expressions.size() == 1 && alternativeExpr instanceof AlternativeExpression) {
				List<Expression> firstExpression = ((AlternativeExpression) alternativeExpr).getFirstExpression();
				List<Expression> secondExpression = ((AlternativeExpression) alternativeExpr).getSecondExpression();
				if (firstExpression.size() > 1 && secondExpression.size() > 1) { 
					Expression subSecondExpression = secondExpression.get(0);
					Expression subFirstExpression = firstExpression.get(0);
					// check at the beginning of each expression
					if (subFirstExpression.equals(subSecondExpression)) {
						firstExpression.remove(0);
						secondExpression.remove(0);
						List<Expression> newList = new ArrayList<>();
						newList.add(subFirstExpression);
						newList.add(expression);
						return newList;
					}
					// check at the end if no match at the beginning
					else {
						subSecondExpression = secondExpression.get(secondExpression.size() - 1);
						subFirstExpression = firstExpression.get(firstExpression.size() - 1);
						if (subFirstExpression.equals(subSecondExpression)) {
							firstExpression.remove(firstExpression.size() - 1);
							secondExpression.remove(secondExpression.size() - 1);
							List<Expression> newList = new ArrayList<>();
							newList.add(expression);
							newList.add(subFirstExpression);
							return newList;
						}
					}

				}

			}
		}
		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule9(Expression expression) {
		// (a*|b*|c*)* => (a|b|c)*
		/*
		 * one one expression at left or right alternative
		 */
		if (expression instanceof ParentheseExpression) {
			List<Expression> expressions = expression.getExpressions();
			if (expressions != null) {
				Expression subExpression = expressions.get(0);
				if (expressions.size() == 1 && subExpression instanceof AlternativeExpression) {
					SimplifierService.checkForNestedExpression((AlternativeExpression) subExpression);
				}
			}

		}
		return Arrays.asList(expression);
	}

	/*
	 * public List<Expression> simplifyRule10(Expression expression) { // a+b+a*
	 * => b+a* //a|a* => a* //a|b|a* => b|a*
	 * 
	 * if(expression instanceof AlternativeExpression){ List<Expression>
	 * firstExpression = ((AlternativeExpression)
	 * expression).getFirstExpression(); List<Expression> secondExpression =
	 * ((AlternativeExpression) expression).getSecondExpression(); } return
	 * Arrays.asList(expression); }
	 */
	// DONE
	public List<Expression> simplifyRule11(Expression expression) {
		// ba+a+=>ba+ 
		List<Expression> expressions = expression.getExpressions();
		if (expressions != null) {
			Iterator<Expression> i = expressions.iterator();
			Expression previousExpr = null;
			while (i.hasNext()) {
				Expression expr = i.next();
				if (expr instanceof LastTokenExpression && previousExpr instanceof LastTokenExpression) {
					String previousExprSymbol = ((LastTokenExpression) previousExpr).getLastSymbol();
					String exprSymbol = ((LastTokenExpression) expr).getLastSymbol();
					if (previousExpr != null && exprSymbol != null && (!exprSymbol.equals("?"))
							&& expr.equals(previousExpr) && previousExprSymbol.equals(exprSymbol)) {
						i.remove();
					} else
						previousExpr = expr;
				} else
					previousExpr = expr;
			}
		}
		expression.setExpressions(expressions);

		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule12(Expression expression) {
		// aa* => a+
		List<Expression> expressions = expression.getExpressions();
		if (expressions != null) {
			Iterator<Expression> i = expressions.iterator();
			Expression previousExpr = null;
			while (i.hasNext()) {
				Expression expr = i.next();
				if (expr instanceof LastTokenExpression && previousExpr instanceof LastTokenExpression) {
					String previousExprSymbol = ((LastTokenExpression) previousExpr).getLastSymbol();
					String exprSymbol = ((LastTokenExpression) expr).getLastSymbol();
					if (previousExpr != null && previousExprSymbol == null && exprSymbol != null
							&& exprSymbol.equals("?")) {
						i.remove();
						((LastTokenExpression) previousExpr).setLastSymbol("+");
					} else
						previousExpr = expr;
				} else
					previousExpr = expr;
			}
		}
		expression.setExpressions(expressions);

		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule13(Expression expression) {
		// (ONE_EXPR*)*=> a*
		// if there is a single expression without lastToken and it is not an
		// AlternativeExpr or MatchCount Expr
		if (expression instanceof ParentheseExpression) {
			String exprLastSymbol = ((ParentheseExpression) expression).getLastSymbol();
			List<Expression> expressions = expression.getExpressions();
			if (expressions.size() == 1) {
				// check if subExpression is not an AlternativeExpr or MatchCountExpr
				// just check if subExpression is an lastTokenExpression
				Expression subExpression = expressions.get(0);
				if (subExpression instanceof LastTokenExpression) {
					// if symbol equals or subExpr symbol is not present
					String subExprLastSymbol = ((LastTokenExpression) subExpression).getLastSymbol();
					if (subExprLastSymbol == null || subExprLastSymbol.equals(exprLastSymbol)) {
						((LastTokenExpression) subExpression).setLastSymbol(exprLastSymbol);
						return Arrays.asList(subExpression);
					}
				}
			}
		}

		return Arrays.asList(expression);
	}

	public List<Expression> simplifyRule15(Expression expression) {
		// [aaa] => [a]
		// if two expressions are equal remove one from the list
		// if there is a single expression and it is not an alternative
		if (expression instanceof BracketExpression) {
			List<Expression> expressions = expression.getExpressions();
			Set<Expression> uniqueExpressions = new HashSet<>(expressions);
			if (expressions.size() > uniqueExpressions.size()) {
				List<Expression> newExpressions = new ArrayList<>(uniqueExpressions);
				expression.setExpressions(newExpressions);
			}
		}

		return Arrays.asList(expression);
	}

}
