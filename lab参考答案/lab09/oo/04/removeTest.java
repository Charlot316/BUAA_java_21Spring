import java.io.*;
public class removeTest {
	public static void main(String[] args) {
		String s1="input.txt";
		String s2="out.txt";
		try{
			removeComments(s1,s2);
		}catch(IOException e) {}
	}
	public static void removeComments(String input, String output) throws IOException{
		File f1 = new File(input);
		File f2 = new File(output);
		f1.createNewFile();
		String input1="File f = new File(\"D:\\\\java\");\n"+
		"System.out.println(\"当前文件是：\" +f);//这条注释不用处理\n"+
		"//文件是否存在\n"+"System.out.println(\"判断是否存在：\"+f.exists());\n"+
		"//是否是文件夹\n"+"System.out.println(\"判断是否是文件夹：\"+f.isDirectory());\n"+
		"       //这个也不需要处理，因为该行的开头是空格";
        BufferedWriter fwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1), "UTF-8"));
        fwriter.write(input1);
        fwriter.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));
        byte[] bytes = new byte[1024];
        String s = new String(bytes,"UTF-8");
		//处理
		f2.createNewFile();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2), "UTF-8"));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));
		
		BufferedWriter fwriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2), "UTF-8"));
		while((s = br1.readLine())!=null){
			if(!(s.charAt(0)=='/'&&s.charAt(1)=='/')){
				fwriter1.write(s);
				fwriter1.write("\n");
				fwriter1.flush();
			}
        }
		br.close();
        br1.close();
        br2.close();
	}
}
