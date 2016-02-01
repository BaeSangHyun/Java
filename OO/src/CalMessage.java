import java.util.Scanner;

public class CalMessage {
	public void printMessage () {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input number : ");
		double num1 = input.nextDouble();
		System.out.println("input number : ");
		double num2 = input.nextDouble();
		System.out.println("input operator(+,-,*,/) : ");
		String operator = input.next();

	}

}
