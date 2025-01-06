package superPackage;

public class ChildInstMethod extends ParentInstMethod{
	
public void show() {
	System.out.println("Hi, I am the child class method");
	this.invoke();//this invokes current class method
	super.show();//this invokes super/parent class method
	
}
public void invoke() {
	super.display();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ChildInstMethod obj=new ChildInstMethod();
		
		obj.show();
	}

}
