import java.io.*;
public class FileCopyTest {
	public static void main(String[] args) {
		String s1="source.txt";
		String s2="target.txt";
		try{
			copyFile(s1,s2);
		}catch(IOException e) {}
	}
	public static void copyFile(String sourceFile, String targetFile) throws IOException{
		File f1 = new File(sourceFile);
		File f2 = new File(targetFile);
		byte[] bytes = new byte[1024];
        String s = new String(bytes,"UTF-8");
        int c=0;
		f1.createNewFile();
		String input="File f = new File(\"D:\\\\java\");\n"+
		"System.out.println(\"��ǰ�ļ��ǣ�\" +f);//����ע�Ͳ��ô���\n"+
		"//�ļ��Ƿ����\n"+"System.out.println(\"�ж��Ƿ���ڣ�\"+f.exists());\n"+
		"//�Ƿ����ļ���\n"+"System.out.println(\"�ж��Ƿ����ļ��У�\"+f.isDirectory());\n"+
		"       //���Ҳ����Ҫ������Ϊ���еĿ�ͷ�ǿո�";
        BufferedWriter fwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1), "UTF-8"));
        fwriter.write(input);
        fwriter.flush();
        FileInputStream in=new FileInputStream(f1);
        FileOutputStream out=new FileOutputStream(f2);
		//����
		f2.createNewFile();
		while((c=in.read())!=-1) {
			out.write(c);
		}
		in.close();
        out.close();
	}
}
