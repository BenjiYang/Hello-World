class Data{
    	String msg;
    	Data(String str){
        	msg=str;
    	}
}

class DataPrinter{
   	void print(Data d){                   //�Զ�����Ϊ��������
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
        	System.out.println("��һ��������:"+data.msg);
        	dp.setMsg(data);                   // �򷽷����ݶ���data������
        	System.out.println("�ڶ���������:"+data.msg);
    	}
}
