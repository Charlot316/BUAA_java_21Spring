public class Person {
    private String name;
    Person(String name){
        this.name = name;
    }
    Person(){
        name = "Default";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say(String s) {
        System.out.println(s);
    }
}
