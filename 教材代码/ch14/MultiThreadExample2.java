//例14.4 该程序分别打印线程A、线程B、线程Ｃ各３次
public class MultiThreadExample2 {
	public static void main(String args[]) {
		// 将MyThread2的对象作为Thread类的构造方法的参数，创建线程对象
		Thread t1 = new Thread(new MyThread2("A"));
		Thread t2 = new Thread(new MyThread2("B"));
		Thread t3 = new Thread(new MyThread2("C"));
		t1.start();// 启动线程t1
		t2.start();
		t3.start();
	}
}

class MyThread2 implements Runnable {
// 定义线程类MyThread2，实现Runnable接口
	String name;
	public MyThread2(String n) {
		name = n;
	}	
	public void run() {// 线程执行主体
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("访问：" + name);
		}
	}
}
