package OOPS;

class A{
	A(){
		System.out.println("This is default constructor");
	}
	public void classA() {
		System.out.println("This is class A method.");
	}
}
class B extends A{
	public void classB() {
		System.out.println("This is Class B method.");
	}
}
class C extends B{
	public void classC() {
		System.out.println("This is class C method.");
	}
}
public class inheritance {
	public static void main(String[] args) {
		B b=new B();
		b.classA();
		b.classB();
		C c=new C();
		c.classC();
		c.classA();
		c.classB();
	}
}
