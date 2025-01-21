package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListNonGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList li=new ArrayList();
		ArrayList al=new ArrayList();
		li.add("Green");
		li.add("Yellow");
		li.add("Black");
		li.add("Red");
		System.out.println(li);
		al.add("Apple");
		al.add("Orange");
		al.add("Banana");
		al.add("Avocado");
		System.out.println(al);
		
		//addAll to add one list to another
		
		System.out.println(al.addAll(li));
		System.out.println(al);
		li.remove(0);
		System.out.println(li);
		System.out.println(li.get(2));
		//System.out.println(li.contains("black"));
		
		//Iterator used to iterate the elements in the list
		Iterator<String> itr=li.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		//remove the last element
		itr.remove();
		System.out.println(li);
		
		
		
		al.clear();
		System.out.println(al);
		
		
		

	}

}
