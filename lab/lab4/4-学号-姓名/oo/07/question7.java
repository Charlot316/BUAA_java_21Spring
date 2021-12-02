class A{
    public int a;
    static {
        System.out.println("父类被加载");
    }
    public A() {
        System.out.println("a="+a);
        this.a=1;
        System.out.println("父类对象被构建");
    }
}
class B extends A {
    public int b=1;
    public int c;
    static {
        System.out.println("子类被加载");
    }
    public B() {
        System.out.println("a="+a+"b="+b+"c="+c);
        super.a=2;
        this.b=2;
        this.c=3;
        System.out.println("a="+a+"b="+b+"c="+c);
        System.out.println("子类对象被构建");
    }
}
public class question07{
    public static void main(String[] args) {
        B b =new B();
    }
}