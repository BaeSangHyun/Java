import java.util.Scanner;

public class WhatMain { //과제2
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("연산자 +, -, *, / 중에 입력하세요. : ");
		
		What whatResult = new What();
		
		String result = whatResult.WhatOper(input);
		System.out.println(result);
		
	}

}
