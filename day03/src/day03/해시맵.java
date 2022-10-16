package day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵 {

	public static void main(String[] args) {
		//Map
		Map<String, Integer> map = new HashMap<String, Integer>(); //(객체,객체)를 써야함으로 Object만가능 Ex)Integer->int(X)
		
		//객체 삽입하기
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 100);
		
		//객체 검색하기
		System.out.println(map.get("B"));
		System.out.println(map.get("F")); //key가아닌것 -> null
		
		//객체 모두 출력
		// step1> key만 모은다.
		Set KeySet = map.keySet(); //key만모아서 Keyset에 저장
		Iterator<String> it = KeySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}

}
