package practise;

public class ChildAggre{
	
	ParentAggre ref;
	String s;
	
	public ChildAggre(String s,ParentAggre ref) {
		
		this.s=s;
		this.ref=ref;
		
	}
	public void display() {
		
		System.out.println("Sum is"+ref.c);
		//ref.method1();
		System.out.println("string is"+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentAggre object=new ParentAggre(2,3);
		//object.method1();
		//object.method2();
		ChildAggre obj=new ChildAggre("black",object);
		obj.display();
		
		
		

	}

}
