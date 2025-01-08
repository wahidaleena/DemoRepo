package encapsulation;

public class EncapChild1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapParent1 obj=new EncapParent1();
		obj.setUser("aleena");
		System.out.println("Username is: "+obj.getUser());
		obj.setPass("aleena123");
		System.out.println("Password is: "+obj.getPass());

	}

}
