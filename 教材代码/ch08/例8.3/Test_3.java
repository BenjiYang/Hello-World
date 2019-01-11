interface IFoo {
		public <T> T view(T str);
}

class Bar implements IFoo {
		public <T> T view(T s) {
			System.out.println(s);
			return s;
		}
}

class Test_3 {
		public static void main(String[] args) {
			Bar b = new Bar();
			b.view("Hello world!");
			b.view(new Integer(100));
			b.view(new Double(200.55));
			b.view(new Test_3().toString());
		}
}

