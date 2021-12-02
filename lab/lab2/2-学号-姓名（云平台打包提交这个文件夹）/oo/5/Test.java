class Music{
    String name;
    String type;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
class Phone{
    String brand;
    String type;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args)  {
        Music music = new Music();
        music.setName("One Last Kiss");
        music.setType("EVA‘s ED");
        System.out.println(music);
        Phone phone = new Phone();
        phone.setBrand("Apple");
        phone.setType("iPhone12");
        System.out.println(phone);
    }
}