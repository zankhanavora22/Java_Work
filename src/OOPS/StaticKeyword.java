package OOPS;
class stu{
	static {
		System.out.println("THis is Student Static block");
	}
	int id;
	String name;
	static String cname="TOPS";
	
	public stu(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void getdata() {
		System.out.println("id :"+id+" Name : "+name+" cname : "+cname);
		
	}
	public void run() {
		System.out.println("This is run method.");
	}
}
public class StaticKeyword {
	static {
		System.out.println("THis is main static block.");
	}
	
	public static void main(String[] args) {
			stu s1=new stu(1,"Zankhana");
			stu s2=new stu(2,"Dhruvi");
			s1.getdata();
			s2.getdata();
			
	}

}
