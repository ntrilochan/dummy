package utils;

import java.io.File;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static components.ApplicationCommon.*;

public class ExcelTestDataUtils 
{
	public static void loadTestData() throws Exception, Exception
	{
		int row=0;
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\Task2.xlsx";
		XSSFWorkbook workbook =new XSSFWorkbook(new File(path));
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		for(int i=0;i<=rows;i++)
		{
			String cellValue=sheet.getRow(i).getCell(0).getStringCellValue();
			if(methodname.equals(cellValue))
			{
				row=i;
				break;
			}
		}
		exceldata=new HashMap<String, String>();
		int cells=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<cells;i++)
		{
			String key=sheet.getRow(0).getCell(i).getStringCellValue();
			String value=sheet.getRow(row).getCell(i).getStringCellValue();
			exceldata.put(key, value);
		}
		System.out.println(exceldata);
	}
}
