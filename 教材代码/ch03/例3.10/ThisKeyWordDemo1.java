public class ThisKeyWordDemo1 {
    	int x,y;
    	ThisKeyWordDemo1(int x){
	    	//使用this调用成员变量,"="左边的x是成员变量,右边的x是局部变量
        	this.x=x;   
 	}
	void f(){
		int x = 10;
         	this.y = 30;                                //调用成员变量的默认格式
		System.out.println("局部变量x="+x);         //成员变量被隐藏       
		System.out.println("y="+y);
         	this.g();                                   //调用成员方法的默认格式
    	}
    	void g(){
        	System.out.println("成员变量x="+this.x);    //使用this调用成员变量
    	}
    	public static void main(String[] args){
        	ThisKeyWordDemo1 td=new ThisKeyWordDemo1(20);
        	td.f();                         
    	}
}
