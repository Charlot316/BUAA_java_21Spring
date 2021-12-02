public class Exe extends File {
    Exe(){
        super();
        location.getFileList().add((File)this);
    }
    Exe(String name,String s,int size){
        super(name,s,size);
        location.getFileList().add((File)this);
    }

    public String Open(){
        System.out.println(s);
        return s;
    }
}
