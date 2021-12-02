import java.util.Scanner;

public class Pppi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		double p=getPi(n);
		System.out.println(p);

	}
	public static double getPi(int n)
	{
		double p=0.0;
		int i,k=1;
		if(n<=0)
		{
			n=0;
			p=1.0/(2.0*(double)n+1.0);
		}
		else
		{
			for(i=0;i<=n;i++)
			{
				if(i%2==0)
					k=1;
				else k=-1;
				p=1.0/(2.0*(double)i+1.0)*k+p;
			}
		}
		return 4*p;
	}
}
