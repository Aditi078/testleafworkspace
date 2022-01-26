package week5.day2assignment;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String fileName) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/" + fileName + ".xlsx");

		XSSFSheet ws = wb.getSheetAt(0);

		int rowCount = ws.getLastRowNum();

		int cellCount = ws.getRow(0).getLastCellNum();

		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {

			XSSFRow row = ws.getRow(i);

			for (int j = 0; j < cellCount; j++) {

				DataFormatter formatter = new DataFormatter();

				XSSFCell cell = row.getCell(j);

				// String cellValue = cell.getStringCellValue();
				String cellValue = formatter.formatCellValue(cell);
				data[i - 1][j] = cellValue;
			}
		}

		wb.close();

		return data;

	}

}