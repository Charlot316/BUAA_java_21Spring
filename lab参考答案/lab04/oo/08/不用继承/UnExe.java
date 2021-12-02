import java.text.SimpleDateFormat;
import java.util.Date;

public class UnExe {
    private String name="Default";
    private String time;
    final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int size = 0;
    private String s;
    private FileFolder location;

    UnExe(){
        time= df.format(new Date());
        s="";
        location = FileFolder.getWorkPath();
        location.getUnexes().add(this);
        location.UpdateCnt(1);
        location.UpdateSize(size);
    }
    UnExe(String name,String s,int size){
        this.name = name;
        time= df.format(new Date());
        this.size = size;
        this.s=s;
        this.location = FileFolder.getWorkPath();
        location.UpdateCnt(1);
        location.UpdateSize(size);
        location.getUnexes().add(this);
    }

    public void Open(){
        System.out.println("Fail to Open");
    }
    public String Open(Exe exe){
        System.out.println(s);
        return s;
    }
}
