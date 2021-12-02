import java.util.ArrayList;

public class File {
    public static String currentPath;
    String name;
    String time;
    int size;
    String content;
    String path;
    File(){
    }
    public void open()
    {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
class Folder extends File{
    ArrayList<File> files=new ArrayList<>();
    int foldercount;
    int filecount;
    Folder(String path){
        super();
        super.size=0;
        this.filecount=0;
        this.foldercount=0;
        super.path=path;
    }
    void addfile(ExecutableFile file)
    {
        this.files.add(file);
        super.size+=file.size;
        filecount++;
        file.path=super.path+"/"+file.name;
    }
    void addfile(UnExecutableFile file)
    {
        this.files.add(file);
        super.size+=file.size;
        filecount++;
        file.path=super.path+"/"+file.name;
    }
    void addfile(Folder file)
    {
        this.files.add(file);
        super.size+=file.size;
        foldercount++;
        file.path=super.path+"/"+file.name;
    }
    void addfile(ShortCut file)
    {
        this.files.add(file);
        super.size+=file.size;
        filecount++;
        file.path=super.path+"/"+file.name;
    }
    public void open(int index)
    {
        files.get(index).open();
        File.currentPath=super.path;
    }
}
class ShortCut extends File{
    File target;
    ShortCut(File file){
        super();
        this.target=file;
    }
    public void open()
    {
        if(target!=null) target.open();
        else{
            System.out.println("File not exists");
        }
    }
}
class ExecutableFile extends File{
    ExecutableFile(){
    }
    public void open()
    {
        System.out.println("File operating");
    }

}

class UnExecutableFile extends File{
    UnExecutableFile(){
    }
    public void open(String method)
    {
        if(!method.equals("correct"))
        System.out.println("File cannot open");
        else{
            System.out.println("File opens");
        }
    }

}