import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class TwoColorBall {

	public static void main(String[] args) {
		Map<Integer, String> twocolorball= new HashMap<Integer, String>();
		String red="ºìÉ«";
		String blue="À¶É«";
		int number=0;
		while(twocolorball.size()<5) {
			number=(int)(1+Math.random()*(33-1+1));
			twocolorball.put(number,red);
		}
		number=(int)(1+Math.random()*(16-1+1));
		Set<Integer> keys = twocolorball.keySet();
		for(Integer i:keys){
		    System.out.println(red+" "+i);
		}
		System.out.println(blue+" "+number);
		while(twocolorball.size()<7) {
			number=(int)(1+Math.random()*(33-1+1));
			twocolorball.put(number,red);
		}
		System.out.println(red+" "+number);
	}

}
