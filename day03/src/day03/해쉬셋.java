package day03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 해쉬셋 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("AA");
		set.add("BB");
		set.add("CC");
		set.add("BB");
		set.add("AA");
		set.add("DD");
		
		System.out.println(set.size());
		
		Iterator<String> it = set.iterator(); //하나씩꺼내는 것
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		
	}

}
