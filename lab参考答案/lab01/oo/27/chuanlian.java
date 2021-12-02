
public class chuanlian {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= strscat("c","x","y","x","x","n");
		System.out.println(s);
		String s1=strscat(new String[] {"ccc","xxx"});
		System.out.println(s1);
	}
	public static String strscat(String... args) {
		String ss=new String("");
		for(String pa:args)
		{
			ss=ss+pa;
		}
		return ss;
	}
}
