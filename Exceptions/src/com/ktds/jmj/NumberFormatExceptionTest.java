package com.ktds.jmj;

import java.util.Scanner;

public class NumberFormatExceptionTest {
	
	public int parseInt ( String str ) {
		try { 
			return Integer.parseInt(str); // 문자를 숫자로 바꾸는 방법******
		}
		catch (NumberFormatException nfe) {
			return 0;
		}
	}
	

	public void start(){
		
		Scanner input = new Scanner(System.in);
		String numberString = input.next();
		// 문자를 정수로 변환한다.
		
		// 문자를 long으로 변환한다.
		// 문자를 short로 변환한다.
		// 문자를 int로 변환한다.
		try {
			int integerNumber = Integer.parseInt(numberString);
			//괄호안에는 숫자가 들어가있는 문자가 들어가야한다.
			System.out.println(integerNumber);
		}
		catch ( NumberFormatException nfe) {
			System.out.println("숫자변환에 실패");
			System.out.println(nfe.getMessage());
		}

		//
		
		//문자를 실수로 변환한다.
		// 문자를 double 로 변환한다.
		// 문자를 float로 변환한다.
		
		// 문자로 boolean
		
		
	}
	public static void main(String[] args) {
		NumberFormatExceptionTest test = new NumberFormatExceptionTest();
		test.start();


	}

}
