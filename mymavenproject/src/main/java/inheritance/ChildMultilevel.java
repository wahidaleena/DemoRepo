package inheritance;

public class ChildMultilevel extends IntermediateMultilevel {

	public void get() {
		System.out.println("Hello child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildMultilevel obj=new ChildMultilevel();
		obj.display();
		obj.show();
		obj.get();

	}

}
