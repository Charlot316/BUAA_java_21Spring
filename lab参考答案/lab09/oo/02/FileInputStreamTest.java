import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        File f =new File("hello.txt");
        byte [] a="abcd".getBytes();
        try{
            FileOutputStream out=new FileOutputStream(f);
            out.write(a);
            out.close();
            FileInputStream in=new FileInputStream(f);
            byte [] tom= new byte[3];
            //Part Ⅰ
            int m = in.read(tom,0,3);
            System.out.println(m);
            String s=new String(tom,0,3);
            System.out.println(s);
            //Part Ⅱ
            m = in.read(tom,0,3);
            System.out.println(m);
            s=new String(tom,0,3);
            System.out.println(s);
        }
        catch(IOException e) {}
    }
}
