package MAIN;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ANTLR.ParserTestBaseVisitor;
import ANTLR.ParserTestParser;
import ANTLR.ParserTestParser.PrintContext;
import ANTLR.ParserTestParser.StatementContext;
import ANTLR.ParserTestParser.While_blockContext;
import ANTLR.ParserTestParser.AddContext;
import ANTLR.ParserTestParser.AssignContext;
import ANTLR.ParserTestParser.BlockContext;
import ANTLR.ParserTestParser.Condition_blockContext;
import ANTLR.ParserTestParser.Else_blockContext;
import ANTLR.ParserTestParser.OperationContext;



public class MyVisitor extends ParserTestBaseVisitor<Integer> {
	private Map<String, String>  variables = new HashMap<String, String>();
	
	@Override
	public Integer visitAssign(AssignContext ctx){
        String id = ctx.ID().get(0).getText();        
        String value = "";        
        
        if (variables.containsKey(id))
            throw new IllegalArgumentException("Variable '" + id + "' ya fue declarada");
        else {
        	if (ctx.ID().size() > 1) {
        		value = ctx.ID(1).getText(); 
        	}else { 
            	//System.out.println(id+" en else ");//+ctx.BOOLEAN_().getText());    	   
            	if (ctx.BOOLEAN_()!=null) {
            		if(ctx.TRUE()!=null)
            			value = ctx.TRUE().getText();
            		else
            			value = ctx.FALSE().getText();            		
            	}else if(ctx.NUMBER()!=null){
            		value = ctx.NUMBER().getText();
            	}else{
            		value = ctx.STRING().getText().substring(1, ctx.STRING().getText().length()-1);          		
            	}
        	}
        	variables.put(id, value);
        }       
        
        return 0;
    }
	
	@Override
	public Integer visitPrint(PrintContext ctx){	        
	        String output = "";
	        if (ctx.ID() == null)
	        	output = ctx.NUMBER().getText(); 
	        else
	        	output = variables.get(ctx.ID().getText()).toString();
	        
	        System.out.println(output);
	        return 0;
	}
	 @Override
	 public Integer visitAdd(AddContext ctx) {
		 String variableName;
		 //variableName : variable a modificar en tabla de sim
		 //System.out.println(ctx.ID().size());
		if (ctx.ID().size() > 1) {
			variableName = ctx.ID(1).getText();
			//System.out.println(ctx.ID(1).getText());
		}else {
			variableName = ctx.ID(0).getText();
			//System.out.println(ctx.ID(0).getText());
		}		
		 
		 // value : variable con el valor a sumar a variable variableName    
	    int value=0;
	    if (ctx.ID().size() > 1) {
		    if (!variables.containsKey(ctx.ID(0).getText()))
	            throw new IllegalArgumentException("Variable '" + ctx.ID(0).getText() + "' has not ben declared");
			else {
				if (ctx.ID().size() > 1) {
					value = Integer.parseInt(variables.get(ctx.ID(0).getText()));
					//System.out.println(value);
				}else {
					value = Integer.parseInt(ctx.NUMBER().getText());
					//System.out.println(value);
				}   
			}
	    }
		if (!variables.containsKey(variableName))
            throw new IllegalArgumentException("Variable '" + variableName + "' has not ben declared");
		else
			variables.put(variableName, String.valueOf(Integer.parseInt(variables.get(variableName)) + value));	    	     
		return 0;
	 }
	 
	 @Override 
	 public Integer visitIf_block(ParserTestParser.If_blockContext ctx) { 
		 Integer salida = 0;
		 
		 salida = visitCondition_block(ctx.condition_block());	
		 if (salida == 1) {
			 salida = visitElse_block(ctx.else_block()); 
		 }
		 
		 return salida; 
	 }
	 
