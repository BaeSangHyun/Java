package com.ktds.jmj;

public class EMart {
	
	public void start() {
		
		Seller 과일장수1 = new Seller(50000, 20, 1500);//Seller의 생성자가 먼저 실행된다.
		Seller 과일장수2 = new Seller(5000, 1, 1500);
		Seller 과일장수3 = new Seller();
		//기본생성자가 아닌 사용자가 직접 생성한 연산자가 있을경우 그거 밖에 못쓴다.
		
		과일장수3.setAppleCount(10);
		System.out.println(과일장수1);//메모리 주소가 출력된다.
		/*과일장수1.setAppleCount(20);
		과일장수1.setMoney(50000);
		과일장수1.setApplePrice(1500);//생성자를 통해서 줄일 수 있다.*/
		
		Customer 전민정 = new Customer();
		전민정.setMoney(60000);
		전민정.setAppleCount(0);//전민정 인스턴스 생성
		
		과일장수1.getMoneyFromCustomer(3000, 전민정);
		과일장수1.printMyInfo();
		전민정.printMyInfo();
		
		과일장수1.giveApple(1, 전민정);
		과일장수1.printMyInfo();
		전민정.printMyInfo();
		
		과일장수1.giveRemain(3000, 1, 전민정);
		

		과일장수2.getMoneyFromCustomer(5000,전민정);
		과일장수2.printMyInfo();
		전민정.printMyInfo();
		
		과일장수2.giveApple(1, 전민정);
		과일장수2.printMyInfo();
		
	}

	public static void main(String[] args) {
		EMart mart = new EMart();
		mart.start();
	}

}
