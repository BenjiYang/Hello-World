//��ͼ��FileInputStream�����ԡ����ֽڡ���ʽȥ��ȡ����ʾ�ı��ļ�����
import java.io.*;

class FileDisplay1 {
	public static void main(String args[]) throws IOException {
		FileInputStream infile = new FileInputStream("d:\\mydir\\readme.txt");
		try {
			int i = infile.read();// �ȶ�ȡһ���ֽ�
			while (i != -1) {// ��ָ�뵽�������β��ʱ����
				System.out.print((char) i);// ��һ���ֽ�ǿ��ת��Ϊһ���ַ�,�����
				i = infile.read();// ��ȡ��һ���ֽ�
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			infile.close();//�ر�������
		}
	}
}
