public class Square {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int i;
        for(i=1;i<=a*a;i++)
        {
            System.out.print(i+" ");
            if(i%a==0)  System.out.print("\n");
        }
    }
}
