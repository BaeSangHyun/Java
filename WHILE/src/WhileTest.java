import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
		int i = 0;
		while ( i < 10 ) {
			
			System.out.println(i);
			i++;
			
		}
		
		Scanner input = new Scanner(System.in);
		String inputValue = "";
		
		boolean isRunning = true;
		while ( isRunning ){
			
			System.out.println("출력 중....종료하려면 exit를 입력하세요.");
			inputValue = input.next();
			
			if (inputValue.equalsIgnoreCase("exit")){//.equals는 대문자를 확실히 구분 .equalsIgnoreCase는 대소문자 구분 안함
				isRunning = false;
			}
		}
		
		for ( int j = 1; j < 10; j+=2){
			System.out.println(j);
		}
		
		for ( int j = 0; j < 10; j++){
			if (j%2 == 0){
				continue; // 짝수라면 건너뛰어라
			}
			System.out.println(j);
		}
	}
}

