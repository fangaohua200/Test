package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;

/**
 * 2003 HSSFWorkbook HSSFSheet HSSFRow HSSFCell
 * 
 * 2010 XSSFWorkbook XSSFSheet XSSFRow XSSFCell
 * 
 * @author fangh1
 *
 */
public class TestRuleTablesheet {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		File f = new File("D:\\Elois Work\\DE-464 CTO Report\\7X11_12_13_PROC_BACKPLANE.xls");
		// InputStream is = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(f);
		Sheet sheet = workbook.getSheetAt(0);

		int rowNum = sheet.getLastRowNum();// 获得总行数</span>
//		int rowNum1 = sheet.getPhysicalNumberOfRows();// 获得总行数</span>
		System.out.println(rowNum);
//		System.out.println(rowNum1);
		System.out.println("***********");
		String coments = getCellValue(sheet.getRow(1).getCell(0));
		sheet.getRow(6);
		System.out.println(">>>>>>"+coments);
		for (int i = 0; i <= rowNum; i++) {
			Row row = sheet.getRow(i);
			int cellCount = sheet.getRow(i).getLastCellNum();
			System.out.println("      " + cellCount);
			for (int column = 0; column < cellCount; column++) {
				Cell cell = row.getCell(column);
				System.out.println( "行--" + i+"   列"+column);
				System.out.println(cell);
			}
		}

		// Row row = sheet.getRow(rowline);

	}

	/**
	 * Read the Excel 2003-2007
	 * 
	 * @param path
	 *            the path of the Excel
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public void read2003Xls(String path) throws IOException {
		InputStream is = new FileInputStream(path);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		List list = new ArrayList();
		// Read the Sheet
		HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
			// Read the Row
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if (hssfRow != null) {
					// SBB MFI FFI Option FeatureCode Description

					HSSFCell SBB = hssfRow.getCell(0);
					HSSFCell MFI = hssfRow.getCell(1);
					HSSFCell FFI = hssfRow.getCell(2);
					HSSFCell Option = hssfRow.getCell(3);
					HSSFCell FeatureCode = hssfRow.getCell(4);
					HSSFCell Description = hssfRow.getCell(5);


				}
			}
	}

	
	/**   
	* 获取合并单元格的值   
	* @param sheet   
	* @param row   
	* @param column   
	* @return   
	*/    
	public String getMergedRegionValue(Sheet sheet ,int row , int column){    
	    int sheetMergeCount = sheet.getNumMergedRegions();    
	        
	    for(int i = 0 ; i < sheetMergeCount ; i++){    
	        CellRangeAddress ca = sheet.getMergedRegion(i);    
	        int firstColumn = ca.getFirstColumn();    
	        int lastColumn = ca.getLastColumn();    
	        int firstRow = ca.getFirstRow();    
	        int lastRow = ca.getLastRow();    
	            
	        if(row >= firstRow && row <= lastRow){    
	                
	            if(column >= firstColumn && column <= lastColumn){    
	                Row fRow = sheet.getRow(firstRow);    
	                Cell fCell = fRow.getCell(firstColumn);    
	                return getCellValue(fCell) ;    
	            }    
	        }    
	    }    
	        
	    return null ;    
	}    
	  
	/**  
	* 判断合并了行  
	* @param sheet  
	* @param row  
	* @param column  
	* @return  
	*/  
	private boolean isMergedRow(Sheet sheet,int row ,int column) {  
	  int sheetMergeCount = sheet.getNumMergedRegions();  
	  for (int i = 0; i < sheetMergeCount; i++) {  
	CellRangeAddress range = sheet.getMergedRegion(i);  
	int firstColumn = range.getFirstColumn();  
	int lastColumn = range.getLastColumn();  
	int firstRow = range.getFirstRow();  
	int lastRow = range.getLastRow();  
	if(row == firstRow && row == lastRow){  
	if(column >= firstColumn && column <= lastColumn){  
	return true;  
	}  
	}  
	  }  
	  return false;  
	}  
	  
	/**  
	* 判断指定的单元格是否是合并单元格  
	* @param sheet   
	* @param row 行下标  
	* @param column 列下标  
	* @return  
	*/  
	private boolean isMergedRegion(Sheet sheet,int row ,int column) {  
	  int sheetMergeCount = sheet.getNumMergedRegions();  
	  for (int i = 0; i < sheetMergeCount; i++) {  
	CellRangeAddress range = sheet.getMergedRegion(i);  
	int firstColumn = range.getFirstColumn();  
	int lastColumn = range.getLastColumn();  
	int firstRow = range.getFirstRow();  
	int lastRow = range.getLastRow();  
	if(row >= firstRow && row <= lastRow){  
	if(column >= firstColumn && column <= lastColumn){  
	return true;  
	}  
	}  
	  }  
	  return false;  
	}  
	  
	/**  
	* 判断sheet页中是否含有合并单元格   
	* @param sheet   
	* @return  
	*/  
	private boolean hasMerged(Sheet sheet) {  
	        return sheet.getNumMergedRegions() > 0 ? true : false;  
	    }  
	  
	/**  
	* 合并单元格  
	* @param sheet   
	* @param firstRow 开始行  
	* @param lastRow 结束行  
	* @param firstCol 开始列  
	* @param lastCol 结束列  
	*/  
	private void mergeRegion(Sheet sheet, int firstRow, int lastRow, int firstCol, int lastCol) {  
	sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));  
	}  
	  
	/**   
	* 获取单元格的值   
	* @param cell   
	* @return   
	*/    
	public static String getCellValue(Cell cell){    
	        
	    if(cell == null) return "";    
	        
	    if(cell.getCellType() == Cell.CELL_TYPE_STRING){    
	            
	        return cell.getStringCellValue();    
	            
	    }else if(cell.getCellType() == Cell.CELL_TYPE_BOOLEAN){    
	            
	        return String.valueOf(cell.getBooleanCellValue());    
	            
	    }else if(cell.getCellType() == Cell.CELL_TYPE_FORMULA){    
	            
	        return cell.getCellFormula() ;    
	            
	    }else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){    
	            
	        return String.valueOf(cell.getNumericCellValue());    
	            
	    }    
	    return "";    
	}  
	
}