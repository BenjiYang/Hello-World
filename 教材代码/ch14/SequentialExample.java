//实例14.1 该程序分别打印序列A与序列B各５次
public class SequentialExample {
	public static void main(String args[]) {
		new Sequential("A").run();//调用Sequential对象的run()方法
		new Sequential("B").run();//调用Sequential对象的run()方法
	}
}

class Sequential {//构建普通类Sequential
	String name = null;//序列名称
	public Sequential(String n) {
		name = n;
	}
	public void run() {		
		for (int i = 0; i < 5; i++) {//进行５次打印输出序列名称
			try {//休眠一段小于１０００毫秒的时间，以延缓循环速度
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("访问：" + name);
		}
	}
}
