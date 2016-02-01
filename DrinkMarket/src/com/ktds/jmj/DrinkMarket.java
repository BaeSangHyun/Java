package com.ktds.jmj;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class DrinkMarket {
	
	Scanner input = new Scanner(System.in);
	
	private static String whatDrink[] = new String[]{ "coke", "sprite", "fanta"};
	private static int drinkCount[] = new int[] {15, 15, 15};
	public static final int DRINK_PRICE[] = new int[] {1000, 800, 900};
	private int money = 5000;
	
	public void start() {
		
		Customer min = new Customer();
		
		System.out.println("=========================================");
		System.out.println("어서오세요. 음료수 팜");
		System.out.println("=========================================");
		System.out.println("가진돈얼마?");
		int totalMoney = input.nextInt();
		min.setMoney(totalMoney);
		min.setDrinkCount(0);
		
		while(true){
			
			//3가지 음료중에 선택
			System.out.println("어떤 음료를 마실건가요? 1.콜라 2.사이다 3.환타");
			int what = input.nextInt();
			System.out.println(whatDrink[what-1] +"를 선택하셨습니다.");
			//몇개 살건지 물어보기
			System.out.println("몇개?");
			int count = input.nextInt();
			
			//선택한 음료가 내가 가진 돈보다 적으면 종료
			if(DRINK_PRICE[what-1] * count > min.getMoney()){
				System.out.println("장사그만");
				break;
			}
			//얼마를 내는지 물어보기
			System.out.println("얼마낼거니?");
			int howMuch = input.nextInt();
			if(min.getMoney() < howMuch ){
				System.out.println("가진돈이 모자른것같다. 잘가");
				break;
			}
			//내는 돈이 모자르면 종료
			if ( howMuch < DrinkMarket.DRINK_PRICE[what-1] * count){
				System.out.println("돈 모자르다.잘가");
				break;
			}
			//음료가 다 떨어지거나 가진돈이 최저가 음료의 값보다 적으면 종료
			if(DrinkMarket.drinkCount[what-1] == 0 || min.getMoney() < 800){
				System.out.println("장사그만");
				break;
			}

			min.pay(howMuch);
			this.money += howMuch;
			
			this.drinkCount[what-1] -= count;
			min.getDrink(count);
			
			int money = howMuch - (DrinkMarket.DRINK_PRICE[what-1]*count) ;
			this.money -= money;
			min.takeMoney(money);
			
			System.out.println("거스름돈은 " + money);
			min.printMyInfo();
			
		}
		
	}
	
	public static void main(String[] args){
		DrinkMarket market = new DrinkMarket();
		market.start();
	}

}
