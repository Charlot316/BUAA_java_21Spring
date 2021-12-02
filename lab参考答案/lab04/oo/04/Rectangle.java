//-编写Rectangle类，a和b分别代表矩形两条边的长度（长和宽）；
class Rectangle extends Shape {
	Rectangle(double aa,double bb){
		setA(aa);
		setB(bb);
	}
	public double calcArea() {
		return a*b;
	}
}