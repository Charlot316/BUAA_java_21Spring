import java.util.Scanner;

public class JudgeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		String s=new String();
		s=reader.nextLine();
		int i=0,j=0;
		if(s.length()>=1) {//先判断长度
			for(i=0;i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9';i++){//判断字符
			}
			if(i==s.length()) {//
				if(s.charAt(0)=='0'&&s.length()>1) //判断是否是一个没有前导 0 的无符号整数；如果是，则还要判断该数字是否是一个回文数
					System.out.println("这个字符串有前导零");
				else if(s.charAt(0)!='0'){//没有前导零
					for(i=0,j=s.length()-1;i<j;i++,j--) {
						if(s.charAt(i)!=s.charAt(j)) {//若不符合回文字符串
							break;
						}
					}
					if(s.charAt(i)==s.charAt(j)) {
						System.out.println("这是一个回文数");
					}
					else System.out.println("这不是一个回文数");
				}
				else System.out.println("这是一个回文数");
			}
			else System.out.println("这个字符串有其他字符");
		}
		else System.out.println("字符串长度小于1");
	}
}
