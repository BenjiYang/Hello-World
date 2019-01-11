//实例14.6 Box对象用来存放数据
public class Box {
	private int value;	
	public void put(int value) {// 存放数据
		this.value = value;
	}	
	public int get() {// 取出数据
		return this.value;
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

public class 消费者 extends Thread {//消费者对象获取数据
	private Box box;
	private String name;
	public 消费者(Box b, String n) {
		box = b;
		name = n;
	}
	public void run() {
		for (int i = 1; i < 6; i++) {
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

public class 生产者消费者测试 {//主类
	public static void main(String args[]) {
		Box box = new Box();
		生产者 p = new 生产者(box, "001");// 创建生产者001，往box对象中存数据
		消费者 c = new 消费者(box, "002");// 创建消费者002，从box对象中取数据
		p.start();
		c.start();
	}
}
