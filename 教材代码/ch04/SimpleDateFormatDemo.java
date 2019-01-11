//SimpleDateFormat类的使用
import java.util.*;
import java.text.*;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Calendar now = new GregorianCalendar();// 以系统当前时间来创建日历对象
		SimpleDateFormat formatter = new SimpleDateFormat();// 创建SimpleDateFormat对象
		formatter.applyPattern("现在时间: yyyy年MM月dd日 HH时mm分ss秒");// 设置输出模式
		String str = formatter.format(now.getTime());// 转换成Date类型,并输出
		System.out.println(str);
		// 以第16届亚运会开幕时间创建另一个日历对象
		Calendar Asian16 = new GregorianCalendar(2010, 10, 12, 20, 0, 0);
		// 得到这两个时点之间相差的毫秒数
		long distance = Asian16.getTimeInMillis() - now.getTimeInMillis();
		int days = (int) (distance / (24 * 60 * 60 * 1000)); // 转换为天数
		// 剩余的转换为"总秒数"
		long seconds = (distance % (24 * 60 * 60 * 1000)) / 1000;
		int hh = (int) (seconds / (60 * 60)); // 转换成小时数
		int mm = (int) ((seconds % (60 * 60)) / 60); // 转换成分钟数
		int ss = (int) ((seconds % (60 * 60)) % 60); // 转换成秒钟数

		System.out.println("距离2010年11月12日第16届亚运会开幕还有:" + days + "天" + hh + "时"+ mm + "分" + ss + "秒");
	}
}