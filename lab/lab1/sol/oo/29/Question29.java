class buyer{
    private String name;
    private String vegetable;
    public void setname(String name){
        this.name=name;
        System.out.print(this.name+"是采购员\n");
    }
    public void buythings(String vegetable){
        this.vegetable=vegetable;
        System.out.print(this.name+"负责"+this.vegetable+"\n");
    }
}
class cook{
    private String name;
    private String cookings;
    public void setname(String name){
        this.name=name;
        System.out.print(this.name+"是厨师\n");
    }
    public void cookthings(String cookings){
        this.cookings=cookings;
        System.out.print(this.name+"负则"+this.cookings+"\n");
    }
}
public class Question29 {
    public static void main(String args[]) {
        buyer auntA=new buyer();
        buyer mom=new buyer();
        buyer me=new buyer();
        cook dad=new cook();
        cook auntB=new cook();
        auntA.setname("姑姑");
        auntA.buythings("买肉");
        mom.setname("妈妈");
        mom.buythings("买菜");
        me.setname("我");
        me.buythings("买鸡蛋和佐料");
        dad.setname("爸爸");
        dad.cookthings("烹饪");
        auntB.setname("婶婶");
        auntB.cookthings("烤甜品");
    }
}
