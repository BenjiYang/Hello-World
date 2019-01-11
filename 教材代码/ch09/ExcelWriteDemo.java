//Excel�ĵ�д���ʾ��
import java.io.*;
import java.util.*;
import jxl.*;
import jxl.write.*;

public class ExcelWriteDemo {
	public static void main(String[] arges) {
		try {
			File file=new File("myexcel.xls");
			// ����һ����д���excel�ļ�,���õ�"������"����
			WritableWorkbook w_workbook = Workbook.createWorkbook(file);
			// ʹ�õ�һ��"������"(�±�Ϊ0)����������Ϊ�����п���
			WritableSheet w_sheet = w_workbook.createSheet("���п����", 0);

			// ���һ�еĵ�Ԫ����������������ñ�ͷ.��Ԫ����(��,��)��ʽָ��,�±����0��ʼ
			Label label0 = new Label(0, 0, "����");
			w_sheet.addCell(label0);
			Label label1 = new Label(1, 0, "ʱ��");
			w_sheet.addCell(label1);
			Label label2 = new Label(2, 0, "������");
			w_sheet.addCell(label2);

			// ��ͨ�ַ�,����Ҫ���ø�ʽ
			// ��ʽ������
			DateFormat df = new DateFormat("yyyy-MM-dd  hh:mm:ss");
			WritableCellFormat wcfDF = new WritableCellFormat(df);
			// ��ʽ������
			NumberFormat nf = new NumberFormat("#.##");
			WritableCellFormat wcfN = new WritableCellFormat(nf);

			//ʹ���������ڡ����ָ�ʽ����ӵڶ������ݣ���ͬ
			Label cardID = new Label(0, 1, "6013821900047310001");
			w_sheet.addCell(cardID);
			DateTime datetime = new DateTime(1, 1,new GregorianCalendar(2009,11,31).getTime(), wcfDF);
			w_sheet.addCell(datetime);
			jxl.write.Number balance = new jxl.write.Number(2, 1, 1000, wcfN);
			w_sheet.addCell(balance);

			//��ӵ���������
			cardID = new Label(0, 2, "6013821900047310002");
			w_sheet.addCell(cardID);
			datetime = new DateTime(1, 2,new GregorianCalendar(2010,0,1).getTime(), wcfDF);
			w_sheet.addCell(datetime);
			balance = new jxl.write.Number(2, 2, 20000, wcfN);
			w_sheet.addCell(balance);

			// �رն����ͷ���Դ
			w_workbook.write();
			w_workbook.close();
			System.out.println("����д�����!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}