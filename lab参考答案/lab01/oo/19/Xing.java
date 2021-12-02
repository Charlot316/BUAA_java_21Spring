import java.util.Scanner;

public class Xing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();	
		int i,j,k=n/2,l=1;
		for(i=0;i<=n/2;i++)
		{
			for(j=k;j>0;j--)
			{
				System.out.print(" ");
			}
			for(j=l;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			k--;
			l=l+2;
		}
		k=1;
		l=n-2;
		for(i=0;i<n/2;i++)
		{
			for(j=k;j>0;j--)
			{
				System.out.print(" ");
			}
			for(j=l;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			k=k+1;
			l=l-2;
		}
	}

}
