package codingpractice;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) 
	{
		//declaring the hashmap: used to store key value pairs
		//creating the object to store the value
		HashMap<Integer,String> givenmapset = new HashMap<>();
		//passing key and values to hashmap object
		givenmapset.put(1, "a");
		givenmapset.put(null, "b");
		givenmapset.put(3, "c");
		givenmapset.put(4, "d");
		//printing the added key value pairs or hashmap
		System.out.println("Key valu pairs added in the given hash map set:"+givenmapset);
		//givenmapset.clear();
		//System.out.println("all the added key and values will be deleted:"+givenmapset);
		givenmapset.clone();
		System.out.println("it will give one more same copy of key and values as a result:"+givenmapset);
		givenmapset.compute(null, null);
		System.out.println(givenmapset);
	}

}
