package superPackage;

public class ChildInsVar extends ParentInsVar{
	
String color="Red";

public void display() {
	System.out.println("Color from Child Class is: "+color);
	System.out.println("Color from Parent Class is: "+super.color);
	//Here super is used to access parent class instance variable
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ChildInsVar obj=new ChildInsVar();
		obj.display();
		
	}

}
