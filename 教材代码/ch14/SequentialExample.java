//ʵ��14.1 �ó���ֱ��ӡ����A������B������
public class SequentialExample {
	public static void main(String args[]) {
		new Sequential("A").run();//����Sequential�����run()����
		new Sequential("B").run();//����Sequential�����run()����
	}
}

class Sequential {//������ͨ��Sequential
	String name = null;//��������
	public Sequential(String n) {
		name = n;
	}
	public void run() {		
		for (int i = 0; i < 5; i++) {//���У��δ�ӡ�����������
			try {//����һ��С�ڣ������������ʱ�䣬���ӻ�ѭ���ٶ�
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���ʣ�" + name);
		}
	}
}
