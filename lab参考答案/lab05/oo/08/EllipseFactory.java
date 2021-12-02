public class EllipseFactory implements IShapeFactory{
	public Shape makeShape(double a, double b) {
		Shape p=new Ellipse(a,b);
		return p;
	}
}