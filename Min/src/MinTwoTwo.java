import java.util.Scanner;

public class MinTwoTwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("숫자 두개를 입력하세요.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.println("연산자를 입력하세요.(+, -, *, /)");
		String a = input.next();

		if (a.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (a.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (a.equals("*")) {
			System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
		} else if (a.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / (double) num2));
		}

	}

}
