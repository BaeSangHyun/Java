package com.ktds.jmj;

public class ThrowsTest {
	
	public void start() {
		MakeExceptions makeExceptions = new MakeExceptions();
		
		int number= 0;
		number = makeExceptions.parseInt("123");
		//makeExceptions.parseInt("ABC");
		
		try{ //try - catch 를 throws한 애한테 써줘야한다.
			number = makeExceptions.parseInt2("DEF");// throws를 하면 반드시 호출을 한 애가 잡아야한다.
		}
		catch(NumberFormatException nfe) {
			System.out.println("변환실패!"); 
			number = 0; //0출력 / 17번 주석하면 123출력
		}
		System.out.println(number);
		/*catch(NullPointerException npe) {// throws 부분에서 NullPointrException도 있다면 catch를 하나 더 만들어줘야한다.
			System.out.println("변환실패!");
		}*/
//------------------		
/*		try {
			number = makeExceptions.parseInt3("DEF");
		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		} // InvalidNumberException이 exception의 종류이기 때문에 throws / try-catch 던지거나 잡아야한다.
*/		
		
		number = makeExceptions.parseInt3("DEF"); //runtimeException으로 생성했기 때문에 try catch 필요없다.
	
//--------------		
		 
/*		try{ //try - catch 를 throws한 애한테 써줘야한다.
			 number = makeExceptions.parseInt3("DEF");// throws를 하면 반드시 호출을 한 애가 잡아야한다.
			}
			catch(NumberFormatException nfe) {
				System.out.println("변환실패!!!!!!!!!!!!!!"); // 123출력
				number = 0; //0출력
			}*/
		System.out.println(number);
	}
	public static void main(String[] args) {
		
		ThrowsTest test = new ThrowsTest();
		test.start();

	}

}
