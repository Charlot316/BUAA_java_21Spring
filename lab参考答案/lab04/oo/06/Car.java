public class Car extends Vehicle{
    private String brand;
    Car(){
        super();
        brand = "Default";
    }
    Car(Tyre tyre,Engine engine,String name,String brand){
        super(tyre,engine,name,4);
        this.brand = brand;
    }
    public String toString(){
        return "Car "+super.toString()+"\n\t"+"Brand:"+brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
