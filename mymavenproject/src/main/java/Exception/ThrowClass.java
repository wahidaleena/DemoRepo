package Exception;

public class ThrowClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		if(age>=18) {
			
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Not Eligible for voting");
		}

	}

}
