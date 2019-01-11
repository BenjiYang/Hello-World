import java.awt.*;
public class CheckboxExample extends Frame{
Checkbox servlets, jsp, ejb, vc;
	Button submit;
	CheckboxExample() {
	setTitle("Checkbox Example");
	setLayout(new FlowLayout());
	setFont(new Font("SansSerif", Font.BOLD, 15));
	servlets = new Checkbox("Servlets");
	jsp = new Checkbox("JSP");
	ejb = new Checkbox("EJB",true);
	vc = new Checkbox("VC++");
	submit = new Button("Submit");
	add(servlets);
	add(jsp);
	add(ejb);
	add(vc);
	add(submit);
	setSize(250,150);
	setVisible(true);
	}
	public static void main(String[] args) {
		CheckboxExample testCBX= new CheckboxExample();
		}
	}