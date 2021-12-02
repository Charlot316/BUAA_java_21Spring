
public class SnakeCaseProcessor implements ITextProcess{
	public String process(String s) {
		String be=" ";
		String af=" ";
		int len=s.length();
		int i=0,j=len-1;
		while(s.charAt(i)==' '&&i<len){
			be+=" ";
			i++;
		}
		while(s.charAt(j)==' '&&j>=0) {
			j--;
			af+=" ";
		}
		String s1=s.trim();
		s1=s1.replace(" ", "_");
		if(i!=0)
			s1=be+s1;
		if(j!=len-1)
			s1=s1+af;
		return s1;
	}
}
