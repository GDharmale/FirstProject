import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

@SuppressWarnings("unused")
public class ExcelRead2 {
	public static void main(String...args) throws Exception {
		FileInputStream fis=new FileInputStream("G:/abc.xls");
		System.out.println("1. Open Excel file");
		
		Workbook wb=Workbook.getWorkbook(fis);
		System.out.println("2. Get Workbook");
		
		Sheet sh=wb.getSheet(1);
		System.out.println("3. Acces the Sheet");
		
		int rows=sh.getRows();
		
		int column=sh.getColumns();
		
		for (int i = 0; i <=4; i++) {
			for (int j = 0; j<=5; j++) {
				Cell cell = sh.getCell(j, i);
				System.out.println(cell.getContents());
			}
		}
		
		//System.out.println("The Number of Columns Is:"+column);
		
		
		
	}

}
