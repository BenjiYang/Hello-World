class Data{
    	private String msg;
    	Data(String s){
       		 msg=s;
    	}
    	public String getMsg(){
        	return msg;
    	}
    	public void printData(){
        	DataPrinter dp=new DataPrinter();
                dp.print(this);                        //this代表当前对象的引用
    	}
}

class DataPrinter{
    	void print(Data d){
        	System.out.println(d.getMsg());
    	}
}

public class ThisKeyWordDemo2 {
    	public static void main(String[] args){
        	Data d=new Data("Hello from Java!");
        	d.printData();                           //d为当前对象
    	}
}
