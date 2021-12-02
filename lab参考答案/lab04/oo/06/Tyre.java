public class Tyre {
    private String name;
    private double d;

    public Tyre(){
        name = "Default";
        d = 60;
    }
    public Tyre(String name,double d){
        this.name = name;
        if(d<0)
            d=60;
        this.d = d;
    }

    public String toString(){
        return "Tyre:\t Name:"+name+",Diameter="+d+"mm";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setD(double d) {
        if(d<0)
            d=60;
        this.d = d;
    }
}
