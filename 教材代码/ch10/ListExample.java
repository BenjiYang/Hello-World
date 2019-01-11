import java.awt.*;
public class ListExample extends Frame{
List list1, list2;
Label select1, select2;
ListExample() {
	setTitle("List Example");
	setLayout(new FlowLayout());
    list1 = new List(4, true);
	list2 = new List(4, false);
	select1 = new Label("Select one or more:");
	select2 = new Label("Select only one:      ");
	list1.add("Java");
	list1.add("Servlets");
	list1.add("EJB");
	list1.add("JSP");
	list2.add("ASP");
	list2.add(".NET");
	list2.add("VC++");
	list2.add("VB");
	list2.add("ActiveX");
	add(select1);
	add(list1);
	add(select2);
	add(list2);
	setSize(300,200);
	setVisible(true);
	}
	public static void main(String[] args) {
		ListExample testL= new ListExample();
		}
	}