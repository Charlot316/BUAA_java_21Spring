public class Tank extends Vehicle{
    private int caliber;
    Tank(){
        super();
        caliber = 125;
    }
    Tank(Tyre tyre,Engine engine,String name,int caliber){
        super(tyre,engine,name,0);
        this.caliber = caliber;
    }
    public String toString(){
        return "Tank "+super.toString()+"\n\t"+"Caliber:"+caliber+"mm";
    }

}
