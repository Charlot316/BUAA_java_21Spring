class Tire{
    String color;
    String type;

    public Tire(String color, String type) {
        this.color = color;
        this.type = type;
    }
}
class Engine{
    String color;
    String type;

    public Engine(String color, String type) {
        this.color = color;
        this.type = type;
    }
}
public class Vehicle{
    static Tire tire;
    static Engine engine;
    int countOfTire;
    public int getCountOfTire() {
        return countOfTire;
    }
    public Vehicle(){

    }
    public void running(){

    }

}
class Person{
    String name;
    void say(String thing)
    {
        System.out.println(thing);
    }

    public Person(String name) {
        this.name = name;
    }
}
class Motorbike extends Vehicle{
    Person driver;
    Person passenger;
    public Motorbike(Person driver, Person passenger) {
        super();
        super.tire=new Tire("black","motor");
        super.engine=new Engine("black","motor");
        super.countOfTire=2;
        this.driver = driver;
        this.passenger = passenger;
    }
    public void running()
    {
        System.out.println("motor is running");
    }
    @Override
    public String toString() {
        return "Motorbike{" +
                "countOfTire=" + countOfTire +
                "tirecolor=" + super.tire.color +
                "tiretype=" + super.tire.type +
                "enginecolor=" + super.engine.color +
                "enginetype=" + super.engine.type +
                ", driver=" + driver +
                ", passenger=" + passenger +
                '}';
    }
}
class Car extends Vehicle{
    public Car() {
        super.tire=new Tire("black","car");
        super.engine=new Engine("black","car");
        super.countOfTire=4;
    }
    public void running()
    {
        System.out.println("car is running");
    }
    @Override
    public String toString() {
        return "Motorbike{" +
                "countOfTire=" + countOfTire +
                "tirecolor=" + super.tire.color +
                "tiretype=" + super.tire.type +
                "enginecolor=" + super.engine.color +
                "enginetype=" + super.engine.type +
                '}';
    }
}
class Tank extends Vehicle{
    public Tank() {
        super.tire=new Tire("black","tank");
        super.engine=new Engine("black","tank");
        super.countOfTire=4;
    }
    public void running()
    {
        System.out.println("tank is running");
    }
    @Override
    public String toString() {
        return "Motorbike{" +
                "countOfTire=" + countOfTire +
                "tirecolor=" + super.tire.color +
                "tiretype=" + super.tire.type +
                "enginecolor=" + super.engine.color +
                "enginetype=" + super.engine.type +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Person brother = new Person("brother");
        Person sister = new Person("sister");
        Vehicle a = new Car();
        Vehicle b = new Tank();
        Vehicle mb = new Motorbike(brother, sister);
        a.running();
        b.running();
        mb.running();
        System.out.println(mb);
        sister.say("不像我，我只会心疼geigei~");
    }
}