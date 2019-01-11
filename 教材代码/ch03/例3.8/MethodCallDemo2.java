class Data{
    	String msg;
    	Data(String str){
        	msg=str;
    	}
}

class DataPrinter{
   	void print(Data d){                   //以对象作为参数类型
        	System.out.println(d.msg);       
    	}
    	public void setMsg(Data d){           
        	d.msg="Hello to Java!";
    	}
}

public class MethodCallDemo2 {
    	public static void main(String[] args){
        	Data data=new Data("Hello from Java!");
        	DataPrinter dp=new DataPrinter();
        	System.out.println("第一次输出结果:"+data.msg);
        	dp.setMsg(data);                   // 向方法传递对象data的引用
        	System.out.println("第二次输出结果:"+data.msg);
    	}
}
