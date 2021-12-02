import java.math.BigDecimal;

public class Triangle_Test {
    public static void main(String[] args) {
        double x,y,z;
        try{
            x=3;y=4;z=5;
            Triangle a =new Triangle(x,y,z);
            a.showInfo();
            System.out.println("This triangle has an area of "+a.getArea());
            for(int i=0;i<10;i++){
                BigDecimal   b   =   new   BigDecimal((Math.random()*(20-1)+1));
                BigDecimal   c   =   new   BigDecimal((Math.random()*(20-1)+1));
                BigDecimal   d   =   new   BigDecimal((Math.random()*(20-1)+1));
                x   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                y   =   c.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                z   =   d.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();//这里为了让double小数位数不要太多，只保留两位
                Triangle temp =new Triangle(x,y,z);
                temp.showInfo();
                System.out.println("This triangle has an area of "+temp.getArea());
            }
        }catch(NotTriangleException e){
            System.out.println(e.getReason());
        }


    }
}
