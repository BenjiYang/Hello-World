//实例14.7 Box对象用来存放数据
public class Box {
		private int value;
		// 是否可以使用，true可读取数据，false可写入数据
		private boolean available = false;
		public void put(int value) {
			while (available == true) {
				try {
					wait();// 等待，提供给其他线程使用
				}catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
		available = true;// 表示可读取数据
		notifyAll();// 唤醒所有等待线程
		this.value = value;// 写入数据
	}
	public int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available = false;// 表示可写入数据
		notifyAll();// 唤醒所有等待线程
		return this.value;// 读取数据
	}
}

public class 生产者 extends Thread {//生产者对象产生数据
	private Box box;
	private String name;
	public 生产者(Box b, String n) {
		box = b;
		name = n;
	}
	public void run() {
		for (int i = 1; i < 6; i++) {
			synchronized (box) {
				box.put(i);// 存放数据i入box对象
				System.out.println("生产者" + name + "生产产品:" + i);
				try {
					sleep((int) (Math.random() * 100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class 消费者 extends Thread {//消费者对象获取数据
	private Box box;
	private String name;
	public 消费者(Box b, String n) {
		box = b;
		name = n;
	}
	public void run() {
		for (int i = 1; i < 6; i++) {
			synchronized (box) {
				box.get();// 从box对象中取出数据i
				System.out.println("消费者" + name + "取得产品:" + i);
				try {
					sleep((int) (Math.random() * 100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class 生产者消费者测试 {//主类
	public static void main(String args[]) {
		Box box = new Box();
		生产者 p = new 生产者(box, "001");// 创建生产者001，往box对象中存数据
		消费者 c = new 消费者(box, "002");// 创建消费者002，从box对象中取数据
		p.start();
		c.start();
	}
}
