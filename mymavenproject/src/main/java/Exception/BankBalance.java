package Exception;

public class BankBalance {
	
	public static void checkBal(double amount) throws LowBalException{
		
		if(amount<2000) {
			
			System.out.println("Balance is low");
			throw new LowBalException("Low Balance");
			
		}
		
		else
		{
			System.out.println("Min  balance maintained");
		}
	
	}

	public static void main(String[] args) throws LowBalException {
		// TODO Auto-generated method stub
		
		
		
		//checkBal(1000);
		try {
		checkBal(1000.0);
		}
		catch(LowBalException e) {
			
			System.out.println(e);
		
		}
			
		finally {
			
			System.out.println("The code is executed successfully");	
		}
			
		}

	}


