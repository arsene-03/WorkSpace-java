package seller;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import data.Item;
import mainLogic.Main;



public class View {

	public static void menu() {
		System.out.println("\n***안녕하세요 "+Controller.seller.getName()+"님***");
		System.out.println("※캐시충전은 개인정보 수정 후 가능합니다.※");
		System.out.println("1. 개인정보 조회 및 수정");
		System.out.println("2. 물품 조회");
		System.out.println("3. 내 물품 관리");
		System.out.println("4. 로그아웃");
		System.out.println("5. 프로그램 종료");
		System.out.println("> ");
		
	}

	public static void sellerInfo() {//1.개인정보 조회 및 수정
		boolean run = true;
		while(run) {
			System.out.println("\n***내 정보를 불러옵니다***");
			System.out.println("=> ID: "+Controller.seller.getId());
			System.out.println("1.비밀번호: 비공개");
			System.out.println("2.이름: "+Controller.seller.getName());
			System.out.println("3.연락처: "+Controller.seller.getPhoneNum());
			System.out.println("*캐시*: "+Controller.seller.getCash());
			
			System.out.println("\n***어떤 정보를 수정할까요***");
			System.out.println("다른숫자를 입력하면 건너뛸 수 있습니다.");
			System.out.print("> ");
			int key2 = mainLogic.View.number();

			if(key2==1) {
				System.out.println("\n수정할 비밀번호 입력하세요.");
				System.out.print("> ");
				String newPassword = mainLogic.Main.scan.nextLine();
				Controller.seller.setPassword(newPassword);
				System.out.println("\n***수정완료****");
			}else if(key2==2) {
				System.out.println("\n수정할 이름을 입력하세요.");
				System.out.print("> ");
				String newName = mainLogic.Main.scan.nextLine();
				Controller.seller.setName(newName);
				System.out.println("\n***수정완료****");
			}else if(key2==3) {
				System.out.println("\n수정할 연락처 입력하세요.");
				System.out.print("> ");
				String newNum = mainLogic.Main.scan.nextLine();
				Controller.seller.setPhoneNum(newNum);
				System.out.println("\n***수정완료****");
			}else {
				run = false;
			}			
		}
	}

	public static void chargeCash() {//1-1 캐시충전
		System.out.println("\n개인정보 수정 완료. 캐시를 충전할 수 있습니다.");
		System.out.println("***충전할 금액을 입력해 주세요.***");
		System.out.print("> ");
		int chargeCash = mainLogic.View.number();
		Controller.seller.setCash(chargeCash);
		System.out.println("\n***충전이 완료되었습니다.***");
		
	}

	public static void itemCheck() {//2. 물품조회
		System.out.println("\n1.전체 물품 조회");
		System.out.println("2.내가 등록한 물품 조회");
		System.out.println("다른숫자를 입력하면 뒤로갑니다.");
		System.out.println("> ");
		int key3 = mainLogic.View.number();
		
		if(key3==1) { //2-1. 전체 물품조회
			System.out.println("\n***등록된 전체 물품을 조회합니다.***");
			int count = 0;
			Set<Map.Entry<String,Item>> entrySet2 = mainLogic.Main.items.entrySet();
			Iterator<Map.Entry<String,Item>> entryItr2 = entrySet2.iterator();

			while(entryItr2.hasNext()) {
				Map.Entry<String,Item> entry2 = entryItr2.next();
				String itemName = entry2.getKey();
				count++;
				System.out.println(count+". "+itemName);
			}
		}else if(key3==2) {//2-2. 내가등록한 물품조회
			System.out.println("\n***내가 등록한 물품을 조회합니다.***");
			int count = 0;
			
			Set<Map.Entry<String,Item>> entrySet2 = mainLogic.Main.items.entrySet();
			Iterator<Map.Entry<String,Item>> entryItr2 = entrySet2.iterator();

			while(entryItr2.hasNext()) {
				Map.Entry<String,Item> entry2 = entryItr2.next();
				Item item = entry2.getValue();
				String itemName = item.getItemName();
				if(Controller.seller.getId().equals(item.getSellerId())){
					count++;
					System.out.println(count+". "+itemName);
				}
				
			}
		}
	}

