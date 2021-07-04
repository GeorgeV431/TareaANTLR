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
	
	@Override
	public Integer visitDeclaracion(DeclaracionContext ctx){
        String id = ctx.nombre().ID().getText();        
        String value = "";        
        
        if (variables.containsKey(id))
            throw new IllegalArgumentException("Variable '" + id + "' ya fue declarada");
        else {
        	if (ctx.ID().size() > 1) {
        		value = ctx.ID(1).getText(); 
        	}else { 
            	//System.out.println(id+" en else ");//+ctx.BOOLEAN_().getText());    	   
            	if(ctx.NUMBER()!=null){
            		value = ctx.NUMBER().getText();
            	}else{
            		value = ctx.STRING().getText().substring(1, ctx.STRING().getText().length()-1);          		
            	}
        	}
        	variables.put(id, value);
        }       
        
        return 0;
    }
	
	

}
