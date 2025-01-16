package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generic Set Interface
		//set is orderless
		Set<String> s=new HashSet<String>();
		s.add("Kinder");
		s.add("Kitkat");
		s.add("Dairy Milk");
		s.add("Milkybar");
		System.out.println(s);
		Set<String> s1=new HashSet<String>();
		s1.add("Jasmine");
		s1.add("Sunflower");
		s1.add("Rose");
		
		//addAll to add one set to another
		s.addAll(s1);
		System.out.println(s);
		
		//contains
		System.out.println(s.contains("Jasmine"));
		System.out.println(s1.contains("Diary Milk"));
		System.out.println(s.contains("Yellow"));
		
		//size to know the length
		System.out.println(s.size());
		
		//isEmpty
		System.out.println(s.isEmpty());
		s.remove("Sunflower");
		System.out.println(s);
		
		//Iterator		
		Iterator<String> itr= s1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		//clear
		s1.clear();
		System.out.println(s1);
		
		
		

	}

}
