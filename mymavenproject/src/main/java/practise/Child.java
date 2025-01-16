package practise;

public class Child extends Parent {
	
	
	public void display()
	{
		
		super.display();
		System.out.println("hello child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj=new Child();
		obj.display();

	}

}
