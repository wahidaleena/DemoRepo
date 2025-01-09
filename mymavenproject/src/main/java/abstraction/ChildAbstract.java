package abstraction;

public class ChildAbstract extends ParentAbstract {

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method is displayed here");
		
		
		
	}
	
	public void sample() {
		
		System.out.println("Testing the child class method");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstract obj=new ChildAbstract();
		obj.display();
		obj.text();
		obj.sample();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method 2 is implemented");
		
	}
}
