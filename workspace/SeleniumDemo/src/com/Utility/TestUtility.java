package com.Utility;

import java.util.ArrayList;

import TestNgDemo.Xls_Reader;

public class TestUtility {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {// Instead of void i
															// used
															// ArrayList<Object[]>
															// bcoz at the last
		// am returning myData so i write it insted of Void
		ArrayList<Object[]> myData = new ArrayList();
		try {
			reader = new Xls_Reader("C:\\Users\\Samsung\\Desktop\\Book1.xlsx");
		} catch (Exception e) {
			e.printStackTrace();

		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("JBKData"); rowNum++) {
			String Name = reader.getCellData("JBKData", "Name", rowNum);
			String LastName = reader.getCellData("JBKData", "LastName", rowNum);
			String MobileNumber = reader.getCellData("JBKData", "MobileNumber", rowNum);
			String Password = reader.getCellData("JBKData", "Password", rowNum);

			Object ob[] = { Name, LastName, MobileNumber, Password };
			myData.add(ob);
		}
		return myData;
	}

}
