abstract class Figure{
	 float width,height;
	 Figure(float w,float h){
		width=w;
		height=h;
	 }
	 abstract float getArea();		//���󷽷�
}

class Triangle extends Figure{
	Triangle(float bottom,float height){
		 super(bottom,height);
	}
	 //ʵ�ֳ��󷽷�
	float getArea(){
		 return width*height/2;
	}
}

class Rectangle extends Figure{
	 Rectangle(float w,float h){
		 super(w,h);
	 }
	 //ʵ�ֳ��󷽷�
	 float getArea(){
		 return width*height;
	 }
}

public class AbstractReferenceDemo {
	 public static void main(String[] args){
		 Figure figure;					//����Figure���ͱ���
		 figure=new Triangle(3.0f,6.0f); //�����������͵�Triangle������������ת�Ͷ���
		 System.out.println("�����ε����Ϊ:"+figure.getArea());
		 figure=new Rectangle(3.0f,6.0f);//�����������͵�Rectangle������������ת�Ͷ���
		 System.out.println("���ε����Ϊ:"+figure.getArea());
	 }
}
