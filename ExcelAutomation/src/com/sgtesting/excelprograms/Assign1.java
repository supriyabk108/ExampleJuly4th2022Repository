package com.sgtesting.excelprograms;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign1 {

	public static void main(String[] args) {
		fruitname();
	}
	public static void fruitname()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh1=wb.createSheet("Sheet 1");
			for(int i=0;i<20;i++)
			{
				row=sh1.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue("Fruit"+(i+1));
			}
			fout=new FileOutputStream("D:\\EXCEL\\Assignment1.xlsx");
			wb.write(fout);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
