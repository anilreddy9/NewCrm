package testauto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {

		File src  = new File("D:\\Data1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh1 = wb.getSheetAt(0);
        String data0 = sh1.getRow(0).getCell(0).getStringCellValue();
        System.out.println(data0);
        String data1 = sh1.getRow(0).getCell(1).getStringCellValue();
        System.out.println(data1);
        String data2 = sh1.getRow(1).getCell(0).getStringCellValue();
        System.out.println(data2);
        String data3 = sh1.getRow(1).getCell(1).getStringCellValue();
        System.out.println(data3);
        
        int size = sh1.getLastRowNum();
        System.out.println(size);
        
        for(int i=0; i<=size;i++)
        {
        String data5 =	sh1.getRow(i).getCell(0).getStringCellValue();
        String data6 = sh1.getRow(i).getCell(1).getStringCellValue();
        	System.out.println(data5+ " "+data6);
        }
        
	}

}
