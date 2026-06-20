package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import org.apache.poi.ss.usermodel.Cell;

public class ExcelUtility {
	public static Object[][] getLoginData() throws Exception
	{
		String filepath="D:\\Pratiksha\\Softwear Testing Material\\Software Testing DOC\\Assessment Files-Automation Testing\\Section-C\\Automation Login Project\\src\\test\\resources\\TestData\\LoginData.xlsx";
		FileInputStream fin=new FileInputStream(new File(filepath));
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("LoginData");
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[rows-1][cols];
		
		for(int i=1;i<rows;i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<cols;j++)
			{
				Cell cell=row.getCell(j);
				
				switch(cell.getCellType())
				{
				case STRING:
					data[i-1][j]=cell.getStringCellValue();
					break;
				case BOOLEAN:
					data[i-1][j]=cell.getBooleanCellValue();
					break;
				default:
					data[i-1][j].toString();
				}
			}
		}
		workbook.close();
		fin.close();
		return data;
	}
}
