import java.io.*;

public class FileSpace {
	public static void main(String[] args) throws IOException {
		System.out.println(args[0]+" 占用的磁盘空间为: "+getTotal(args[0])+"字节");
	}

	public static long getTotal(String pathName) throws IOException {
		long total = 0;
		File file = new File(pathName);
		if (file.isFile()) {// 如为文件,返回其大小
			return file.length();
		} else {// 若是目录,用循环方式累计子目录和文件占用空间
			String[] childFilePathName = file.list();
			for (int i = 0; i < childFilePathName.length; i++) {
				total += getTotal(pathName + "/" + childFilePathName[i]);//用递归方法得到文件或子目录所占空间
			}
		}
		return total;
	}
}