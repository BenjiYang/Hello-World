//�ļ��ĸ��ƣ��÷�Ҫ��java CopyFile Դ�ļ� Ŀ���ļ�   (��Ŀ¼��ָ�����/��ʾ)
import java.io.*;

class CopyFile {
	public static void main(String args[]) throws IOException {
		long len = 0L;
		byte[] b = new byte[1024];// �����ֽ�����
		FileInputStream fin = new FileInputStream(args[0]);// ����������
		FileOutputStream fout = new FileOutputStream(args[1]);// ���������
		try {
			int i = fin.read(b);//��ȡ�ֽڵ�����b
			while (i != -1) {
				fout.write(b, 0, i);//д��ʵ�ʶ�ȡ���ֽ���
				len += i;//�ۼӸ����ֽ���
				i = fin.read(b);//��ȡ�����ֽڵ�����b
			}
			System.out.println("��Դ�ļ�������" + len + "�ֽڵ�Ŀ���ļ����ļ�������ϣ�");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			fin.close();// �ر�������
			fout.close();//�ر������			
		}
	}
}
