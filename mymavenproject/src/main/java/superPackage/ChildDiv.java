package superPackage;

public class ChildDiv extends ParentSum {

	public ChildDiv() {
		super.sum();
		int d=c%10;
		if(d==0) {
			System.out.println("The Sum "+c+" is divisible by 10");
		}
		else {
			System.out.println("The Sum "+c+" is not divisible by 10");
		}
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDiv obj=new ChildDiv();
		

	}

}
