package inheritance;

public class Hier2 extends Hier1 {
	public void displayparent1() {
		System.out.println("Hi child1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hier2 obj=new Hier2();
		obj.method1();
		obj.displayparent1();

	}


}
