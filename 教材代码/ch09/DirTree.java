//��ʾ��ǰĿ¼�µ��ļ���Ŀ¼��Ϣ
import java.io.*;

public class DirTree {
	public static void main(String args[]) {
		File dir = new File(System.getProperty("user.dir"));//��ǰĿ¼��System�෽�����
		System.out.println("��ǰĿ¼��" + dir.getAbsolutePath());		
		File mylist[] = dir.listFiles();// ����ָ��Ŀ¼�������ļ���Ŀ¼
		for (int i = 0; i < mylist.length; i++) {
			if (mylist[i].isDirectory()) {
				System.out.println("\t��Ŀ¼: " + mylist[i].getName());
			}else{
				System.out.println("\t�ļ���: " + mylist[i].getName()+", ��С: "+mylist[i].length()+"�ֽ�");
			}
		}
	}
}
