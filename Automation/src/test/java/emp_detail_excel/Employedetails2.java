package emp_detail_excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employedetails2 {

	public static void main(String[] args) throws IOException {
		
		 FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Automation\\Excel_sheets\\selenium practice12.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheet("details");
		 
		 int row = sheet.getLastRowNum();
		 int cell = sheet.getRow(row).getLastCellNum();
		 
		 System.out.println("The Total row = "+row);
		 System.out.println("The Total cell = "+cell);
		 
		 for(int r=0; r<=row; r++) {
			 XSSFRow ro = sheet.getRow(r);
			 
			 for(int c=0; c<cell; c++) {
				 
				 XSSFCell ce = ro.getCell(c);
				 System.out.print(ce.toString()+" \t ");
			 }
			 System.out.println();
		 }
		
		
}
	}

