package Exception;

public class ThrowsClass {
	
	//throws an exception
	public void test()throws ArithmeticException{
		
		
		System.out.println("Exception throws");
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=17;
		
		ThrowsClass obj=new ThrowsClass();
		obj.test();
		if(age>=18) {
			
			System.out.println("Eligible for voting");
		}
		else
		{
			//thow an exception the exception is printed
			throw new ArithmeticException("Not Eligible for voting");
		}
		
		
	}

}
