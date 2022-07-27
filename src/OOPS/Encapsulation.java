package OOPS;

import java.util.Scanner;

class data{
	private int id;
	private String name;
	public data() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id : ");
		id=sc.nextInt();
		System.out.println("Enter name : ");
		name=sc.next();
	}
	public String toString() {
		return "i= "+id+" name = "+name;
	}
	
}
public class Encapsulation {
	public static void main(String[] args) {
		data d=new data();
		//d.id=1;
		//d.name="zankhna";
		System.out.println(d);
	}

}
