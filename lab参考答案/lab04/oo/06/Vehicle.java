abstract public class Vehicle {
    private int num;
    private Tyre tyre;
    private Engine engine;
    private String name;
    Vehicle(){
        tyre = new Tyre();
        engine = new Engine();
        num=4;
        name="Default";
    }
    Vehicle(Tyre tyre,Engine engine,String name,int num){
        this.tyre=tyre;
        this.engine = engine;
        this.num = num;
        this.name = name;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String s = "has "+num+" tyre";
        if(num>1)
            s+='s';
        s = s + "." + "\n\tName:\t"+name+"\n\t";
        s = s + tyre.toString() + "\n\t" +engine.toString();
        return s;
    }
}
