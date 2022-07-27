package OOPS;
abstract class RBI{
	abstract public void interest();
	abstract public void HL();
	public void reporate() {
		System.out.println("Reporate is :+-4%");
	}
}
class SBI extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("SBI Interest : 6%");
		
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI Loan : 7%");
	}
	
}
class PNB extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("PNB Interest : 7%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("PNB Loan : 4%");
	}
}
class JAVA extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("JAVA Interest : 9%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA Loan : 8%");
	}
	
}
public class abstract_demo {
		public static void main(String[] args) {
			SBI S=new SBI();
			S.interest();
			S.HL();
			PNB p=new PNB();
			p.interest();
			p.HL();
			JAVA j=new JAVA();
			j.interest();
			j.HL();
		}
}
