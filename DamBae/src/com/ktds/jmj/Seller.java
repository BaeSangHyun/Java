package com.ktds.jmj;

public class Seller {
	
	private int money;
	private int dambaeCount;
	private int dambaePrice;
	//private int age;
	//source - generate getters and setters
	// ALT - S - R 
	
	
	public Seller(){
		
	}//메소드의 파라미터의 개수가 다르거나 종류가 다르거나 = 메소드 오버로딩
	
	/*public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}*/

	public Seller(int money, int dambaeCount, int dambaePrice) {//생성자는 클래스명과 같아야한다.
		this.setMoney(money);
		this.setDamBaeCount(dambaeCount);
		this.setDamBaePrice(dambaePrice);
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getDamBaeCount() {
		return dambaeCount;
	}
	public void setDamBaeCount(int dambaeCount) {
		this.dambaeCount = dambaeCount;
	}
	public int getDamBaePrice() {
		return dambaePrice;
	}
	public void setDamBaePrice(int dambaePrice) {
		this.dambaePrice = dambaePrice;
	}
//	
	
	public void getMoneyFromCustomer( int money , Customer customer ) { // min.pay()를 받아오기위해서 하는거
		this.money += customer.pay( money );
	}
	
	public void giveDamBae (int dambaeCount, Customer customer) {
		this.dambaeCount -= dambaeCount;
		customer.getDamBae(dambaeCount);
		
	}
	
	public void giveRemain( int money, int dambaeCount, Customer customer ) { //구매자가 지불한 돈, 사간 갯수, 사과 가격 , 소비자한테 직접 줘야하니 customer 필요
		int remain = money - ( dambaeCount * this.dambaePrice);
		this.money -= remain;
		customer.takeMoney(remain);
		System.out.println("거스름돈 " + remain + "원 이야");
	}
	
	public boolean checkInven(Customer customer) {
		if (this.dambaeCount == 0 || customer.getMoney() < this.dambaePrice) {
			System.out.println("장사 그만");
			return false;
		}
		return true;
	}
	
	public void printMyInfo() {
		System.out.println("판매자가 가진 담배의 수: " + this.dambaeCount);
		System.out.println("판매자가 가진 금액 : " + this.money);
	}
}
