public class ThisKeyWordDemo1 {
    	int x,y;
    	ThisKeyWordDemo1(int x){
	    	//ʹ��this���ó�Ա����,"="��ߵ�x�ǳ�Ա����,�ұߵ�x�Ǿֲ�����
        	this.x=x;   
 	}
	void f(){
		int x = 10;
         	this.y = 30;                                //���ó�Ա������Ĭ�ϸ�ʽ
		System.out.println("�ֲ�����x="+x);         //��Ա����������       
		System.out.println("y="+y);
         	this.g();                                   //���ó�Ա������Ĭ�ϸ�ʽ
    	}
    	void g(){
        	System.out.println("��Ա����x="+this.x);    //ʹ��this���ó�Ա����
    	}
    	public static void main(String[] args){
        	ThisKeyWordDemo1 td=new ThisKeyWordDemo1(20);
        	td.f();                         
    	}
}
