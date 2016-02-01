import java.util.Scanner;

public class MinOne {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("1. 체질량 지수 계산");
		System.out.println("몸무게를 입력하세요.");
		double w = console.nextDouble();
		System.out.println("키를 입력하세요.");
		double h = console.nextDouble();
		double result1 = w / (h * h);
		System.out.println("체질량 지수 : " + result1);

		System.out.println("\n2. 화씨 -> 섭씨");
		System.out.println("화씨 온도를 입력하세요");
		double c = console.nextDouble();
		double result2 = (c - 32) / 1.8;
		System.out.println("섭씨온도 : " + result2);

		System.out.println("\n3. 섭씨 -> 화씨");
		System.out.println("섭씨 온도를 입력하세요");
		double f = console.nextDouble();
		double result3 = f * 1.8 + 32;
		System.out.println("화씨온도 : " + result3);

	}
}
