package ex03;

public class Main {

	public static void main(String[] args) {
//		TV();
		TV(new Remocon() {

			@Override
			public void on() {
				System.out.println("Tv를 켭니다");
			}

			@Override
			public void off() {
				System.out.println("Tv를 끕니다");
			}
			
		});
		
	}
	
	private static void TV(Remocon r) {
		r.on();
		r.off();
		
	}

}
