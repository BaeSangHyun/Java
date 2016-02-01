package com.ktds.jmj;

public class SubstringTest {
	
	private void start() {
		
		String welcome = "Hello, World!";
		System.out.println(welcome);
		
		System.out.println(welcome.length());
		String world = welcome.substring(7, 13);
		
		world = welcome.substring(welcome.indexOf(" ") + 1 , welcome.length()); // 공백이 있는 인덱스를 알려준다
		System.out.println(world);
		
		String hello = welcome.substring(0, welcome.indexOf(" "));
		hello = welcome.substring(0, "helloo".length());
		System.out.println(hello);
		
		world = welcome.substring( welcome.indexOf(" ") + 1);
		System.out.println(world);
		
		String str = welcome.substring(4, 8);
		System.out.println(str);
		
		str = welcome.substring(welcome.indexOf("o"));
		System.out.println(str);
		str = welcome.substring(welcome.lastIndexOf("o"));
		System.out.println(str);
		
		String id = welcome.substring(0, 3);
		for ( int i = 0; i < 5; i++) {
			id += "*";
		}
		System.out.println(id);
		
		/*String welcome = "한글한글한글한글한글";
		System.out.println(welcome);
		
		System.out.println(welcome.length());
		String world = welcome.substring(7, 13);
		
		world = welcome.substring(welcome.indexOf(" ") + 1 , welcome.length()); // 공백이 있는 인덱스를 알려준다
		System.out.println(world);
		
		String hello = welcome.substring(0, welcome.indexOf(" "));
		hello = welcome.substring(0, "helloo".length());
		System.out.println(hello);
		
		world = welcome.substring( welcome.indexOf(" ") + 1);
		System.out.println(world);
		
		String str = welcome.substring(4, 8);
		System.out.println(str);
		
		str = welcome.substring(welcome.indexOf("o"));
		System.out.println(str);
		str = welcome.substring(welcome.lastIndexOf("o"));
		System.out.println(str);
		
		String id = welcome.substring(0, 3);
		for ( int i = 0; i < 5; i++) {
			id += "*";
		}
		System.out.println(id);*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstringTest substring = new SubstringTest();
		substring.start();

	}

}
