//��14.3 �ó���ֱ��ӡ�߳�A���߳�B���̣߳ø�����
public class MultiThreadExample1 {
	public static void main(String args[]) {
		MyThread1 t1 = new MyThread1("A");// �����̶߳���t1
		MyThread1 t2 = new MyThread1("B");
		MyThread1 t3 = new MyThread1("C");
		t1.start();// �����߳�t1
		t2.start();
		t3.start();
	}
}

class MyThread1 extends Thread {// �����߳���MyThread1������̳���Thread
	String name;

	public MyThread1(String n) {
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
