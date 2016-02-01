package com.ktds.jmj;

public class Customer {
	/**
	 * 구매자가 가지고 있는 금액
	 */
	private int money;
	
	/**
	 * 구매자가 가지고 있는 사과의 수
	 */
	private int drinkCount;
	
	public void setMoney ( int money ) { // 주고싶은 데이터, 7번라인의 money와 관련이 없는 변수다.
		this.money = money; //인스턴스필드의 money에 파라미터로 넘어온 money를 넣는다.
	}
	
	public void setDrinkCount( int drinkCount ){
		this.drinkCount = drinkCount;
	}
	
	//인스턴스필드가 가지고 있는 값을 외부로 가져다 준다. get
	public int getMoney () {
		return this.money; // 인스턴스 필드의 money를 return한다.
	}
	
	public int getDrinkCount() {
		return this.drinkCount; // 인스턴스 필드의 appleCount를 return한다.
	}
	
	public void pay( int money ) {
		this.money -= money;
	}
	
	public void getDrink( int drinkCount ) {
		this.drinkCount += drinkCount;
	}
	
	public void takeMoney ( int money ) {
		this.money += money;
	}
	
	public void printMyInfo() {
		System.out.println("구매자가 가진 음료의 수 : " + this.drinkCount);
		System.out.println("구매자가 가진 돈 : " + this.money);
	}

}
