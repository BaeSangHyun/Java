package com.ktds.jmj;

public class Computer {
	
	public void printAddition( int numberOne, int numberTwo ) {
		int additionResult = numberOne + numberTwo;
		System.out.println(additionResult);
	}
	
	public void printSubtraction ( int numberOne, int numberTwo ) { 
		int subtractionResult = numberOne - numberTwo;
		System.out.println(subtractionResult);
	}
	
	public void printMultiplication( int numberOne, int numberTwo ) {
		int multicationResult = numberOne * numberTwo;
		System.out.println(multicationResult);
	}
	public void printDivision( int numberOne, int numberTwo ) {
		double divisionResult = numberOne / (double)numberTwo;
		System.out.println(divisionResult);
	}
	
	public int computeAddition( int numberOne, int numberTwo ) { // 반환시키려면 void가 아닌 타입이 들어와야한다. int , string ....
		int computeResult = numberOne + numberTwo;
		return computeResult;
	}
	
	public int computeSubtraction (int numberOne, int numberTwo ) {
		int computeResult = numberOne - numberTwo;
		return computeResult;
	}
	
	public int computeMultiplication (int numberOne, int numberTwo ) {
		int computeResult = numberOne * numberTwo;
		return computeResult;
	}
	
	public double computeDivision (int numberOne, int numberTwo ) {
		return numberOne / (double)numberTwo;
		
	}



}
