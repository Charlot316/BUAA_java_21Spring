class Person{
    String name;
    int age;
    String sex;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>=0 && age<=130) this.age = age;
        else
        {
            System.out.println("Please recheck the name");
        }
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void work(){
        System.out.println("working");
    }
    public void showAge(){
        System.out.println(this.name+"'s age is"+this.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Person Ayanami = new Person();
        Ayanami.setName("AyanamiRei");
        Ayanami.setAge(19);
        Ayanami.setSex("Female");
        System.out.println(Ayanami.getAge());
        Person Asuka = new Person();
        Asuka.setName("AsukaLangley");
        Asuka.setAge(19);
        Asuka.setSex("Female");
        System.out.println(Asuka.getAge());
    }
}
