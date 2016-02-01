package com.ktds.jmj;

public class Machine {
	
	public static final int MAX_QUANTITY = 15;
	
	private String[] cola; // 크기가 한번 정해지면 변경이 될수 없다.
	private String[] sprite;
	private String[] fanta;
	
	private int colaPrice;
	private int spritePrice;
	private int fantaPrice;
	
	private int money;
	
	/**
	 * 구매자가 자판기에 넣은 금액
	 */
	private int customerMoney;

	public String[] getCola() {
		return cola;
	}

	public void setCola(String[] cola) {
		this.cola = cola;
	}

	public String[] getSprite() {
		return sprite;
	}

	public void setSprite(String[] sprite) {
		this.sprite = sprite;
	}

	public String[] getFanta() {
		return fanta;
	}

	public void setFanta(String[] fanta) {
		this.fanta = fanta;
	}

	public int getColaPrice() {
		return colaPrice;
	}

	public void setColaPrice(int colaPrice) {
		this.colaPrice = colaPrice;
	}

	public int getSpritePrice() {
		return spritePrice;
	}

	public void setSpritePrice(int spritePrice) {
		this.spritePrice = spritePrice;
	}

	public int getFantaPrice() {
		return fantaPrice;
	}

	public void setFantaPrice(int fantaPrice) {
		this.fantaPrice = fantaPrice;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getCustomerMoney() {
		return customerMoney;
	}

	public void setCustomerMoney(int customerMoney) {
		this.customerMoney = customerMoney;
	}

	/**
	 * 콜라의 수량을 셋팅한다.
	 * @param quantity
	 */
	public void setColaQuantity( int quantity ) {// 음료의 초기 수량
		if ( !this.isExceedQuantity(quantity)) {
			this.cola = new String[quantity];
			this.setDrink(this.cola, "콜라");
		}
	}
	
	/**
	 * 스프라이트의 수량을 셋팅한다.
	 * @param quantity
	 */
	public void setSpriteQuantity( int quantity ) {// 음료의 초기 수량
		if ( !this.isExceedQuantity(quantity)) {
			this.sprite = new String[quantity];
			this.setDrink(this.sprite, "스프라이트");
		}
	}
	/**
	 * 환타의 수량을 셋팅한다.
	 * @param quantity
	 */
	public void setFantaQuantity( int quantity ) {// 음료의 초기 수량
		if ( !this.isExceedQuantity(quantity)) {
			this.fanta = new String[quantity];
			this.setDrink(this.fanta, "환타");
		}
	}
	
	/**
	 * 음료의 수량 셋팅시 최대 수량을 초과하는지 체크한다.
	 * @param quantity
	 * @return 입력 수량 > 최대 수량의 결과
	 */
	private boolean isExceedQuantity( int quantity ) {
		boolean isExceed = quantity > Machine.MAX_QUANTITY;
		if (isExceed) {
			System.out.println("최대용량은 " + Machine.MAX_QUANTITY + " 입니다.");
		}
		return isExceed;
	}
	
	/**
	 * 음료의 개수와 이름을 셋팅한다.
	 * @param drink 인스턴스 필드 ( cola, sprite, fanta )
	 * @param name 음료의 이름
	 */
	private void setDrink( String drink[], String name) { 
		for ( int i = 0; i < drink.length; i++ ){
			drink[i] = name;
		}
	}
	
	/**
	 * 자판기에 돈을 넣는다.
	 * @param money 자판기에 넣은 금액
	 * @param customer 돈을 넣은 고객
	 */
	public void getMoney( int money, People customer ) {
		this.money += money;
		this.customerMoney = 0; // 돈을 넣을때 마다 0으로 초기화해주고 money를 넣는다. 굳이 필요는 없다.
		this.customerMoney = money;
		
		customer.pay(money);
	}
	
	/**
	 * 메뉴를 출력한다
	 */
	public void printMenu() {
		
		System.out.println("아래 상품을 선택하세요.");
		System.out.println("콜라 (" + this.getColaPrice() + ") : " + this.getDrinkQuantity(1) + "개");
		System.out.println("스프라이트 (" + this.getSpritePrice() + ") : " + this.getDrinkQuantity(2) + "개");
		System.out.println("환타 (" + this.getFantaPrice() + ") : " + this.getDrinkQuantity(3) + "개");
		System.out.println("콜라는 1번, 스프라이트는 2번, 환타는 3번입니다.");
		
	}
	
	/**
	 * 각 음료의 수량을 얻어온다.
	 * @param drinkNumber 
	 * @return
	 */
	public int getDrinkQuantity( int drinkNumber ) {
		
		if ( drinkNumber == 1 ) {
			return getDrinkQuantity(this.cola, "콜라"); //오버로딩 됨
		}
		else if ( drinkNumber == 2 ) {
			return getDrinkQuantity(this.sprite, "스프라이트");
		}
		else if ( drinkNumber == 3 ) {
			return getDrinkQuantity(this.fanta, "환타");
		}
		
		return 0;
	}
	
	private int getDrinkQuantity( String drinks[], String drinkName ) { //오버로딩 사용
		
		int drinkQuantity = 0;
		for ( String drink : drinks ) {
			
			if ( drink.equals(drinkName) ) {
				drinkQuantity++;
			}
			
		}
		return drinkQuantity;
	}
	
	/**
	 * 음료를 구매자에게 준다.
	 * @param drinkNumber 음료 번호 (1: 콜라, 2: 스프라이트, 3:환타)
	 * @param quantity 음료 개수
	 * @param customer
	 * @return
	 */
	public int giveDrink( int drinkNumber, int quantity, People customer) {
		//중복되는거 메소드로 바꿀 수 있다.******
		//콜라
		if ( drinkNumber == 1 ){
			// 1. 구매자가 넣은 금액이 음료 X 수량 만큼 되는지 확인
			//  만약, 금액이 모자란다면, 구매를 할 수 없다.

			if ( this.customerMoney >= (this.getColaPrice() * quantity) ) {
				// 2. 음료를 소비자에게 준다.
				this.saleDrink(this.cola, quantity);
				customer.addCola(quantity);
				
				// 3. 거스름돈을 소비자에게 준다.
				int remainMoney = customerMoney - (this.getColaPrice()*quantity);
				customer.getRemainMoney(remainMoney);
			}
			else {
				System.out.println("금액이 모자랍니다.");
				customer.getRemainMoney(this.customerMoney);
			}
		}
		
		//스프라이트
		else if ( drinkNumber == 2 ) {
			// 1. 구매자가 넣은 금액이 음료 X 수량 만큼 되는지 확인
			//  만약, 금액이 모자란다면, 구매를 할 수 없다.

			if ( this.customerMoney >= (this.getSpritePrice() * quantity) ) {
				// 2. 음료를 소비자에게 준다.
				this.saleDrink(this.sprite, quantity);
				customer.addSprite(quantity);
				
				// 3. 거스름돈을 소비자에게 준다.
				int remainMoney = customerMoney - (this.getSpritePrice()*quantity);
				customer.getRemainMoney(remainMoney);
			}
			else {
				System.out.println("금액이 모자랍니다.");
				customer.getRemainMoney(this.customerMoney);
			}
		}
		//환타
		else if ( drinkNumber == 3 ){
			// 1. 구매자가 넣은 금액이 음료 X 수량 만큼 되는지 확인
			//  만약, 금액이 모자란다면, 구매를 할 수 없다.

			if ( this.customerMoney >= (this.getFantaPrice() * quantity) ) {
				// 2. 음료를 소비자에게 준다.
				this.saleDrink(this.fanta, quantity);
				customer.addFanta(quantity);
				
				// 3. 거스름돈을 소비자에게 준다.
				int remainMoney = customerMoney - (this.getFantaPrice()*quantity);
				customer.getRemainMoney(remainMoney);
			}
			else {
				System.out.println("금액이 모자랍니다.");
				customer.getRemainMoney(this.customerMoney);
			}
		}
		//그런 메뉴없음
		else{
			System.out.println("존재하지 않는 메뉴입니다.");
		}
		return 0;
	}
	
	private void saleDrink(String drinks[], int quantity) {
		
		int saleCount = 0;
		
		for ( int i = 0; i < drinks.length; i++ ) {
			
			if ( saleCount == quantity ) {
				break;
			}
			
			if ( !drinks[i].equals("판매됨") ) {
				drinks[i] = "판매됨";
				saleCount++;
			}
			
		}
	}
	


}
