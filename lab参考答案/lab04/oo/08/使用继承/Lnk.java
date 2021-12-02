public class Lnk extends File{
    private File pointer = null;

    Lnk(){
        super();
        location.getFileList().add((File)this);
    }
    Lnk(String name,String s,int size,File pointer){
        super(name,s,size);
        this.pointer = pointer;
        location.getFileList().add((File)this);
    }
    public File Open() {
        if (pointer == null)
            System.out.println("文件不存在");
        return pointer;
    }

}
