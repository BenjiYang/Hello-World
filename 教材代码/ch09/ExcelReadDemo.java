//读取excel数据，并显示
import java.io.*;
import jxl.*;

public class ExcelReadDemo {
	// 读取excel的指定单元格数据
	public String read(Sheet sheet, int col, int row) {
		try {
			Cell cell = sheet.getCell(col, row);
			String rest = cell.getContents();
			return rest;
		} catch (Exception e) {
			System.out.println("read err:" + e);
			return null;
		}
	}

	// 读取excel文件一行数据
	public String[] readLine(Sheet sheet, int row) {
		try {
			// 获取数据表列数
			int colnum = sheet.getColumns();
			String[] rest = new String[colnum];
			for (int i = 0; i < colnum; i++) {
				String sTemp = read(sheet, i, row);
				if (sTemp != null)
					rest[i] = sTemp;
			}
			return rest;
		} catch (Exception e) {
			System.out.println("readLine err:" + e);
			return null;
		}
	}

	public static void main(String[] arges) {
		ExcelReadDemo excelread = new ExcelReadDemo();
		// 声明工作簿、工作表
		Workbook wb = null;
		Sheet mysheet;
		try {
			File file = new File("myexcel.xls");
			// 打开一个excel文件,并得到"工作簿"对象
			wb = Workbook.getWorkbook(file);
			// 得到第一个工作表,下标为0
			mysheet = wb.getSheet(0);

			// 用循环读取3行数据，并逐一显示出来
			for (int i = 0; i < 3; i++) {
				String[] ssTemp = excelread.readLine(mysheet, i);
				for (int j = 0; j < ssTemp.length; j++) {
					System.out.printf("%1$21s", ssTemp[j]);// 格式化输出，便于对齐
				}
				System.out.println();// 换行
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			wb.close();// 关闭工作簿
		}
	}
}