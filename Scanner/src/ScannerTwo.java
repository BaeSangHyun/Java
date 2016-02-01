import java.util.Scanner;

public class ScannerTwo {

	public static void main(String[] args) {

		// int형 변수 두 개를 정의한다.
		int numberOne;
		int numberTwo;
		
		
		// int 형 변수 각각에 scanner를 통해 값을 입력받는다.
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 두 개를 더하는 프로그램입니다.");
		System.out.print("첫번째 숫자를 입력하세요.");
		numberOne = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요.");
		numberTwo = input.nextInt();
		
		// int 형 변수 두 개를 더해 다른 변수에 저장한다.
		int additionResult = numberOne + numberTwo;
		
		// 두 개를 더한 결과를 출력한다.
		System.out.println(numberOne + " + " + numberTwo + " = " + additionResult);


	}

}
