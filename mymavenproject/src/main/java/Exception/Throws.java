package Exception;

public class Throws {
	
	
	
		
	
public static void test() throws ArithmeticException{
	
	System.out.println("Exception test");
	
	throw new ArithmeticException("An exception occurs here");
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			test();
		}
		catch(ArithmeticException e) {
			
			System.out.println("Exception handled");
		}

	}

}
