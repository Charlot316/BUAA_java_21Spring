import java.util.HashMap;
import java.util.Map;
public class EmailSplit {
    public static void main(String[] args)
    {
        String str = "aa@sohu.com,bb@163.com,cc@sina.com";
        Map<String, String> emailMap = new HashMap<String, String>();
        String[] str1=str.split(",");
        int len=str1.length;
        for(int i=0;i<len;i++) {
        	String[] str2=str1[i].split("@");
        	emailMap.put(str2[0],str2[1]);
        }
        System.out.println(emailMap.toString());
    }
}
