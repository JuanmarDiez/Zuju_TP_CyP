
package com.lenguaje.zuju.interprete;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "zju";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		ZujuLexer lexer = new ZujuLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ZujuParser parser = new ZujuParser(tokens);

		ZujuParser.ProgramContext tree = parser.program();

		ZujuCustomVisitor visitor = new ZujuCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
