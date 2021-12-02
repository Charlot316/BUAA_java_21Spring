public class Triangle {
	private double x;
	private double y;
	private double z;
	public Triangle(double a,double b,double c) {
		x=a;
		y=b;
		z=c;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getArea() throws NotTriangleException{
		double p=(x+y+z)/2;
		double s=Math.sqrt(p*(p-x)*(p-y)*(p-z));
		return s;
	}
	public void showInfo() throws NotTriangleException{
		System.out.println("Three sides of triangle are "+x+", "+y+", "+z+".");
	}
}
