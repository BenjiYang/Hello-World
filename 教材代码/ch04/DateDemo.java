//Date���ʹ��
import java.util.*;

public class DateDemo {
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println("��ǰ����: " + currentDate);

		Date newDate = new Date(10000000000000L); // �������ĳ���Ϊ100����
		System.out.println("�µ�����: " + newDate);

		System.out.println("��ǰ��������������: " + currentDate.before(newDate));
		System.out.println("��ǰ��������������: " + currentDate.after(newDate));

		System.out.println("��ǰ���ھ���GMT 1970.1.1 00:00:00�ĺ�����: "
				+ currentDate.getTime());
		Calendar now=Calendar.getInstance();
		System.out.println("��ǰ����: "+now);
	}
}
