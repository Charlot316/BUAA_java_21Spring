import java.util.Scanner;

public class ShapeFactoryTest {

	public static void main(String[] args) {
		double a1,b1;
		double a2,b2;
		double a3,b3;
		IShapeFactory factory1 = null;
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		a1=reader.nextDouble();
		b1=reader.nextDouble();
		
		Rectangle.setFactory(factory1);
		Rectangle.getFactory().makeShape(a1, b1);
		
		a2=reader.nextDouble();
		b2=reader.nextDouble();
		Rhombus.setFactory(factory1);
		Rhombus.getFactory().makeShape(a2, b2);
		
		a3=reader.nextDouble();
		b3=reader.nextDouble();
		Ellipse.setFactory(factory1);
		Ellipse.getFactory().makeShape(a3, b3);

	}

}
