class Rhombus extends Shape {
	private static Rhombus rhombus=new Rhombus();
	private Rhombus(){
	}
	Rhombus(double aa,double bb){
		setA(aa);
		setB(bb);
	}
	public double calcArea() {
		return a*b/2;
	}
	
	private static IShapeFactory factory;
	
	public static IShapeFactory getFactory() {
		return factory;
	}
	public static void setFactory(IShapeFactory factory) {
		factory = new IShapeFactory() {
			public Shape makeShape(double a, double b) {
				Shape shape;
				if(a<=0||b<=0) {
					shape=null;
					System.out.println("shape is null!");
				}
				else {
					shape=Rhombus.rhombus;
					shape.setA(a);
					shape.setB(b);
					System.out.println(shape.calcArea());
				}
				return shape;
			}
		};
		Rhombus.factory=factory;
	}
}