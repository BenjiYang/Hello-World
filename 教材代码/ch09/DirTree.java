//显示当前目录下的文件、目录信息
import java.io.*;

public class DirTree {
	public static void main(String args[]) {
		File dir = new File(System.getProperty("user.dir"));//当前目录由System类方法获得
		System.out.println("当前目录：" + dir.getAbsolutePath());		
		File mylist[] = dir.listFiles();// 返回指定目录的所有文件或目录
		for (int i = 0; i < mylist.length; i++) {
			if (mylist[i].isDirectory()) {
				System.out.println("\t子目录: " + mylist[i].getName());
			}else{
				System.out.println("\t文件名: " + mylist[i].getName()+", 大小: "+mylist[i].length()+"字节");
			}
		}
	}
}
