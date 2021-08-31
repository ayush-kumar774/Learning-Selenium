package DataDrivenTests;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDataFromExcel {
    /*
        Excel —> Workbook —> Sheet —> row —> cells
        For reading the data first we need to open the excel file then workbook and then the sheet and then the desired row and cells.

        Excel —> FileInputStream Class
        Workbook —> XSSFWorkbook
        Sheet —> XSSFSheet
        Row —> XSSFRow
        Cell —> XSSCell

        getStringCellValue() -> used for string
        getNumericCellValue() -> used for numbers

     */
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("TESTFILE.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        //XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getLastRowNum(); //returns the row count
        int cellCount = sheet.getRow(0).getLastCellNum(); // returns the column count for 1st row

        for (int i = 0 ; i < rowCount ; i++)
        {
            XSSFRow currentRow = sheet.getRow(i);
            for (int j = 0 ; j < cellCount ; j++) {
                String value = currentRow.getCell(j).toString();
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
