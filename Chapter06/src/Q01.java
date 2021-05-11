
public class Q01 {

	public static void main(String[] args) {
		//1. 구구단을 출력하는 메서드를 만들어 출력
		 gugudan();
		
	}
	
	private static void gugudan() { //1. 메서드
		for(int i=2;i<=9;i++) {
			System.out.println("*****"+i+"단*****");
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d\n",i,j,j*i);
			}
		}
		
	}

	
	
}
