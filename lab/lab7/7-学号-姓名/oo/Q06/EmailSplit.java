import java.util.HashMap;
import java.util.Map;

public class EmailSplit {
    public static void main(String[] args)
    {
        String str = "aa@sohu.com,bb@163.com,cc@sina.com";
        Map<String, String> emailMap = new HashMap<String, String>();
        String []address=str.split(",");
        for(String i:address){
            String []splited=i.split("@");
            emailMap.put(splited[0],splited[1]);
        }
        System.out.println(emailMap.toString());
    }
}