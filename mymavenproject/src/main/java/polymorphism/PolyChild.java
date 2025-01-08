package polymorphism;

public class PolyChild extends PolyParent {

	public void calc(int a,int b) {
		
		int c=a-b;
		System.out.println("Difference is "+c);
		super.calc(1,5);
	}
	
	public void color(String a) {
		
		super.color("black");
		System.out.println("Color of dog is"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolyChild obj=new PolyChild();	
		obj.calc(3, 6);
		obj.color("black");
		/*PolyParent obj1=new PolyParent();
		obj1.calc(5, 7);*/
	}

}
