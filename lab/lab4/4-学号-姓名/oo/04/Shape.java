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

class Test {
    public static void main (String[] args) {
        Shape a = new Ellipse(2, 3);
        Shape b = new Rhombus(2, 3);
        Shape c = new Rectangle(2, 3);
        System.out.println(a.calcArea());
        System.out.println(b.calcArea());
        System.out.println(c.calcArea());
    }
}