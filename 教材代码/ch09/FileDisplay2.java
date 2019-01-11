//使用FileInputStream类对象以“字节数组”方式去读取、显示文本文件内容
import java.io.*;

class FileDisplay2 {
	public static void main(String args[]) throws IOException {
		FileInputStream infile = new FileInputStream(
				"d:\\mydir\\readme.txt");
		try {
			byte[] b = new byte[128];//定义一个字节数组
			int i=infile.read(b);//读取数据存放到字节数组中 
			while (i != -1) {// 读指针到达输出流尾部时结束
				System.out.print(new String(b,0,i));// 将字节数组内容转换为字符串，并输出
				i = infile.read(b);// 读取后续数据存放到字节数组中 
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally{
			infile.close();//关闭输入流			
		}
	}
}
