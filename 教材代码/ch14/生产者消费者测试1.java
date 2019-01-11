//ʵ��14.7 Box���������������
public class Box {
		private int value;
		// �Ƿ����ʹ�ã�true�ɶ�ȡ���ݣ�false��д������
		private boolean available = false;
		public void put(int value) {
			while (available == true) {
				try {
					wait();// �ȴ����ṩ�������߳�ʹ��
				}catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
		available = true;// ��ʾ�ɶ�ȡ����
		notifyAll();// �������еȴ��߳�
		this.value = value;// д������
	}
	public int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available = false;// ��ʾ��д������
		notifyAll();// �������еȴ��߳�
		return this.value;// ��ȡ����
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
			synchronized (box) {
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
			synchronized (box) {
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
