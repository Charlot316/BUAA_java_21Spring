import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculate_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		String sn=reader.nextLine();
		String sm=reader.nextLine();
		int n,m,re1,re2;
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$"); 
		try {
			if(pattern.matcher(sn).matches()==false||pattern.matcher(sm).matches()==false)
				throw new myMathException(sn,sm);
			n=Integer.valueOf(sn);
			m=Integer.valueOf(sm);
			re1=Calculate.add(n, m);
			re2=Calculate.minus(n, m);
			System.out.print("add result="+re1+"\n"+"minus result="+re2+"\n");
		}catch(myMathException e) {
			
		}
	}
}
