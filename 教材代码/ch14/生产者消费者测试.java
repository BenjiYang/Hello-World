//ʵ��14.6 Box���������������
public class Box {
	private int value;	
	public void put(int value) {// �������
		this.value = value;
	}	
	public int get() {// ȡ������
		return this.value;
	}
}

public class ������ extends Thread {//�����߶����������
	private Box box;
	private String name;
	public ������(Box b, String n) {
		box = b;
		name = n;
	}
	public void run() {
		for (int i = 1; i < 6; i++) {
			box.put(i);// �������i��box����
			System.out.println("������" + name + "������Ʒ:" + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ������ extends Thread {//�����߶����ȡ����
	private Box box;
	private String name;
	public ������(Box b, String n) {
		box = b;
		name = n;
	}
	public void run() {
		for (int i = 1; i < 6; i++) {
			box.get();// ��box������ȡ������i
			System.out.println("������" + name + "ȡ�ò�Ʒ:" + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class �����������߲��� {//����
	public static void main(String args[]) {
		Box box = new Box();
		������ p = new ������(box, "001");// ����������001����box�����д�����
		������ c = new ������(box, "002");// ����������002����box������ȡ����
		p.start();
		c.start();
	}
}
