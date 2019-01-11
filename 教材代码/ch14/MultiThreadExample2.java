//��14.4 �ó���ֱ��ӡ�߳�A���߳�B���̣߳ø�����
public class MultiThreadExample2 {
	public static void main(String args[]) {
		// ��MyThread2�Ķ�����ΪThread��Ĺ��췽���Ĳ����������̶߳���
		Thread t1 = new Thread(new MyThread2("A"));
		Thread t2 = new Thread(new MyThread2("B"));
		Thread t3 = new Thread(new MyThread2("C"));
		t1.start();// �����߳�t1
		t2.start();
		t3.start();
	}
}

class MyThread2 implements Runnable {
// �����߳���MyThread2��ʵ��Runnable�ӿ�
	String name;
	public MyThread2(String n) {
		name = n;
	}	
	public void run() {// �߳�ִ������
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���ʣ�" + name);
		}
	}
}
