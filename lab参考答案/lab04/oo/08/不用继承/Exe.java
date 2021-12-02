import java.text.SimpleDateFormat;
import java.util.Date;

public class Exe {
    private String name="Default";
    private String time;
    final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int size = 0;
    private String s;
    private FileFolder location;

    Exe(){
        time= df.format(new Date());
        s="";
        location = FileFolder.getWorkPath();
        location.UpdateCnt(1);
        location.UpdateSize(size);
        location.getExes().add(this);
    }
    Exe(String name,String s,int size){
        this.name = name;
        time= df.format(new Date());
        this.size = size;
        this.s=s;
        this.location = FileFolder.getWorkPath();
        location.UpdateCnt(1);
        location.UpdateSize(size);
        location.getExes().add(this);
    }

    public String Open(){
        System.out.println(s);
        return s;
    }
}
