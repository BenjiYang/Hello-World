//��ʾ�ļ����й���Ϣ
import java.io.*;

public class FileDemo {
	public static void main(String args[]) {
		File myfile = new File("d:\\test.txt");// �ļ��ָ�����"/"��"\\"��ʾ
		if (myfile.exists()) {
			System.out.println("�� �� ����" + myfile.getName());
			System.out.println("����·����" + myfile.getAbsolutePath());
			System.out.println("�� Ŀ ¼��" + myfile.getParent());
			System.out.println("�ļ����ȣ�" + myfile.length() + " �ֽ�");
		} else {
			try {
				System.out.println("�Բ���ָ�����ļ�δ�ҵ���");
				myfile.createNewFile();// ����һ�����ļ�
				System.out.println("�Ѵ���һ�����ļ�!");
			} catch (IOException e) {
				System.out.println("������Ϣ��" + e);
			}
		}
	}
}
