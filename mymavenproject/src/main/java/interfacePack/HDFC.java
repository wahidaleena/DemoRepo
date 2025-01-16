package interfacePack;

public class HDFC implements RBI{

	

	@Override
	public double recurringDeposit(double amount, int duration) {
		// TODO Auto-generated method stub
		
		double totalDeposit=amount*duration;
		double interest=amount*duration*(duration+1)*r/2400;
		double maturityAmount=totalDeposit+interest;
		return maturityAmount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI obj=new HDFC();
		double val=obj.recurringDeposit(100, 24);
		System.out.println("The maturity amount is :"+"Rs "+val);
	}
}
