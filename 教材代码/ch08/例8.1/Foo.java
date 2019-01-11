class Foo{
private String information;
public Foo(){		
}

public Foo(String info){
		this.information = info;
}
public void setInfo(String info ){
		this.information = info;
}
public String getInfo( ){
		return this.information;
}
public static void main(String[] args ){
		Foo f1=new Foo("Apple");
		System.out.println(f1.getInfo());
}
}
