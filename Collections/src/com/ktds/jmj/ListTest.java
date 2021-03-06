package com.ktds.jmj;


import java.util.ArrayList;
import java.util.List;


public class ListTest {
	
	public void start(){
		//Ctrl + Shift + O import를 자동으로 시켜주는 것
		List<String> list = new ArrayList<String>();

		list.add("전민정");
		list.add("김장호");
		list.add("황성재");
		list.add("이람");
		list.add("형근");
		list.add("배성진");
		
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		System.out.println( list.get(3) );
		System.out.println( list.get(4) );
		System.out.println( list.get(5) );
		
		System.out.println( list.size() );
		
		for ( int i = 0; i < list.size(); i++ ) { // for 문을 이용하여 찾기
			if(list.get(i).equals("전민정")) {  
				System.out.println("찾았다!");
				break;
			}		
		}
		
		for ( String name : list ) { // 
			if (name.equals("전민정")){
				System.out.println("찾았다!");
				 break;
			}
		}
		
		if ( list.contains("전민정")) { // contains를 이용하여 찾기
			System.out.println("찾았다!"); 
		}
		
		System.out.println(list.indexOf("이람")); //몇번째 인덱스에 있는지 알고싶을 때
		System.out.println(list.indexOf("오잉?")); // 없을 땐 -1
		
		String name = list.get(list.indexOf("전민정")); // "전민정"의 인덱스 위치를 찾고 그 값을 출력
		System.out.println(name);
		
		list.add(1, "현섭"); // 1번 인덱스에 현섭 추가 1번자리에 있던건 한칸씩 뒤로 밀림
		list.get(0);
		
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		System.out.println( list.get(3) );
		System.out.println( list.get(4) );
		System.out.println( list.get(5) );
		System.out.println( list.get(6) );
		
		System.out.println( list.size() );
		
		list.set(2, "안녕"); // 2번인덱스를 "안녕"으로 변경
		System.out.println(list.size());
		System.out.println(list.get(2));
		
		list.remove(2);//2번인덱스에 있는 데이터 삭제
		list.remove("이람"); // "이람"이라는 데이터 삭제
		
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		System.out.println( list.get(3) );
		System.out.println( list.get(4) ); 
		
		System.out.println( list.size() ); // 2개를 지웠으므로 7에서 5로 줄었다.
	}

	public static void main(String[] args) {
		ListTest test = new ListTest();
		test.start();
	}
}
