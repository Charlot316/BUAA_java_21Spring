class person{
    private String name;
    private int weight;
    public void setweight(int weight){
        this.weight=weight;
        System.out.print(this.name+"的体重是"+weight+"kg\n");
    }
    public void setname(String name){
        this.name=name;
        System.out.print("这个人的名字叫"+this.name+"\n");
    }
    public void loseweight(int weight){
        this.setweight(weight);
        System.out.print(this.name+"减肥减到了"+weight+"kg\n");
    }
}
public class Question28 {
    public static void main(String args[]) {
        person wang=new person();
        wang.setname("小王");
        wang.setweight(70);
        wang.loseweight(45);
    }
}
