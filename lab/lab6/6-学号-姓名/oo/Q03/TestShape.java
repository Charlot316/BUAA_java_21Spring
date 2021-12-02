public class TestShape {
    public static void main (String[] args) {
        int count=100;//随机生成100个形状
        for (int i=0;i<count;i++) {
            int randomA = 1 + (int) (Math.random() * 100);//随机生成a
            int randomB = 1 + (int) (Math.random() * 100);//随机生成b
            int randomShape = 1 + (int) (Math.random() * 3);//指定生成的形状
            switch (randomShape){//在switch语句中根据指定形状的不同调用不同的工厂
                case 1:
                    System.out.println(Rectangle.getFactory().makeShape(randomA, randomB));
                    break;
                case 2:
                    System.out.println(Rhombus.getFactory().makeShape(randomA, randomB));
                    break;
                default:
                    System.out.println(Ellipse.getFactory().makeShape(randomA, randomB));
                    break;
            }
        }
    }
}
