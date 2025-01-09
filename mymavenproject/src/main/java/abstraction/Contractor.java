package abstraction;


public class Contractor extends Employee {

	int hrs;
	double payPerhr=500;
	
	@Override
	public void calculateSalary(int hrs) {
		// TODO Auto-generated method stub
		this.hrs=hrs;
		payPerhr=hrs*payPerhr;
		System.out.println("Total payment for the Employee is: "+"Rs "+payPerhr);
		
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj=new Contractor();
		obj.calculateSalary(6);
		
	}


}
