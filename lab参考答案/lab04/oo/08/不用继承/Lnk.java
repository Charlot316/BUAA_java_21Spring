import java.util.Date;
import java.text.SimpleDateFormat;


public class Lnk {
    private String name="Default";
    private String time;
    final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int size = 0;
    private String s;
    private FileFolder location;
    private FileFolder PointerOFFF = null;
    private Lnk PointerOFLnk = null;
    private Exe PointerOFExe = null;
    private UnExe PointerOFUnExe = null;

    Lnk(){
        time= df.format(new Date());
        s="";
        location = FileFolder.getWorkPath();
        location.UpdateCnt(1);
        location.UpdateSize(size);
    }
    Lnk(String name,String s,int size,FileFolder PoiOFFF){
        this.name = name;
        time= df.format(new Date());
        this.size = size;
        this.s=s;
        this.location = FileFolder.getWorkPath();
        this.PointerOFFF = PoiOFFF;
        location.UpdateCnt(1);
        location.UpdateSize(size);
        location.getLnks().add(this);
    }
    Lnk(String name,String s,int size,Lnk PoiOFLnk){
        this.name = name;
        time= df.format(new Date());
        this.size = size;
        this.s=s;
        this.location = FileFolder.getWorkPath();
        this.PointerOFLnk = PoiOFLnk;
        location.UpdateCnt(1);
        location.UpdateSize(size);
        location.getLnks().add(this);
    }
    Lnk(String name,String s,int size,Exe PoiOFExe){
        this.name = name;
        time= df.format(new Date());
        this.size = size;
        this.s=s;
        this.location = FileFolder.getWorkPath();
        this.PointerOFExe = PoiOFExe;
        location.UpdateCnt(1);
        location.UpdateSize(size);
        location.getLnks().add(this);
    }
    Lnk(String name,String s,int size,UnExe PoiOFUnExe){
        this.name = name;
        time= df.format(new Date());
        this.size = size;
        this.s=s;
        this.location = FileFolder.getWorkPath();
        this.PointerOFUnExe = PoiOFUnExe;
        location.UpdateCnt(1);
        location.UpdateSize(size);
        location.getLnks().add(this);
    }

    public void setLocation(FileFolder location) {
        this.location.UpdateCnt(-1);
        this.location.UpdateSize(-this.size);
        this.location = location;
        this.location.UpdateCnt(1);
        this.location.UpdateSize(this.size);
    }
    public FileFolder OpenFF(){
        if(PointerOFFF == null)
            System.out.println("文件不存在");
        return PointerOFFF;
    }
    public Lnk OpenLnk(){
        if(PointerOFLnk == null)
            System.out.println("文件不存在");
        return PointerOFLnk;
    }
    public Exe OpenExe(){
        if(PointerOFExe == null)
            System.out.println("文件不存在");
        return PointerOFExe;
    }
    public UnExe OpenUnExe(){
        if(PointerOFUnExe == null)
            System.out.println("文件不存在");
        return PointerOFUnExe;
    }
}
