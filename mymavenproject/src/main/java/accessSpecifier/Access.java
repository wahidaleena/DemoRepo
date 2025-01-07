package accessSpecifier;

public class Access {

private void primethod() {
	
	System.out.println("Private");
}

public void pubmethod() {
	
	System.out.println("Public");
}

protected void promethod() {
	
	System.out.println("Protected");
}

void defaultmethod() {
	
	System.out.println("Default");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access obj=new Access();
		obj.defaultmethod();
		obj.primethod();
		obj.promethod();
		obj.pubmethod();
		
	}

}