	public static void itemManage() {//3. 물품관리
		System.out.println("\n***물품관리***");
		System.out.println("1. 물품 등록");
		System.out.println("2. 물품 수정");
		System.out.println("3. 물품 삭제");
		System.out.println("다른숫자를 입력하면 뒤로갑니다.");
		System.out.print("> ");
		int key4 = mainLogic.View.number();
		
		switch(key4) {
		case 1://물품등록
			Item item = ItemUp();
			int itemPrice = item.getCostPrice()*item.getAmount();
			if(item == null) {
				failItemUp();
			} else {
				if(Controller.seller.getCash()-itemPrice>=0) {//양수일때
					mainLogic.Main.items.put(item.getItemName(),item);
				}else if(Controller.seller.getCash()-itemPrice<0) {
					System.out.println("캐시가 부족해 물품등록에 실패했습니다.");
				}	
			}
			break;
		case 2://물품수정
			boolean run = true;
			while(run) {
				System.out.println("\n***수정하고 싶은 물품의 이름을 입력해주세요***");
				String modify = mainLogic.Main.scan.nextLine();
				Item modifyItem=mainLogic.Main.items.get(modify);
				
				System.out.println("1.물품명: "+modifyItem.getItemName());
				System.out.println("2.정가: "+modifyItem.getListPrice());
				
				System.out.println("\n***어떤 정보를 수정할까요***");
				System.out.println("다른숫자를 입력하면 건너뛸 수 있습니다.");
				System.out.print("> ");
				int key3 = mainLogic.View.number();

				if(key3==1) {
					System.out.println("\n수정할 물품명을 입력하세요.");
					System.out.print("> ");
					String newItemName = mainLogic.Main.scan.nextLine();
					modifyItem.setItemName(newItemName);
					System.out.println("\n***수정완료****");
				}else if(key3==2) {
					System.out.println("\n수정할 정가를 입력하세요.");
					System.out.print("> ");
					int newListPrice = Integer.parseInt(mainLogic.Main.scan.nextLine());
					modifyItem.setListPrice(newListPrice);
					System.out.println("\n***수정완료****");
				}else {
					run = false;
				}			
			}
			break;
		case 3://물품삭제
			System.out.println("\n***삭제하고 싶은 물품의 이름을 입력해주세요***");
			String remove = mainLogic.Main.scan.nextLine();
			Item removeItem = mainLogic.Main.items.get(remove);
			int ItemsPrice = removeItem.getCostPrice()*removeItem.getAmount();
			Controller.seller.setCash(ItemsPrice);
			mainLogic.Main.items.remove(remove);
			System.out.println("***해당 물품이 삭제되었습니다.***");
			break;
		default:

			
		}
	}

	

	private static Item ItemUp() {//3-1. 물품등록
		System.out.println("물품명: ");
		System.out.print("> ");
		String name = mainLogic.Main.scan.nextLine();
		System.out.println("원가: ");
		System.out.print("> ");
		int cost = Integer.parseInt(mainLogic.Main.scan.nextLine());
		System.out.println("정가: ");
		System.out.print("> ");
		int list = Integer.parseInt(mainLogic.Main.scan.nextLine());
		System.out.println("수량: ");
		System.out.print("> ");
		int count = Integer.parseInt(mainLogic.Main.scan.nextLine());
		if(Main.items.get(name)==null) {
		Item item = new Item(name,cost,list,count,Controller.seller.getId());
		
		
		return item;
		}else {
			System.out.println("\n이미 사용하고 있는 물품명입니다.");
			return null;
	}
	}
	
	private static void failItemUp() {//3-1-1.물품등록 실패
		System.out.println("물품등록을 실패했습니다.");
		
	}

}
