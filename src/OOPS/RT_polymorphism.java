package OOPS;

class overriding{
	public void show() {
		System.out.println("This is Show method");
	}
}
class call extends overriding{
	public void show() {
		super.show();
		System.out.println("This is call Class method");
	}
}
public class RT_polymorphism {
	public static void main(String[] args) {
		call c=new call();
		c.show();
		
	}
}
