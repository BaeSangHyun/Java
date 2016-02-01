package com.ktds.jmj;

public class Customer {
	
	private int money;
	private int eggCount;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getEggCount() {
		return eggCount;
	}
	public void setEggCount(int eggCount) {
		this.eggCount = eggCount;
	}
	public void pay( int money ) {
		this.money -= money;

	}
	
	public void getEgg(int eggCount) {
		this.eggCount += eggCount;
	}
	
	public void takeMoney (int money) {
		this.money += money;
	}
	
	public void printMyInfo() {
		System.out.println("구매자가 가진 Egg의 수 : " + this.eggCount);
		System.out.println("구매자가 가진 돈 : " + this.money);
	}
	
	public void exitProgram(boolean exit){
		
		
	}
	
	

}
