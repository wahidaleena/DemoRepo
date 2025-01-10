package interfacePack;

public class ChildClassMultipleInherit implements MultipleInheritInterface1,MultipleInheritInterface2,MultipleInheritInterface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassMultipleInherit obj=new ChildClassMultipleInherit();
		obj.test();
		obj.show();
		MultipleInheritInterface1 object=new ChildClassMultipleInherit();
		object.test();
		MultipleInheritInterface2 obj1=new ChildClassMultipleInherit();
		obj1.show();
		MultipleInheritInterface3 obj2=new ChildClassMultipleInherit();
		obj2.display();
		obj2.test();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Parent1");
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Parent2");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Parent3");
		
	}

}
