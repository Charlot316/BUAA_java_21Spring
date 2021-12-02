import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class FileFolder {
    private String name="Default";
    private String time;
    final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int size = 0;
    private String s;
    private FileFolder location;
    private int cnt = 0;
    private final static FileFolder root = new FileFolder("C:","",null);
    private static FileFolder WorkPath = root;
    private ArrayList<FileFolder>FileFolders = new ArrayList<FileFolder>();
    private ArrayList<Lnk>lnks = new ArrayList<Lnk>();
    private ArrayList<Exe>exes = new ArrayList<Exe>();
    private ArrayList<UnExe>unexes = new ArrayList<UnExe>();

    FileFolder(){
        time= df.format(new Date());
        s="";
        location = FileFolder.getWorkPath();
        location.getFileFolders().add(this);
    }
    FileFolder(String name,String s){
        this.name = name;
        time= df.format(new Date());
        this.size = 0;
        this.s=s;
        location = FileFolder.getWorkPath();
        if(location != null)
            location.UpdateCnt(1);
        location.getFileFolders().add(this);
    }
    FileFolder(String name,String s,FileFolder Path){
        this.name = name;
        time= df.format(new Date());
        this.size = 0;
        this.s=s;
        this.location = Path;
        if(this.location != null)
            this.location.UpdateCnt(1);
        location.getFileFolders().add(this);
    }

    public void UpdateSize(int size){
        this.size+=size;
        if(this.location!=null)
            this.location.UpdateSize(size);
    }
    public void UpdateCnt(int cnt){
        this.cnt+=cnt;
    }
    public void Open(){
        WorkPath = this;
    }
    static public FileFolder getWorkPath(){
        return WorkPath;
    }
    static public FileFolder getRoot(){
        return root;
    }

    public void setLocation(FileFolder location) {
        this.location.UpdateCnt(-1);
        this.location.UpdateSize(-this.size);
        this.location = location;
        this.location.UpdateCnt(1);
        this.location.UpdateSize(this.size);
    }

    public String getName() {
        return name;
    }

    public ArrayList<FileFolder> getFileFolders() {
        return FileFolders;
    }

    public ArrayList<Lnk> getLnks() {
        return lnks;
    }

    public ArrayList<Exe> getExes() {
        return exes;
    }

    public ArrayList<UnExe> getUnexes() {
        return unexes;
    }
}
