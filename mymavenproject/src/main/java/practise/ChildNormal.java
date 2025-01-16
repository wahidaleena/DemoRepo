package practise;

public class ChildNormal extends ParentAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentAbstract obj=new ChildNormal();
		obj.check();
		obj.test(6, 7);
		obj.test(5, 5);
		

	}

	public void testMeth() {
		
		System.out.println("test");
	}
	@Override
	public void test(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("sum = "+c);
		
	}

}
