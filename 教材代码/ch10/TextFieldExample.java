import java.awt.*;
import java.awt.Frame;
public class TextFieldExample extends Frame{
TextField emailID, password;

	TextFieldExample() {
		Frame f= new Frame();
		setLayout(new FlowLayout());
		setTitle("TextField Example");
		Label label1 = new Label("e-mail ID: ", Label.RIGHT);
		Label label2 = new Label("Password: ", Label.RIGHT);
		emailID = new TextField(12);
		password = new TextField(8);
		password.setEchoChar('*');
		add(label1);
		add(emailID);
		add(label2);
		add(password);
		setSize(200,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		TextFieldExample txtF= new TextFieldExample();
		}
	}