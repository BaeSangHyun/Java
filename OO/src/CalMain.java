import java.util.Scanner;

public class CalMain { //과제 3

	public static void main(String[] args) { //과제3
		Scanner input = new Scanner(System.in);
		Calculation cal = new Calculation();

		boolean exit = true;
		
		while(exit){
			
			System.out.println("input number : ");
			double num1 = input.nextDouble();
			System.out.println("input number : ");
			double num2 = input.nextDouble();
			System.out.println("input operator(+,-,*,/) : ");
			String operator = input.next(); 

			cal.printOperator(num1, num2, operator);
			
			System.out.println("exit를 입력하면 종료. 계속할거면 아무키나 눌러 : ");
			String choice = input.next();
			
			exit = cal.ContinueOrExit(choice) ;
		}
		System.out.println("프로그램을 종료합니다.");
		
	}

}
