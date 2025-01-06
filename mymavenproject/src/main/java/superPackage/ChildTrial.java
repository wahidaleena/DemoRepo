package superPackage;

public class ChildTrial extends ParentTrial {

	ChildTrial(int u){
	super(6,5);
	System.out.println(u);
	}
	
	public ChildTrial(){
		//super("good");
		this(5);
		super.test1();
		System.out.println("Hi");
	}
	
	public ChildTrial(String f){
	this();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildTrial obj=new ChildTrial(5);
		ChildTrial obj1=new ChildTrial();
		ChildTrial obj2=new ChildTrial("Do this");
		

	}

}
