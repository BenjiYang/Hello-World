import java.io.*;

public class DeleteFile {
	public static void main(String[] args) throws IOException {
		DeleteFile df = new DeleteFile();
		if (df.del(args[0])) {
			System.out.println("删除" + args[0] + "成功！");
		} else {
			System.out.println("删除" + args[0] + "失败！");
		}
	}

	public boolean del(String pathName) throws IOException {
		File file = new File(pathName);
		boolean result = false;
		if (file.isFile()) {// 如果file为文件，则直接删除
			result = file.delete();
		} else if (file.isDirectory()) {// 若file是目录，先删除该目录下的所有子目录和文件
			File[] lists = file.listFiles();
			for (int i = 0; i < lists.length; i++)
				del(lists[i].getAbsolutePath());// 递归删除当前目录下的所有子目录和文件

			result = file.delete();// 最后删除当前目录
		}
		return result;
	}
}
