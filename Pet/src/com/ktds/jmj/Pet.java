package com.ktds.jmj;

/**
 * 애완 동물의 정보를 가지는 클래스
 */
public class Pet {
	/**
	 * 만들 수 있는 애완동물의 수
	 */
	public static int petCount = 2; 
	// 인스턴스를 만들지 않아도 변수를 쓸수 있고, 인스턴스를 만들지 않아도 기능을 쓸 수 있다.
	//static은 메모리가 독립되어 있다. 
	//상수를 만들때 static이라는 키워드가 반드시 들어간다.
	/**
	 * 애완 동물의 종류
	 */
	private String type; //초기화를 할 필요없다
	//method 안에 들어가는 것들은 초기화를 반드시 해야한다.
	//public이 범위가 가장 크다.
	//private는 그 클래스 안에서만 그 속성을 사용할 수 있다는 의미.
	/**
	 * 애완 동물의 이름
	 */
	private String name;
	
	
	public void setType ( String type ){ //void 아무것도 줄게없다? = 반환을 시키지 않겠다는 의미
		this.type = type;
	}
	//인자, 파라미터, 매개변수
	//필드가 가진
	
	public void setName ( String name ) {
		this.name = name;
	}
	
	public String getType () {
		return this.type;
	}
	public String getName() {
		return this.name;
	}
	
	
	
	
}
