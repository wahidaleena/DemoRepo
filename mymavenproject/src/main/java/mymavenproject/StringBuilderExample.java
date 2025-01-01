package mymavenproject;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj=new StringBuffer("Welcome");
		System.out.println(obj);
		
		StringBuilder obj1=new StringBuilder("World");
		System.out.println(obj1);
		
		//append, to add string at the end,used in StringBuffer/Stringbuilder only
		System.out.println(obj.append(" to Programming"));
		System.out.println(obj.append(obj1));
		
		//Insert, to insert a particular string to an index
		obj.insert(4, "hello");
		System.out.println(obj);
		
		//replace, to replace a string with another string
		obj.replace(2, 5, "say");
		System.out.println(obj);
		obj.replace(1,3,"Hi");
		System.out.println(obj);
		StringBuffer stre=new StringBuffer("Hello");
		stre.replace(2,4,"Little");
		System.out.println(stre);
		
		//reverse
		stre.reverse();
		System.out.println(stre);
		
		//delete, to delete particular characters
		stre.delete(0, 3);
		System.out.println(stre);
		
		
	}
	

}
