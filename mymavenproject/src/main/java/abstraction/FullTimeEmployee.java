package abstraction;

public class FullTimeEmployee extends Employee {

	int payPerhr=500;
	
	public void calculateSalary(int hrs) {
		// TODO Auto-generated method stub
		
		payPerhr=payPerhr*hrs;
		System.out.println("Total payment for full time Employee is: "+"Rs "+payPerhr);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj=new FullTimeEmployee();
		obj.calculateSalary(8);
	}
	

}
