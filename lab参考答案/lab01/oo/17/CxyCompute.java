public class CxyCompute {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum1=0.0,sum2=0.0;
		double a1=1.0,a2=1.0;
		int i=1;
		do
		{
			a1=(double)i*a1;
			sum1=sum1+1.0/a1;
			i++;
		}while(i<=20);
		
		for(i=1;i<=20;i++) {
			a2=(double)i*a2;
			sum2=sum2+1.0/a2;
		}
		System.out.println("do-whileѭ��������Ϊ��"+sum1);
		System.out.println("forѭ��������Ϊ��"+sum2);
	}
}