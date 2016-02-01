package com.ktds.jmj;

public class PetStore {
	
	public static void main(String[] args) {
		
		System.out.println("기를 수 있는 애완 동물의 수는 " + Pet.petCount + "마리 입니다.");

		
		Pet dog = new Pet();
		dog.petCount++;
		//인스턴스가 클래스 필드를 변경하면 다른 인스턴스도 변경된다?
		//외부에서 값이 변경되면 Pet 클래스 자체가 값이 변경?
		//method 안에 들어가는 것들은 초기화를 반드시 해야한다.
		
		Pet cat = new Pet();
		cat.petCount++;
		
/*		
		dog.type = "개";
		dog.name = "바둑이";
		cat.type = "고양이";
		cat.name = "나비";*/
		
		dog.setType("개");
		dog.setName("바둑이");
		
		cat.setType("고양이");
		cat.setName("나비");
		
		System.out.println("기를 수 있는 애완 동물의 수는 " + Pet.petCount + "마리 입니다.");

		
		System.out.println("애완 동물의 종류는 " + dog.getType() + "이고, 이름은 " + dog.getName() + "입니다.");
		System.out.println("애완 동물의 종류는 " + cat.getType()
		+ "이고, 이름은 " + cat.getName() + "입니다.");
		
	}

}
