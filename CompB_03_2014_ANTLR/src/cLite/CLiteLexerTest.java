package cLite;

import java.io.BufferedReader;
import java.io.FileReader;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Token;

import cLiteLexer.CLiteLexer;

public class CLiteLexerTest {
	private static final String PROGRAM = "programme/convert.cpp";

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(
				PROGRAM));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println("[prog]" + line);
		}
		br.close();

		CLiteLexer lexer = new CLiteLexer(new ANTLRFileStream(
				PROGRAM));
		boolean moreTokens = true;
		System.out.println("---------------------------------");
		while (moreTokens) {
			Token token = lexer.nextToken();
			if (token.getType() == Token.EOF)
				moreTokens = false;

			if (token.getText().charAt(0) != ' ')
				System.out.println("Zeile " + token.getLine() + "\t"
						+ token.getText());
		}
		System.out.println("---------------------------------");

		// CommonTokenStream tokens = new CommonTokenStream(lexer);
		// System.out.println(">>" + tokens.getText() + "<<");
		// for (Token token : tokens.getTokens()) {
		// if (token.getText().charAt(0)!=' ')
		// System.out.println("[TOKEN]" + token.getText());
		// }
	}

}
