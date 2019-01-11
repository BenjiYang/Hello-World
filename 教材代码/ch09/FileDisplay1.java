//试图用FileInputStream对象以“逐字节”方式去读取、显示文本文件内容
import java.io.*;

class FileDisplay1 {
	public static void main(String args[]) throws IOException {
		FileInputStream infile = new FileInputStream("d:\\mydir\\readme.txt");
		try {
			int i = infile.read();// 先读取一个字节
			while (i != -1) {// 读指针到达输出流尾部时结束
				System.out.print((char) i);// 将一个字节强制转换为一个字符,并输出
				i = infile.read();// 读取下一个字节
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			infile.close();//关闭输入流
		}
	}
}
