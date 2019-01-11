import java.util.*;
class myColection {
	public static void main(String[] ss) {
		Set hs = new HashSet();
		hs.add("Hello");
		hs.add("woeld");
		hs.add("世界");
		hs.add("你好");
		System.out.println(hs);
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
	}
		ArrayList al = new ArrayList();
		al.add("Hello");
		al.add("World");
		al.add("世界，你好！");
		System.out.println(al);
		Iterator it2 = al.iterator();
		while (it2.hasNext()) {
				System.out.println(it2.next());
			}
			Map hm = new HashMap();
			hm.put(1, "Hello");
			hm.put(5, "World");
			hm.put(3, "世界，你好！");
			System.out.println(hm);
			System.out.println(hm.get(5));
		}
	}
