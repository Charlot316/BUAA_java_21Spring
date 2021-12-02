
public class NianYeFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer mom=new Buyer();
		Buyer aunt=new Buyer();
		Buyer cxy=new Buyer();
		Cooker dad=new Cooker();
		Cooker aunt1=new Cooker();
		mom.money=50;
		mom.name="mom";
		mom.buywhat="meat";
		mom.Remain(33);
		mom.Buy();
		aunt.money=30;
		aunt.name="aunt";
		aunt.buywhat="vegetables";
		aunt.Remain(25);
		aunt.Buy();
		cxy.money=50;
		cxy.name="cxy";
		cxy.buywhat="eggs and condiments";
		cxy.Remain(22);
		cxy.Buy();
		dad.name="dad";
		dad.dish="cooking";
		dad.Dish();
		aunt1.name="aunt1";
		aunt1.dish="dessert";
		aunt1.Dish();
	}

}
