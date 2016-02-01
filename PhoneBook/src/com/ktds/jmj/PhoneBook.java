package com.ktds.jmj;

import java.util.Scanner;

//속성과 기능이 분리되어있다 는 점이 다름. 실무에서 많이쓰는
public class PhoneBook {
	
	public void start() {
		PhoneBookBiz biz = new PhoneBookBiz();
		
		biz.startProgram();	
	}

	public static void main(String[] args) {
		
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.start();


	}

}
