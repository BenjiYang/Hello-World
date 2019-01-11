//Date类的使用
import java.util.*;

public class DateDemo {
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println("当前日期: " + currentDate);

		Date newDate = new Date(10000000000000L); // 距离起点的长度为100亿秒
		System.out.println("新的日期: " + newDate);

		System.out.println("当前日期早于新日期: " + currentDate.before(newDate));
		System.out.println("当前日期晚于新日期: " + currentDate.after(newDate));

		System.out.println("当前日期距离GMT 1970.1.1 00:00:00的毫秒数: "
				+ currentDate.getTime());
		Calendar now=Calendar.getInstance();
		System.out.println("当前日期: "+now);
	}
}
