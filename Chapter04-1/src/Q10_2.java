import java.util.Scanner;

public class Q10_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 시작합니다");	
		System.out.println("몇회 게임을 진행하실 건가요?");
		int gameCnt = Integer.parseInt(scan.nextLine());
		
		int win=0,lose=0,draw=0;
		
		
		for(int i=1;i<=gameCnt;i++) {
			System.out.println("******"+i+"번째 게임******");
			int computer = (int)(Math.random()*3);
			String comCommender = "";
			
			switch(computer) {
			case 0: comCommender= "바위";
					break;
			case 1: comCommender="보";
					break;
			case 2: comCommender="가위";
					break;

			}
			//System.out.println("컴퓨터: "+comCommender);
			
			
			System.out.println("가위 바위 보 중 하나를 입력하세요.");		
			System.out.println("(단,그외 문자를 입력하면 종료합니다.)");
			
			String userCommend = scan.nextLine();
			
		
			
			switch(userCommend) {
			case "가위":
				if(comCommender.equals("가위")) {
					System.out.println("비겼습니다");
					draw++;
				}else if(comCommender.equals("바위")) {
					System.out.println("플레이어가 졌습니다.");
					lose++;
				}else if(comCommender.equals("보")) {
					System.out.println("플레이어가 이겼습니다.");
				}
				 win++;
				break;
			case "바위":
				if(comCommender.equals("가위")) {
					System.out.println("플레이어가 이겼습니다.");
					win++;
				}else if(comCommender.equals("바위")) {
					System.out.println("비겼습니다");
					draw++;
				}else if(comCommender.equals("보"))
					System.out.println("플레이어가 졌습니다.");
				lose++;
				
				break;
			case "보":
				if(comCommender.equals("가위")) {
					System.out.println("플레이어가 졌습니다.");
					lose++;
				}else if(comCommender.equals("바위")) {
					System.out.println("플레이어가 이겼습니다.");
					win++;
				}else if(comCommender.equals("보"))
					System.out.println("비겼습니다");
				draw++;
				break;
			default:
				System.out.println("잘못 입력했습니다. \n 프로그램을 종료합니다.");
				i--;
			}
		}
		System.out.println("******게임결과******");
		System.out.println(win+"승, "+draw+"무, "+lose+"패");
		System.out.println("게임을 종료합니다.");
	}

}
