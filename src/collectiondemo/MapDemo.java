package collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<String,String> mp = new HashMap<String,String>();
		
		mp.put("k1", "hello");
		
		mp.put("k2", "hello2");
		mp.put("k2", "hello3");
		
		mp.put("k5", "hello5");
		mp.put("k7", "hello7");
		
		System.out.println(mp.get("k2"));
		
		Set<String> keys = mp.keySet();
		for(String key : keys)
		{
			System.out.println(mp.get(key));
		}
	}
}
