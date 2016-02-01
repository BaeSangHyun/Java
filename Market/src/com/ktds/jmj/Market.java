package com.ktds.jmj;

public class Market {
	
	private int appleCount = 15;
	//private static int appleCount = 15;
	private int money = 4000;
	public static final int APPLE_PRICE = 500; //final앞에는 static이 오고 이름은 대문자이어야한다.
	
	public void start() {
		
		Customer min = new Customer();
		min.setMoney(5000);
		min.setAppleCount(0);
		
		while (true) {
			
			if ( this.appleCount == 0 || min.getMoney() < Market.APPLE_PRICE ) {
				System.out.println("안 팔아요.");
				break;
			}
		
			// 소비자에게서 돈을 받는다.
			min.pay(1000);
			this.money += 1000;
			
			// 소비자에게 사과를 준다.
			this.appleCount -= 1;
			min.getApple(1);
			
			// 거스름돈을 남겨준다.
			int money = 1000 - (Market.APPLE_PRICE * 1);
			this.money -= money;
			min.takeMoney(money);
			
			// 소비자의 정보를 출력한다.
			min.printMyInfo();
			//System.out.println(this.appleCount);
		}
		
	}

	public static void main(String[] args) {
		Market market = new Market();//자기 자신을 인스턴스로 만들 수 있다.
		market.start();
		//System.out.println(Market.appleCount);

	}
}
