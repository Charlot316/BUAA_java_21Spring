//编写Rhombus类，a和b分别代表两条菱形对角线的长度
class Rhombus extends Shape {
	Rhombus(double aa,double bb){
		setA(aa);
		setB(bb);
	}
	public double calcArea() {
		return a*b/2;
	}
}