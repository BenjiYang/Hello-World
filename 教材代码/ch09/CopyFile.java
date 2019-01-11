//文件的复制，用法要求：java CopyFile 源文件 目标文件   (根目录与分隔符用/表示)
import java.io.*;

class CopyFile {
	public static void main(String args[]) throws IOException {
		long len = 0L;
		byte[] b = new byte[1024];// 定义字节数组
		FileInputStream fin = new FileInputStream(args[0]);// 创建输入流
		FileOutputStream fout = new FileOutputStream(args[1]);// 创建输出流
		try {
			int i = fin.read(b);//读取字节到数组b
			while (i != -1) {
				fout.write(b, 0, i);//写入实际读取的字节数
				len += i;//累加复制字节数
				i = fin.read(b);//读取后续字节到数组b
			}
			System.out.println("从源文件复制了" + len + "字节到目标文件，文件复制完毕！");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			fin.close();// 关闭输入流
			fout.close();//关闭输出流			
		}
	}
}
