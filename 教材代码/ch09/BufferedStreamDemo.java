//�����ֽڻ������Ĺ�Ч
import java.io.*;

public class BufferedStreamDemo {
	public static void main(String args[]) throws IOException {
		long time1 = 0L;// ��ʼʱ��
		long time2 = 0L;// ����ʱ��
		System.out.println("ʹ���������������ļ�д��1000000������:");
		// ��ʹ���ֽڻ�����
		time1 = System.currentTimeMillis();
		FileOutputStream f1 = new FileOutputStream("data1.dat");
		DataOutputStream out1 = new DataOutputStream(f1);
		for (int i = 1; i <= 1000000; i++)
			out1.writeInt(i);
		out1.close();
		time2 = System.currentTimeMillis();
		System.out.println("��ʹ���ֽڻ�����,����ʱ��: " + (time2 - time1) + "����");

		// ʹ���ֽڻ�����
		time1 = System.currentTimeMillis();
		FileOutputStream f2 = new FileOutputStream("data2.dat");
		BufferedOutputStream buf = new BufferedOutputStream(f2, 2048);
		DataOutputStream out2 = new DataOutputStream(buf);
		for (int i = 1; i <= 1000000; i++)
			out2.writeInt(i);
		out2.close();
		time2 = System.currentTimeMillis();
		System.out.println("  ʹ���ֽڻ�����,����ʱ��: " + (time2 - time1) + "����");
	}
}