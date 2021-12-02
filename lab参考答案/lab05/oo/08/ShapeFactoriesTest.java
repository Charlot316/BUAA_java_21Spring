public class ShapeFactoriesTest {
	static Shape makeShape(IShapeFactory factory, double a, double b) {
		return factory.makeShape(a, b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleFactory re=new RectangleFactory();
		RhombusFactory rh=new RhombusFactory();
		EllipseFactory el=new EllipseFactory();
		IShapeFactory[] ish=new IShapeFactory[3];
		ish[0]=re;
		ish[1]=rh;
		ish[2]=el;
		for(IShapeFactory i:ish) {
			//ShapeFactories.makeShape
			double aa=Math.random()*10;
			double bb=Math.random()*10;
			if(aa<=0||bb<=0)
				System.out.println("exception");
			else 
				System.out.println(i.makeShape(aa,bb).calcArea());
		}
	}

}