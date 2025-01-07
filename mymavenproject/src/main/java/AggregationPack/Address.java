package AggregationPack;

public class Address {

String addr;
Student ref;

public Address(String addr,Student ref) {
	
	this.addr=addr;
	this.ref= ref;
}
public void show() {

	System.out.println("Name: "+ref.name);
	System.out.println("Roll no: "+ref.roll+"\n"+"Address: "+addr);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student object=new Student(21,"Aleena");
		Address obj=new Address("Jannath,Kollam",object);
		obj.show();
		
	
		
		

	}

}
