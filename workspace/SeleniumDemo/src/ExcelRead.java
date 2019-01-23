import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;



public class ExcelRead {
	public static void main(String[] args)throws Exception {
		
		FileInputStream fis = new FileInputStream("G:/abc.xls");
		System.out.println("Open the XLS File");
		
		Workbook wb = Workbook.getWorkbook(fis);
		System.out.println("2");
		
		Sheet sh= wb.getSheet(0);
		System.out.println("3");
		
		int rows = sh.getRows();
		
		System.out.println("4");
		System.out.println(rows);
		
		int col = sh.getColumns();
		
		for (int i = 0; i <rows; i++) {
			for (int j = 0; j <=col-1; j++) {
				Cell cell = sh.getCell(j, i);
				System.out.println(cell.getContents());
			}
		}
		System.out.println("5");
		System.out.println(col);
		
	}


	}



