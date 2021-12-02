
public class Test {
	public static void process(ITextProcess p, String s) {
		if(s!=null)
			System.out.println(p.process(s));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="   hhhh yyyy ";
		String s2="  CxyHei ";
		String s3="hello world";
		Splitter sp=new Splitter();
		UpperCaseProcessor ucp=new UpperCaseProcessor();
		SnakeCaseProcessor scp=new SnakeCaseProcessor();
		Test.process(sp, s1);
		Test.process(sp, s2);
		Test.process(sp, s3);
		Test.process(ucp, s1);
		Test.process(ucp, s2);
		Test.process(ucp, s3);
		Test.process(scp, s1);
		Test.process(scp, s2);
		Test.process(scp, s3);
	}

}
