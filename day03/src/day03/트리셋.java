package day03;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class 트리셋 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87);
		scores.add(88);
		scores.add(98);
		scores.add(75);
		scores.add(80);
		scores.add(85);
		
		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수 " + score);
		score = scores.last();
		System.out.println("가장 높은 점수 " + score);
		score = scores.lower(95);
		System.out.println("95점 아래 점수 " + score);
		score = scores.higher(95);
		System.out.println("95 점 위 점수 " + score);
		
		NavigableSet<Integer> desendingSet =  scores.descendingSet(); //정렬
		for (Integer score1 : desendingSet) {
			System.out.print(score1 + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> desendingSet1 =  desendingSet.descendingSet();
		for (Integer score1 : desendingSet1) {
			System.out.print(score1 + " ");
		}
		
	}

}
