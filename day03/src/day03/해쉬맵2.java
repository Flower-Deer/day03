package day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해쉬맵2 {
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(3334, 1111);
		map.put(2224, 1112);
		map.put(1114, 1113);
		map.put(1234, 1000);
		
		Set Keyset = map.keySet();
		Iterator<Integer> it = Keyset.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(map.get(key));
		}
	}
	
}
