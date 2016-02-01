import java.util.Scanner;

public class MinTwo {

	public static void main(String[] args) {
		/**
		 * Scanner을 이용해 숫자 두개를 입력받는다. Scanner을 이용해 연산자 하나를 입력받는다. 입력 받을 수 있는
		 * 연산자는 +, -, *, / 로 제한한다. 입력 받은 연산자에 해당하는 계산을 한 뒤 결과를 출력한다.
		 * 
		 * 문자를 입력받는 Scanner 기능은 .next()을 사용한다.
		 **/
		Scanner input = new Scanner(System.in);

		System.out.println("숫자 두개를 입력하세요.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		for (;;) {// 반복문안에서 변수선언 ㄴㄴ
			System.out.println("연산자를 입력하세요.(+, -, *, /)");
			String operator = input.next();
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
				if (operator.equals("+")) {
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				} else if (operator.equals("-")) {
					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				} else if (operator.equals("*")) {
					System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
				} else if (operator.equals("/")) {
					System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / (double) num2));
				}
				break;
			}
		}
	}
}
