package qaclickacademy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReverseDD {
	public ArrayList<String> getdata(String asset) throws IOException {
		ArrayList<String> a=new ArrayList<String>();
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\X133477\\\\demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
     
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("demo2")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cells = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				while (cells.hasNext()) {
					Cell value = cells.next();
					if (value.getStringCellValue().equalsIgnoreCase(asset)){
						column = k;
						
					}
					k++;

				}System.out.println(column);
				
				while(rows.hasNext()) {
					Row row=rows.next();
					
					a.add(row.getCell(column).getStringCellValue());
					 
				
					
				}
			}
		}return a;
		
	}

	public static void main(String[] args) throws IOException {
		
		}
	}


