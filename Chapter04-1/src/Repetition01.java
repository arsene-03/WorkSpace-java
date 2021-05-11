
public class Repetition01 {

	public static void main(String[] args) {
		// 10이라는 숫자를 10번 출력하세요
		System.out.println("1. 10이라는 숫자를 10번 출력하세요");
		System.out.println();
		int count = 1;
		
		while(count<=10) {
			System.out.println(10);
			count++;
		}
		System.out.println("----------------------");
		//1부터 10까지 순서대로 출력하세요
		System.out.println("2. 1부터 10까지 순서대로 출력하세요");
		System.out.println();
		
		count = 1;
		
		while(count<=10) {
			System.out.println(count);
			count++;
		}
		System.out.println("----------------------");
		System.out.println("3. 1의 예제를 do~while로 출력해보기");
		
		count = 1;
		
		do {System.out.println(10);
		count++;
		}while(count<=10);
		//
		
		System.out.println("----------------------");
		System.out.println("4. 2의 예제를 do~while로 출력해보기");
				
		count = 1;
		do {System.out.println(count);
		count++;
		}while(count<=10);
		//
		
		System.out.println("----------------------");
		System.out.println("5. 1부터 10까지 합계를 구해봅시다");
		
		count = 1;
		int sum = 0; //합계를 누적시킬 변수
		
		while(count<=10) {
			
			sum = sum+count; // (0+1)+2+3+4+5+6+7+8+9+10
			count++;
		}
		System.out.println("합계: "+sum);
		
		
	}

}
