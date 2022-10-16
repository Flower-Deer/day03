package day03;

import java.util.Stack;

public class 컬렉션스텍 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(90);
		stack.push(91);
		stack.push(92);
		stack.push(93);

//		System.out.println(stack);
//		System.out.println(stack.pop()); //마지막에들어간 93이나옴

		while (!stack.isEmpty()) { //비어있지 않으면 돈다
			System.out.println(stack.pop());
		}
	}

}
