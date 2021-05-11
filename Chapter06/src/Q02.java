import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {//2. 숫자를 입력받으면 해당 숫자의 구구단을 출력하세요
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int selectNum = Integer.parseInt(scan.nextLine());
		gugudan(selectNum);

	}

	private static void gugudan(int selecNum) {
		System.out.println("*****"+selecNum+"단*****");
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d\n",selecNum,j,j*selecNum
						);
				
			}
	
	
		
	}

}

	