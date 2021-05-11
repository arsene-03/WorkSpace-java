package set01;

import java.util.Iterator;
import java.util.TreeSet;

public class Main05 {

	public static void main(String[] args) {
		TreeSet<Coffee> tree = new TreeSet<>();

		tree.add(new Coffee("카라멜 프라푸치노",5300));
		tree.add(new Coffee("카페라떼",4100));
		tree.add(new Coffee("카페 아메리카노",3600));
		tree.add(new Coffee("에스프레스 칩",5400));
		tree.add(new Coffee("바닐라라떼",4600));
		
		Iterator<Coffee> itr = tree.iterator();
	
		while(itr.hasNext()) {
			itr.next().prt();
		}
	
	}

}
