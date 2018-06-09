package expressions;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class RangeOccurence implements Expression {
	private String firstNumber;
	private String secondNumber;

	public RangeOccurence(TerminalNode firstNumber, TerminalNode secondNumber) {
		this.firstNumber = firstNumber.getText();
		if (isInteger(secondNumber.getText()))
			this.secondNumber = secondNumber.getText();
	}

	public String getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(String firstNumber) {
		this.firstNumber = firstNumber;
	}

	public String getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(String secondNumber) {
		this.secondNumber = secondNumber;
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
		if (firstNumber == null)
			firstNumber = "";
		if (secondNumber == null)
			secondNumber = "";
		return "{" + firstNumber + "," + secondNumber + "}";
	}

	private static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		// only got here if we didn't return false
		return true;
	}
}
