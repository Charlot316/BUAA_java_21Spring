import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		ShapeSequence ss=new ShapeSequence(n);
		ss.add(new Rectangle(3,4));
		ss.add(new Rectangle(2,4));
		ss.add(new Rhombus(3,4));
		ss.add(new Ellipse(3,4));
		String s=ss.toString();
		System.out.println(s);
		ShapeSequence.SequenceIterator it1=ss.iterator();
		ShapeSequence.SequenceIterator it2=ss.iterator();
		System.out.println("it1==it2:"+(it1==it2));
		System.out.println("it1.equals(it2):"+it1.equals(it2));
		Shape sh1;
		while(!it1.isEnd()) {
			System.out.println(it1.iter);
			System.out.println(it1.isEnd());
			sh1=it1.current();
			System.out.print("a="+sh1.getA()+","+"b="+sh1.getB()+",");
			System.out.println("Area="+sh1.calcArea());
			it1.moveNext();
		}
		System.out.println(it1.iter);
		System.out.println(it1.isEnd());
		if(!it1.isEnd()) {
			sh1=it1.current();
			System.out.print("a="+sh1.getA()+","+"b="+sh1.getB()+",");
			System.out.println("Area="+sh1.calcArea());
		}
	}
}
