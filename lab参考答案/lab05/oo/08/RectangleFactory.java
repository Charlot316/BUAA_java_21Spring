public class RectangleFactory implements IShapeFactory{
	public Shape makeShape(double a, double b) {
		Shape p=new Rectangle(a,b);
		return p;
	}
}