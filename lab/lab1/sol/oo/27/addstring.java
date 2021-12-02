public class addstring {
    public static String strscat(String...args){
        String a="";
        for(int i=0;i<args.length;i++){
            a+=args[i];
        }
        return a;
    }
    public static void main(String args[]) {
        System.out.print(strscat(new String[]{"a", "b"}));
        System.out.print(strscat("str"));
    }
}
