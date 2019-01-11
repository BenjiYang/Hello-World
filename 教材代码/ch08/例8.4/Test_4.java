class Test_4 {
		public static void main(String[] args) {
			Foo f1 = new Foo();
			f1.setInfo(new Object());
			System.out.println(f1.getInfo());
			f1.setInfo("abc");
			System.out.println(f1.getInfo());
			f1.setInfo(123);
			System.out.println(f1.getInfo());
			f1.setInfo(new Test_4());
			System.out.println(f1.getInfo());
			f1.setInfo(new Integer(200));
			System.out.println(f1.getInfo());
			f1.setInfo(new String("Hello world!"));
			System.out.println(f1.getInfo());
		}
}
