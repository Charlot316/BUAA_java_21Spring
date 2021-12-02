public class Calculate {
	public static int add(int a,int b) throws myMathException{
		if((a>10||a<-10)||(b>10||b<-10))
			throw new myMathException(a,b);
		return a+b;
	}
	public static int minus(int a,int b) throws myMathException{
		if((a>10||a<-10)||(b>10||b<-10))
			throw new myMathException(a,b);
		return a-b;
	}
}
