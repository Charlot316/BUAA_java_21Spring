//编写Ellipse类，a和b分别代表椭圆两个半轴（半长轴和半短轴）的长度
class Ellipse extends Shape {
	Ellipse(double aa,double bb){
		setA(aa);
		setB(bb);
	}
	public double calcArea() {
		return a*b*3.14;
	}
}