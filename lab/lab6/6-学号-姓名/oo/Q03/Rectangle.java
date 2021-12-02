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
