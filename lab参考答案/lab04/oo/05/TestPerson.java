public class TestPerson {
	public static void main(String[] args) {
		Person p1=new Person();
		Student s1=new Student();
		Graduate g1=new Graduate();
		p1.name="cxy";
		p1.sex="female";
		p1.birth="2000/02/13";
		System.out.println("Person的名字："+p1.name+" 性别："+p1.sex+" 生日："+p1.birth);
		s1.name="cxy1";
		s1.sex="male";
		s1.birth="2010/12/13";
		//s1.idnum="1833540";
		System.out.println("Student的名字："+s1.name+" 性别："+
		s1.sex+" 生日："+s1.birth+" 学号："+s1.idnum);
		g1.name="cxy2";
		g1.sex="female";
		g1.birth="1988/06/23";
		//g1.idnum="1833540";
		g1.profession="math";
		g1.teacher="hhhh";
		System.out.println("Graduate的名字："+g1.name+" 性别："+g1.sex+" 生日："+
		g1.birth+" 学号："+g1.idnum+" 专业："+g1.profession+" 导师："+g1.teacher);
	}

}