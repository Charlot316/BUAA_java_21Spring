public class Calculate {
    public static int add(int a,int b) throws NumberRangeException//add operation
    {
        if(a>10 || a<-10) throw  new NumberRangeException(a);
        else if(b>10 || b<-10) throw  new NumberRangeException(b);
        else return a+b;
    }
    public static int minus(int a,int b)throws NumberRangeException//minus operation
    {
        if(a>10 || a<-10) throw  new NumberRangeException(a);
        else if(b>10 || b<-10) throw  new NumberRangeException(b);
        else return a-b;
    }
}
