package Generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/***
 * *This method is used to fectch the data from excel
 * @return
 * @param Key
 * @throws Throwable
 * @author Manuja
 * @return 
 */

public class Excel_utilities
{
	public String getDataFromExcel(String sheetName,int RowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		//FileInputStream fis1=new FileInputStream("./Excel.xlsx");
		FileInputStream fis1=new FileInputStream(ipathConstant.PROPERTYFILE_PATH1);
		Workbook book=WorkbookFactory.create(fis1);
		Sheet sh=book.getSheet(sheetName);
		Row row=sh.getRow( RowNum);
		Cell cel=row.getCell(cellNum);
		String data=cel.getStringCellValue();
		return data;
		//DataFormatter format=new DataFormatter();
		
	}

}
