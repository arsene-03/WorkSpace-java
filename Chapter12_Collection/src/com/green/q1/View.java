//package com.green.q1;
//
//public class View {
//
//	public static int count() {
//		System.out.println("게임횟수를 입력해주세요");
//		int gameCount = Integer.parseInt(Main.scan.nextLine());
//		return gameCount;
//	}
//
//	public static void choice() {
//		System.out.println("숫자를 직접 입력하시겠습니까?");
//		System.out.print("(입력을 원하지 않으시면 숫자0을 눌러주세요)");
//		System.out.println("> ");
//		int choiceNum = Integer.parseInt(Main.scan.nextLine());
//		if(choiceNum==0) {
//			return;
//		}if(choiceNum!=0) {
//			
//		}
//		
//		
//	}
//
//	public static int main() {
//		System.out.println("로또 뽑기 프로그램");
//		System.out.println("1. 게임수(입력 없으면 1회)");
//		System.out.println("2. 자동");
//		System.out.println("3. 수동");
//		System.out.println("4.프로그램종료");
//		int selectNum = Integer.parseInt(Main.scan.nextLine());
//		return selectNum;
//	}
//
//	public static void inputGameNumber() {
//		System.out.println("게임수를 입력하세요.");
//		System.out.println("입력이 없는경우 기본 1회");
//		System.out.print("> ");
//		int num = Integer.parseInt(Main.scan.nextLine());
//		
//		if(0<num) {
//			int gameCount = num;
//		}else {
//			System.out.println("잘못입력했습니다.");
//		}
//		
//	}
//
//	public static void gameAuto() {
//		for(int i=0;i<gamecount;i++);
//		auto(); // 자도응로 로또를 뽑는기능
//		lottoPrt(); //뽑은 로또는 출력하고 번호를 초기화
//		
//	}
//
//	private static void auto() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public static void gameMenual() {
//		while(Main.lotto.size()<6) {
//			System.out.println("로또 번호를 선택하세요(1~45)");
//			System.out.println("0을 입력하면 나머지 번호는 자동으로 뽑습니다.");
//			System.out.print("> ");
//			int num = Integer.parseInt(Main.scan.nextLine());
//			
//			if(num==0) {
//				System.out.println("나머지 번호는 자동으로 뽑습니다.");
//				auto();
//			}else if (chk45Num(num)) {//입력한 숫자가 1~45까지인지 체크
//				System.out.println("잘못입력했습니다.");
//				System.out.println("1~45까지의 숫자를 입력해주세요.");
//			}else if(chkSet(num)) {// 중복 숫자를 입력했을때
//				System.out.println("번호가 중복됩니다.");
//				System.out.println("다시 확인하고 입력해 주세요");
//		}else {
//			Main.lotto.add(num);
//		}
//	}
//	}
//
//	private static boolean chk45Num(int num) {
//		if(1<= num && num <=45) {
//			return false;
//		}
//		return true;
//	}
//
//	private static boolean chkSet(int num) {
//		for (int lottoNum:Main.lotto) {
//			if(lottoNum == num) {
//				return true;
//			}
//		}
//		return false;
//	}
//}
