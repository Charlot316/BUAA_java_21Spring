import java.util.Scanner;

public class JudgeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		String s=new String();
		s=reader.nextLine();
		int i=0,j=0;
		if(s.length()>=1) {//���жϳ���
			for(i=0;i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9';i++){//�ж��ַ�
			}
			if(i==s.length()) {//
				if(s.charAt(0)=='0'&&s.length()>1) //�ж��Ƿ���һ��û��ǰ�� 0 ���޷�������������ǣ���Ҫ�жϸ������Ƿ���һ��������
					System.out.println("����ַ�����ǰ����");
				else if(s.charAt(0)!='0'){//û��ǰ����
					for(i=0,j=s.length()-1;i<j;i++,j--) {
						if(s.charAt(i)!=s.charAt(j)) {//�������ϻ����ַ���
							break;
						}
					}
					if(s.charAt(i)==s.charAt(j)) {
						System.out.println("����һ��������");
					}
					else System.out.println("�ⲻ��һ��������");
				}
				else System.out.println("����һ��������");
			}
			else System.out.println("����ַ����������ַ�");
		}
		else System.out.println("�ַ�������С��1");
	}
}
