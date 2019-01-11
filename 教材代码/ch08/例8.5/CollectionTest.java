import java.util.*;
class CollectionTest {
		public static void main(String[] args) {
			CollectionTest test = new CollectionTest();
			Set set = new HashSet();
			set.add("One");
			set.add("Two");
			set.add("Three");
			test.print(set);
			List list = new ArrayList();
			list.add("AAA");
			list.add("BBB");
			list.add("CCC");
			test.print(list);
		}

		public void print(Collection coll) {
			Iterator iter = coll.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
		}
}
