package MAIN;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

import ANTLR.ParserDNDBaseVisitor;
import ANTLR.ParserDNDParser;
import ANTLR.ParserDNDParser.AsignacionContext;
import ANTLR.ParserDNDParser.DeclaracionContext;




public class MyVisitor extends ParserDNDBaseVisitor<Integer> {
	private Map<String, String>  variables = new HashMap<String, String>();
	
	//------Declaracion de Variables-----//
	@Override
	public Integer visitDeclaracion(DeclaracionContext ctx){
		String id = ctx.nombre().getText();        
        String value = "";  
        
        if (variables.containsKey(id))
            throw new IllegalArgumentException("Variable '" + id + "' ya fue declarada declarada");
        else {
	    	value = ctx.valor().getText();
	    
	        variables.put(id, value);
        }
        return 0;
  
    }
	
	

}
