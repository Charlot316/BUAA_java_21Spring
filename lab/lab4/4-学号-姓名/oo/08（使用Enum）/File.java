import java.util.ArrayList;

public enum File {
    Folder("文件夹", 1), ShortCut ("快捷方式", 2), ExecutableFile("可执行文件", 3), UnExecutableFile("不可执行文件", 4);
    public static String currentPath;
    String name;
    String time;
    int size;
    String content;
    String path;
    String type;
    int folderCount;
    int fileCount;
    File target;
    ArrayList<File> files=new ArrayList<>();
    int typeindex;
    File(String type,int typeindex){
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTypeindex() {
        return typeindex;
    }

    public void setTypeindex(int typeindex) {
        this.typeindex = typeindex;
    }
    void addfile(File file)
    {
        if (this.typeindex==1)
        {
            this.files.add(file);
            this.size+=file.size;
            file.path=this.path+"/"+file.name;
            if(file.typeindex==1)
            {
                this.folderCount++;
            }
            else
            {
                this.fileCount++;
            }
        }
    }
    void setTarget(File file)
    {
        if(this.typeindex==2)
        {
            this.target=file;
        }
    }
    void open(File file)
    {
        if(file.typeindex==1)
        {
            currentPath= file.path;
        }
        else if(file.typeindex==2)
        {
            this.target.open(this.target);
        }
        else if(file.typeindex==3)
        {
            System.out.println("File operating");
        }
        else if(file.typeindex==4)
        {
            System.out.println("File cannot open");
        }
    }
}
