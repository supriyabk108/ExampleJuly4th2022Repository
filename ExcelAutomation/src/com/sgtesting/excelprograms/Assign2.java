package com.sgtesting.excelprograms;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign2 {

	public static void main(String[] args) {
		flowername();
	}
	public static void flowername()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row r=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet 1");
			r=sh.createRow(9);
			for(int i=0;i<20;i++)
			{
				c=r.createCell(i);
				c.setCellValue("flower"+(i+1));
			}
			fout=new FileOutputStream("D:\\EXCEL\\Assign2.xlsx");
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
