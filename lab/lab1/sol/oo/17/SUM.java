public class SUM {
    public static void main(String args[]) {
        int i=0;
        double sum=0,factorial=1;
        do{
            i++;
            factorial*=i;
            sum+=1/factorial;
        }while(i<20);
        System.out.println("do-while:"+sum);

        i=0;sum=0;factorial=1;

        for(i=1;i<=20;i++) {
            factorial*=i;
            sum+=1/factorial;
        }
        System.out.println("for:"+sum);
    }
}
