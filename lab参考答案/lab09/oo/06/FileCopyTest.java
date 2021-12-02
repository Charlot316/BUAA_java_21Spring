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
		"System.out.println(\"当前文件是：\" +f);//这条注释不用处理\n"+
		"//文件是否存在\n"+"System.out.println(\"判断是否存在：\"+f.exists());\n"+
		"//是否是文件夹\n"+"System.out.println(\"判断是否是文件夹：\"+f.isDirectory());\n"+
		"       //这个也不需要处理，因为该行的开头是空格";
        BufferedWriter fwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1), "UTF-8"));
        fwriter.write(input);
        fwriter.flush();
        FileInputStream in=new FileInputStream(f1);
        FileOutputStream out=new FileOutputStream(f2);
		//处理
		f2.createNewFile();
		while((c=in.read())!=-1) {
			out.write(c);
		}
		in.close();
        out.close();
	}
}
