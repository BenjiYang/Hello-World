//���л��������л�������
import java.io.*;

//ѧ����(�����л�),ʵ��Serializabler�ӿ�
class Student implements Serializable {
	String num;// ѧ��
	String name; // ����
	transient int age;// ����
	float average;// ƽ���ɼ�;

	Student(String s_id, String s_name, int s_age, float s_average) {// ���췽��
		num = s_id;
		name = s_name;
		age = s_age;
		average = s_average;
	}

	public void displsy() {
		System.out.print(num + "\t");
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(average + "\n");
	}
}

public class SerializableDemo {
	public static void main(String[] args) {
		// ������������
		Student zhang = new Student("0712345601", "��С��", 19, 87.6f);
		Student li = new Student("0712345602", "���", 21, 90.3f);
		Student wang = new Student("0712345603", "������", 20, 77.2f);

		// ����Ϊ���л�����
		try {
			// �����ļ��ֽ������,���Դ����ɶ��������
			FileOutputStream file_out = new FileOutputStream("students.dat");
			ObjectOutputStream object_out = new ObjectOutputStream(file_out);
			// ����������д������
			object_out.writeObject(zhang);
			object_out.writeObject(li);
			object_out.writeObject(wang);
			object_out.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		// ����Ϊ�����л�����
		try {
			// �����ļ��ֽ�������,���Դ����ɶ���������
			FileInputStream file_in = new FileInputStream("students.dat");
			ObjectInputStream object_in = new ObjectInputStream(file_in);
			Student st = null;
			int i;
			System.out.println("ѧ��\t\t����\t����\tƽ���ɼ�");
			for (i = 0; i < 3; i++) {
				st = (Student) object_in.readObject();
				st.displsy();
			}
			object_in.close();
		} catch (ClassNotFoundException e) {
			System.out.println("���ܶ�������!");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
