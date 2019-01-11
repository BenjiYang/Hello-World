//实例14.5对线程的各状态转换的使用
public class ControlThread extends Thread {
	public ControlThread(String name) {
		super(name);
	}
	public void run() {
		loop();
	}
	public void loop() {
		String name = Thread.currentThread().getName();// 获得当前线程名称
		System.out.println("进入循环函数：" + name);
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException x) {
				System.out.println("线程被打断了");
			}
			System.out.println("线程名：" + name);
		}
		System.out.println("离开循环函数：" + name);
	}
	public static void main(String args[]) {
		ControlThread tn = new ControlThread("我的线程");// 创建新线程对象
		tn.start();// 启动线程,进入可运行状态
		tn.interrupt();// 对线程发出中断信号
		try {
			tn.join();// main线程停止，直到tn线程执行完毕，main线程才继续往下执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tn.loop();
	}
}
