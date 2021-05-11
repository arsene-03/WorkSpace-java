package etc;

import java.util.Stack;

public class Main01 {

	public static void main(String[] args) {
		//스택 (Stack)
		Stack<String> stack = new Stack<>();
		
		stack.push("박길동");
		System.out.println(stack.peek());
		stack.push("이길동");
		System.out.println(stack.peek());
		stack.push("김길동");
		System.out.println(stack.peek());
		stack.push("최길동");
		System.out.println(stack.peek());
		stack.push("장길동");
		System.out.println(stack.peek());
		
		System.out.println("----------------------");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
	}

}
