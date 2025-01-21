package excelPackage;

import java.io.IOException;

public class SampleMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		for(int i=1;i<4;i++) {
			
			System.out.println(SampleMeth.getStringVal(i,0));
			System.out.println(SampleMeth.getIntegerVal(i,1));
		}
			
		}
		

}
