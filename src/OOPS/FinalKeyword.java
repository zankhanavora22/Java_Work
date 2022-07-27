package OOPS;
class emp{
	final int id = 1;
	String name;
	final public void show() {
		System.out.println("id : "+id);
	}
}
class EmpCall extends emp{
	public void show() {
		System.out.println("show inside call");
	}
}
public class FinalKeyword {
	public static void main(String[] args) {
		emp e=new emp();
		e.show();
	}
	
}
