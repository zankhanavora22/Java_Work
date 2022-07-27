package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add(1);
		list.add("hello");
		list.add(true);
		list.add("22.15");
		list.add("A");
		list.remove(0);
		System.out.println(list);
		Enumeration em = list.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
