import java.io.*;

public class FileSpace {
	public static void main(String[] args) throws IOException {
		System.out.println(args[0]+" ռ�õĴ��̿ռ�Ϊ: "+getTotal(args[0])+"�ֽ�");
	}

	public static long getTotal(String pathName) throws IOException {
		long total = 0;
		File file = new File(pathName);
		if (file.isFile()) {// ��Ϊ�ļ�,�������С
			return file.length();
		} else {// ����Ŀ¼,��ѭ����ʽ�ۼ���Ŀ¼���ļ�ռ�ÿռ�
			String[] childFilePathName = file.list();
			for (int i = 0; i < childFilePathName.length; i++) {
				total += getTotal(pathName + "/" + childFilePathName[i]);//�õݹ鷽���õ��ļ�����Ŀ¼��ռ�ռ�
			}
		}
		return total;
	}
}