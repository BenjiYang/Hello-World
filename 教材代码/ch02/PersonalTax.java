//例 2.6 通过命令行方式输入月工资,用if...else...语句判断是否需要交纳个人所得税
public class PersonalTax {
	public static void main(String args[]) {
		double salary;
		salary = Double.parseDouble(args[0]);
		System.out.println("您的月工资为: " + salary + "元");
		if (salary > 2000.0)
			System.out.println("根据税法，您应该交纳个人所得税。");
		else
			System.out.println("根据税法，您现在不用交纳个人所得税。");
	}
}