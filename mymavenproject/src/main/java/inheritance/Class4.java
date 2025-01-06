package inheritance;

public class Class4 extends Class3 {

	public void slip() {
		System.out.println("*******Salary Slip********");
		System.out.println("Basic Pay: "+"Rs "+basic);
		System.out.println("Deduction: "+"Rs "+deduction);
		System.out.println("HRA: "+"Rs "+hra);
		System.out.println("PF: "+"Rs "+pf);
		System.out.println("Bonus: "+"Rs "+bonus);
		System.out.println();
		System.out.println("Total Salary by hand: "+"Rs "+sal);
		System.out.println("***************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class4 obj=new Class4();
		obj.get();
		obj.calc();
		obj.getsal();
		obj.slip();

	}

}
