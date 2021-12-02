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