package MAIN;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ANTLR.ParserDNDBaseVisitor;
import ANTLR.ParserDNDParser.AsignacionContext;
import ANTLR.ParserDNDParser.DeclaracionContext;
import ANTLR.ParserDNDParser.PrintSentenceContext;
import ANTLR.ParserDNDParser.Tipo_datoContext;





public class MyVisitor extends ParserDNDBaseVisitor<Integer> {
	private Map<String, String>  variables = new HashMap<String, String>();
	private Map<String, String>  variablesTipo = new HashMap<String, String>();
	
	
	//--------------- Funcion Imprimir -------------//
	@Override
	public Integer visitPrintSentence(PrintSentenceContext ctx){	        
	        String output = "";
	        if(ctx.valor() == null && ctx.nombre() == null) {
	        	throw new IllegalArgumentException("Funcion Sending esta vacia.");
	        	
	        }else if (ctx.valor() != null ) {
	        	output = ctx.valor().getText();
	        	
	        }
	        System.out.println(output);
	        return 0;
	}
	
	//-------------- Declarar Variables 	-----------//
	@Override
	public Integer visitDeclaracion(DeclaracionContext ctx){	        
	       String id = ctx.nombre().getText();
	       String value = "";
	       
	       if (variables.containsKey(id))
	            throw new IllegalArgumentException("Variable '" + id + "' ya fue declarada");
	       else{
	    	   if( ctx.asignacion() != null ) {
	    		   
	    		   
	    	   }else {
	    		   variables.put(id, value);
	    	   }
	       }
	       
	       return 0;
	}
	
	
	//-------------- Asignar Variables 		-----------//
	@Override
	public Integer visitAsignacion(AsignacionContext ctx){	        
	       String id = ctx.nombre(0).getText();
	       String value = "";
	       
	       if (variables.containsKey(id)) {
	           if(variables.containsKey(id)) {
	        	   
	        	   
	        	   
	           }
	    	   
	    	   
	       }else{
	    	   if( ctx.operacion() != null ) {
	    		   
	    		   
	    	   }
	    	   variables.put(id, value);
	    	   
	       }
	       
	       return 0;
	}
	
	
	//-------------- Funcion Matematica 	-----------//
	//-------------- Leer Variables 		-----------//
	//-------------- Operar Variables 		-----------//
	//-------------- If					 	-----------//
	//-------------- Comparar Variables 	-----------//
	//-------------- Iteracion		 		-----------//
	//-------------- Iteracion - for		-----------//
	//-------------- Iteracion - while		-----------//
	//-------------- Reconocer tipo de variable -------//
	@Override
	public Integer visitTipo_dato(Tipo_datoContext ctx){
		
		if(ctx.ENTERO() != null){
			return 1;
		}
		else if(ctx.BOOLEAN() != null) {
			return 2;
		}
		else if(ctx.STRING() != null) {
			return 3;
		}
		
		return 0;
	}
	
	
}
