
import java.util.Scanner;

public class Fangge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int a[][];
		a=new int[n][n];
		int i,j,sum=1;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sum;
				sum++;
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
