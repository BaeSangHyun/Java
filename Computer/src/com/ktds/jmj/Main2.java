package com.ktds.jmj;

import java.util.Scanner;

public class Main2 {
	
	
	//두개는 정수 하나는 문자 / int 숫자 두개 string에는 연산자 입력받아서 연산자로 숫자두개 계산
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		String operator = input.next();
		
		Operator op = new Operator();
		
		op.printOperator(num1, num2, operator);
		
		double computeResult = op.computeOperator(num1, num2, operator);
		System.out.println(computeResult);
		
	}
}
