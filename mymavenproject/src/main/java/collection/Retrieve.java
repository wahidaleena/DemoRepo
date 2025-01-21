package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the index of the element you want to retrieve");
		int index=in.nextInt();
		System.out.println("The element is: "+al.get(index));
		
	}

}
