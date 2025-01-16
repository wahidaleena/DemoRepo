package practise;

public class ChildEncap extends ParentEncap{
	
	
	public void display() {
		
		System.out.println("color is"+getColor());
		System.out.println("Count is"+getCount());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChildEncap obj=new ChildEncap();
		//obj.display();
		
		ParentEncap obj=new ParentEncap();
		obj.setColor("black");
		obj.setCount(7);
		System.out.println("color is"+obj.getColor());
		System.out.println("Count is"+obj.getCount());
		
		

	}

}
