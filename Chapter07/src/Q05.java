import java.util.Scanner;

public class Q05 {
	static Scanner scan = new Scanner(System.in);
	static Account[] clients = new Account[100]; 
	
	public static void main(String[] args) {
		
		
		while(true) {
			int selectNum = mainmenu();
			switch(selectNum) {
			case 1:
				makeAccount();
				break;
			case 2:
				System.out.println("계좌번호를 입력하세요");
				System.out.print("> ");
				System.out.println(clients);
				
				
				break;
			case 3:
				System.out.println("\n***프로그램을 종료합니다.***");
				System.exit(0);
				break;
			default :
				System.out.println("\n잘못입력했습니다.");
				System.out.println("다시 입력해주세요\n");
				
			}
		}
		
	
		
		
	}


//	private static void banking() { // 은행업무
//		
//		
//		
//		
//		
//		System.out.println("***어떤 업무를 하겠습니까?***");
//		System.out.println("1. 예금");
//		System.out.println("2. 출금");
//		System.out.print("> ");
//		int selectNum2 = Integer.parseInt(scan.nextLine());
//		if(selectNum2 ==2) {
//			System.out.println("예금할 금액을 입력하세요");
//			System.out.print("> ");
//			int savingMoney = Integer.parseInt(scan.nextLine());
//			
//			
//		}if(selectNum2 == 1) {
//			System.out.println("출금할 금액을 입력하세요");
//			System.out.print("> ");
//			int outMoney = Integer.parseInt(scan.nextLine());
//		}else {
//			System.out.println("\n잘못입력했습니다.");
//			System.out.println("다시 입력해주세요\n");
//		}
//	}


	private static void makeAccount() { //계좌 개설
		int clientsIndex=-1;
		System.out.println("이름을 입력하세요");
		System.out.print("> ");
		String name = scan.nextLine();
		System.out.println("계좌번호를 입력하세요");
		System.out.print("> ");
		int accountNumber = Integer.parseInt(scan.nextLine());
		System.out.println("초기 예금액을 입력하세요");
		System.out.print("> ");
		int balance = Integer.parseInt(scan.nextLine());
		System.out.println("\n***새로운 계좌를 개설했습니다.***\n");
		clientsIndex++;
		clients[clientsIndex++] = new Account(name,  accountNumber, balance);
	}


	private static int mainmenu() { // 메인메뉴
		System.out.println("**은행계좌 프로그램입니다.**");
		System.out.println("1. 계좌생성");
		System.out.println("2. 은행업무");
		System.out.println("3. 프로그램종료");
		System.out.print("> ");
		
		int selectNum = Integer.parseInt(scan.nextLine());
		return selectNum;
	}
}
