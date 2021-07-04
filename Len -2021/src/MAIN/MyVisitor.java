package MAIN;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ANTLR.ParserDNDBaseVisitor;
import ANTLR.ParserDNDParser.AsignacionContext;
import ANTLR.ParserDNDParser.DeclaracionContext;
import ANTLR.ParserDNDParser.PrintSentenceContext;
import ANTLR.ParserDNDParser.Tipo_datoContext;
import ANTLR.ParserDNDParser.ValorContext;





public class MyVisitor extends ParserDNDBaseVisitor<Integer> {
	private Map<String, String>  variables = new HashMap<String, String>();
	private Map<String, String>  variablesTipo = new HashMap<String, String>();
	
	
	//--------------- Funcion Imprimir -------------//
	@Override
	public Integer visitPrintSentence(PrintSentenceContext ctx){	        
	        String output = "";
	        if(ctx.valor() == null && ctx.nombre() == null) {
	        	throw new IllegalArgumentException("Funcion Sending esta vacia.");
	        	
	        }else{ 
	        	if (ctx.valor() != null) {
	        		output += ctx.valor().getText();
	        	
	        	}
	        	if (ctx.nombre() != null) {
	        		if(!variables.containsKey(ctx.nombre().getText()))
	        			throw new IllegalArgumentException("Variable '" + ctx.nombre().getText() + "' no ha sido declarada.");
	        		
	        		output += variables.get(ctx.nombre().getText());
	        	}
	        }
	        System.out.println(output);
	        return 0;
	}
	
	//-------------- Declarar Variables 	-----------//
	@Override
	public Integer visitDeclaracion(DeclaracionContext ctx){	        
		   String id = "";
		   
		   if(ctx.asignacion() != null) {
			   id = ctx.asignacion().nombre(0).getText();
		   }
		   if(ctx.nombre() != null) {
			   id = ctx.nombre().getText();
		   }
		   
		   
	       String tipoDato = "";
	       switch(visitTipo_dato(ctx.tipo_dato())) {
	       case 1:
	    	   tipoDato = "ENTERO";
	    	   break;
	    	   
	       case 2:
	    	   tipoDato = "BOOLEAN";
	    	   break;
	    	   
	       case 3:
	    	   tipoDato = "STRING";
	    	   break;
	       
	       default:
	    	   throw new IllegalArgumentException("Tipo de Variable no valida.");
	       
	       }

	       String value = "";
	       
	       if (variables.containsKey(id))
	            throw new IllegalArgumentException("Variable '" + id + "' ya fue declarada");
	       
	       
	       variables.put(id, value);
	       variablesTipo.put(id, tipoDato);
	       
	       if( ctx.asignacion() != null ) {
	    		visitAsignacion(ctx.asignacion());
	    		   
	       }
	       
	       return 0;
	}
	
	
	//-------------- Asignar Variables 		-----------//
	@Override
	public Integer visitAsignacion(AsignacionContext ctx){	        
		String variableName;
		String value = "";
		
		if (ctx.nombre().size() > 1) {
			variableName = ctx.nombre(1).getText();
		}else {
			variableName = ctx.nombre(0).getText();
			
		}		
	       
		if (ctx.nombre().size() > 1) { 
			if(!variables.containsKey(variableName)) {
				throw new IllegalArgumentException("Variable '" + variableName + "' no ha sido declarada");
			}
			else {
				if(!variables.containsKey(ctx.nombre(0).getText())) {
					throw new IllegalArgumentException("Variable '" + ctx.nombre(0).getText() + "' no ha sido declarada");
				}
				
				
				if ( variablesTipo.get(ctx.nombre(0).getText()) != variablesTipo.get(variableName) ) {
					throw new IllegalArgumentException("Variables son de distinto tipo.");
				}
					
					variables.replace(ctx.nombre(0).getText(), variables.get(variableName));
					return 0;
			}
		}
		
		
		if(!variables.containsKey(variableName)) {
			throw new IllegalArgumentException("Variable '" + variableName + "' no ha sido declarada");
		}
			
		if(ctx.operacion() != null) {
			
		}
		if(ctx.funcion() != null) {
			
		}
		if(ctx.valor() != null) {
			String valorNuevo = "";
			
			switch(visitValor(ctx.valor())) {
		       case 1:
		    	   valorNuevo = "ENTERO";
		    	   break;
		    	   
		       case 2:
		    	   valorNuevo = "BOOLEAN";
		    	   break;
		    	   
		       case 3:
		    	   valorNuevo = "STRING";
		    	   break;
		       
		       default:
		    	   throw new IllegalArgumentException("Tipo de Valor no Valido.");
		       
			}
			
			if(variablesTipo.get(variableName) != valorNuevo) {
				throw new IllegalArgumentException("Tipo de Valor no compatible con la Variable.");
			}
				
			value = ctx.valor().getText();
			
		}
		
		variables.replace(ctx.nombre(0).getText(), value);
		
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
	
	@Override
	public Integer visitValor(ValorContext ctx){
		
		if(ctx.NUM() != null){
			return 1;
		}
		else if(ctx.TRUE() != null || ctx.FALSE() != null) {
			return 2;
		}
		else if(ctx.STRING_LITERAL() != null) {
			return 3;
		}
		
		return 0;
	}
	
	
}
