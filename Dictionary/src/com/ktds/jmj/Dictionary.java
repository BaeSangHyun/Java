package com.ktds.jmj;

public class Dictionary {
	
	public void start() {
		
		System.out.println("------------------------------------");
		System.out.println("            간단 단어장");
		System.out.println("------------------------------------");
		
		DictionaryProgram dp = new DictionaryProgram();
		dp.printMenu();
		
	}
	
	public static void main(String[] args) {
		Dictionary dic = new Dictionary ();
		dic.start();
	}
}
