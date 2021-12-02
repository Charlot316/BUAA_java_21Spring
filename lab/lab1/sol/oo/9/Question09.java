public class Question09 {
    public static String unicodeFormOf(char ch)
    {
        String convert=Integer.toHexString((int)ch);
        String ans="\\u";
        int i=convert.length();
        while(i<4)
        {
            ans=ans+"0";
            i++;
        }
        ans=ans+convert;
        return ans;
    }
    public static void main(String args[]) {
        char c = '冲';
        System.out.println(unicodeFormOf(c));
        c = 'a';
        System.out.println(unicodeFormOf(c));
    }
}
