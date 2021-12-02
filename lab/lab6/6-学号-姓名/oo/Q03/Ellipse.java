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
