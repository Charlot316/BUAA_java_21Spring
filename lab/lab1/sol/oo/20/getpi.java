public class getpi {
    public static double getPi(int n){
        if(n<0) n=0;
        int i;
        double pi=0;
        for(i=0;i<=n;i++){
            pi+=Math.pow(-1,(double)i)/(double)(2*i+1);
        }
        pi*=4;
        return pi;
    }
    public static void main(String args[]) {
        int n=2000;
        System.out.println(getPi(n));
    }
}
