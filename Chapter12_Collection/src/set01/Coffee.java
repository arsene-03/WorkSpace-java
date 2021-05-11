package set01;

public class Coffee implements Comparable<Coffee>{
	
	private String name;
	private int price;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void prt() {
		System.out.println(name+" : "+price);
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Coffee c) {
//		if(this.price > c.getPrice()) {
//			return -10;
//		}else if(this.price < c.getPrice()) {
//			return 100;
//		}else {
//			return 0;
//		}
		
//		return this.price - c.getPrice();
		
		return this.name.compareTo(c.getName());
		
	}
	
	
	
}
