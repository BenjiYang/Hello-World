class ArrayDoubler{
         void doubler(int a[]){	//������Ԫ��ֵ�ӱ�
        	for(int i=0;i<a.length;i++){
            		a[i]*=2;
        	}
    	}
}

public class MethodCallDemo3 {
   	public static void main(String[] args){
        	int arr[]={1,2};
        	ArrayDoubler ad=new ArrayDoubler();
        	System.out.println("����doubler����ǰ:");
        	for(int i=0;i<arr.length;i++){
            		System.out.println("arr["+i+"]="+arr[i]);
        	}
              	ad.doubler(arr);                          //�򷽷���������arr������
        		System.out.println("����doubler������:");
        		for(int i=0;i<arr.length;i++){
            		System.out.println("arr["+i+"]="+arr[i]);
        	}
    	}
}
