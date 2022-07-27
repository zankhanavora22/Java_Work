package OOPS;
class overloading{
	
	overloading(){
		
	}
	overloading(int i){
		
	}
	overloading(String name){
		
	}
	
	public void show(int i) {
		System.out.println("This is show method 1.");
	}
	public void show(int i,int j) {
		System.out.println("This is show method 2.");
	}
	
}
public class CT_polymorphism {
		public static void main(String[] args) {
			overloading o=new overloading();
			o.show(1);
			o.show(1, 2);
		}
	
	
}
