//ʵ��15.3 �������˳���
import java.net.*;
import java.io.*;

public class ServerClass {
	public static void main(String args[]) {
		int i = 0;
		try {
			ServerSocket ss = new ServerSocket(2345);//�������˿ں�2345
			System.out.println("����������......");
			while (true) {
				Socket sock = ss.accept();//�����˿�
				i++;
				System.out.println("������������" + i);
//�� socket�����ϻ�������
				PrintStream out = new PrintStream(sock.getOutputStream());					out.println("���");//��ͻ�������һ������á��ַ���
				out.close();
				sock.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
