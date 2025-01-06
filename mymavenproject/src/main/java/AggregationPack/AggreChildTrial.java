package AggregationPack;

public class AggreChildTrial {

	int qnt;
	double amt;
	AggreParentTrial ref;//reference variable by creating a variable of the parent class
	
	AggreChildTrial(int qnt,double amt,AggreParentTrial ref){
		
	this.qnt=qnt;
	this.amt=amt;
	this.ref=ref;
	}
	public void display() {
		
	System.out.println("Quantity is: "+qnt);
	System.out.println("Amount is: "+amt);
	System.out.println("Color is: "+ref.color);
	System.out.println("Item is: "+ref.item);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AggreParentTrial object=new AggreParentTrial("Black","Watch");
		AggreChildTrial obj=new AggreChildTrial(20,5000.00,object);
		obj.display();

	}

}
