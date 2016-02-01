
public class CastingTwo {
	
	public static void main(String[] args) {
		// Sudo Coding
		
		int numberOne = 15;
		
		//숫자 15를 2로 나눈다.
		int numberTwo = numberOne / 2;
		
		//결과를 출력한다.
		System.out.println(numberOne + " 나누기 2의 결과는 " + numberTwo + "입니다.");
		
		double numberThree = numberOne / 2; 
		// numberOne은 int, 2도 int 이므로 int 형 나누기 int 형으로 7이 나오고 7이 double형으로 바뀌므로 7.0이 출력
		System.out.println(numberOne + " 나누기 2의 결과는 " + numberThree + "입니다.");
		
		numberThree = (double)numberOne / 2;
		//numberThree = numberOne / 2.0; 결과는 7.5로 같다
		System.out.println(numberOne + " 나누기 2의 결과는 " + numberThree + "입니다.");
		
		
		//숫자 15를 실수로 변환한다.
		double numberFour = numberOne;
		
		//실수 15를 2로 나눈다.
		double numberFive = numberFour / 2;
		
		//결과를 출력한다.
		System.out.println(numberFour + " 나누기 2의 결과는 " + numberFive + "입니다.");
	}
}
