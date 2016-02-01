
public class ForTest {

	public static void main(String[] args) {
		
/*		// 구구단 만들기
		for (int i = 2; i < 10; i++){
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++){
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.print("\n");
		}
		
		for (int i =1; i < 10; i++){
			for (int j=2; j <10; j++){
				System.out.print(j + "*" + i + "=" + j*i + "  ");
			}
			System.out.print("\n");
		}
		
		// 하나의 for문을 이용해서 "************"를 출력하세요.
		
		for (int i = 1; i <= 10; i++){
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.println("");
		
		for (int i = 1; i < 6; i++){
			for (int j = 0; j < i; j++){
				System.out.print("*");
			}
		System.out.println("");
		}
		*/
		
		int numberOne = 10;
		
		numberOne++;
		System.out.println(numberOne);
		numberOne += 1;
		System.out.println(numberOne);
		numberOne = numberOne + 1;
		System.out.println(numberOne);
	
		
		//System.out.println(numberOne++); //일경우 11출력 /뒤에 ++ 이 붙을 경우 다음 라인에 증가
		//System.out.println(++numberOne); //일경우 12출력 /앞에 ++ 이 붙은 경우 즉시 증가
		
		//System.out.println(numberOne++); // 다음 라인에 증가되므로 10출력
		//System.out.println(numberOne); // 다음 라인이 되어 11로 증가
		

	}

}
