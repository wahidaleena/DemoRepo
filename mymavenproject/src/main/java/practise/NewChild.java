package practise;

public class NewChild extends Child{
	
	public void display() {
		
		super.display();
		System.out.println("class c extends class b");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewChild obj=new NewChild();
		obj.display();

	}

}
