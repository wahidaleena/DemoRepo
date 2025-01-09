package abstraction;

public class ChildSample extends ParentAbstract2{

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method is implemented here");
		
	}
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Display method 2 is implemented here");
		
	}
	//This cannot be done
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentAbstract2 object=new ChildSample();
		//Here a object reference is created as abstract class has no constructor invoking
		//object is created for child class and given as reference to parent class
		
		object.display();
		object.test();
		//object.display2();
		
		/*display2() cannot be invoked as display2() is a method of child class and only those methods
which are defined in abstract class can be accessed through reference object*/		

	}

}
