import java.io.*;
public class FileAddNumber {
	public static void main(String[] args) {
		String s1="input.txt";
		String s2="out.txt";
		try{
			addLineNo(s1,s2);
		}catch(IOException e) {}
		
	}
	public static void addLineNo(String inputpath,String outpath) throws IOException{
		File f1 = new File(inputpath);
		File f2 = new File(outpath);
		String input="File f = new File(\"D:\\\\java\");\n"+
		"System.out.println(\"当前文件是：\" +f);//这条注释不用处理\n"+
		"//文件是否存在\n"+"System.out.println(\"判断是否存在：\"+f.exists());\n"+
		"//是否是文件夹\n"+"System.out.println(\"判断是否是文件夹：\"+f.isDirectory());\n";
		f1.createNewFile();
        BufferedWriter fwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1), "UTF-8"));
        fwriter.write(input);
        fwriter.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));
        byte[] bytes = new byte[1024];
        String s = new String(bytes,"UTF-8");
        int i=1;
		//处理
		f2.createNewFile();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2), "UTF-8"));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));
		
		BufferedWriter fwriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2), "UTF-8"));
		while((s = br1.readLine())!=null){
			s=i+"."+s;
			fwriter1.write(s);
			fwriter1.write("\n");
			fwriter1.flush();
			i++;
        }
		br.close();
        br1.close();
        br2.close();
	}
}
