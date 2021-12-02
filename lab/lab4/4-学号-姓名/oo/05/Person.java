public class Person{
    String name;
    char sex;
    String birthday;

    public Person(String name, char sex, String birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

class Student extends Person{
    final int id;

    public Student(String name, char sex, String birthday, int id) {
        super(name, sex, birthday);
        this.id = id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", id=" + id +
                '}';
    }
}

class GraStudent extends Student{
    String major;
    String tutor;

    public GraStudent(String name, char sex, String birthday, int id, String major, String tutor) {
        super(name, sex, birthday, id);
        this.major = major;
        this.tutor = tutor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GraStudent{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", id=" + id +
                ", major='" + major + '\'' +
                ", tutor='" + tutor + '\'' +
                '}';
    }
}
class Test {
    public static void main (String[] args) {
        Person a =new Person("alala",'M',"2001/3/16");
        Person b =new Student("alalala",'M',"2001/3/16",123);
        Person c =new GraStudent("alalalala",'M',"2001/3/16",123123,"Software","blabla");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}