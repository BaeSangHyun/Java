package com.ktds.jmj;

public class Main {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		/*computer.printAddition(30,60);
		computer.printSubtraction(100, 50);
		computer.printMultiplication(10, 5);
		computer.printDivision(10, 2);*/
		
		int additionResult = computer.computeAddition(100, 200);
		System.out.println(additionResult);
		
		int subtractionResult = computer.computeSubtraction(100, 200);
		System.out.println(subtractionResult);
		
		int multiplicationResult = computer.computeMultiplication(100, 200);
		System.out.println(multiplicationResult);
		
		double divisionResult = computer.computeDivision(50 , 10);
		System.out.println(divisionResult);
		
		//두개는 정수 하나는 문자 int 숫자 두개 string에는 연산자 입력받은 연산자로 숫자두개 계산		
	}

}
