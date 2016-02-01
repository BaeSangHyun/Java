package com.ktds.jmj;

public class Operator {
	
	public void printOperator( double numberOne, double numberTwo, String Operator ) {
		double result = 0;
		if ( Operator.equals("+")){
			result = numberOne + numberTwo;
		}
		else if( Operator.equals("-")){
			result = numberOne - numberTwo;
		}
		else if ( Operator.equals("*")) {
			result = numberOne * numberTwo;
		}
		else if ( Operator.equals("/")) {
			result = numberOne / numberTwo;
		}
		System.out.println(result);
	}
	

	public double computeOperator( double numberOne, double numberTwo, String Operator ) {
		double result = 0;
		if ( Operator.equals("+")){
			result = numberOne + numberTwo;
		}
		else if( Operator.equals("-")){
			result = numberOne - numberTwo;
		}
		else if ( Operator.equals("*")) {
			result = numberOne * numberTwo;
		}
		else if ( Operator.equals("/")) {
			result = numberOne / numberTwo;
		}
		return result;
	}
}
