package MAIN;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import ANTLR.ParserDNDLexer;
import ANTLR.ParserDNDParser;


public class TooL {
	
	public static void main(String[] args)throws Exception {
        
		
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("example/ejemplo0.txt"));
		ParserDNDLexer lexer = new ParserDNDLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParserDNDParser parser = new ParserDNDParser(tokens);  
        ParseTree tree = parser.program();
        MyVisitor eval = new MyVisitor();
        eval.visit(tree);
        
	}

}
