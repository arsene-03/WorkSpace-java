package com.green.q08;

public class View {

	public static int menu() { // 메인메뉴 메서드
		System.out.println("\n***학사정보관리 시스템***");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.print("> ");
		int selectNum = Integer.parseInt(Main.scan.nextLine());
		System.out.println();
		return selectNum;
	}

	public static void userFault() { // default. 잘못 입력했을때 메서드
		System.out.println("잘못 입력했습니다.");
		System.out.println("메인메뉴로 돌아갑니다.\n");
		
	}

	public static void end() { // 3. 프로그램 종료 메서드
		System.out.println("***프로그램을 종료하겠습니까?***");
		System.out.println("(y/n)");
		System.out.print("> ");
		String select = Main.scan.nextLine();
		System.out.println();
		if(select.equals("y") || select.equals("Y")) {
			System.out.println("***프로그램을 종료했습니다.***");
			System.exit(0);
		}else if(select.equals("n") || select.equals("N")){
			System.out.println("메인 메뉴로 돌아가겠습니다.\n");
			return;
		}else {
			userFault();
		}	
	}

	public static Member sign_up() { // 1. 회원가입 메서드
		System.out.println("***회원가입***");
		System.out.println("1. 선생님용 계정");
		System.out.println("2. 학생용 계정");
		System.out.print("> ");
		int selectNum = Integer.parseInt(Main.scan.nextLine());
		
		if(selectNum==1) {
			System.out.println("이름: ");
			System.out.print("> ");
			String name = Main.scan.nextLine();
			System.out.println("I D: ");
			System.out.print("> ");
			String id = Main.scan.nextLine();
			System.out.println("비밀번호: ");
			System.out.print("> ");
			String password = Main.scan.nextLine();
			System.out.println("과목: ");
			System.out.print("> ");
			String subject = Main.scan.nextLine();
			
			Member teacher = new Teacher(name,id,password,subject);
			return teacher;
		}else if(selectNum==2) {
			System.out.println("이름: ");
			System.out.print("> ");
			String name = Main.scan.nextLine();
			System.out.println("I D: ");
			System.out.print("> ");
			String id = Main.scan.nextLine();
			System.out.println("비밀번호: ");
			System.out.print("> ");
			String password = Main.scan.nextLine();
			System.out.println("전공: ");
			System.out.print("> ");
			String major = Main.scan.nextLine();
			Member student = new Student(name,id,password,major);
			return student;
			}else {
				
				return null;
			}
	}

	public static String[] sign_in() { // 2. 로그인 메서드
			System.out.println("***로그인***");
			System.out.println("ID를 입력해주세요.");
			System.out.print("> ");
			String id = Main.scan.nextLine();
			System.out.println("비밀번호를 입력해주세요.");
			System.out.print("> ");
			String password = Main.scan.nextLine();
			
			String[] userinfo = new String[] {id,password};
			return userinfo;
		
	}

	public static void loginFail() { // 2-1 로그인 실패
		System.out.println("\n로그인에 실패했습니다.");
		System.out.println("가입되지 않은 정보입니다.\n");
		
		
	}

	public static void loginSuccess() {
		System.out.println();
		System.out.println("***로그인 성공***");
		
	}


}
