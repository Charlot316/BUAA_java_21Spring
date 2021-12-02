import java.util.Date;

public class UnExe extends File{
    UnExe(){
        super();
        location.getFileList().add((File)this);
    }
    UnExe(String name,String s,int size){
        super(name,s,size);
        location.getFileList().add((File)this);
    }

    public void Open(){
        System.out.println("Fail to Open");
    }
    public String Open(Exe exe){
        System.out.println(s);
        return s;
    }
}
