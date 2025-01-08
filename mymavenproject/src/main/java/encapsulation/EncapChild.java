package encapsulation;

public class EncapChild extends EncapParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//here object is created for parent and invoked in child
	//this way it is usually done
	EncapParent obj=new EncapParent();
	//EncapChild obj=new EncapChild();
	//here object is created for child instead which can also be done
	obj.setAge(30);
	obj.setName("Radha");
	System.out.println("Age is "+obj.getAge());
	System.out.println("Name is "+obj.getName());
	

	}

}
