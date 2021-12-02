class MyPrintStream{
    //执行实际输出时可直接调用System.out.println();
    public void println(String string) {
        System.out.println(string);
    }
}

class MySystem{
    public static MyPrintStream out = new MyPrintStream();
}

public class SystemOutDemo {
    public static void main(String[] args){
        MySystem.out.println("hello");
    }
}
