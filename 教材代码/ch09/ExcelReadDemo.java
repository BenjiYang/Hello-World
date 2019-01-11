//��ȡexcel���ݣ�����ʾ
import java.io.*;
import jxl.*;

public class ExcelReadDemo {
	// ��ȡexcel��ָ����Ԫ������
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

	// ��ȡexcel�ļ�һ������
	public String[] readLine(Sheet sheet, int row) {
		try {
			// ��ȡ���ݱ�����
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
		// ������������������
		Workbook wb = null;
		Sheet mysheet;
		try {
			File file = new File("myexcel.xls");
			// ��һ��excel�ļ�,���õ�"������"����
			wb = Workbook.getWorkbook(file);
			// �õ���һ��������,�±�Ϊ0
			mysheet = wb.getSheet(0);

			// ��ѭ����ȡ3�����ݣ�����һ��ʾ����
			for (int i = 0; i < 3; i++) {
				String[] ssTemp = excelread.readLine(mysheet, i);
				for (int j = 0; j < ssTemp.length; j++) {
					System.out.printf("%1$21s", ssTemp[j]);// ��ʽ����������ڶ���
				}
				System.out.println();// ����
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			wb.close();// �رչ�����
		}
	}
}