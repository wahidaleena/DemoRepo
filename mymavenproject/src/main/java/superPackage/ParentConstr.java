package superPackage;



public class ParentConstr {
	
	ParentConstr(){
		
	}
	
	public ParentConstr(int a,int b) {
		int c=a+b;
		System.out.println("Sum of integer numbers is: "+c);
		
	}
	
	public ParentConstr(String s) {
		System.out.println("Parent method string is:"+s);
	}

}
