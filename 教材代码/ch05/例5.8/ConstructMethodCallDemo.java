class A{
	A(){
		System.out.println("构造A类对象");
	}
}

class B extends A{
	B(){
		System.out.println("构造B类对象");
	}
}

class C extends B{
	C(){
		System.out.println("构造C类对象");
	}
}

class D extends C{
	D(){
		System.out.println("构造D类对象");
	}
}

public class ConstructMethodCallDemo {
	public static void main(String[] args){
		D d=new D();
	}
}
