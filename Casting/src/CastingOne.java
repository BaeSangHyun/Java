
public class CastingOne {
	
	public static void main(String[] args) {		
		// 2 byte : short
		short shortNumber = 10;		
		//명시적 캐스팅
		// 4 byte : integer
		int number = (int)shortNumber; // 이 순간에만 int 로 형 변환 되는것이다.
		//shortNumber 자체는 short
		// 8 byte : long
		long biggerNumber = (long)shortNumber;
		
		System.out.println("number is " + number);
		System.out.println("biggerNumber is " + biggerNumber);
		
		shortNumber = 35;		
		//묵시적 캐스팅
		number = shortNumber;
		biggerNumber = shortNumber;
		
		System.out.println("number is " + number);
		System.out.println("biggerNumber is " + biggerNumber);
			
	}
}
