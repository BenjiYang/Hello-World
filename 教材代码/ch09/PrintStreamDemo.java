//PrintStream��Ӧ��
import java.io.*;
import java.awt.*;

public class PrintStreamDemo {
	public static void main(String args[]) {
		try {
			PrintStream ps = new PrintStream("test.txt");
			Button bt = new Button("��ť");// ����һ����ť����
			ps.println(123);//�������
			ps.println(3.1415926);//���double������
			ps.println("123" + 456);//����ַ���
			ps.println(123 == 123.0);//���boolean������
			ps.println(bt); // ��ӡ����ʱ�����ö����toString()����
			ps.close();
			System.out.println("����д�����!");
		} catch (Exception e) {
		}
	}
}
