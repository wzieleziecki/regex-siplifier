package expressions;

import org.antlr.v4.runtime.tree.TerminalNode;

public interface LastTokenExpression {
	
	public void setLastSymbol(TerminalNode lastToken);
	
	public void setLastSymbol(String symbol);
	
	public void removeLastSymbol();
	
	public String getLastSymbol();
}
