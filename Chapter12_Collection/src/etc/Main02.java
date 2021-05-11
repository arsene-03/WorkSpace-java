package etc;

import java.util.LinkedList;
import java.util.Queue;

public class Main02 {

	public static void main(String[] args) {
		// 큐  (Queue)

		Queue<String> queue = new LinkedList<>();
		
		queue.offer("박길동");
		System.out.println(queue.peek());
		queue.offer("이길동");
		System.out.println(queue.peek());
		queue.offer("김길동");
		System.out.println(queue.peek());
		queue.offer("최길동");
		System.out.println(queue.peek());
		queue.offer("장길동");
		System.out.println(queue.peek());
		
		System.out.println("-----------------------------");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
