//数据流的应用
import java.io.*;

class DataStreamDemo {
	public static void main(String args[]) {
		File f = new File("employee.txt");// 数据存放文件

		try {// 创建文件,添加内容,为字节输出流
			FileOutputStream out = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("张小山");
			dos.writeInt(22);
			dos.writeFloat(2345.67f);
			dos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {// 打开文件,显示内容,为字节输入流
			FileInputStream in = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(in);
			String name = dis.readUTF();
			int age = dis.readInt();
			float salary = dis.readFloat();
			dis.close();
			System.out.println("姓名：" + name);
			System.out.println("年龄：" + age);
			System.out.println("月薪：" + salary);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
