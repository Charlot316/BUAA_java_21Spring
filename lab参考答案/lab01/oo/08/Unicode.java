public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char a = 'a';
//		char b = '��';
		char c = '��';
		char a = '��';
		char b = '��';
		
		//System.out.println("\\u");
		System.out.println("'��'��ʮ������λ��Unicode������"+unicodeFormOf(a));
		System.out.println("'��'��ʮ������λ��Unicode������"+unicodeFormOf(b));
		System.out.println("'��'��ʮ������λ��Unicode������"+unicodeFormOf(c));
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

