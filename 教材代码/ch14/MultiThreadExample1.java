//例14.3 该程序分别打印线程A、线程B、线程Ｃ各３次
public class MultiThreadExample1 {
	public static void main(String args[]) {
		MyThread1 t1 = new MyThread1("A");// 创建线程对象t1
		MyThread1 t2 = new MyThread1("B");
		MyThread1 t3 = new MyThread1("C");
		t1.start();// 启动线程t1
		t2.start();
		t3.start();
	}
}

class MyThread1 extends Thread {// 定义线程类MyThread1，必须继承类Thread
	String name;

	public MyThread1(String n) {
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
