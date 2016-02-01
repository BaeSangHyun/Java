package com.ktds.jmj;

public class FinallyTest {

	public static void start(){
		
		try{ //try > catch > finally
			//int number = Integer.parseInt("abd");
			int number = Integer.parseInt("123"); //에러가 발생안하면 11번의 nullpointer에러는 잡는다.
			
			String str = null; //8번에서 에러가 발생하면 바로 15번줄 catch로 넘어가서 무시당한다.
			str.length(); //NullPointer 에러발생
			
			System.out.println(number);
		}
		catch (NumberFormatException | NullPointerException nfe) {
			System.out.println("숫자 변환에 실패했습니다. " + nfe.getMessage());
			if (nfe instanceof NumberFormatException){ // NumberFormatException의 인스턴스인가
				System.out.println("숫자변환을 할 수 없습니다.");
			}
			else if ( nfe instanceof NullPointerException ){
				System.out.println("잘못된 참조입니다.");
			}
		}
		
/*		catch (NullPointerException npe){ // catch를 또 추가하면 11번라인도 에러를 잡아낸다.
			System.out.println("잘못된 참조입니다. 객체가 null이 아닌지 확인하세요.");
		}*/
		
		finally { // 에러가 발생하든 안하든 수행된다.
			System.out.println("숫자 변환을 종료합니다.");	
		}
	}

	public static void main(String[] args) {
		// FinallyTest test = new FinallyTest();
		// test.start();

		// this.start(); start()에 static이 붙으면 this.로 접근 못한다. static void
		// start()로 생성한후 메인에서 FinallyTest.start()로 접근
		// 독립적인 메모리에 접근하는 방법 첫번째는 static을 붙이는 방법, 두번째는 10 11 라인과 같은 인스턴스화 방법이
		// 있다.
		FinallyTest.start();

	}

}
