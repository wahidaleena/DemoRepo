package encapsulation;

import java.util.Scanner;

public class Bank {

	private int pin;
	
	public void setPin(int pin) {
		
		this.pin = pin;
	}
	public int getPin() {
		
		if(pin==1001|pin==1234|pin==1212) {
			
			return pin;
		}
		else
			System.out.println("Sorry,Invalid Pin, try again!");
		return 0;
		
	}
	
}
