package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SearchList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int n=in.nextInt();
		System.out.println(al);
		
			
		if((al.contains(n)))
		{
			System.out.println("The element "+n+" is found");
		}
		else
			System.out.println("The element "+n+" is not found");
			
	}
	}



