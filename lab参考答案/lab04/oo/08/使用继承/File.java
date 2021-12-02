import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class  File {
    protected String name="Default";
    protected String time;
    public final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected int size = 0;
    protected String s;
    protected FileFolder location;

    File(){
        time= df.format(new Date());
        s="";
        location = FileFolder.getWorkPath();
        location.UpdateCnt(1);
        location.UpdateSize(size);
    }
    File(String name,String s,int size){
        this.name = name;
        time= df.format(new Date());
        this.size = size;
        this.s=s;
        this.location = FileFolder.getWorkPath();
        location.UpdateCnt(1);
        location.UpdateSize(size);
    }

    public void setLocation(FileFolder location) {
        this.location.UpdateCnt(-1);
        this.location.UpdateSize(-this.size);
        this.location = location;
        if(this.location!=null) {
            this.location.UpdateCnt(1);
            this.location.UpdateSize(this.size);
        }
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public int getSize() {
        return size;
    }

    public String getS() {
        return s;
    }

    public FileFolder getLocation() {
        return location;
    }
}
