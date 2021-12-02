import java.util.Scanner;
public class Triangle_Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		//int len=reader.nextInt();
		int i=0;
		double a,b,c;
		Triangle[] trs = new Triangle[5];
		while(i<5) {
			a=reader.nextDouble();
			b=reader.nextDouble();
			c=reader.nextDouble();
			trs[i]=new Triangle(a,b,c);
			try {
				if(!(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a))
					throw new NotTriangleException(a,b,c);
				System.out.println("Area="+trs[i].getArea());
				trs[i].showInfo();
			}
			catch(NotTriangleException e){
				System.out.println("Three sides cannot form a triangle");
			}
			i++;
		}
	}
}
