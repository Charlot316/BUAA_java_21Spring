class Ellipse extends Shape {
	private static Ellipse ellipse=new Ellipse();
	private Ellipse(){
	}
	Ellipse(double aa,double bb){
		setA(aa);
		setB(bb);
	}
	public double calcArea() {
		return a*b*3.14;
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
					shape=Ellipse.ellipse;
					shape.setA(a);
					shape.setB(b);
					System.out.println(shape.calcArea());
				}
				return shape;
			}
		};
		Ellipse.factory=factory;
	}
}