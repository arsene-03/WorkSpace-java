package administer;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import data.Item;
import data.Member;

public class View {

	public static void mainMenu() {// 관리자 메인화면
		System.out.println("\n***안녕하세요 관리자님***");
		System.out.println("원하는 기능을 선택하세요");
		System.out.println("1. 고객관리");
		System.out.println("2. 물품관리");
		System.out.println("3. 로그아웃");
		System.out.println("4. 프로그램 종료");
		System.out.print("> ");
	}

	public static void customerManagement() {//1. 고객관리

		System.out.println("\n***고객관리***");
		System.out.println("1. 전체 고객조회");
		System.out.println("2. 고객정보 수정하기");
		System.out.print("> ");

	}

	public static void allCustomerCheck() { // 1-1 전체고객조회
		int count = 0;
		System.out.println("\n---ID / 가입유형---");
		for(int i =0;i<mainLogic.Main.members.size();i++) {
			
			String userId =mainLogic.Main.members.get(i).getId();
			String userPosition =mainLogic.Main.members.get(i).getPosition();
			count= i+1;
			System.out.println(count+". "+userId+" /"+userPosition);
		}
	
	}

	public static void eachCustomerRevise() {//1-2 고객정보 수정하기
		System.out.println("\n수정할 고객의 번호를 입력하세요");
		System.out.print("> ");
		int key = Integer.parseInt(mainLogic.Main.scan.nextLine());
		
		Member users = mainLogic.Main.members.get(key);
		if(users !=null) {
			boolean run = true;
			while(run) {
				System.out.println("\n***해당 고객의 정보를 불러옵니다***");
				System.out.println("=> ID: "+users.getId());
				System.out.println("1.이름: "+users.getName());
				System.out.println("2.연락처: "+users.getPhoneNum());
				System.out.println("3.캐시: "+users.getCash());
				System.out.println("4.회원정보 삭제");
				System.out.println("\n***어떤 정보를 수정할까요***");
				System.out.println("다른숫자를 입력하면 뒤로갑니다.");
				System.out.print("> ");
				int key2 = mainLogic.View.number();

				if(key2==1) {
					System.out.println("\n수정할 이름을 입력하세요.");
					System.out.print("> ");
					String newName = mainLogic.Main.scan.nextLine();
					users.setName(newName);
					System.out.println("\n***수정완료****");
				}else if(key2==2) {
					System.out.println("\n수정할 연락처 입력하세요.");
					System.out.print("> ");
					String newNum = mainLogic.Main.scan.nextLine();
					users.setPhoneNum(newNum);
					System.out.println("\n***수정완료****");
				}else if(key2==3) {
					System.out.println("\n수정할 캐시를 입력하세요.");
					System.out.print("> ");
					int newCash = mainLogic.View.number();
					users.setCash(newCash);
					System.out.println("\n***수정완료****");
				}else if(key2==4) {
					System.out.println("\n정말 회원정보를 삭제 하시겠습니까?(y)");
					System.out.println("다른버튼을 입력하면 뒤로갑니다.");
					System.out.print("> ");
					String off = mainLogic.Main.scan.nextLine();

					if(off.equals("y")||off.equals("Y")) {
						System.out.println("\n***회원정보삭제 완료***");	
						mainLogic.Main.members.remove(key);
						run = false;
					}else{
						System.out.println("\n뒤로 돌아갑니다.");
					}
				}else {
					run = false;
				}
			}
		}else {
			System.out.println("\n가입되지 않은 ID입니다.");
		}
	}
	
	public static void itemCheck() {//2. 물품조회
		System.out.println("\n***등록된 물품을 조회합니다.***");
		int count = 0;
		Set<Map.Entry<String,Item>> entrySet2 = mainLogic.Main.items.entrySet();
		Iterator<Map.Entry<String,Item>>  entryItr2 = entrySet2.iterator();

		while(entryItr2.hasNext()) {
			Map.Entry<String,Item> entry2 = entryItr2.next();
			String itemName = entry2.getKey();
			count++;
			System.out.println(count+". "+itemName);
		}
	}











}
