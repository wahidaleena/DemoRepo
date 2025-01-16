package Exception;

import java.lang.reflect.Array;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10,div;
		try
		{
		div=n/0;
		System.out.println(div);
		}
		
		
    	catch(ArithmeticException e) {
			
			div=n/2;
			//System.out.println("Exception handled");
			System.out.println(div);
			System.out.println(e);
			//catch block is used to handle the exception
		}
		try
		{
			//int[]array= {1,2,3};
			int[] array=new int[]{1,2,3,4};
				
			
			for(int i=0;i<6;i++) {
				System.out.println(array[i]);
				
			}
		}
			
			catch(ArrayIndexOutOfBoundsException e) {
				
				
				System.out.println("Exception handled here");
			}
		
		finally {
			
			System.out.println("Program ends here");
			
		}

	}

}
