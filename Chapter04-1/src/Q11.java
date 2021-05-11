import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// 은행문제

		int balance =0; //잔액
		Scanner scan = new Scanner(System.in);

		System.out.println("green bank");

		while(true) {
			System.out.println("그린 뱅크에 오신것을 환영합니다.");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print("> ");

			int selectNum = Integer.parseInt(scan.nextLine());

			switch(selectNum) {
			case 1: //예금기능
				System.out.print("\n입금금액을 입력해 주십시오 > ");
				int savings = Integer.parseInt(scan.nextLine());
				balance+=savings;
				System.out.println("\n***예금완료***\n");

				break;
			case 2: //출금기능
				System.out.print("\n출금금액을 입력해 주십시오 > ");
				int outmoney = Integer.parseInt(scan.nextLine());
				if(balance>outmoney) {
					balance-=outmoney;
					System.out.println("\n***출금완료***\n");
				}else {
					System.out.println("\n***잔액부족***\n");
				}
				break;
			case 3: //잔액조회
				System.out.println("\n***잔액은: "+balance+"원 입니다.***1\n");

				break;
			case 4: //종료

				System.out.println("\n프로그램을 종료합니다.\n");
				System.exit(0);
				break;
			default:
				System.out.println("\n잘못입력했습니다. 다시선택해 주세요\n");

			}
		}


	}

}
