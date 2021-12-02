import java.util.ArrayList;

public class FileFolder extends File{
    private int cnt = 0;
    private final static FileFolder root = new FileFolder("C:","",null);
    private static FileFolder WorkPath = root;
    private ArrayList<File>FileList = new ArrayList<File>();
    final private String type = "FileFolder";

    FileFolder(){
        super();
        cnt = 0;
        location.getFileList().add((File)this);
    }
    FileFolder(String name,String s){
        super(name,s,0);
        location.getFileList().add((File)this);
    }
    FileFolder(String name,String s,FileFolder Path){
       super(name,s,0);
       this.setLocation(Path);
        location.getFileList().add((File)this);
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

    public ArrayList<File> getFileList() {
        return FileList;
    }

    public String getType() {
        return type;
    }

    public int getCnt() {
        return cnt;
    }
}
