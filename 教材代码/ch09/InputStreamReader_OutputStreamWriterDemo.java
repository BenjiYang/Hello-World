import java.io.*;

public class InputStreamReader_OutputStreamWriterDemo {
	public static void main(String[] args) throws Exception {
		String str1 = "��ѧ";
		char cbuf[] = new char[str1.length()];
		str1.getChars(0, str1.length(), cbuf, 0);// ���ַ���str1���ݴ�ŵ��ַ�����cbuf
		String str2 = "�������ѧԺ";

		// �ȴ����ļ��ֽ������,�ٴ����ַ������
		FileOutputStream fos = new FileOutputStream("char.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		// �Զ��ַ�ʽд���ַ�����
		osw.write('��');// д��һ���ַ�
		osw.write('��');// д��һ���ַ�
		osw.write(cbuf);// д���ַ���������
		osw.write(str2);// д���ַ�������
		osw.close();

		// �ȴ����ļ��ֽ�������,�ٴ����ַ�������
		FileInputStream fis = new FileInputStream("char.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		char mychars[] = new char[str1.length() + str2.length()];// ����һ���ܴ��str1��str2���ַ�����
		System.out.print((char) isr.read());// ���ַ���ʽ��ȡ��1���ַ�,�����
		System.out.print((char) isr.read());// ���ַ���ʽ��ȡ��2���ַ�,�����
		int len = isr.read(mychars, 0, str1.length() + str2.length());// ���ַ����鷽ʽ��ȡʣ���ַ�
		System.out.print(new String(mychars, 0, len));// ���ַ�����������ϵͳĬ���ַ��������ַ���,�����
		isr.close();
	}
}
