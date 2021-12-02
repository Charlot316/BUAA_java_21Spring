public class myMathException extends Exception{
	public myMathException(String sn,String sm) {
		System.out.println("The input is not a number!");
	}
	public myMathException(int n,int m) {
		System.out.println("Number is out of range!");
	}
}

