public class TestPerson {
	public static void main(String[] args) {
		Person p1=new Person();
		Student s1=new Student();
		Graduate g1=new Graduate();
		p1.name="cxy";
		p1.sex="female";
		p1.birth="2000/02/13";
		System.out.println("Person�����֣�"+p1.name+" �Ա�"+p1.sex+" ���գ�"+p1.birth);
		s1.name="cxy1";
		s1.sex="male";
		s1.birth="2010/12/13";
		//s1.idnum="1833540";
		System.out.println("Student�����֣�"+s1.name+" �Ա�"+
		s1.sex+" ���գ�"+s1.birth+" ѧ�ţ�"+s1.idnum);
		g1.name="cxy2";
		g1.sex="female";
		g1.birth="1988/06/23";
		//g1.idnum="1833540";
		g1.profession="math";
		g1.teacher="hhhh";
		System.out.println("Graduate�����֣�"+g1.name+" �Ա�"+g1.sex+" ���գ�"+
		g1.birth+" ѧ�ţ�"+g1.idnum+" רҵ��"+g1.profession+" ��ʦ��"+g1.teacher);
	}

}