import java.util.Scanner;

public class HelloMain { //과제1
	
	public static void main(String[] args){
		Hello printMessage = new Hello();
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 :");
		String name = input.next();
		System.out.println("사는 곳을 입력하세요 :");
		String home = input.next();
		System.out.println("나이를 입력하세요 :");
		int age = input.nextInt();
		
		printMessage.SayHello(name, home, age);

		
	}

}
