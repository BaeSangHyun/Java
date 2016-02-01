import java.util.Scanner;

public class IFTest {

	public static void main(String[] args){
		
		int money = 1200;
		if ( money >= 1200 ) {
			System.out.println("캔 커피를 삽니다.");			
		}
		
		int age = 27;
		if ( age >= 30 ) {
			System.out.println("당신은 30대 입니다.");
		}
		else {
			System.out.println("당신의 나이는 30대가 아닙니다.");
		}
		
		if ( age >= 30 && money >= 1200 ) {
			System.out.println("캔 커피를 삽니다.");
		}
		
		// 나이가 20세 이상이고, 현재 가진 금액이 4500원 이상일 때,
		if ( age >= 20 && money >= 4500 ){
		// "담배를 삽니다" 라고 출력하는 명령문을 만드세요.
			System.out.println("담배를 삽니다.");
		}
		else {
			System.out.println("담배를 못삽니다.");
		}
		
		// 성별 저장하는 변수 생성( 정수로 남자는 0 여자는 1)
		int w;
		
		Scanner input = new Scanner(System.in);
		System.out.println("남자는 0, 여자는 1 입력 ㄱㄱ");
		w = input.nextInt();
		
		//성별이 남자일 경우 "남탕으로 가세요."
		if ( w == 0 ) {
			System.out.println("남탕으로 가세요.");
		}
		//성별이 여자일 경우 "여탕으로 가세요."
		else {
			System.out.println("여탕으로 가세요.");
		}
		
		int score = 100;
		
		if ( score >= 90 && score <= 100 ) {
			System.out.println("A");
		}
		else if ( score >= 80 && score <= 89 ) {
			System.out.println("B");
		}
		else if ( score >= 70 && score <= 79 ) {
			System.out.println("C");
		}
		else if ( score >= 60 && score <= 69 ) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		// 두 정수의 평균을 구한다.
		int num1 = 70;
		int num2 = 90;
		
		// 평균값이 50 이상이라면, "대기"을 출력하고
		// 75점 이상이라면, "합격"을 출력한다.
		// 100점 이라면, "수석 합격"을 출력한다.
		
		if ( (num1 + num2)/2 >= 100 ) {
			System.out.println("수석 합격");
		}
		else if( (num1 + num2)/2 >= 75 ) {
			System.out.println("합격");
		}
		else if( (num1 + num2)/2 >= 50 ){
			System.out.println("대기");
		}
		
		
		//문자열 비교
		
		String operator = "+";
		
		if ( operator.equals("+")) {
			System.out.println("더하기를 합니다.");
		}
		
	}
}
