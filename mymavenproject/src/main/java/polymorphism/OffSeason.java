package polymorphism;

public class OffSeason extends OnSeason {
	
	public void discount(int price) {
		
		int disPerc=15;
		double dis=price*15/100;
		System.out.println("Discount in Offseason is: "+"Rs "+dis);
		super.discount(2000);
		
		}

			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffSeason obj=new OffSeason();
		obj.discount(2000);
		

	}

}
