package set01;

import java.util.Iterator;
import java.util.TreeSet;

public class Main06 {

	public static void main(String[] args) {
		// 제 3의 클래스에서 비교를 맡기는 방법
		
		TreeSet<PokeMon> tree = new TreeSet<>(new Ranking());
		
		tree.add(new PokeMon("야도란",14));
		tree.add(new PokeMon("잠만보",21));
		tree.add(new PokeMon("파이리",17));
		tree.add(new PokeMon("피카츄",29));
		tree.add(new PokeMon("파오리",11));
		tree.add(new PokeMon("꼬부기",25));
		
		Iterator<PokeMon> itr= tree.iterator();
	
		while(itr.hasNext()) {
			itr.next().prt();
		}

	}

}
