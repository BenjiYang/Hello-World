import java.io.*;

public class DeleteFile {
	public static void main(String[] args) throws IOException {
		DeleteFile df = new DeleteFile();
		if (df.del(args[0])) {
			System.out.println("ɾ��" + args[0] + "�ɹ���");
		} else {
			System.out.println("ɾ��" + args[0] + "ʧ�ܣ�");
		}
	}

	public boolean del(String pathName) throws IOException {
		File file = new File(pathName);
		boolean result = false;
		if (file.isFile()) {// ���fileΪ�ļ�����ֱ��ɾ��
			result = file.delete();
		} else if (file.isDirectory()) {// ��file��Ŀ¼����ɾ����Ŀ¼�µ�������Ŀ¼���ļ�
			File[] lists = file.listFiles();
			for (int i = 0; i < lists.length; i++)
				del(lists[i].getAbsolutePath());// �ݹ�ɾ����ǰĿ¼�µ�������Ŀ¼���ļ�

			result = file.delete();// ���ɾ����ǰĿ¼
		}
		return result;
	}
}
