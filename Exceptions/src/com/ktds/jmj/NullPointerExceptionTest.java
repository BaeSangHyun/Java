package com.ktds.jmj;

/*public class NullPointerExceptionTest {
	
	public void start() {
		String str = null;
		
		for (int i =; i <3; i ++)	}
				if(sA

	public static void main(String[] args) {
		
		float floatNumber = 0.0F;
		double doubleNumber = 0.0D;
		
		 primitive Type의 default
		 * int   		0
		 * short		0
		 * long			0L
		 * byte			0
		 * float		0.0F
		 * double		0.0D 혹은 0.0
		 * boolean		false
		 * char			''
		 * 
		 * Reference Type의 default		null
		 * String
		 * Scanner
		 * NullPointerExceptionTest		null
		 * String
		 * NumberFoarmatExcception
		 * InputMimathexception
		 
		
		NullPointerExceptionTest test;
		test.start();


	}

}*/

public class NullPointerExceptionTest {

   public void start(){
      
      String str = new String("BBB");
      
      for (int i = 0; i < 0; i++) {
         
         if(str!= null && str.equals("AAA")){ // Null 예외는 try catch걸지마....
            System.out.println("AAA 입니다.");
         }
         else {
            System.out.println("에러 입니다.");
         } 
      }  
   }
   
   public static void main(String[] args) {
      NullPointerExceptionTest test = new NullPointerExceptionTest();
      test.start();
      
      /*
       *int      0
       *short      0
       *long      0L
       *byte      0
       *float      0.0F
       *double   0.0D 혹은 0.0
       *boolean   false
       *char
       *
       *Reference Type의 기본 값
       *String
       *Scanner
       *System
       *
       *
       */
      
   }
   
}
