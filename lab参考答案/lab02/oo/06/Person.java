class Person{
	private String name;
	private String age;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		if(Integer.valueOf(age)>=0&&Integer.valueOf(age)<=130)
			this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void work() {
		System.out.println("working");
	}
	public void showAge() {
		System.out.print(age);
	}
}