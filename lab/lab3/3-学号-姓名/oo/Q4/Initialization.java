
class A {
    static
    {
        System.out.println("A类被加载");
    }
    static int value;
    public A(int i){
        value = i;
        System.out.println("initialize A"+i);
    }
    public static void presentValue(){
        System.out.println("my value is "+value);
    }

}

public class Initialization {
    public static void main(String[] args) {
        System.out.println("main begins");
        //A a9 = new A(9);
        //System.out.println(A.value);
        A.presentValue();
        System.out.println("main ends");
    }
}
