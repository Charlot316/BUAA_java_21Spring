//Test.java
interface Inter { 
	void show(); 
}

class Outer {
	static Inter cxy=new Inter(){
		@Override
		public void show() {
			System.out.println("oo");
		}
	};
	public static Inter method(){
		Inter cxy1=cxy;
		return cxy1;
	}
}

public class Test {
	 public static void main(String[] args) {
	     Outer.method().show();
	 }
}