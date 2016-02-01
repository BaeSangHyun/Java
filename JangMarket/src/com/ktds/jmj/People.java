package com.ktds.jmj;

public class People {
	
	private int money;
	
	private int colaQuantity;
	private int spriteQuantity;
	private int fantaQuantity;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getColaQuantity() {
		return colaQuantity;
	}
	public void setColaQuantity(int colaQuantity) {
		this.colaQuantity = colaQuantity;
	}
	public int getSpriteQuantity() {
		return spriteQuantity;
	}
	public void setSpriteQuantity(int spriteQuantity) {
		this.spriteQuantity = spriteQuantity;
	}
	public int getFantaQuantity() {
		return fantaQuantity;
	}
	public void setFantaQuantity(int fantaQuantity) {
		this.fantaQuantity = fantaQuantity;
	}
	
	public int pay( int money ) {
		this.money -= money;
		return money;
	}
	
	public  void addCola( int quantity ) {
		this.colaQuantity += quantity;
	}
	
	public  void addSprite( int quantity ) {
		this.spriteQuantity += quantity;
	}
	
	public  void addFanta( int quantity ) {
		this.fantaQuantity += quantity;
	}
	
	public void getRemainMoney ( int money ) {
		this.money += money;
	}
	
	public void printMyInfo() {
		System.out.println("구매자가 가진 돈 : " + this.getMoney() );
		System.out.println("구매자가 구입한 콜라 : " + this.getColaQuantity() );
		System.out.println("구매자가 구입한 스프라이트 : " + this.getSpriteQuantity() );
		System.out.println("구매자가 구입한 환타 : " + this.getFantaQuantity() );
	}
	
	
	

}
