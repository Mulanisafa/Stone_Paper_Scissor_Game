package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class colln1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.add(100);
		list.add(78);
		list.add(10.0);
		list.add("mango");
		list.add("apple");
		list.add('o');
		list.add(true);
		list.add(100);
		list.add("fox");
		list.add(100);
		System.out.println(list);
		
		ArrayList list1 = new ArrayList();
		list.add("apple");
		list.add("mango");
		System.out.println(list);
		
		ArrayList List1 = new ArrayList();
		list.add("apple");
		list.add(100);
		System.out.println(list1);
		
		list.addAll(list1);
		System.out.println(list);
		
		System.out.println(list.contains("mango"));
		System.out.println(list1.get(0));
		
		System.out.println(list.indexOf("Apple"));
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.lastIndexOf(100));
		System.out.println(list.remove(2));
		System.out.println(list);
		
		
		System.out.println(list.set(2,"mango"));
		System.out.println(list);
		System.out.println(list.size());
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			if(it.next()=="fox") {
				it.remove();
				
				
			}
		}
		System.out.println(list);


	}

}
