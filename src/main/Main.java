package main;

import antlr.RegexRulesLexer;
import antlr.RegexRulesParser;
import antlr.RegexRulesParser.BracketExpressionContext;
import antlr.RegexRulesParser.ProgContext;
import expressions.Expression;
import expressions.RegularExpr;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import simplifier.Simplifier;
import simplifier.TreeSearcher;
import visitor.MyListener;
import visitor.MyVisitor;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// "((sa+d+)?)+(ppp?)|abc\n";
		// "(c)|ab(c)|ab|a\n";
		//"((aaa|a)+)|((aaa|a)+)\n"
		//"((a|b+)+)|((a|b+)+)\n"
		//"(((df)|b+))|(((df)|b+))\n"
		//"((aaa|a)+)|((aaa|a)+)\n"
		//(baa+a+a+)\n"
		//"(ab|cb)\n"
		//"[aba]\n"
		//"((((abc)))(((wre))))+\n"
		//"(([aaaabsaaaa]){0,1})\n"
		// "((sa+d+)?)+(pp?)\n"
		//"(([a-b])){0,1}\n"
		String content = "ba+a+\n";// "((sdg))(ppp?)(qwqw|qw)+xyz|(as|df)[a-x]abc{1,51}(foo)|bar(agga)|(aaa)\n";

		Pattern pattern = Pattern.compile(content);
		Matcher matcher = pattern.matcher("sdgpppqwxyzgabcc");
		boolean match = matcher.matches();
		System.out.println("JSON File:\n" + content + "\n\n");

		ANTLRInputStream input = new ANTLRInputStream(content);

		RegexRulesLexer lexer = new RegexRulesLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		RegexRulesParser parser = new RegexRulesParser(tokens);

		ParseTree tree = parser.prog();

		ParseTreeWalker walker2 = new ParseTreeWalker();
		ParseTreeProperty<Expression> propTree = new ParseTreeProperty<>();

		// ==check few Classes

		// === parser.prog NULL values - NONE children
		ProgContext context = parser.prog(); // NULL children values
		if (context.bracketExpression() != null) {
			System.out.println(context.matchCountExpression().size());
		}

		List<BracketExpressionContext> bracketExpression = context.bracketExpression();
		bracketExpression.stream().forEach(cntx -> System.out.println("Sysout" + cntx.toStringTree()));
		// ===parser.prog NULL values - NONE children

		// FEW WAYS OF GETTING NODES
		// getting ROOT (RegularExpr)
		Object payloadRootObject = tree.getPayload();
		ProgContext payloadRoot = (ProgContext) tree.getPayload();

		Interval sourceInterval = tree.getSourceInterval();
		String text = tree.getText();
		if (payloadRootObject instanceof ProgContext) {
			System.out.println("PROG CONTEXT");
		}


		// ==Listeners and Visitor
		MyListener extractor = new MyListener();
		ParseTreeWalker walker = new ParseTreeWalker();
		// walker.walk(extractor, tree);
		ParseTreeWalker.DEFAULT.walk(extractor, payloadRoot);
		MyVisitor<Expression> visitor = new MyVisitor<>();
		RegularExpr regularExpr2 = (RegularExpr) visitor.visit(payloadRoot);

		System.out.println("ParseTree:\n" + tree.toStringTree(parser) + "\n");
		System.out.println("PP:\n" + context.toStringTree(parser) + "\n");

		Simplifier simplifier = new Simplifier();
		List<Expression> allExpressions = regularExpr2.getExpressions();
		
		TreeSearcher treeSearcher = new TreeSearcher();
		treeSearcher.simplifyProg(regularExpr2);
		
		System.out.println(regularExpr2.toString());


	}

}
