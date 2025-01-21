package excelPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class SampleMeth {
	
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	
	public static String getStringVal(int r,int c) throws IOException {
		
		 f= new FileInputStream("/Users/aleena/Downloads/NameList.xlsx");
		 wb=new XSSFWorkbook(f);
		 sh=wb.getSheet("Names");
		 XSSFRow row=sh.getRow(r);
		 XSSFCell cell=row.getCell(c);
		 return cell.getStringCellValue();
		 
		
	}
	
	
	public static String getIntegerVal(int r,int c) throws IOException {
		
		 f= new FileInputStream("/Users/aleena/Downloads/NameList.xlsx");
		 wb=new XSSFWorkbook(f);
		 sh=wb.getSheet("Names");
		 XSSFRow row=sh.getRow(r);
		 XSSFCell cell=row.getCell(c);
		 int x=(int) cell.getNumericCellValue();
		 return String.valueOf(x);
		 
		
	}

}
