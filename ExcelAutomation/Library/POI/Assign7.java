package com.sgtesting.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign7 {

	public static void main(String[] args) {
		Student();
	}
	public static void Student()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet s1=null;
		Sheet s2=null;
		Row r1=null;
		Row r2=null;
		Cell c1=null;
		Cell c2=null;
		try
		{
			fin=new FileInputStream("D:\\EXCEL\\Std1.xlsx");
			wb=new XSSFWorkbook(fin);
			s1=wb.getSheet("Sheet1");
			s2=wb.createSheet("Sheet2");
			int a=s1.getPhysicalNumberOfRows();
			for(int i=0;i<a;i++)
			{
				r1=s1.getRow(i);
				r2=s2.createRow(i);
				int b=r1.getPhysicalNumberOfCells();
				for(int j=0;j<b;j++)
				{
					c1=r1.getCell(j);
					c2=r2.createCell(j);
					String c=c1.getStringCellValue();
					c2.setCellValue(c);
				}
			
			}
			fout=new FileOutputStream("D:\\EXCEL\\Stdnew.xlsx");
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
				fin.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
