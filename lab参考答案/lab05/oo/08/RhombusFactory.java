public class RhombusFactory implements IShapeFactory{
	public Shape makeShape(double a, double b) {
		Shape p=new Rhombus(a,b);
		return p;
	}
}