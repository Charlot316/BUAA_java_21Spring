public class Stars {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int i,j;
        for(i=0;i<a;i++)
        {
            for(j=0;j<a-Math.abs(a/2-Math.abs(a/2-i));j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<(a-2*Math.abs(a/2-i));j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
