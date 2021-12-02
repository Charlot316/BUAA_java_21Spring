class Rectangle extends Shape {
	private static Rectangle rectangle=new Rectangle();
	private Rectangle(){
	}
	public double calcArea() {
		return a*b;
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
					shape=Rectangle.rectangle;
					shape.setA(a);
					shape.setB(b);
					System.out.println(shape.calcArea());
				}
				return shape;
			}
		};
		Rectangle.factory=factory;
	}
}