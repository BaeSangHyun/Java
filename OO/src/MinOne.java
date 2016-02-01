import java.util.Scanner;

public class MinOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 배열을 이용해 점수를 10개 받아서 평균내기
		System.out.println("10개의 점수를 입력받아 평균내기");
		int list[] = new int[10]; //list 생성
		int sum = 0; // 합을 저장하기 위한 변수 생성, 0초기화
		
		for( int i = 0; i < list.length; i++ ){	
			System.out.println((i+1) +"번째 점수를 입력하세요.");
			list[i] = input.nextInt();
			sum = sum + list[i];
		}
		
		System.out.println( "평균 : " + (double)sum / (double)list.length + "\n");
		
//------------------------------------------------------------------------------
		// 배열에 숫자 다섯개를 받아서 오름차순으로 정ㅇ렬하기 for 문이 두개있어야한다. if도 써야하고
		
		System.out.println("5개의 점수를 입력받아 오름차순 정렬하기");
		int list3[] = new int[5]; // list 생성
		
		for( int i = 0; i < list3.length; i++){
			System.out.println((i+1) +"번째 점수를 입력하세요."); 
			list3[i] = input.nextInt(); // 5개의 숫자 입력받기
		}
		
		for (int i = 0; i < list3.length; i++) { // 0 부터 시작
			for (int j = i+1; j < list3.length; j++){ // i + 1 부터 시작하여 바로 옆자리 숫자부터 비교할 수 있게(?)
				if ( list3[i] > list3[j]) { // 숫자비교해서 앞 숫자가 뒷 숫자보다 크다면 자리교환
					int temp = list3[i];
					list3[i] = list3[j];
					list3[j] = temp;
				}//if
			}//for
		}//for
		
		for (int b: list3){ // 배열 출력
			System.out.println(b);
		}
			
//--------------------------------------------------------------------------------		
		
		// 내림차순정렬하기
		System.out.println("5개의 점수를 입력받아 내림차순 정렬하기");
		int list4[] = new int[5];

		
		for( int i = 0; i < list4.length; i++){
			System.out.println((i+1) +"번째 점수를 입력하세요.");
			list4[i] = input.nextInt();
		}
		
		for (int i = 0; i < list4.length; i++) {
			for (int j = i+1; j < list4.length; j++){
				if ( list4[i] < list4[j]) {// 숫자비교해서 앞숫자가 뒷수자보다 작다면 자리교환
					int temp = list4[i];
					list4[i] = list4[j];
					list4[j] = temp;
				}//if
			}//for
		}//for
		
		for (int c: list4){ // 배열 출력
			System.out.println(c);
		}//for	
	}//main
}//class
