class Buyer extends Person{
	int money;
	String buywhat;
	public int Remain(int m)
	{
		money=money-m;
		return money;
	}
	void Buy(){
		System.out.println(name+"��"+buywhat+"ʣ��"+money+"Ǯ");
	}
}