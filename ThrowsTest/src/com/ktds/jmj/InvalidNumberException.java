package com.ktds.jmj;


//외워야한다. 
public class InvalidNumberException extends RuntimeException { // 예외를 만들때 반드시 extends를 붙여야한다. 
	
	public InvalidNumberException() {
		super();
	}
	
	public InvalidNumberException( String msg ) {
		super(msg);
	}
	
	public InvalidNumberException( Throwable t ) { // 최상위 예외 클래스 Throwable (모든 예외를 다 포함한다.)
		super(t);
	}
	
	public InvalidNumberException ( String msg, Throwable cause) {
		super(msg, cause);
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
/*public class InvalidNumberException extends Exception { // 예외를 만들때 반드시 extends를 붙여야한다. extends는 사용하지말아라.
	
	public InvalidNumberException() {
		super();
	}
	
	public InvalidNumberException( String msg ) {
		super(msg);
	}
	
	public InvalidNumberException( Throwable t ) { // 최상위 예외 클래스 Throwable (모든 예외를 다 포함한다.)
		super(t);
	}
	
	public InvalidNumberException ( String msg, Throwable cause) {
		super(msg, cause);
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
