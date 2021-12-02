测试入口为TestShape.java

```java
public class TestShape {
    public static void main (String[] args) {
        int count=100;//随机生成100个形状
        for (int i=0;i<count;i++) {
            int randomA = 1 + (int) (Math.random() * 100);//随机生成a
            int randomB = 1 + (int) (Math.random() * 100);//随机生成b
            int randomShape = 1 + (int) (Math.random() * 3);//指定生成的形状
            switch (randomShape){//在switch语句中根据指定形状的不同调用不同的工厂
                case 1:
                    System.out.println(Rectangle.getFactory().makeShape(randomA, randomB));
                    break;
                case 2:
                    System.out.println(Rhombus.getFactory().makeShape(randomA, randomB));
                    break;
                default:
                    System.out.println(Ellipse.getFactory().makeShape(randomA, randomB));
                    break;
            }
        }
    }
}
```

接口内容：

```java
public interface IShapeFactory{
    Shape makeShape(double a, double b);
}
```

形状父类：

```java
public abstract class Shape  {

    private double a;
    private double b;

    public Shape(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    abstract public double calcArea();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        if (a < 0) a = 0.0;
        this.a = a;
    }

    public void setB(double b) {
        if (b < 0) b = 0.0;
        this.b = b;
    }
}
```

三个子类：

```java
public class Ellipse extends Shape {
    private Ellipse(double a, double b) {
        super(a, b);
    }
    private static IShapeFactory factory=new IShapeFactory() {
        public Shape makeShape(double a, double b){
            if(a<0||b<0) return null;
            else return new Ellipse(a,b);
        }
    };
    public static IShapeFactory getFactory(){
        return factory;
    }
    public double calcArea() {
        return super.getA() * super.getB() * Math.PI;
    }
    @Override
    public String toString() {
        return "Ellipse a="+super.getA()+" b="+super.getB()+" area="+this.calcArea();
    }
}
```

```java
public class Rectangle extends Shape{
    private Rectangle(double a, double b) {
        super(a, b);
    }
    private static IShapeFactory factory=new IShapeFactory() {
        public Shape makeShape(double a, double b){
            if(a<0||b<0) return null;
            else return new Rectangle(a,b);
        }
    };
    public static IShapeFactory getFactory(){
        return factory;
    }
    public double calcArea() {
        return super.getA() * super.getB();
    }

    @Override
    public String toString() {
        return "Rectangle a="+super.getA()+" b="+super.getB()+" area="+this.calcArea();
    }
}
```

```java
public class Rhombus extends Shape{
    private Rhombus(double a, double b) {
        super(a, b);
    }
    private static IShapeFactory factory=new IShapeFactory() {
        @Override
        public Shape makeShape(double a, double b){
            if(a<0||b<0) return null;
            else return new Rhombus(a,b);
        }
    };
    public static IShapeFactory getFactory(){
        return factory;
    }
    public double calcArea() {
        return super.getA() * super.getB() / 2;
    }
    @Override
    public String toString() {
        return "Rhombus a="+super.getA()+" b="+super.getB()+" area="+this.calcArea();
    }
}
```