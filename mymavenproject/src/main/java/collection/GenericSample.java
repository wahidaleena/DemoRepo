package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ref=new ArrayList<String>();
		//Add to add strings to list
		
		ref.add("Black");
		ref.add("Red");
		ref.add("Yellow");
		ref.add("Orange");
		System.out.println(ref);
		
		//set to replace a string using index
		ref.set(1, "Purple");
		System.out.println(ref);
		
		//indexOf- to know the index of the object
		System.out.println(ref.indexOf("Purple"));
		ref.add("Yellow");
		System.out.println(ref);
		//it shows the 1st occurence if the strings are repeated
		System.out.println(ref.indexOf("Yellow"));
		System.out.println(ref.indexOf("brown"));
		//-1 if the string is not present
		System.out.println(ref.lastIndexOf("Yellow"));
		
		
		//remove - delete a string
		ref.remove(3);
		System.out.println(ref);
		ref.remove("Black");
		System.out.println(ref);
		
		
		//get- to view a string
		System.out.println(ref.get(1));
		
		//contains- to check if a string is present in list or not
		System.out.println(ref.contains("Black"));
		System.out.println(ref.contains("Purple"));
		
		
		//isEmpty to check if list is empty or not
		if(ref.isEmpty()) {
			
			System.out.println("List is empty");
		}
		else
			System.out.println("List is not empty");
		
		System.out.println(ref.isEmpty());
		
		//size to check the size of list
		System.out.println(ref.size());
		
		for(int i=0;i<ref.size();i++) {
			
			System.out.println(ref.get(i));
			
		}
		
		for(String i:ref) {
			
			System.out.println(i);
			
		}
		
		
		
	
		
		
		

	}

}
