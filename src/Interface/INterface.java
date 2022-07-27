package Interface;

class intercall implements inter_1,inter2{

	@Override
	public void interface3(){
		System.out.println("interface 3");
	}
	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
	@Override
	public void interface1() {
		System.out.println("interface 1");
	}
	
		
}
public class INterface {
	public static void main(String[] args) {
		intercall i=new intercall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter_1.inter4();
	}
}
