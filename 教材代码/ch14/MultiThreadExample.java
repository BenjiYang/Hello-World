//例14.2 该程序分别打印线程A与线程B各５次
public class MultiThreadExample {
	public static void main(String args[]) {// 依次创建两个线程并启动	
		new MyThread("A").start();//启动线程Ａ，调用MyTread类的run()方法
		new MyThread("B").start();//启动线程Ｂ，调用MyTread类的run()方法
	}
}

class MyThread extends Thread {//构建线程类MyThread
	public MyThread(String n) {
		super(n);
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {// 休眠一段小于１０００毫秒的时间，以延缓循环速度
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("访问：" + getName());
		}
	}
} 
