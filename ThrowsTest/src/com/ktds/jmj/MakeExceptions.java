package com.ktds.jmj;

public class MakeExceptions {
	
	/**
	 * 문자를 숫자로 변환한다.
	 * 만약, 예외상황이 발생하면 적절한 조치를 취해준다.
	 * @param str
	 * @return
	 */
	public int parseInt(String str) {
		
		try {
			return Integer.parseInt(str);
		}
		catch( NumberFormatException nfe ){
			return 0;
		}
		
	}
	/**
	 * 문자를 숫자로 변환한다.
	 * 만약, 예외상황이 발생하면 적절한 조치를 취하지 않는다.
	 * @param str
	 * @return
	 * @throws NumberFormatException
	 */
/*	public int parseInt2( String str ) throws NumberFormatException, NullPointerException { // 처리의 책임을 전가한다.
		return Integer.parseInt(str);
	}*/
	public int parseInt2( String str ) throws NumberFormatException { // 처리의 책임을 전가한다.
		return Integer.parseInt(str);
	}
	
/*	public int parseInt3( String str ) throws InvalidNumberException { // 반드시 throws로 던져야한다. 
 * ***extends로 예외를 생성했을때 
		
		try {
			return Integer.parseInt(str);
		}
		catch (NumberFormatException nfe) {
			System.out.println(str +"은 숫자로 바꿀수없다.");
			//throw nfe;
			InvalidNumberException ine = new InvalidNumberException(str +"은 숫자로 바꿀수없다.");
			throw ine; // 반드시 throw를 던져야한다.
			//InvalidNumberException 이 Exception의 한 종류이기 때문에 반드시 throw를 던져야한다.
		}
	}*/
	
	public int parseInt3( String str ) { // throws를 적지않아도 된다. runtimeException으로 예외를 생성했을 때
		
		try {
			return Integer.parseInt(str);
		}
		catch (NumberFormatException nfe) {
			System.out.println(str +"은 숫자로 바꿀수없다.");
			//throw nfe;
			InvalidNumberException ine = new InvalidNumberException(str +"은 숫자로 바꿀수없다.");
			throw ine; // 반드시 throw를 던져야한다.
			//InvalidNumberException 이 Exception의 한 종류이기 때문에 반드시 throw를 던져야한다.
		}
	}


}
