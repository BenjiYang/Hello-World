import java.awt.*;
class FrameExample extends Frame {
	FrameExample() {
		Label message = new Label("��ӭ�����JAVAѧϰ���У�");//����һ��Labelʵ��
		add(message); //��message���ӵ�frame
	}
	public static void main(String[] args) {
		FrameExample f = new FrameExample();
		f.setTitle("����Frame��ϰ����"); //����frame����
		f.setSize(300, 100); //����frame��С
		f.setVisible(true); //��ʾ����
	}
}