//PrintWriter��Ӧ��
import java.io.*;

class PrintWriterDemo {
	public static void main(String args[]) throws IOException {
		// �����ļ����������PrintWriter����
		PrintWriter pw = new PrintWriter("output.txt");
		// д�뼸������
		pw.println("hello");
		pw.println(18.97);
		pw.println(true);
		// ��ʽ���������
		pw.format("PI�Ľ���ֵΪ%1$10.6f", Math.PI);
		pw.println();
		pw.format("e �Ľ���ֵΪ%1$10.6f", Math.E);
		pw.println();
		int a = 5, b = 10;
		pw.format("%1$d+%2$d=%3$d", a, b, a + b);
		pw.close();
		System.out.println("����д�����!");
	}
}