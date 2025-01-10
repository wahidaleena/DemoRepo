package interfacePack;

public class ChildClass implements InterfaceParent {

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Child class implements display method from interface");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceParent obj=new ChildClass();
		//similar to abstraction here object reference is created for parent
		obj.display();
		System.out.println(a);

	}

}
