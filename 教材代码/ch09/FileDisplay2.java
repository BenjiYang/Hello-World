//ʹ��FileInputStream������ԡ��ֽ����顱��ʽȥ��ȡ����ʾ�ı��ļ�����
import java.io.*;

class FileDisplay2 {
	public static void main(String args[]) throws IOException {
		FileInputStream infile = new FileInputStream(
				"d:\\mydir\\readme.txt");
		try {
			byte[] b = new byte[128];//����һ���ֽ�����
			int i=infile.read(b);//��ȡ���ݴ�ŵ��ֽ������� 
			while (i != -1) {// ��ָ�뵽�������β��ʱ����
				System.out.print(new String(b,0,i));// ���ֽ���������ת��Ϊ�ַ����������
				i = infile.read(b);// ��ȡ�������ݴ�ŵ��ֽ������� 
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally{
			infile.close();//�ر�������			
		}
	}
}
