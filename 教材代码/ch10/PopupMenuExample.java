import java.awt.*;
public class PopupMenuExample{
	public static void main(String args[]){
	Frame fm = new Frame("弹出式菜单");

	PopupMenu pEdit = new PopupMenu();// 创建弹出式菜单
	MenuItem miCut = new MenuItem("剪切");
	MenuItem miCopy = new MenuItem("复制");
	MenuItem miPaste = new MenuItem("粘贴");
	pEdit.add(miCut);//将菜单项添加到弹出式菜单中
	pEdit.add(miCopy);
	pEdit.add(miPaste);

	fm.add(pEdit);//将弹出式菜单添加到框架中
	fm.setSize(300, 200);
	fm.setVisible(true);

	pEdit.show(fm, 50, 50);//在指定位置显示弹出式菜单
}
}