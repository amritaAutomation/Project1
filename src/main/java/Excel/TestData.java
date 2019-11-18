package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {

	public static long PAGE_LOAD_TIMEOUT=40;
	public static long IMPLICIT_WAIT =40;

	
	public static XSSFSheet Sheet1;
	 
	private static XSSFWorkbook fi=null;
	public FileInputStream fis=null;
	public FileOutputStream fos=null;

	public XSSFRow row=null;
	public XSSFCell cell=null;
	 String xlFilePath;
	
	 //String xlFilePath;
	 //public static final String File_TestData = "G:\\Automation\\HRMAutomation\\src\\test\\resources\\data1.xlsx";
	
	
	  
	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
	 
		public TestData(String xlFilePath) throws Exception {
			this.xlFilePath = xlFilePath;
			fis = new FileInputStream(xlFilePath);
			try {

    			// Open the Excel file

				fis = new FileInputStream(xlFilePath);

				// Access the required test data sheet

				fi = new XSSFWorkbook(fis);

				 
				//ExcelWSheet = fi.getSheetAt(0);

				} catch (Exception e){

					throw (e);

				}

		}
 
		//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
		 
	    public String getCellData(int sheetNumber,int RowNum, int ColNum) throws Exception{

   				Sheet1=fi.getSheetAt(sheetNumber);
      			//Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

      			String CellData = Sheet1.getRow(RowNum).getCell(ColNum).getStringCellValue();

					return CellData;
	
	    }
	    
	    public int getRowCount(int sheetIndex)
	    {
	    	int row=fi.getSheetAt(sheetIndex).getLastRowNum();
	    	row=row+1;
	    	return row;
	    }
	    
   			
	    
	    public boolean setCellData(String sheetName, int colNumber, int rowNum, String value)
	    {
	        try
	        {
	            Sheet1 = fi.getSheet(sheetName);
	            row = Sheet1.getRow(rowNum);
	            if(row==null)
	                row = Sheet1.createRow(rowNum);
	 
	            cell = row.getCell(colNumber);
	            if(cell == null)
	                cell = row.createCell(colNumber);
	 
	            cell.setCellValue(value);
	 
	            fos = new FileOutputStream(xlFilePath);
	            fi.write(fos);
	            fos.close();
	        }
	        catch (Exception ex)
	        {
	            ex.printStackTrace();
	            return  false;
	        }
	        return true;
	    }
	    

}
