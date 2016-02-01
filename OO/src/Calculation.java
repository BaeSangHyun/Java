
public class Calculation { //과제3
	
	public void printOperator( double numberOne, double numberTwo, String Operator ) {
		double result = 0;
		if ( Operator.equals("+")){
			result = numberOne + numberTwo;
		}
		else if( Operator.equals("-")){
			result = numberOne - numberTwo;
		}
		else if ( Operator.equals("*")) {
			result = numberOne * numberTwo;
		}
		else if ( Operator.equals("/")) {
			result = numberOne / numberTwo;
		}
		System.out.println(result);
	}
	
	public boolean ContinueOrExit( String choice ){
		boolean exit;
		if ( choice.equals("exit")) {
			exit = false;
		}
		else {
			exit = true;
		}
		return exit;
	}
}
