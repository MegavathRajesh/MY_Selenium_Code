package emp_detail_excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employedetails {

	public static void main(String[] args) throws IOException {
		
		 FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Automation\\Excel_sheets\\selenium practice.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 
		 int totalrow = sheet.getLastRowNum();
		 int totalcell = sheet.getRow(totalrow).getLastCellNum();
		 
		 System.out.println("The Total row : "+ totalrow);
		 System.out.println("The Total cell : "+ totalcell);
		 
		 
		 for(int r=0; r<=totalrow; r++) {
			 
			 XSSFRow row = sheet.getRow(r);
			  
			 
			 for(int c=0; c<totalcell; c++) {
				 
				 XSSFCell cell = row.getCell(c);
				 System.out.print(cell.toString()+"         \t");
				 
			 }
			 System.out.println(" ");
		 }

	}

}
