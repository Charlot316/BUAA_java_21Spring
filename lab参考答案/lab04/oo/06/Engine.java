public class Engine {
    private String name;
    private int thrust;

    Engine(){
        name = "Default";
        thrust = 2000;
    }
    Engine(String name,int thrust){
        this.name = name;
        if(thrust < 0)
            thrust = 2000;
        this.thrust = thrust;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setThrust(int thrust) {
        if(thrust < 0)
            thrust = 2000;
        this.thrust = thrust;
    }
    public String toString(){
        return "Engine:\t Name:"+name+",Thrust="+thrust+"kN";
    }
}