	 @Override
	 public Integer visitCondition_block(Condition_blockContext ctx) {
		//System.out.println("childcount en if:"+ctx.getChildCount());
		Integer salidaCondition = -1;
		Integer salidaStatement = -1;

		salidaCondition = visitOperation(ctx.operation());
		if(salidaCondition==0) {
			if(ctx.block()!=null)
				salidaStatement = visitBlock(ctx.block());
			else
				throw new IllegalArgumentException("IF sin statements");	
		}	
		return salidaCondition;
	 }
	 @Override 
	 public Integer visitElse_block(Else_blockContext ctx) { 
		 Integer salida = 0;
		 if(ctx.block()!=null)
			salida = visitBlock(ctx.block());
		 else
			throw new IllegalArgumentException("ELSE sin statements");
		 return salida; 
	 }
	 
	 @Override 
	 public Integer visitBlock(BlockContext ctx) { 
		 Integer salida =0;
		 //System.out.println("cant de statement"+ctx.getChildCount());

		 for(int indice = 0;indice<ctx.getChildCount();indice++)
		 {
			 salida= visitStatement(ctx.statement(indice));
		 }
		 
		 return salida; 
	 }
	 
	 
	 @Override 
	 public Integer visitOperation(OperationContext ctx) { 
		 String id1="";
		 String id2="";
		 String value1 ="";
		 String value2 ="";
		 Integer salida = -1;
		 
		 if(ctx.getChildCount()==1){
			 id1 = ctx.ID().getText();
			 if (!variables.containsKey(id1))
		            throw new IllegalArgumentException("Variable '" + id1 + "' has not ben declared");
			 else {
					value1 = variables.get(id1);
					if(value1.equals("true")) {
						 salida = 0;
					}else if (value1.equals("false")) {
					 	salida = 1;
					}else{ 
						 salida = Integer.valueOf(value1);
					}			 
			 }		 
		 }else {
			 id1 = ctx.getChild(0).getText();
			 id2 = ctx.getChild(2).getText();
			 if (!variables.containsKey(id1))
		            throw new IllegalArgumentException("Variable '" + id1 + "' has not ben declared");
			 else if (!variables.containsKey(id2))
		            throw new IllegalArgumentException("Variable '" + id2 + "' has not ben declared");
			 else {
				 value1 = variables.get(id1);
				 value2 = variables.get(id2);
				//System.out.println(value1+" "+value2);
				 if(ctx.EQUAL().getText().equals("==")){
					 if(value1 == value2) {
						 salida = 0;
					 }else {
						 salida = 1;
					 }
				 }
			 }
		 } 
		 return salida; 	 
	 }
	 
	 @Override 
	 public Integer visitWhile_block(While_blockContext ctx) { 
		 Integer salida=0;
		 while(salida==0) {
			 salida = visitCondition_block(ctx.condition_block());
		 }
		 
		 return salida; 	 
	 }
	 
	 @Override 
	 public Integer visitStatement(StatementContext ctx) { 
		 Integer salida = 0;
		 
		 if(ctx.assign()!=null) {
			 salida = visitAssign(ctx.assign());
		 }else if(ctx.add()!=null) {
			 salida = visitAdd(ctx.add());
		 }else if(ctx.print()!=null) {
			 salida = visitPrint(ctx.print());
		 }else if(ctx.if_block()!=null) {
			 salida = visitIf_block(ctx.if_block());
		 }else if(ctx.while_block()!=null){
			 salida = visitWhile_block(ctx.while_block());
		 }
		 
		 /*for(int indice = 0;indice<list.size();indice++)
		 {
			 if(list.get(indice).assign()!=null) {
				 salida = visitAssign(list.get(indice).assign());
			 }else if(list.get(indice).add()!=null) {
				 salida = visitAdd(list.get(indice).add());
			 }else if(list.get(indice).print()!=null) {
				 salida = visitPrint(list.get(indice).print());
			 }else if(list.get(indice).if_block()!=null) {
				 salida = visitIf_block(list.get(indice).if_block());
			 }
		 }*/
		
		 return salida; 
	 }
}
