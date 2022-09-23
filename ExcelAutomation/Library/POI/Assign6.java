package com.sgtesting.poi;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign6 {
	public static void main(String[] args) {
		capitalcountry();
	}
	public static void capitalcountry()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet s=null;
		Row r1=null;
		Row r2=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			s=wb.createSheet("Sheet 1");
			r1=s.createRow(3);
			r2=s.createRow(4);
			for(int i=0;i<20;i++)
			{
				c=r1.createCell(i);
				c.setCellValue("Capital"+(i+1));
				c=r2.createCell(i);
				c.setCellValue("Country"+(i+1));
			}
			fout=new FileOutputStream("D:\\EXCEL\\Assign6.xlsx");
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
