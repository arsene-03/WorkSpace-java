
public class Gugudan {

	public static void main(String[] args) {
		// 1단계: 구구단 2단부을 출력해 봅시다
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		
		System.out.println("------2단계 ------");
		// 2단계: 2단을 변화하지 않는부분, 변화하는 부분을 구분해서 반복문으로 만들기
		
		System.out.printf("2 x %d = %d \n",1,2*1);
		System.out.printf("2 x %d = %d \n",2,2*2);
		System.out.printf("2 x %d = %d \n",2,2*3);
		
		System.out.println("------3단계 ------");
		// 3단계: 2단계의 내용을 반복문으로 출력
		
		for(int i=1;i<=9;i++) {
			System.out.printf("2 x %d = %d \n",i,2*i);
		}
		
		System.out.println("------4단계 ------");
		// 3단계: 3단계의 내용을 9단까지 반복문으로 출력
		
		System.out.println("******2단********");
		for(int i=1;i<=9;i++) {
			System.out.printf("2 x %d = %d \n",i,2*i);
		}
		System.out.println("******3단********");
		for(int i=1;i<=9;i++) {
			System.out.printf("3 x %d = %d \n",i,3*i);
		}
		System.out.println("******4단********");
		for(int i=1;i<=9;i++) {
			System.out.printf("4 x %d = %d \n",i,4*i);
		}
		System.out.println("******5단********");
		for(int i=1;i<=9;i++) {
			System.out.printf("5 x %d = %d \n",i,5*i);
		}
		System.out.println("******6단********");
		for(int i=1;i<=9;i++) {
			System.out.printf("6 x %d = %d \n",i,6*i);
		}
		System.out.println("******7단********");
		for(int i=1;i<=9;i++) {
			System.out.printf("7 x %d = %d \n",i,7*i);
		}
		System.out.println("******8단********");
		for(int i=1;i<=9;i++) {
			System.out.printf("8 x %d = %d \n",i,8*i);
		}
		System.out.println("******9단********");
		for(int i=1;i<=9;i++) {
			System.out.printf("9 x %d = %d \n",i,9*i);
		}
			System.out.println("------5단계 ------");
			// 5단계: 4단계의 내용을 반복되는 부분과 반복되지 않는 부분으로 구분해서 반복문 만들기
			
		for(int j=2;j<=9;j++) {
			System.out.printf("******%d단********\n",j);
			for(int i=1;i<=9;i++) {
				System.out.printf(" x %d = %d \n",j,j*i);
			}
		}
		
		
				
		
	}

}
