package com.ktds.jmj;

import java.util.InputMismatchException;
import java.util.Scanner;
//하나의 메소드는 하나의 기능을 하게 해야 유지보수가 편해요.
public class Market {
	Scanner input = new Scanner(System.in);
	Seller DamBaeSell = new Seller (50000, 10, 2000);
	boolean exit = true;
	
	public int inputMessage(int some) {
		some = input.nextInt();
		return some;
	}
	
	public void start() {
		int age = 0;
		int totalMoney = 0;
		int count = 0;
		int howMuch = 0;
	
		//min.setMoney(totalMoney);
		//min.setDambaeCount(0);
		
		while (exit) {
			
			System.out.println("몇살이니");
			while (true) {
				try {
					age = inputMessage(age); 
					break;
				}
				catch ( InputMismatchException ime ) {
					input = new Scanner(System.in);
					System.out.println("잘못 입력했습니다. 정수만 입력가능");
					
					//System.out.println(ime.getCause().getCause() + "예외가 " + ime.getMessage());
				}
			}

			
			System.out.println("재산얼마?");
			while (true) {
				try {
					totalMoney = inputMessage(totalMoney); 
					break;
				}
				catch ( InputMismatchException ime ) {
					input = new Scanner(System.in);
					System.out.println("잘못 입력했습니다. 정수만 입력가능");
					
					//System.out.println(ime.getCause().getCause() + "예외가 " + ime.getMessage());
				}
			}
			
			
			Customer min = new Customer(totalMoney, count, age);
			
			//나이물어서 어리면 보내기
			//exit = min.checkAge();
			
			/*if ( DamBaeSell.getDamBaeCount() == 0 ) {
				System.out.println("품절.");
				break;
			}
			
			if (min.getMoney() < DamBaeSell.getDamBaePrice()){
				System.out.println("돈이 2000원보다 적네요.");
				break;
			}*/
			
			if (!min.checkAge()){
				break;
			}
			if (!DamBaeSell.checkInven(min)){
				break;
			}

			// 소비자에게서 돈을 받는다.
			System.out.println("개당 2천원이야 몇개?");
			while (true) {
				try {
					count = inputMessage(count);
					break;
				}
				catch ( InputMismatchException ime ) {
					input = new Scanner(System.in);
					System.out.println("잘못 입력했습니다. 정수만 입력가능");
					
					//System.out.println(ime.getCause().getCause() + "예외가 " + ime.getMessage());
				}
			}

			System.out.println("얼마낼거니?");
			while (true) {
				try {
					howMuch = inputMessage(howMuch);
					break;
				}
				catch ( InputMismatchException ime ) {
					input = new Scanner(System.in);
					System.out.println("잘못 입력했습니다. 정수만 입력가능");
					
					//System.out.println(ime.getCause().getCause() + "예외가 " + ime.getMessage());
				}
			}
			
			
			if ( howMuch < DamBaeSell.getDamBaePrice() * count || min.getMoney() < howMuch){
				System.out.println("돈 모자르다.");
				break;
			}
			// 내가 달라한 개수보다 있는 담배가 적을 때 
			if (count > DamBaeSell.getDamBaeCount()){
				System.out.println(count + "개의 담배가 없어요.");
				break;
				
			}
			//min은 돈을 지불하고, seller은 돈을 받는다.
			//min.pay(howMuch);
			DamBaeSell.getMoneyFromCustomer(howMuch, min);

			// DamBaeSell은 사과를 준다. min은 담배를 받는다.
			DamBaeSell.giveDamBae(count, min);
			
			// DamBaeSell은 거스름돈을 남겨준다. min은 받는다.
			DamBaeSell.giveRemain((howMuch), count, min);
			
			// 소비자의 정보를 출력한다.
			min.printMyInfo();
			DamBaeSell.printMyInfo();
			System.out.println("=========================================");
			System.out.println("그만사고 싶으면 exit 입력해.계속살거면 아무거나 눌러");
			String exit = input.next();
			if (exit.equals("exit")){
				System.out.println("잘가");
				break;
			}
		}
	}
	
	public void printMessage() {
		System.out.println("=========================================");
		System.out.println("어서오세요. 담배 팜");
		System.out.println("=========================================");
		System.out.println("안녕?");

	}

	public static void main(String[] args) {
		Market market = new Market();//자기 자신을 인스턴스로 만들 수 있다.
		market.printMessage();
		market.start();
		//System.out.println(Market.appleCount);
	}
}
