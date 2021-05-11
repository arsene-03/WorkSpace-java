import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		//4. 숫자가 하나만 입력되면해당 숫자의 구구단을 출력하고 
		//두개의 숫자가 입력되면 작은 수부터 큰수까지의 구구단을출력하세요
		Scanner scan = new Scanner(System.in);

		System.out.println("출력하고자 하는 단을 입력하세요.");
		System.out.print("> ");
		int selectNum = Integer.parseInt(scan.nextLine());
		System.out.println("더 원하는 단이 있습니까? 1: 예 / 2: 아니오");
		System.out.print("> ");
		int yesOrNo = Integer.parseInt(scan.nextLine());
		
		if(yesOrNo == 1) {
			System.out.println("숫자를 입력하세요.");
			int selectNum2 = Integer.parseInt(scan.nextLine());	
			gugudan(selectNum,selectNum2 );
		}else {
			gugudan(selectNum);
		}
	}
	private static void gugudan(int select,int select2) {

		if(select<select2) {
			for(int i=select;i<=select2;i++) {
				System.out.println("*****"+i+"단*****");
				for(int j=1;j<=9;j++) {
					System.out.printf("%d x %d = %d\n",i,j,j*i);
				}
			}
		}else {	
			for(int i=select2;i<=select;i++) {
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
