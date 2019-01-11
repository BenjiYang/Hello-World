class Foo<T> {
		private T information;
		public Foo(){
		
}
		public Foo(T info) {
			this.information = info;
		}
		public void setInfo(T info) {
			this.information = info;
		}
		public T getInfo() {
			return this.information;
		}
		public static void main(String[] args) {
			Foo f1 = new Foo<String>("Apple");
			System.out.println(f1.getInfo());
			Foo f2 = new Foo<Integer>(new Integer(100));
			System.out.println(f2.getInfo());
			Foo f3 = new Foo<Double>(new Double(22.58));
			System.out.println(f3.getInfo());
		}
}
