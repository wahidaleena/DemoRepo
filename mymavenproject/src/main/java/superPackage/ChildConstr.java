package superPackage;

public class ChildConstr extends ParentConstr {
	
	int x,y;


	
	public ChildConstr(float f,float g){
		
		super(5,6);
		float res=f+g;
		System.out.println("Child constructor with two float arguments");
		System.out.println("sum of float numbers is"+res);
	}
	
	
	
	public ChildConstr(String name) {
		super("true");
	}
	
	public ChildConstr(int x,int y) {
		//super("foo");
		System.out.println("Child class constructor with two integer arguments");
		this.x=x;
		this.y=y;
		int sum=x+y;
		System.out.println("Sum of int numbers is "+sum);
	}
	
	public ChildConstr(int r,int s,int t) {
		
		//super("hi");
		int res=r+s+t;
		System.out.println("result is "+res);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChildConstr obj=new ChildConstr(2.1f,3.4f);
		ChildConstr obj1=new ChildConstr("check");
		//ChildConstr obj3=new ChildConstr(6,8);
		ChildConstr obj2=new ChildConstr(2,3,5);
	}

}
