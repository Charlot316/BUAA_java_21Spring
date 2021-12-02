import java.util.ArrayList;
import java.util.List;
public class RandomNumber {
	public static void main(String[] args) {
		int[] a=new int[10];
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			a[i]=(int)(1+Math.random()*(100-1+1));
		}
		for(int i=0;i<10;i++) {
			if(a[i]>=50) {
				list.add(a[i]);
				System.out.print(a[i]+"\t");
			}
		}
	}
}