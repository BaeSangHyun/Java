
public class CastingThree {
	
	public static void main(String[] args) {
		
		double numberOne = 100000;
		//short numberTwo = numberOne; 오류 double 8, short 4 이므로 short에 double을 넣을수 없다.
		short numberTwo = (short) numberOne;
		System.out.println(numberTwo); 
		//short 범위 -32,768 ~ 32,767 이므로 100000이 short 범위에 속하지 않는다.
		
		//int numberThree = numberOne; 오류 double 8 , int 4 이므로 int 에 double을 넣을 수 없다
		int numberThree = (int) numberOne;
		System.out.println(numberThree);
		
		
		char chr = 'A';
		System.out.println(chr);
		
		char chrTwo = 66; // char 에는 문자와 숫자가 들어갈 수 있다.
		System.out.println(chrTwo);
		
		char chrThree = (char) (chr + 1);
		System.out.println(chrThree);
		
		char chrFour = 1; // ascii코드인듯...?
		
		System.out.println(chrFour);
		
	}
}
