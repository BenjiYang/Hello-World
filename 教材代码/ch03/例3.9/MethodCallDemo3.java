class ArrayDoubler{
         void doubler(int a[]){	//将数组元素值加倍
        	for(int i=0;i<a.length;i++){
            		a[i]*=2;
        	}
    	}
}

public class MethodCallDemo3 {
   	public static void main(String[] args){
        	int arr[]={1,2};
        	ArrayDoubler ad=new ArrayDoubler();
        	System.out.println("调用doubler方法前:");
        	for(int i=0;i<arr.length;i++){
            		System.out.println("arr["+i+"]="+arr[i]);
        	}
              	ad.doubler(arr);                          //向方法传递数组arr的引用
        		System.out.println("调用doubler方法后:");
        		for(int i=0;i<arr.length;i++){
            		System.out.println("arr["+i+"]="+arr[i]);
        	}
    	}
}
