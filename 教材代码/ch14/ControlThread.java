//ʵ��14.5���̵߳ĸ�״̬ת����ʹ��
public class ControlThread extends Thread {
	public ControlThread(String name) {
		super(name);
	}
	public void run() {
		loop();
	}
	public void loop() {
		String name = Thread.currentThread().getName();// ��õ�ǰ�߳�����
		System.out.println("����ѭ��������" + name);
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException x) {
				System.out.println("�̱߳������");
			}
			System.out.println("�߳�����" + name);
		}
		System.out.println("�뿪ѭ��������" + name);
	}
	public static void main(String args[]) {
		ControlThread tn = new ControlThread("�ҵ��߳�");// �������̶߳���
		tn.start();// �����߳�,���������״̬
		tn.interrupt();// ���̷߳����ж��ź�
		try {
			tn.join();// main�߳�ֹͣ��ֱ��tn�߳�ִ����ϣ�main�̲߳ż�������ִ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tn.loop();
	}
}
