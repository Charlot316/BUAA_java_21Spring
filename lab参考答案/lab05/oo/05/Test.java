public class Test {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��д�����ࣺ
		//-ʹ�����ϵ�����������״�ķ�ʽ���ֱ�������������״���洢��Shape���͵����飨��������������
		//���ʹ��foreachѭ�������ǵ�������
		Shape[] p1 = new Shape[5];
		Shape[] p2 = new Shape[5];
		ShapeType type1=ShapeType.Rectangle;
		ShapeType type2=ShapeType.Rhombus;
		ShapeType type3=ShapeType.Ellipse;
		
		p1[0]=ShapeFactory.makeShape(type1, -1, 3);
		p1[1]=ShapeFactory.makeShape(type2, 4, 3);
		p1[2]=ShapeFactory.makeShape(type2, 6, 7);
		p1[3]=ShapeFactory.makeShape(type1, 2, 3);
		p1[4]=ShapeFactory.makeShape(type3, 5, 5);
		//public Shape makeShape(ShapeType type, double a, double b)new Rectangle(2.3,4);
		for(Shape i:p1) {
			if(i!=null)
				System.out.println(i.calcArea());
			else System.out.println("exception");
		}
		
		for(int i=0;i<5;i++) {
			p2[i]=ShapeFactory.randomNextShape();
		}
		for(Shape i:p2) {
			if(i!=null)
				System.out.println(i.calcArea());
			else System.out.println("exception");
		}
	}
}
