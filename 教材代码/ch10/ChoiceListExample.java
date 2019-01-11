import java.awt.*;
public class ChoiceListExample extends Frame {
	Choice choice;
	Label select;
	ChoiceListExample() {
		setLayout(new FlowLayout());
		choice = new Choice();
		select = new Label("Choose your option:");
		choice.add("C++");
		choice.add("C");
		choice.add("Core Java");
		choice.add("DB2");
		add(select);
		add(choice);
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		ChoiceListExample testC = new ChoiceListExample();
	}
}
