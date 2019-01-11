//例12－10	播放声音
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.*;
public class AudioPlayerTest extends Applet {
	AudioClip audioClip = null; // 定义一个 AudioClip对象
	public AudioPlayerTest() {
		super();
	}
	public void destroy() { }
	public void init() {
		try {
			// 返回 URL 参数指定的 AudioClip 对象。
			audioClip = getAudioClip(new URL(getCodeBase(), "sample.au"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public void paint(java.awt.Graphics g) {
		audioClip.play();// 开始播放此音频剪辑
		audioClip.loop();// 以循环方式开始播放此音频剪辑。
	}
	public void start() {
	}
	public void stop() {
		audioClip.stop();// 停止播放此音频剪辑
	}
}
