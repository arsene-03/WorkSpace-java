package Green.Login;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static Member[] member = new Member[100];
	public static void main(String[] args) {
		
		while(true) {
			int SelectNum = mainmenu();
			switch(SelectNum) {
			case 1://회원가입 기능
				Join();
				break;
			case 2://로그인 기능
				login();
				
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
				default:
					System.out.println("잘못 입력했습니다.");
					System.out.println("번호를 다시 확인해주세요.");
			}
		}
		

	}
	private static void login() {
		int chkidx = -1; // 나올수 없는수
		System.out.println("아이디를 입력해주세요");
		System.out.println(">");
		String joinid = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		System.out.println(">");
		String joinpw = scan.nextLine();
		
		
		for(int i=0;i<member.length;i++) {
			if(member[i] == null) {//해당 인덱스i가 비어있다면  
			}else if(member[i].getId().equals(joinid)) {
			if(member[i].getpw().equals(joinpw)) {
				chkidx = i; // 아이디가 맞았을경우 해당 인덱스chkidx에 저장
				System.out.println("로그인 되었습니다.");
				System.out.println(member[i].getName()+"님 안녕하세요.");
				member[chkidx].prt();
				break;
			}else {
				System.out.println("잘못된 비밀번호입니다.");
				break;
}
			}else {
				System.out.println("아이디가 존재하지않습니다.");
				break;
				}
		}
	}
	private static void Join() {
		System.out.println("회원가입 메뉴입니다");
		System.out.println("사용하실 아이디를 입력하세요.");
		System.out.println(">");
		String id = scan.nextLine();
		System.out.println("사용하실 비밀번호를 입력하세요.");
		System.out.println(">");
		String pw = scan.nextLine();
		System.out.println("사용자 이름을 입력하세요.");
		System.out.println(">");
		String name = scan.nextLine();
		System.out.println("본인의 핸드폰번호 입력하세요.");
		System.out.println(">");
		int phoneNum = Integer.parseInt(scan.nextLine());
		
		Member newMember = new Member(id,pw,name,phoneNum);
		
		for (int i=0;i<member.length;i++) {//i는 0부터 시작;i는 100보다 작다;i는 1씩 증가한다
			if(member[i]==null) {//멤버의 인덱스 i가 공란일 경우 
				member[i]=newMember;//i부터 회원가입을 채워넣는다 ==>100개의 칸중 공백이 없도록 만드는 것
			}
		}
		
	}
	private static int mainmenu() {
		System.out.println("로그인기능입니다.");
		System.out.println("원하시는 메뉴를 선택해주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		System.out.println("선택>");
		int SelectNum = Integer.parseInt(scan.nextLine());
		return SelectNum;
	}

}
