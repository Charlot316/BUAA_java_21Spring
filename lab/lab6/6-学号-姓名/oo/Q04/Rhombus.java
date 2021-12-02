public class Rhombus extends Shape{

    private Rhombus(double a, double b) {
        super(a, b);
        super.name="Rhombus";
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
