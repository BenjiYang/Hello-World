//FileWriter��Ӧ��
import java.io.*;

class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("myfile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("C++�������");
		bw.newLine();
		bw.write("Java�������");
		bw.newLine();
		bw.close();
		System.out.println("�ļ�����д�����");
	}
}