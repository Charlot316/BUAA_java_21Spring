public class TestShape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle(2,3);
		Rhombus rhombus=new Rhombus(3,3);
		Ellipse ellipse=new Ellipse(3,4);
		Ellipse ellipse1=new Ellipse(-3, 3);
		System.out.println(rectangle.calcArea());
		
		System.out.println(rhombus.calcArea());
		
		System.out.println(ellipse.calcArea());

		System.out.println(ellipse1.calcArea());
	}
}
