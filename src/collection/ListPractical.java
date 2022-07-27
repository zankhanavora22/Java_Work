package collection;

import java.util.ArrayList;
import java.util.List;

class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id = "+id+ " name = "+name;
	}
}
public class ListPractical {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Zankhana");
		Student s2 = new Student(2, "Dhruvi");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		System.out.println(list);
	}

}
