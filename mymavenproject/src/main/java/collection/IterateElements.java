package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
