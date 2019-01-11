//�����ȡ�ļ�������
import java.io.*;

public class RandomAccessFileDemo {
	public static void main(String arg[]) {
		try {
			// ����ָ���������ļ�����������"��д"���ܵ�RandomAccessFile����
			RandomAccessFile raf = new RandomAccessFile("numbers.dat", "rw");
			// ��0,1,..,9��ƽ��д�������ļ���
			for (int i = 0; i < 10; i++)
				raf.writeInt(i * i);

			// ��ȡ�����ļ��д���ż��λ�õ�����
			System.out.println("����ż��λ�õ�����: ");
			long length = raf.length();// �õ��ļ������ֽ���
			for (int i = 4; i < length; i += 2 * 4) {// һ������ռ4�ֽ�
				raf.seek(i);// ��λż��λ�����ݵ��ֽ�λ��
				System.out.print(raf.readInt() + "  ");
			}

			raf.close();// �ر��ļ�
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}