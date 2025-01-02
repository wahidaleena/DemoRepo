package inheritance;

public class Child extends Parent {

public void get() {
	System.out.println("This is a child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Child obj=new Child();
obj.get();
obj.display();

	}

}
