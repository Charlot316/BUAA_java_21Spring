import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoColorBall {
    public static void main(String[] args) {
        int bluePos = (int) (Math.random()*(7-1)+1);
        int blueValue =(int) (Math.random()*(16-1)+1);
        Map<Integer, String> redMap = new HashMap<>();
        for(int i =0;i<6;i++)
        {
            int redValue =(int) (Math.random()*(33-1)+1);
            while(redMap.containsKey(redValue)){
                redValue =(int) (Math.random()*(33-1)+1);
            }
            redMap.put(redValue,"红球");
        }
        int j=1;
        Iterator it = redMap.entrySet().iterator();
        while(it.hasNext()&&j!=bluePos) {
            Map.Entry obj = (Map.Entry)it.next();
            System.out.println(obj.getValue()+" "+obj.getKey());
            j++;
        }
        System.out.println("蓝球 "+blueValue);
        j++;
        while(it.hasNext()&&j!=bluePos) {
            Map.Entry obj = (Map.Entry)it.next();
            System.out.println(obj.getValue()+" "+obj.getKey());
            j++;
        }

    }
}