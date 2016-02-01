package com.ktds.jmj;

public class Customer {
	/**
	 * 구매자가 가지고 있는 금액
	 */
	private int money;
	
	/**
	 * 구매자가 가지고 있는 담배의 수
	 */
	private int dambaeCount;
	
	/**
	 * 구매자의 나이
	 */
	private int age;
	
	
	public Customer(int money, int dambaeCount, int age) {//생성자는 클래스명과 같아야한다.
		this.setMoney(money);
		this.setDambaeCount(dambaeCount);
		this.setAge(age);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setMoney ( int money ) { // 주고싶은 데이터, 7번라인의 money와 관련이 없는 변수다.
		this.money = money; //인스턴스필드의 money에 파라미터로 넘어온 money를 넣는다.
	}
	
	public void setDambaeCount( int damBaeCount ){
		this.dambaeCount = damBaeCount;
	}
	
	
	//인스턴스필드가 가지고 있는 값을 외부로 가져다 준다. get
	public int getMoney () {
		return this.money; // 인스턴스 필드의 money를 return한다.
	}
	
	public int getDamBaeCount() {
		return this.dambaeCount; // 인스턴스 필드의 appleCount를 return한다.
	}
	
	public int pay( int money ) {
		this.money -= money;
		return money;
	}
	
	public void getDamBae( int damBaeCount ) {
		this.dambaeCount += damBaeCount;
	}
	
	public void takeMoney ( int money ) {
		this.money += money;
	}
	
	public boolean checkAge() {
		if ( this.age < 20 ) {
			System.out.println("너무어려. 잘가");
			return false;
		}
		return true;
		
	}
	
	public void printMyInfo() {
		System.out.println("너가 가진 담배의 수 : " + this.dambaeCount);
		System.out.println("너가 가진 돈 : " + this.money);
	}

}
