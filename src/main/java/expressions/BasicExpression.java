package expressions;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BasicExpression implements Expression, LastTokenExpression {

	private List<Expression> expressions;
	private List<String> letters;
	private String lastSymbol;


	public BasicExpression() {
		this.expressions = new ArrayList<>();
		this.letters = new ArrayList<>();
	}

	@Override
	public void addExpression(Expression expression) {
		expressions.add(expression);
	}


	public void setLetters(List<TerminalNode> letters) {
		letters.stream().forEach(terminalNode -> this.letters.add(terminalNode.getText()));
	}

	public List<String> getLetters() {
		return letters;
	}

	@Override
	public void setLastSymbol(String endSymbol) {
		this.lastSymbol = endSymbol;
	}

	@Override
	public void setLastSymbol(TerminalNode lastToken) {
		if (lastToken != null) {
			this.lastSymbol = lastToken.getText();
		}
	}

	@Override
	public String getLastSymbol() {
		return lastSymbol;
	}

	@Override
	public List<Expression> getExpressions() {
		return expressions;
	}

	@Override
	public void setExpressions(List<Expression> expressions) {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expressions == null) ? 0 : expressions.hashCode());
		result = prime * result + ((lastSymbol == null) ? 0 : lastSymbol.hashCode());
		result = prime * result + ((letters == null) ? 0 : letters.hashCode());
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
		BasicExpression other = (BasicExpression) obj;
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
		if (letters == null) {
			if (other.letters != null)
				return false;
		} else if (!letters.equals(other.letters))
			return false;
		return true;
	}

	@Override
	public void removeLastSymbol() {
		this.lastSymbol = null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		letters.stream().forEach(letter -> {
			if (letter != null)
				builder.append(letter);
		});
		if (lastSymbol != null)
			builder.append(lastSymbol);
		return builder.toString();
	}

}
