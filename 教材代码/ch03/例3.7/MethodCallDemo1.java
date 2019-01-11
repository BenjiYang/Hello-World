class Printer {
   	public void print(String name,int age){
        	age++;//修改参数值
        	System.out.println("您好!我叫"+name+",今年"+age+"岁,请关照!");
    	}
}

public class MethodCallDemo1 {
   	public static void main(String[] args){
        	Printer p=new Printer();
        	int age=26;
       		p.print("张捷",age);
       		System.out.println("调用方法后age的值为"+age);
    	}
}
