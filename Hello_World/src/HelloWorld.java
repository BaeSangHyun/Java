
public class HelloWorld {
	public static void main(String[] args) {

		int a = 10;

		System.out.println(a += 2);
		System.out.println(a /= 2);
		System.out.println(a = a++);
		System.out.println(true && false);
		System.out.println("10+5:" + 3 * 5); // 10+5:15
		System.out.println("10+5:" + 3 + 5); // 10+5:35
		System.out.println("10+5:" + (3 + 5)); // 10+5:8

	}
}
