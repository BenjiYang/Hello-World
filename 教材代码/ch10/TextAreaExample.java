import java.awt.*;
public class TextAreaExample extends Frame{
TextField emailID, password;
	TextArea textArea;
	TextField textField;
	Label email, message;
	String string;
	TextAreaExample() {
		string = "You cannot edit the text";
		setLayout(new FlowLayout());
		setTitle("TextArea Example");
		email = new Label("e-mail ID:");
		add(email);
		textField = new TextField(20);
		add(textField);
		message = new Label("Message:");
		add(message);
		textArea = new TextArea(5, 20);
		add(textArea);
		message = new Label("Message:");
		add(message);
		textArea = new TextArea(string, 3, 20);
		textArea.setEditable(false);
		add(textArea);
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		TextAreaExample txtF= new TextAreaExample();
		}
	}