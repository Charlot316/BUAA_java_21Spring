import java.text.DecimalFormat;

public class Triangle {
    private double x,y,z;
    public static boolean isTriangle(Triangle temp){
        double x=temp.getX();
        double y=temp.getY();
        double z=temp.getZ();
        return (x+y>z)&&(x+z>y)&&(z+y>x)&&(x>0)&&(y>0)&&(z>0);
    }
    Triangle(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void showInfo() throws NotTriangleException{
        if(!isTriangle(this)) throw new NotTriangleException(this);
        System.out.println("This Triangle consists of three edges with the length of x = "+x+",y = "+y+",z = "+z);
    }
    public double getArea() throws NotTriangleException{
        if(!isTriangle(this)) throw new NotTriangleException(this);
        DecimalFormat    df   = new DecimalFormat("######0.00");
        return Double.parseDouble(df.format(Math.sqrt((x+y+z)*(x+y-z)*(x+z-y)*(y+z-x))/4));//面积只保留前两位小数
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
