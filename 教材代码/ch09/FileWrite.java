//FileOutputStreamӦ��:�����ļ���д������
import java.io.*;

class FileWrite {
	public static void main(String args[]) throws IOException {
		File f = new File("test.txt");
		FileOutputStream outfile = new FileOutputStream(f, true);
		try {
			for (int i = 'A'; i <= 'Z'; i++)
				outfile.write(i);// д��int������
			outfile.write('\t');// д���Ʊ�λ
			byte buf[] = "Java�������".getBytes();// ���ַ���ת���ֽ�����
			outfile.write(buf);// д���ֽ���������
			outfile.write('\r');// д��س���
			outfile.write('\n');// д�뻻�з�
			System.out.println("�ļ�����д����ϣ�");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			outfile.close();// �ر������
		}

	}
}
