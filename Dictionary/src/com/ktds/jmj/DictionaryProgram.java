package com.ktds.jmj;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class DictionaryProgram {
	//input, nullpointer 사용해보기
	private Map<String, String> Dictionary;//인스턴스는 선언과 동시에 초기화  시키면 안된다.
	private Scanner input = new Scanner(System.in);
	private int menuNum;
	
	//Alt+Shift+R 이름 한번에 바꾸는 방법
	//Alt+Shift+M 반복되는 것을 함수로 생성하기
	
	public DictionaryProgram () {
		this.Dictionary = new HashMap<String,String>();
	}

	public Map<String, String> getDictionary() {
		return Dictionary;
	}

	public void setDictionary(Map<String, String> dictionary) {
		Dictionary = dictionary;
	}

	//프로그램 메뉴
	public void printMenu() {
		while(true){
			 System.out.println("----- 메뉴를 선택하세요 -----");
			 System.out.println("1. 단어등록");
			 System.out.println("2. 단어조회");
			 System.out.println("3. 단어삭제");
			 System.out.println("9. 종료");
			 try{
				 input = new Scanner(System.in);
				 this.menuNum = input.nextInt();
				 whatMenu();
			 }
			 catch (InputMismatchException ime ) {
				 input = new Scanner(System.in);
				 System.out.println("잘못입력했습니다.");
				 printMenu();
			 }
			 //setMenuNum(menuNum);
		}
	}
	
	//메뉴판단
	public void whatMenu() {
		if ( this.menuNum == 1 ) {
			putWord();
		}
		else if (this.menuNum == 2) {
			searchWord();
		}
		else if (this.menuNum == 3) {
			deleteWord();
		}
		else if ( this.menuNum == 9) {
			exitProgram();
		}
		else{
			System.out.println("숫자 1,3,5,9중 하나 입력해");
		}
	}
	
	//단어등록
	public void putWord() {
		String english = "";
		String korean = "";
		while (true) {
			input = new Scanner(System.in);
			
			try {
				System.out.println("등록하고 싶은 영어 단어를 입력하세요.");
				english = input.nextLine();
				int integerNumber = Integer.parseInt(english);
				System.out.println("재입력해주세요.");//괄호안에는 숫자가 들어가있는 문자가 들어가야한다.
			}
			catch ( NumberFormatException nfe) {
				try {
					input = new Scanner(System.in);
					System.out.println("등록하고 싶은 영어의 뜻을 한국어로 입력하세요.");
					korean = input.nextLine();
					int integerNumber = Integer.parseInt(korean);
					System.out.println("재입력해주세요.");
				}
				catch ( NumberFormatException nfe2 ){
					this.Dictionary.put(english, korean);
					System.out.println("단어를 등록했습니다.");
					break;
				}
			}
		}
	}
	
	//단어조회
	public void searchWord() {
		String english = "";
		String korean = "";
		
		while (true) {
			input = new Scanner(System.in);
			try {
				System.out.println("찾고 싶은 영어 단어를 입력하세요.");
				english = input.nextLine();
				int integerNumber = Integer.parseInt(english);
				System.out.println("재입력해주세요.");
			}
			catch ( NumberFormatException nfe) {
				korean = Dictionary.get(english);
				if( korean == null ) {
					System.out.println("해당 단어는 존재하지 않습니다.");
				}
				else {
					System.out.println(english + " 의 뜻은 " + korean + " 입니다.");
				}
				break;
			}
		}
	}

	//단어삭제
	public void deleteWord() {
		String english = "";
		String korean = "";
		while (true) {
			input = new Scanner(System.in);
			try {
					System.out.println("삭제하고 싶은 단어를 입력하세요.");
					english = input.nextLine();
					int integerNumber = Integer.parseInt(english);
					System.out.println("재입력해주세요.");
			}
			catch ( NumberFormatException nfe) {
				korean = Dictionary.get(english);
				if(korean == null) {
					System.out.println("해당 단어는 존재하지 않습니다.");
				}
				else {
					Dictionary.remove(english);
					System.out.println(english + " 를 삭제했습니다.");
				}
				break;
			}
		}
	}
	
	//종료조건
	public void exitProgram() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	

	
/*	
   public Scanner getScannerNullCheck() { // 디자인 패턴 중 하나이다.
		if (this.console == null){ // console은 Scanner로 입력받은 값.
			this.console = new Scanner(System.in);
		}
		return this.console;
	}
*/

}
