package set01;

import java.util.Comparator;

public class Ranking implements Comparator<PokeMon>{

	@Override
	public int compare(PokeMon p1, PokeMon p2) {
		if(p1.getLevel() > p2.getLevel()) {
			return 1;
		}else if(p1.getLevel() < p2.getLevel()) {
			return -1;
		}else {
			return 0;
		}
		
	}

}
