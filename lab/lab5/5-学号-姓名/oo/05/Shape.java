import java.util.ArrayList;

class ShapeFactory{
    
    public Shape randomNextShape()
    {
        int randomshape=1+(int)(Math.random()*3);
        ShapeType type;
        switch(randomshape){
            case 1:
                type=ShapeType.Rectangle;
                break;
            case 2:
                type=ShapeType.Rhombus;
                break;
            case 3:
                type=ShapeType.Ellipse;
                break;
            default:
                type=ShapeType.Ellipse;
                break;
        }
        double randoma=(Math.random()*100);
        double randomb=(Math.random()*100);
        return this.makeShape(type,randoma,randomb);
    }
    enum ShapeType{
        Rectangle(1),Rhombus(2),Ellipse(3);
        int index;
        ShapeType(int index) {
            this.index = index;
        }
    }
    public Shape makeShape(ShapeType type, double a, double b)
    {
        Shape temp;
        switch(type){
            case Rectangle:
                return temp = new Rectangle(a,b);
            case Ellipse:
                return temp = new Ellipse(a,b);
            case Rhombus:
                return temp = new Rhombus(a,b);
            default:
                return null;
        }
    }
}

public abstract class Shape {
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

class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    public double calcArea() {
        return super.getA() * super.getB();
    }
}

class Rhombus extends Shape {
    public Rhombus(double a, double b) {
        super(a, b);
    }

    public double calcArea() {
        return super.getA() * super.getB() / 2;
    }
}

class Ellipse extends Shape {
    public Ellipse(double a, double b) {
        super(a, b);
    }

    public double calcArea() {
        return super.getA() * super.getB() * Math.PI;
    }
}

class TestShape {
    public static void main (String[] args) {
        ShapeFactory factory = new ShapeFactory();
        int count=5;
        ArrayList<Shape> tempList =new ArrayList<>();
        for(int i=0;i<count;i++)
        {
            tempList.add(factory.randomNextShape());
        }
        for(int i=0;i<count;i++)
        {
            int randomshape=1+(int)(Math.random()*3);
            ShapeFactory.ShapeType type;
            switch(randomshape){
                case 1:
                    type= ShapeFactory.ShapeType.Rectangle;
                    break;
                case 2:
                    type= ShapeFactory.ShapeType.Rhombus;
                    break;
                case 3:
                    type= ShapeFactory.ShapeType.Ellipse;
                    break;
                default:
                    type= ShapeFactory.ShapeType.Ellipse;
                    break;
            }
            double randoma=(Math.random()*100);
            double randomb=(Math.random()*100);
            tempList.add(factory.makeShape(type,randoma,randomb));
        }
        for(Shape x:tempList){
            System.out.println(x.calcArea());
        }
    }
}