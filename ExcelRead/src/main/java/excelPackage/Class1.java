package excelPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class1 {

	//To get the file this class is used
	static FileInputStream f;
	//To get the workbook this class is used
	static XSSFWorkbook wb;
	//To take values from sheet this class is used
	static XSSFSheet sh;
	
	public static String getStringData(int a,int b) throws IOException {
		
		//a is row and b is cell
		//to take the data from file
		f=new FileInputStream("/Users/aleena/Downloads/Marks.xlsx");
		
		
		//to get the workbook from f
		wb=new XSSFWorkbook(f);
		//to get value from sheet from wb
		sh=wb.getSheet("Sheet1");
		//to get value from row
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
	}
	
	public static String getIntegerData(int a,int b) throws IOException {
		
		f=new FileInputStream("/Users/aleena/Downloads/Marks.xlsx");
		//to get the workbook from f
				wb=new XSSFWorkbook(f);
				//to get value from sheet from wb
				sh=wb.getSheet("Sheet1");
				//to get value from row
				XSSFRow r=sh.getRow(a);
				XSSFCell c=r.getCell(b);
				//store as integer
				int x=(int)c.getNumericCellValue();
				//convert back to string
				return String.valueOf(x);
	}
}
