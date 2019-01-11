import java.awt.*;
public class setLayoutExample{
 public Frame jf = new Frame("setLayout Example");
 public Panel jpn = new Panel();
 public Button jb = new Button("setLayout");
 public setLayoutExample(){
  //jpn.setLayout(null);
  jf.add(jpn,BorderLayout.NORTH);
  jpn.setBackground(Color.orange);
  jpn.setBounds(10, 10, 50, 50);//设置组件的初始位置和大小。
  jpn.add(jb);
  jf.setSize(250,150);
  jf.setVisible(true);
 }
 public static void main(String[] args) {
  setLayoutExample testLY=new setLayoutExample();
 }
}