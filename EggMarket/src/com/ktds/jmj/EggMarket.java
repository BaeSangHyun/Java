package com.ktds.jmj;

import java.util.Scanner;

public class EggMarket {
	Scanner input = new Scanner(System.in);
	
	private int eggCount = 30;
	private int money = 1000000;
	public static final int EGG_PRICE = 1000;
	
	public void start() {
		
		Customer min = new Customer();
		System.out.println("가진돈얼마?");
		int totalMoney = input.nextInt();
		min.setMoney(totalMoney);
		min.setEggCount(0);
		
		while(true){
			if(this.eggCount == 0 || min.getMoney() < EggMarket.EGG_PRICE){
				System.out.println("판매종료");
				break;
			}
			
			System.out.println("얼마낼거니?");
			int howMuch = input.nextInt();
			if(min.getMoney() < howMuch ){
				System.out.println("가진돈이 모자른것같다");
				break;
			}
			
			if ( howMuch < EggMarket.EGG_PRICE ){
				System.out.println("돈 모자르다.");
				break;
			}//if
			
			min.pay(howMuch);
			this.money += howMuch;
			
			this.eggCount -= 1;
			min.getEgg(1);
			
			int money = howMuch - EggMarket.EGG_PRICE ;
			this.money -= money;
			min.takeMoney(money);
			
			System.out.println("거스름돈은 " + money);
			min.printMyInfo();
			
		}//while
		
	}//start
	
	public static void main(String[] args){
		EggMarket market = new EggMarket();
		market.start();
		
	}
}
