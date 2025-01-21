package collection;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.remove(2);
		System.out.println("The third element of the list is removed");
		System.out.println(al);

	}

}
