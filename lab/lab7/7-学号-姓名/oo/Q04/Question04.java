import java.util.ArrayList;
import java.util.List;

public class Question04 {
    public static void main(String[] args){
        List<Integer> tempList=new ArrayList<>();
        int []a=new int[10];
        for(int i=0;i<10;i++){
            int temp=(int) (Math.random()*(100-1)+1);
            a[i]=temp;
            if(temp>=50) {
                tempList.add(temp);
                System.out.println(temp);
            }
        }
    }
}
