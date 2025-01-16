package encapsulation;

import java.util.*;
public class User extends Bank {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj=new Bank();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin you want to set");
		int pinNo=sc.nextInt();
	    obj.setPin(pinNo);
	    System.out.println("The Pin obtained is: "+obj.getPin());
		
		
	}

}
