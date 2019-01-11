//��������Ӧ��
import java.io.*;

class DataStreamDemo {
	public static void main(String args[]) {
		File f = new File("employee.txt");// ���ݴ���ļ�

		try {// �����ļ�,�������,Ϊ�ֽ������
			FileOutputStream out = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("��Сɽ");
			dos.writeInt(22);
			dos.writeFloat(2345.67f);
			dos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {// ���ļ�,��ʾ����,Ϊ�ֽ�������
			FileInputStream in = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(in);
			String name = dis.readUTF();
			int age = dis.readInt();
			float salary = dis.readFloat();
			dis.close();
			System.out.println("������" + name);
			System.out.println("���䣺" + age);
			System.out.println("��н��" + salary);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
