
public class SwitchTest {

	public static void main(String[] args) {
		
		int numberOne = 2;
		
		switch ( numberOne ) {
		case 1 :
			System.out.println("numberOne의 값은 1 입니다.");
			break;
		case 2 :
			System.out.println("numberOne의 값은 2 입니다.");
			break;
		case 3 :
			System.out.println("numberOne의 값은 3 입니다.");
			break;
		default :
			System.out.println("numberOne의 값은 알 수 없습니다.");
			break;
		}
		
		if ( numberOne == 1 ) {
			System.out.println("numberOne의 값은 1 입니다.");
		}
		else if ( numberOne == 2 ){
			System.out.println("numberOne의 값은 2 입니다.");
		}
		else if ( numberOne == 3 ){
			System.out.println("numberOne의 값은 3 입니다.");
		}
		else {
			System.out.println("numberOne의 값은 알 수 없습니다.");
		}

	}

}
