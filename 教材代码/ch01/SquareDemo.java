import javax.swing.JOptionPane; //导入所需要的类

public class SquareDemo {
	public static void main(String args[]) {
		// 建立输入对话框来输入数据(字符串)
		String s = JOptionPane.showInputDialog("请输入一个数: ");
		double d = Double.parseDouble(s); // 将数据(字符串)转换为数值型
		double result = d * d;//计算结果
		// 建立消息对话框来输出结果
		JOptionPane.showMessageDialog(null, s + "的平方是：" + result);
	}
}
