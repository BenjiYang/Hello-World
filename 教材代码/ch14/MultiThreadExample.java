//��14.2 �ó���ֱ��ӡ�߳�A���߳�B������
public class MultiThreadExample {
	public static void main(String args[]) {// ���δ��������̲߳�����	
		new MyThread("A").start();//�����̣߳�������MyTread���run()����
		new MyThread("B").start();//�����̣߳£�����MyTread���run()����
	}
}

class MyThread extends Thread {//�����߳���MyThread
	public MyThread(String n) {
		super(n);
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {// ����һ��С�ڣ������������ʱ�䣬���ӻ�ѭ���ٶ�
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���ʣ�" + getName());
		}
	}
} 
