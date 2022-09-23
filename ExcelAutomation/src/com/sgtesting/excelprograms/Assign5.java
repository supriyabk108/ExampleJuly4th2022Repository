package com.sgtesting.excelprograms;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign5 {

	public static void main(String[] args) {
		colourflower();
	}
	public static void colourflower()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet s=null;
		Row r=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			s=wb.createSheet("Sheet 1");
			for(int i=0;i<20;i++)
			{
				r=s.createRow(i);
				c=r.createCell(0);
				c.setCellValue("Flower"+(i+1));
				c=r.createCell(1);
				c.setCellValue("Colour"+(i+1));
			}
			fout=new FileOutputStream("D:\\EXCEL\\Assign5.xlsx");
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
