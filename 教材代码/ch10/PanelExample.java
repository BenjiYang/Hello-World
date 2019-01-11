import java.awt.*;
class PanelExample extends Panel {
	public static void main(String[] args) {
		Frame f = new Frame("Panel Example");
		PanelExample pe = new PanelExample();// 创建面板
		f.add(pe);// 将面板添加到框架
		Label message = new Label("欢迎你加入JAVA GUI学习！");
		f.add(message, BorderLayout.SOUTH);// 将标签放置到框架底部
		f.setSize(200, 200);
		f.setVisible(true);
	}
}
