package set01;

public class PokeMon {
	private String name;
	private int level;
	
	public PokeMon(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void prt() {
		System.out.println(name + " : "+level);
	}
	
	
}
