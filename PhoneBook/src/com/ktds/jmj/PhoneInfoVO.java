package com.ktds.jmj;

/**
 * VO : Value Object
 * 기능없이 인스턴스 필드와 Getter Setter만 가지고 있다.
 * @author 206-020
 *
 */
public class PhoneInfoVO {
	//인스턴스 필드니까 private로
	private String name;
	private String PhoneNumber;
	private int age;
	private String address;
	private static int count;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
