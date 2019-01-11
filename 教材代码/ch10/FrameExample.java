import java.awt.*;
class FrameExample extends Frame {
	FrameExample() {
		Label message = new Label("欢迎你加入JAVA学习行列！");//创建一个Label实例
		add(message); //将message增加到frame
	}
	public static void main(String[] args) {
		FrameExample f = new FrameExample();
		f.setTitle("这是Frame练习程序"); //设置frame标题
		f.setSize(300, 100); //设置frame大小
		f.setVisible(true); //显示窗口
	}
}