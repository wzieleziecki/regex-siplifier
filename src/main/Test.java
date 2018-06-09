package main;

import antlr.RegexRulesLexer;
import antlr.RegexRulesParser;
import antlr.RegexRulesParser.ProgContext;
import expressions.Expression;
import expressions.RegularExpr;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import simplifier.TreeSearcher;
import visitor.MyVisitor;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args){
		List<String> regexes = prepareRegexes();
		regexes.forEach(content -> {
			RegularExpr regularExpr = prepareParsedTree(content);
			TreeSearcher treeSearcher = new TreeSearcher();
			System.out.print("Original Regex: "+content);
			treeSearcher.simplifyProg(regularExpr);
		});

	}
	
	public static List<String> prepareRegexes(){

		List<String> regexes = new ArrayList<>();
		regexes.add("((((abc)))(((wre))))+\n");
		regexes.add("[aaaaabbbbbaaasapaaaappppaaacppaappaa]\n");
		regexes.add("((sa+d+)?)+(pp?)\n");
		regexes.add("(([a-b])){0,1}\n");
		regexes.add("ba+a+\n");
		regexes.add("((sdg))(ppp?)(qwqw|qw)+xyz|(as|df)[a-x]abc{0,}(foo)|bar(agga)|(aaa)\n");
		regexes.add("b*(asaf+)a+a+\n");

		return regexes;
	}
	
	public static RegularExpr prepareParsedTree(String content){
		ANTLRInputStream input = new ANTLRInputStream(content);

		RegexRulesLexer lexer = new RegexRulesLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		RegexRulesParser parser = new RegexRulesParser(tokens);

		ParseTree tree = parser.prog();
		
		ProgContext payloadRoot = (ProgContext) tree.getPayload();
		
		MyVisitor<Expression> visitor = new MyVisitor<>();
		RegularExpr regularExpr = (RegularExpr) visitor.visit(payloadRoot);
		
		return regularExpr;
		
	}
}
