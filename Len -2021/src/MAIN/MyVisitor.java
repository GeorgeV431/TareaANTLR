package MAIN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import ANTLR.ParserDNDBaseVisitor;
import ANTLR.ParserDNDParser.AsignacionContext;
import ANTLR.ParserDNDParser.ComparacionContext;
import ANTLR.ParserDNDParser.ConditionContext;
import ANTLR.ParserDNDParser.DeclaracionContext;
import ANTLR.ParserDNDParser.FuncionContext;
import ANTLR.ParserDNDParser.If_blockContext;
import ANTLR.ParserDNDParser.Iter_forContext;
import ANTLR.ParserDNDParser.Iter_whileContext;
import ANTLR.ParserDNDParser.OperacionContext;
import ANTLR.ParserDNDParser.PreguntaContext;
import ANTLR.ParserDNDParser.PrintSentenceContext;
import ANTLR.ParserDNDParser.ReadSentenceContext;
import ANTLR.ParserDNDParser.RecorrerContext;
import ANTLR.ParserDNDParser.ReformularContext;
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
			value = visitOperacion(ctx.operacion()).toString();
			
		}
		if(ctx.funcion() != null) {
			value = visitFuncion(ctx.funcion()).toString();
			
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
	@Override
	public Integer visitFuncion(FuncionContext ctx){
	        Integer num=1;
	        if(ctx.valor() == null && ctx.nombre() == null) {
	        	throw new IllegalArgumentException("Funcion esta vacia.");
	        	
	        }else{ 
	        	if (ctx.valor() != null) {
	        		num = Integer.valueOf(ctx.valor().getText());
	        		
	        	
	        	}
	        	if (ctx.nombre() != null) {
	        		if(!variables.containsKey(ctx.nombre().getText()))
	        			throw new IllegalArgumentException("Variable '" + ctx.nombre().getText() + "' no ha sido declarada.");
	        		num = Integer.valueOf(variables.get(ctx.nombre().getText()));
	        	}
	        }
	        if(ctx.COS() != null){
	        	return (int) Math.cos(num);
	        }else if(ctx.SIN() != null) {
	        	return (int) Math.sin(num);
	        }else if(ctx.TAN() != null) {
	        	return (int) Math.tan(num);
	        }else if(ctx.ABS() != null) {
	        	return (int) Math.abs(num);
	        }

	        return 0;
	}
	//-------------- Leer Variables 		-----------//
	@Override
	public Integer visitReadSentence(ReadSentenceContext ctx) {
		String id = ctx.nombre().getText();
		
		if(!variables.containsKey(id)) {
			throw new IllegalArgumentException("Variable '" + id + "' no ha sido declarada");
		}
		
		Scanner myObj = new Scanner(System.in);
		String valor = "";
		
		switch(variablesTipo.get(id)) {
		case "ENTERO":
			valor = myObj.nextLine();
			if(!valor.matches(".*\\d+.*")) {
				myObj.close();
				throw new IllegalArgumentException("Valor no valido.");
			}
			
			break;
		case "BOOLEAN":
			valor = myObj.nextLine();
			valor = valor.toUpperCase();
			
			if(!valor.equals("GOOD") && !valor.equals("EVIL")) {
				myObj.close();
				throw new IllegalArgumentException("Valor no valido.");
			}
			break;
		case "STRING":
			valor = myObj.nextLine();
			valor = ("\""+valor+"\"");
			break;
		default:
			myObj.close();
			throw new IllegalArgumentException("Valor no valido.");
			
		}
				
		variables.replace(id, valor);
		myObj.close();
		return 0;
	}
	
	
	//-------------- Operar Variables	((valor|nombre) reformular (valor|nombre));	-----------//
	@Override
	public Integer visitOperacion(OperacionContext ctx){
		Integer num1 = 0;
		Integer num2 = 0; 
		Integer resultado = 0;
	
		if(ctx.nombre(0) != null) {
			if(ctx.nombre().size() > 1) {
				if(!variables.containsKey(ctx.nombre(0).getText())) {
					throw new IllegalArgumentException("Variable '" + ctx.nombre(0).getText() + "' no ha sido declarada");
				}
				if(variables.get(ctx.nombre(0).getText()) == "") {
					throw new IllegalArgumentException("Variable '" + ctx.nombre(0).getText() + "' no tiene valor");
				}
				if(variablesTipo.get(ctx.nombre(0).getText()) != "ENTERO")
					throw new IllegalArgumentException("Valor no es StoneShapes.");
				
				num1 = Integer.valueOf(variables.get(ctx.nombre(0).getText()));
				
				if(!variables.containsKey(ctx.nombre(1).getText())) {
					throw new IllegalArgumentException("Variable '" + ctx.nombre(1).getText() + "' no ha sido declarada");
				}
				if(variables.get(ctx.nombre(1).getText()) == "") {
					throw new IllegalArgumentException("Variable '" + ctx.nombre(1).getText() + "' no tiene valor");
				}
				if(variablesTipo.get(ctx.nombre(1).getText()) != "ENTERO")
					throw new IllegalArgumentException("Valor no es StoneShapes.");
				num2 = Integer.valueOf(variables.get(ctx.nombre(1).getText()));
				
			}
			
			else {
				if(!variables.containsKey(ctx.nombre(0).getText())) {
					throw new IllegalArgumentException("Variable '" + ctx.nombre(0).getText() + "' no ha sido declarada");
				}
				if(variables.get(ctx.nombre(0).getText()) == "") {
					throw new IllegalArgumentException("Variable '" + ctx.nombre(0).getText() + "' no tiene valor");
				}
				if(variablesTipo.get(ctx.nombre(0).getText()) != "ENTERO")
					throw new IllegalArgumentException("Valor no es StoneShapes.");
				
				
				if(ctx.nombre(0) == ctx.getChild(0) ) {
					num1 = Integer.valueOf(variables.get(ctx.nombre(0).getText()));
				}
				else if(ctx.nombre(0) == ctx.getChild(2) ) {
					num2 = Integer.valueOf(variables.get(ctx.nombre(0).getText()));
				}
			}
			
		}
		
		if(ctx.valor(0) != null) {
			if(ctx.valor().size() > 1) {
				if(visitValor(ctx.valor(0)) != 1)
					throw new IllegalArgumentException("Valor no es StoneShapes.");
				if(visitValor(ctx.valor(1)) != 1)
					throw new IllegalArgumentException("Valor no es StoneShapes.");
				
				
				num1 = Integer.parseInt(ctx.valor(0).getText());
				num2 = Integer.parseInt(ctx.valor(1).getText());
				
			}
			
			else {
				if(visitValor(ctx.valor(0)) != 1)
					throw new IllegalArgumentException("Valor no es StoneShapes.");
				
				if(ctx.valor(0) == ctx.getChild(0) ) {
					num1 = Integer.valueOf(ctx.valor(0).getText());
				}
				else if(ctx.valor(0) == ctx.getChild(2) ) {
					num2 = Integer.valueOf(ctx.valor(0).getText());
				}
			}
			
		}
		
		switch(visitReformular(ctx.reformular())) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			resultado = num1 / num2;
			break;
		case 5:
			resultado = num1 % num2;
			break;
		default:
			throw new IllegalArgumentException("Operacion no valida");
		
		}

		return resultado;
	}
	//-------------- Reformular				-----------//
	@Override
	public Integer visitReformular(ReformularContext ctx){	        

	        if(ctx.SUMAR() != null) {
	        	return 1;
	        }else if(ctx.RESTAR()!=null) {
	        	return 2;
	        }else if(ctx.MULTIPLICAR()!=null) {
	        	return 3;
	        }else if(ctx.DIVIDIR()!=null) {
	        	return 4;
	        }else if(ctx.RESTO()!=null) {
	        	return 5;
	        }

	        return 0;
	}
	//-------------- Comparar Variables 	-----------//
	@Override
	public Integer visitComparacion(ComparacionContext ctx){
			
		if(ctx.IGUAL() != null){
			return 1;
		}
		else if(ctx.MAYOR() != null) {
			return 2;
		}
		else if(ctx.MENOR() != null) {
			return 3;
		}
		else if(ctx.NOTIGUAL() != null) {
			return 4;
		}
		else if(ctx.MAYORIGUAL() != null) {
			return 5;
		}
		else if(ctx.MENORIGUAL() != null) {
			return 6;
		}
		return 0;

	}
		
	//-------------- If					 	-----------//
	@Override
	public Integer visitPregunta(PreguntaContext ctx){
		if(visitCondition(ctx.condition())==1) {
			visitIf_block(ctx.sinElse().if_block(0));
			
		}else {
			if(ctx.sinElse().if_block().size() > 1) {
				visitIf_block(ctx.sinElse().if_block(1));
			}
			
		}
		return 0;
	}
	
	@Override
	public Integer visitIf_block(If_blockContext ctx){
		
		for(int i=0;i<ctx.statement().size();i++) {
				visitStatement(ctx.statement(i));
		}	
			
		return 0;
	}
		
	
	//-------------- Iteracion - for		-----------//
	@Override
	public Integer visitIter_for(Iter_forContext ctx) {
		String id = ctx.nombre().getText();
		
		if(!variables.containsKey(id)) {
			throw new IllegalArgumentException("Variable '" + id + "' no ha sido declarada");
		}
		
		if(variablesTipo.get(id) != "ENTERO") {
			throw new IllegalArgumentException("Variable no es StoneShapes.");
		}
		
		variables.replace(id, ctx.NUM().getText());
		
		while(visitCondition(ctx.condition()) == 1) {
			
			for(int j=0; j<ctx.statement().size();j++) {
				visitStatement(ctx.statement(j));
			}		
			
			variables.replace(id, visitRecorrer(ctx.recorrer()).toString());
		}
		return 0;
	}
	
	
	//-------------- Iteracion - while		-----------//
	@Override
	public Integer visitIter_while(Iter_whileContext ctx){
		Integer i=0;
		while(visitCondition(ctx.condition())==1) {
			for(i=0;i<ctx.statement().size();i++) {
					visitStatement(ctx.statement(i));
			}	
		}
		return 0;
	}
	//-------------- Condition		 		-----------//
	
	@Override
	public Integer visitCondition(ConditionContext ctx){	
	String valor1 = "";
	String valor2 = "";
	
	String tipo1 = "";
	String tipo2 = "";
	
	if(ctx.nombre(0) != null) {
		if(ctx.nombre().size() > 1) {
			if(!variables.containsKey(ctx.nombre(0).getText())) {
				throw new IllegalArgumentException("Variable '" + ctx.nombre(0).getText() + "' no ha sido declarada");
			}
			if(variables.get(ctx.nombre(0).getText()) == "") {
				throw new IllegalArgumentException("Variable '" + ctx.nombre(0).getText() + "' no tiene valor");
			}
			
			valor1 = variables.get(ctx.nombre(0).getText());
			tipo1 = variablesTipo.get(ctx.nombre(0).getText());
			
			if(!variables.containsKey(ctx.nombre(1).getText())) {
				throw new IllegalArgumentException("Variable '" + ctx.nombre(1).getText() + "' no ha sido declarada");
			}
			if(variables.get(ctx.nombre(1).getText()) == "") {
				throw new IllegalArgumentException("Variable '" + ctx.nombre(1).getText() + "' no tiene valor");
			}
			
			valor2 = variables.get(ctx.nombre(1).getText());
			tipo2 = variablesTipo.get(ctx.nombre(1).getText());
			
		}
		
		else {
			if(!variables.containsKey(ctx.nombre(0).getText())) {
				throw new IllegalArgumentException("Variable '" + ctx.nombre(0).getText() + "' no ha sido declarada");
			}
			if(variables.get(ctx.nombre(0).getText()) == "") {
				throw new IllegalArgumentException("Variable '" + ctx.nombre(0).getText() + "' no tiene valor");
			}
			
			if(ctx.nombre(0) == ctx.getChild(0) ) {
				valor1 = variables.get(ctx.nombre(0).getText());
				tipo1 = variablesTipo.get(ctx.nombre(0).getText());
			}
			else if(ctx.nombre(0) == ctx.getChild(2) ) {
				valor2 = variables.get(ctx.nombre(0).getText());
				tipo2 = variablesTipo.get(ctx.nombre(0).getText());
			}
		}
		
	}
	
	if(ctx.valor(0) != null) {
		if(ctx.valor().size() > 1) {
		
			switch(visitValor(ctx.valor(0))) {
		       case 1:
		    	   tipo1 = "ENTERO";
		    	   break;
		    	   
		       case 2:
		    	   tipo1 = "BOOLEAN";
		    	   break;
		    	   
		       case 3:
		    	   tipo1 = "STRING";
		    	   break;
		       
		       default:
		    	   throw new IllegalArgumentException("Tipo de Valor no Valido.");
			}
			switch(visitValor(ctx.valor(1))) {
		       case 1:
		    	   tipo2 = "ENTERO";
		    	   break;
		    	   
		       case 2:
		    	   tipo2 = "BOOLEAN";
		    	   break;
		    	   
		       case 3:
		    	   tipo2 = "STRING";
		    	   break;
		       
		       default:
		    	   throw new IllegalArgumentException("Tipo de Valor no Valido.");
			}
			
			valor1 = ctx.valor(0).getText();
			valor2 = ctx.valor(1).getText();
			
		}
		
		else {
			
			if(ctx.valor(0) == ctx.getChild(0) ) {
				switch(visitValor(ctx.valor(0))) {
			       case 1:
			    	   tipo1 = "ENTERO";
			    	   break;
			    	   
			       case 2:
			    	   tipo1 = "BOOLEAN";
			    	   break;
			    	   
			       case 3:
			    	   tipo1 = "STRING";
			    	   break;
			       
			       default:
			    	   throw new IllegalArgumentException("Tipo de Valor no Valido.");
				}
				valor1 = ctx.valor(0).getText();
			}
			else if(ctx.valor(0) == ctx.getChild(2) ) {
				switch(visitValor(ctx.valor(0))) {
			       case 1:
			    	   tipo2 = "ENTERO";
			    	   break;
			    	   
			       case 2:
			    	   tipo2 = "BOOLEAN";
			    	   break;
			    	   
			       case 3:
			    	   tipo2 = "STRING";
			    	   break;
			       
			       default:
			    	   throw new IllegalArgumentException("Tipo de Valor no Valido.");
				}
				valor2 = ctx.valor(0).getText();
			}
		}
		
	}
	
	if(!tipo1.equals(tipo2))
		throw new IllegalArgumentException("Variables no son del mismo tipo.");
	
	
	Integer retorno = 0;
	
	if (tipo1 == "ENTERO"){
			Integer num1 = Integer.valueOf(valor1);
			Integer num2 = Integer.valueOf(valor2);

			switch(visitComparacion(ctx.comparacion())) {
			case 1:

					if(num1==num2) {
						 retorno = 1;
					}else {
						retorno = 0;
					}
					break;
			case 2:
					if(num1>num2) {
						retorno = 1;
					}else {
						retorno = 0;
					}
					break;
			case 3:
					if(num1<num2) {
						retorno = 1;
					}else {
						retorno = 0;
					}
					break;
			case 4:
					if(num1!=num2) {
						retorno = 1;
					}else {
						retorno = 0;
					}
					break;
			case 5:
					if(num1>=num2) {
						retorno = 1;
					}else {
						retorno = 0;
					}
					break;
			case 6:
					if(num1<=num2) {
						retorno = 1;
					}else {
						retorno = 0;
					}
					break;
			}
	}else {
		
		if(visitComparacion(ctx.comparacion()) != 1 && visitComparacion(ctx.comparacion()) != 4) {
    		throw new IllegalArgumentException("Comparacion no valida para Tipo de Variable."); 
    	}
    	
    	if(visitComparacion(ctx.comparacion()) == 1) {
    		if(valor1.equals(valor2))
    			retorno = 1;
    		else
    			retorno = 0;
    	}
    	
    	if(visitComparacion(ctx.comparacion()) == 4) {
    		if(!valor1.equals(valor2))
    			retorno = 1;
    		else
    			retorno = 0;
    	}
		
	}
	Integer condicionExtra = 1;
	if(ctx.condition() != null) {
		condicionExtra = visitCondition(ctx.condition());
	}
	
	if(ctx.AND() != null) {
		if( retorno == 1 && condicionExtra == 1)
			retorno = 1;
		else
			retorno = 0;
	}
	if(ctx.OR() != null) {
		if( retorno == 1 || condicionExtra == 1)
			retorno = 1;
		else
			retorno = 0;
	}
	
	


	return retorno;
}

	//-------------- RECORRER		 		-----------//
	@Override
	public Integer visitRecorrer(RecorrerContext ctx){	

	        if (!variablesTipo.containsKey(ctx.nombre(0).getText())) 
	        	throw new IllegalArgumentException(ctx.nombre(0).getText()+"No existe");
	        	
	        if(!variablesTipo.containsKey(ctx.nombre(1).getText())) 
	        	throw new IllegalArgumentException(ctx.nombre(1).getText()+ "No existe");
	        		
	        if(variablesTipo.get(ctx.nombre(0).getText()) != "ENTERO" ) 
	        	throw new IllegalArgumentException(ctx.nombre(0).getText()+ "No es tipo StoneShape");
	        			
	        if(variablesTipo.get(ctx.nombre(1).getText()) != "ENTERO" ) 
	        	throw new IllegalArgumentException(ctx.nombre(1).getText()+ "No es tipo StoneShape");
	        			
	        Integer num1 = Integer.valueOf(variables.get(ctx.nombre(0).getText()));
	        Integer suma = Integer.valueOf(ctx.NUM().getText());
	        
	        if(ctx.SUMAR()!=null){
	        	return  num1 + suma;
	        }
	        if(ctx.RESTAR()!=null){
	        	return  num1 - suma;
	        }

	        return 0;
	}
	
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
