package AggregationPack;

public class AggreChild {
	
int no;
String sub;
AggreParent ref; //reference variable

public	AggreChild(int no,String sub,AggreParent ref){
	
	this.no=no;
	this.sub=sub;
	this.ref=ref;
		
	}

public void display() {
	
	System.out.println("Child class display method");
	System.out.println("Subject is "+sub);
	System.out.println("Roll no is "+no);
	System.out.println("Name is "+ref.name);
	System.out.println("Age is "+ref.age);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    AggreParent object=new AggreParent(21,"Roma");
		AggreChild obj=new AggreChild(2,"English",object);
		//The object of parent is used as reference in child class and passed
		//as an argument
		obj.display();
	}

}
