package OopsConcept;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable h= new Hashtable();
		
		h.put(1, 100);
		h.put("a", "hello");
		h.put('c', 'j');
		System.out.println(h.size());
		h.put(2, 22.333);
		h.put(3, "Tom");
		System.out.println(h.size());
		System.out.println(h.get('c'));
		System.out.println(h.get(3));
		h.remove('c');
		System.out.println(h.size());
		//to restrict for particular type
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(2, null);
		h1.put(1, 300);
		h1.put(5, 400);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer,String>();
		h2.put(2, "a");

	}

}
