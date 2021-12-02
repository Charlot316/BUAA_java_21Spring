import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
    public void start() throws IOException{
        throw new IOException("Unable to open file");
    }
    public void open(String fileName)  throws FileNotFoundException{
        FileInputStream fis=new FileInputStream(fileName);
    }
    public static void main(String[] args){
        try{
            SubClass a=new SubClass();
            a.start();
        }catch (FileNotFoundException re){
            re.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}