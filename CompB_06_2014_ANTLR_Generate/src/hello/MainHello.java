package hello;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;


public class MainHello {
	private static final String PROGRAM = "programme/Hello.txt";
	private static final String TOKENS = "src/HelloLexer.tokens";

	public static void main(String[] args) throws Exception {
		TreeMap<Integer, String> symbols = new TreeMap<Integer, String>();
		symbols=initSymbols();

		BufferedReader br = new BufferedReader(new FileReader(PROGRAM));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println("[prog]" + line);
		}
		br.close();

		/*
		 * LEXER
		 */

		HelloLexer lexer = new HelloLexer(new ANTLRFileStream(PROGRAM));
		System.out.println("---------------------------------");
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		System.out.println(">>" + tokens.getText() + "<<");
		for (Token token : tokens.getTokens()) {
			if (token.getText().charAt(0) != ' ')
				System.out.println("[TOKEN]<" + token.getType() + " , "
						+ token.getText() + ">"
						+ " "
						+ symbols.get(token.getType())
						);
		}
		System.out.println("---------------------------------");

		/*
		 * PARSER
		 */
		// Parser verarbeitet Tokens
		HelloParser parser = new HelloParser(tokens);
		ParseTree tree = parser.r(); // start-Regel
		String strParseTree = new MyTestVisitor<String>().visit(tree);
		System.out.println("ParseTree: " + strParseTree);

	}

	static TreeMap<Integer, String> initSymbols() throws IOException {
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		BufferedReader br = new BufferedReader(new FileReader(TOKENS));
		String line = ""; // AddOp=32
		String value, sKey;
		int key;
		int eq;

		while ((line = br.readLine()) != null) {
			eq = line.lastIndexOf('=');
			value = line.substring(0, eq);
			sKey = line.substring(eq + 1, line.length());
			key = Integer.parseInt(sKey);
			// System.out.println("token="+ token + " value " + value);
			tree.put(key, value);
		}
		br.close();

		return tree;
	}


}
