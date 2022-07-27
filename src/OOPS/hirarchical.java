package OOPS;

class D{
	public void classD(){
		System.out.println("Class D");
	}
}
class E extends D{
	public void classE(){
		System.out.println("Class E");
	}
}
class F extends D{
	public void classF(){
		System.out.println("Class F");
	}
}

public class hirarchical {
	public static void main(String[] args) {
		E e=new E();
		e.classD();
		e.classE();
		F f=new F();
		f.classD();
		f.classF();
	}

}
