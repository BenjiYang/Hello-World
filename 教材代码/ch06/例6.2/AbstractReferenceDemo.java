abstract class Figure{
	 float width,height;
	 Figure(float w,float h){
		width=w;
		height=h;
	 }
	 abstract float getArea();		//抽象方法
}

class Triangle extends Figure{
	Triangle(float bottom,float height){
		 super(bottom,height);
	}
	 //实现抽象方法
	float getArea(){
		 return width*height/2;
	}
}

class Rectangle extends Figure{
	 Rectangle(float w,float h){
		 super(w,h);
	 }
	 //实现抽象方法
	 float getArea(){
		 return width*height;
	 }
}

public class AbstractReferenceDemo {
	 public static void main(String[] args){
		 Figure figure;					//声明Figure类型变量
		 figure=new Triangle(3.0f,6.0f); //创建抽象类型的Triangle子类对象的向上转型对象
		 System.out.println("三角形的面积为:"+figure.getArea());
		 figure=new Rectangle(3.0f,6.0f);//创建抽象类型的Rectangle子类对象的向上转型对象
		 System.out.println("矩形的面积为:"+figure.getArea());
	 }
}
