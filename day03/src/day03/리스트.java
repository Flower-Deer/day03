package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 리스트 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//1_리스트 생성 및 추가
		list.add("AA");
		list.add("BB");
		list.add(1,"CC"); //1번 index자리에 CC를 넣음.
		list.add("AA");
		list.add("DD");
		
		//리스트 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//리스트 삭제
		list.remove(4);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("지우고 난 후 list" + list.get(i));
		}
		
		//2_리스트 생성
		List<String> list1 = Arrays.asList("11", "22", "33", "44");
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("list1 생성 > " + list1.get(i));
		}
		
	}
	
}
