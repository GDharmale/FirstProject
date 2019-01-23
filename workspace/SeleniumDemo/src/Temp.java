import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Temp {
public static void main(String...args) throws Exception {
		
		FileInputStream fis=new FileInputStream("G:/abc.xls");
		
		Workbook wb=Workbook.getWorkbook(fis);
		  Sheet sh=wb.getSheet(1);
		  
		  int rows=sh.getRows();
		    int column=sh.getColumns();
		       for(int i=0;i<rows;i++){
		    	   for(int j=0;j<=column-1;j++){
		    		   Cell cell=sh.getCell(j, i);
		    		   System.out.println(cell.getContents());
		    	   }
		       }

}
}
