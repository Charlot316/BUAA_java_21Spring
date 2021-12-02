import java.io.*;

public class copyDirectioryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="sourceDir";
		String s2="targetDir";
		try{
			copyDirectiory(s1,s2);
		}catch(IOException e) {}
	}
	public static void copyDirectiory(String sourceDir, String targetDir) throws IOException{
		File f1 = new File(sourceDir);
		if(!f1.exists())
			f1.mkdir();
		if (!(new File(targetDir)).exists()) {
            (new File(targetDir)).mkdir();
        }
		String[] files=f1.list();
		for (int i=0;i<files.length; i++) {
            if ((new File(sourceDir+f1.separator+files[i])).isDirectory())
            	copyDirectiory(sourceDir+f1.separator+files[i],targetDir+f1.separator+files[i]);
            if (new File(sourceDir+f1.separator+files[i]).isFile()) {
            	File oldFile=new File(sourceDir+f1.separator+files[i]);//oldPath
                File file = new File(targetDir+f1.separator+files[i]);//newPath
                FileInputStream in = new FileInputStream(oldFile);
                FileOutputStream out = new FileOutputStream(file);;
                byte[] buffer=new byte[2097152];

                while((in.read(buffer)) != -1){
                    out.write(buffer);
                }  
            }
		}
	}
}
