//Excel文档写入的示例
import java.io.*;
import java.util.*;
import jxl.*;
import jxl.write.*;

public class ExcelWriteDemo {
	public static void main(String[] arges) {
		try {
			File file=new File("myexcel.xls");
			// 创建一个可写入的excel文件,并得到"工作簿"对象
			WritableWorkbook w_workbook = Workbook.createWorkbook(file);
			// 使用第一张"工作表"(下标为0)，将其命名为“银行卡余额”
			WritableSheet w_sheet = w_workbook.createSheet("银行卡余额", 0);

			// 向第一行的单元格添加数据用来设置表头.单元格以(列,行)方式指定,下标均从0开始
			Label label0 = new Label(0, 0, "卡号");
			w_sheet.addCell(label0);
			Label label1 = new Label(1, 0, "时间");
			w_sheet.addCell(label1);
			Label label2 = new Label(2, 0, "存款余额");
			w_sheet.addCell(label2);

			// 普通字符,不需要设置格式
			// 格式化日期
			DateFormat df = new DateFormat("yyyy-MM-dd  hh:mm:ss");
			WritableCellFormat wcfDF = new WritableCellFormat(df);
			// 格式化数字
			NumberFormat nf = new NumberFormat("#.##");
			WritableCellFormat wcfN = new WritableCellFormat(nf);

			//使用上述日期、数字格式，添加第二行数据，下同
			Label cardID = new Label(0, 1, "6013821900047310001");
			w_sheet.addCell(cardID);
			DateTime datetime = new DateTime(1, 1,new GregorianCalendar(2009,11,31).getTime(), wcfDF);
			w_sheet.addCell(datetime);
			jxl.write.Number balance = new jxl.write.Number(2, 1, 1000, wcfN);
			w_sheet.addCell(balance);

			//添加第三行数据
			cardID = new Label(0, 2, "6013821900047310002");
			w_sheet.addCell(cardID);
			datetime = new DateTime(1, 2,new GregorianCalendar(2010,0,1).getTime(), wcfDF);
			w_sheet.addCell(datetime);
			balance = new jxl.write.Number(2, 2, 20000, wcfN);
			w_sheet.addCell(balance);

			// 关闭对象，释放资源
			w_workbook.write();
			w_workbook.close();
			System.out.println("数据写入完毕!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}