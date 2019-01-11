//显示文件的有关信息
import java.io.*;

public class FileDemo {
	public static void main(String args[]) {
		File myfile = new File("d:\\test.txt");// 文件分隔符用"/"或"\\"表示
		if (myfile.exists()) {
			System.out.println("文 件 名：" + myfile.getName());
			System.out.println("绝对路径：" + myfile.getAbsolutePath());
			System.out.println("父 目 录：" + myfile.getParent());
			System.out.println("文件长度：" + myfile.length() + " 字节");
		} else {
			try {
				System.out.println("对不起，指定的文件未找到。");
				myfile.createNewFile();// 创建一个新文件
				System.out.println("已创建一个新文件!");
			} catch (IOException e) {
				System.out.println("出错信息：" + e);
			}
		}
	}
}
