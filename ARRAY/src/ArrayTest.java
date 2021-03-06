
public class ArrayTest {

	public static void main(String[] args) {
		
		// 5개의 문자열이 들어가는 배열 변수를 만든다.
		String list[] = new String[5];
		
		list[0] = "김광민";
		list[1] = "백지경";
		list[2] = "김현섭";
		list[3] = "남준호";
		list[4] = "황성재";
		
		/*int index = 0;
		System.out.println(list[index++]);
		System.out.println(list[index++]);
		System.out.println(list[index++]);
		System.out.println(list[index++]);
		System.out.println(list[index++]);*/
		
		for ( int i = 0; i < 5; i++) {
			System.out.println(list[i]);
		}
		
		for ( String name : list ){
			System.out.println(name);
		}//속도가 위에 것보다 더 빠르다
		
		int scores[] = new int[] { 10, 20, 50 }; 
		for ( int score : scores ) {
			System.out.println(score);
		}
	}
}
