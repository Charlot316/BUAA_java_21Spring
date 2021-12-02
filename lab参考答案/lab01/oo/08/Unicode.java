public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char a = 'a';
//		char b = '冲';
		char c = '他';
		char a = '你';
		char b = '我';
		
		//System.out.println("\\u");
		System.out.println("'你'的十六进制位的Unicode编码是"+unicodeFormOf(a));
		System.out.println("'我'的十六进制位的Unicode编码是"+unicodeFormOf(b));
		System.out.println("'他'的十六进制位的Unicode编码是"+unicodeFormOf(c));
	}
	public static String unicodeFormOf(char ch) {
		String s=String.valueOf(Integer.toHexString((int)ch));
		int l=s.length();
		if(l==1)
		{
			s="000"+s;
		}
		else if(l==2)
		{
			s="00"+s;
		}
		else if(l==3)
		{
			s="0"+s;
		}
		s="\\"+"u"+s;
		return s;
	}
}

