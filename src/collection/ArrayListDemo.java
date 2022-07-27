package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Zankhna");
		list.add(1);
		list.add("dhruvi");
		list.add(true);
		list.add(15.22);
		System.out.println(list);
		System.out.println("Size of list : "+list.size());
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
