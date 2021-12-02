public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.setAge(args[0]);
		p.setName(args[1]);
		p.setSex(args[2]);
		String myage=p.getAge();
		System.out.println("myage:"+myage);
		System.out.print("p:");
		p.showAge();
		System.out.print("\n");
		Person p1=new Person();
		p1.setAge(args[3]);
		p1.setName(args[4]);
		p1.setSex(args[5]);
		String myage1=p1.getAge();
		System.out.println("myage1:"+myage1);
		System.out.print("p1:");
		p1.showAge();
		System.out.print("\n");
		p=p1;
		System.out.println("当将p和p1是相同的引用时：");
		System.out.print("p:");
		p.showAge();System.out.print("\n");
		System.out.print("p1:");
		p1.showAge();System.out.print("\n");
		p.setAge("22");
		System.out.println("修改p的年龄之后：");
		System.out.print("p:");
		p.showAge();System.out.print("\n");
		System.out.print("p1:");
		p1.showAge();System.out.print("\n");
	}

}
