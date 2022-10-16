package day03;
import java.util.Map;
import java.util.TreeMap;

public class 트리맵 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "a");
		scores.put(98, "b");
		scores.put(75, "c");
		scores.put(95, "d");
		scores.put(80, "e");
		scores.put(87, "f");
		
		//주소라 이미 지워짐
//		TreeMap<Integer, String> scores2 = scores;
		TreeMap<Integer, String> scores2 = new TreeMap<Integer, String>();
		scores2.put(87, "a");
		scores2.put(98, "b");
		scores2.put(75, "c");
		scores2.put(95, "d");
		scores2.put(80, "e");
		scores2.put(87, "f");
		
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수" + entry.getKey() + " " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수" + entry.getKey() + " " + entry.getValue());
		
		while (!scores.isEmpty() ) {
			entry = scores.pollFirstEntry(); //작은 것부터 따옴 ->메모리에서 빠짐 (버려짐)
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("-------------------");
		//위에서 다따져서 비어서 빈값//
//		while (!scores.isEmpty() ) {
//			entry = scores.pollLastEntry();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		while (!scores2.isEmpty() ) {
			entry = scores2.pollLastEntry(); //큰 것부터 따옴 ->메모리에서 빠짐 (버려짐)
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}

}
