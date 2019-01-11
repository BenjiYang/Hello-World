//FileOutputStream应用:创建文件并写入内容
import java.io.*;

class FileWrite {
	public static void main(String args[]) throws IOException {
		File f = new File("test.txt");
		FileOutputStream outfile = new FileOutputStream(f, true);
		try {
			for (int i = 'A'; i <= 'Z'; i++)
				outfile.write(i);// 写入int型数据
			outfile.write('\t');// 写入制表位
			byte buf[] = "Java程序设计".getBytes();// 将字符串转换字节数组
			outfile.write(buf);// 写入字节数组数据
			outfile.write('\r');// 写入回车符
			outfile.write('\n');// 写入换行符
			System.out.println("文件内容写入完毕！");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			outfile.close();// 关闭输出流
		}

	}
}
