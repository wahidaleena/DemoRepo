package polymorphism;


public class PolyParent {

	int a,b,c;
	
public void calc(int a,int b) {

	this.a=a;
	this.b=b;
	c=a+b;
	
	System.out.println("Sum is "+c);
	
}

public void color(String a) {
	
	System.out.println("color of bag is"+a);
}

}
