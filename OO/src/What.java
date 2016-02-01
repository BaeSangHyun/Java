import java.util.Scanner;

public class What { // 과제2
	
	public String WhatOper( Scanner input){
		String oper = input.next();
		String result = "";
		if ( oper.equals("+")){
			result = "더하기";
		}
		else if ( oper.equals("-")){
			result = "빼기";
		}
		else if ( oper.equals("*")){
			result = "곱하기";
		}
		else if( oper.equals("/")){
			result = "나누기";
		}
		return result;
	}
}
