//SimpleDateFormat���ʹ��
import java.util.*;
import java.text.*;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Calendar now = new GregorianCalendar();// ��ϵͳ��ǰʱ����������������
		SimpleDateFormat formatter = new SimpleDateFormat();// ����SimpleDateFormat����
		formatter.applyPattern("����ʱ��: yyyy��MM��dd�� HHʱmm��ss��");// �������ģʽ
		String str = formatter.format(now.getTime());// ת����Date����,�����
		System.out.println(str);
		// �Ե�16�����˻ῪĻʱ�䴴����һ����������
		Calendar Asian16 = new GregorianCalendar(2010, 10, 12, 20, 0, 0);
		// �õ�������ʱ��֮�����ĺ�����
		long distance = Asian16.getTimeInMillis() - now.getTimeInMillis();
		int days = (int) (distance / (24 * 60 * 60 * 1000)); // ת��Ϊ����
		// ʣ���ת��Ϊ"������"
		long seconds = (distance % (24 * 60 * 60 * 1000)) / 1000;
		int hh = (int) (seconds / (60 * 60)); // ת����Сʱ��
		int mm = (int) ((seconds % (60 * 60)) / 60); // ת���ɷ�����
		int ss = (int) ((seconds % (60 * 60)) % 60); // ת����������

		System.out.println("����2010��11��12�յ�16�����˻ῪĻ����:" + days + "��" + hh + "ʱ"+ mm + "��" + ss + "��");
	}
}