//ʵ��15.3 �ͻ��˳���
import java.io.*;
import java.net.*;

public class AClient {
	public static void main(String args[]) {
		try {
			// ���ݷ�����IP �Ͷ˿ںţ�����socket����
			Socket sock = new Socket("127.0.0.1", 2345);
			// ��socket�����ϻ��������
			BufferedReader in = new BufferedReader(new InputStreamReader(sock
					.getInputStream()));
			// ��������in�� ��ȡһ�з���Ϣ
			String s = in.readLine();
			// ����Ļ�������Ϣ
			System.out.println(s);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
