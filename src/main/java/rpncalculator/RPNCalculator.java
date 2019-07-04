package rpncalculator;

import java.util.Stack;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.AbstractDocument.LeafElement;

public class RPNCalculator {

	double firstOperand;
	double secondOperand;
	Stack<Double> stack = new Stack<Double>(); 
	public double evaluate(String input) {
		// TODO Auto-generated method stub
		String[] tokens = input.split(" ");

		
		for(String token : tokens) {
			
			if(isMathOperator(token) == true) {
				
				extractInputs();
				
				IMathOperation mathOperation =  MathFactory.getObject(token);
				
				double result = mathOperation.evaluate(firstOperand, secondOperand);
				
				stack.push(result);
			
			} else {
				stack.push(Double.parseDouble(token));
			}
			
		}
		
		return stack.pop();
	}

	private boolean isMathOperator(String token) {
		// TODO Auto-generated method stub
		String operators = "+/*-";
		return operators.contains(token);
	}

	
	private void extractInputs() {
		secondOperand = stack.pop();
		firstOperand = stack.pop();
	}

}
