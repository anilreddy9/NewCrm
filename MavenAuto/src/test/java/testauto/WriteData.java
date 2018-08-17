package testauto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;       

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
    File src = new File("D:\\Data1.xlsx");
    FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sh1 = wb.getSheetAt(0);
    sh1.getRow(0).createCell(2).setCellValue("Pass");
    sh1.getRow(1).createCell(2).setCellValue("Fail");
    FileOutputStream fos = new FileOutputStream(src);
    wb.write(fos);
	}

}
