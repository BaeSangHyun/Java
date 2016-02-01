package com.ktds.jmj;

public class Seller {
	
	private int money;
	private int appleCount;
	private int applePrice;
	//source - generate getters and setters
	// ALT - S - R 
	
	
	public Seller(){
		
	}//메소드의 파라미터의 개수가 다르거나 종류가 다르거나 = 메소드 오버로딩
	
	public Seller(int money, int appleCount, int applePrice) {//생성자는 클래스명과 같아야한다.
		//생성할때부터 데이터를 주고싶다.
		//System.out.println("인스턴스가 만들어졌습니다!!!!!"); Main을 실행하면 바로 출력된다.
		this.setMoney(money);
		this.setAppleCount(appleCount);
		this.setApplePrice(applePrice);
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getAppleCount() {
		return appleCount;
	}
	public void setAppleCount(int appleCount) {
		this.appleCount = appleCount;
	}
	public int getApplePrice() {
		return applePrice;
	}
	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
	}
	
	public void getMoneyFromCustomer( int money , Customer customer ) { // min.pay()를 받아오기위해서 하는거
		this.money += customer.pay( money );
	}
	
	public void giveApple (int appleCount, Customer customer) {
		this.appleCount -= appleCount;
		customer.getApple(appleCount);
	}
	
	public void giveRemain( int money, int appleCount, Customer customer ) { //구매자가 지불한 돈, 사간 갯수, 사과 가격 , 소비자한테 직접 줘야하니 customer 필요
		int remain = money - ( appleCount * this.applePrice);
		this.money -= remain;
		customer.takeMoney(remain);
	}
	
	public void printMyInfo() {
		System.out.println("판매자가 가진 사과의 수: " + this.appleCount);
		System.out.println("판매자가 가진 금액 : " + this.money);
	}
}
