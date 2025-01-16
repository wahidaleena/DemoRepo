package practise;

public class ChildClass implements MultipleParent1,MultipleParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.func();
		obj.test();
		

	}

	@Override
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("parent2 method");
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("parent1 method");
		
	}

}
