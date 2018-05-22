package testjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestPOI {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		try {
			InputStream is = new FileInputStream(new File("D:\\123.xlsx"));
			Workbook wb = WorkbookFactory.create(is);

			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.createRow(1);
			CellStyle deleteStyle = wb.createCellStyle();
			TestPOI.setCellValue(sheet, row, 0, "00000", null);
			TestPOI.setCellValue(sheet, row, 1, "00000", wb.createCellStyle());
			Font font = wb.createFont();
			font.setItalic(true);
			font.setStrikeout(true);
			deleteStyle.setFont(font);

			CellStyle changeStyle = wb.createCellStyle();
			// changeStyle.setFillForegroundColor(HSSFColor.ORANGE.index);
			// changeStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			changeStyle.setFillBackgroundColor(HSSFColor.ORANGE.index);
			TestPOI.setCellValue(sheet, row, 2, "12", deleteStyle);

			// Aqua background
			CellStyle style = wb.createCellStyle();
			style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
			style.setFillPattern(FillPatternType.BIG_SPOTS);
			TestPOI.setCellValue(sheet, row, 5, "123", style);
			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(IndexedColors.BLUE_GREY.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			TestPOI.setCellValue(sheet, row, 10, "123", style);

			FileOutputStream out = new FileOutputStream("D:\\1234.xlsx");
			wb.write(out);
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void setCellValue(Sheet sheet, Row row, int column, String value, CellStyle style) {
		Cell cell = row.getCell(column);
		if (cell == null) {
			cell = row.createCell(column);
		}
		cell.setCellValue(value);
		cell.setCellStyle(style);

	}

}
