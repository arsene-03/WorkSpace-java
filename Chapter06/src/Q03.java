import java.util.Scanner;

public class Q03 {//3. 두개의 숫자를 입력받아서작은 수부터 큰 수 까지의 구구단을출력하세요.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int selectNum1 = Integer.parseInt(scan.nextLine());
		System.out.println("두번째 숫자를 입력하세요.");
		int selectNum2 = Integer.parseInt(scan.nextLine());

		gugudan(selectNum1,selectNum2);

	}

	private static void gugudan(int select1,int select2) {

		if(select1<select2) {
			for(int i=select1;i<=select2;i++) {
				System.out.println("*****"+i+"단*****");
				for(int j=1;j<=9;j++) {
					System.out.printf("%d x %d = %d\n",i,j,j*i);
				}
			}
		}else {	
			for(int i=select2;i<=select1;i++) {
				System.out.println("*****"+i+"단*****");
				for(int j=1;j<=9;j++) {
					System.out.printf("%d x %d = %d\n",i,j,j*i);
				}

			}
		}
	}
	private static void gugudan(int selecNum) {


		System.out.println("*****"+selecNum+"단*****");
		for(int j=1;j<=9;j++) {
			System.out.printf("%d x %d = %d\n",selecNum,j,j*selecNum
					);			
		}	
	}
}
