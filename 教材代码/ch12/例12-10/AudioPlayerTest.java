//��12��10	��������
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.*;
public class AudioPlayerTest extends Applet {
	AudioClip audioClip = null; // ����һ�� AudioClip����
	public AudioPlayerTest() {
		super();
	}
	public void destroy() { }
	public void init() {
		try {
			// ���� URL ����ָ���� AudioClip ����
			audioClip = getAudioClip(new URL(getCodeBase(), "sample.au"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public void paint(java.awt.Graphics g) {
		audioClip.play();// ��ʼ���Ŵ���Ƶ����
		audioClip.loop();// ��ѭ����ʽ��ʼ���Ŵ���Ƶ������
	}
	public void start() {
	}
	public void stop() {
		audioClip.stop();// ֹͣ���Ŵ���Ƶ����
	}
}
