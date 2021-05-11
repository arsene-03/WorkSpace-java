package buyer;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import data.Item;

public class View {

	public static void menu() {
		System.out.println("\n***안녕하세요 "+Controller.buyer.getName()+"님***");
		System.out.println("※캐시충전은 개인정보 수정 후 가능합니다.※");
		System.out.println("※물건구매는 장바구니에 담고나서 가능합니다.※");
		System.out.println("1. 개인정보 조회 및 수정");
		System.out.println("2. 물품 조회하기");
		System.out.println("3. 내 장바구니 관리");
		System.out.println("4. 로그아웃");
		System.out.println("5. 프로그램 종료");
		System.out.print("> ");
	}

	public static void buyerInfo() {//1.개인정보 조회 및 수정

		boolean run = true;
		while(run) {
			System.out.println("\n***내 정보를 불러옵니다***");
			System.out.println("=> ID: "+Controller.buyer.getId());
			System.out.println("1.비밀번호: 비공개");
			System.out.println("2.이름: "+Controller.buyer.getName());
			System.out.println("3.연락처: "+Controller.buyer.getPhoneNum());
			System.out.println("*캐시*: "+Controller.buyer.getCash());

			System.out.println("\n***어떤 정보를 수정할까요***");
			System.out.println("다른숫자를 입력하면 건너뛸 수 있습니다.");
			System.out.print("> ");
			int key2 = mainLogic.View.number();

			if(key2==1) {
				System.out.println("\n수정할 비밀번호 입력하세요.");
				System.out.print("> ");
				String newPassword = mainLogic.Main.scan.nextLine();
				Controller.buyer.setPassword(newPassword);
				System.out.println("\n***수정완료****");
			}else if(key2==2) {
				System.out.println("\n수정할 이름을 입력하세요.");
				System.out.print("> ");
				String newName = mainLogic.Main.scan.nextLine();
				Controller.buyer.setName(newName);
				System.out.println("\n***수정완료****");
			}else if(key2==3) {
				System.out.println("\n수정할 연락처 입력하세요.");
				System.out.print("> ");
				String newNum = mainLogic.Main.scan.nextLine();
				Controller.buyer.setPhoneNum(newNum);
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
		Controller.buyer.setCash(chargeCash);
		System.out.println("\n***충전이 완료되었습니다.***");
	}

	public static void itemCheck() {//2. 등록된 물품 조회
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

	}
	public static void basketManager() {//3. 장바구니 관리
		System.out.println("***내 장바구니 관리***");
		System.out.println("1. 장바구니에 물건 담기");
		System.out.println("2. 장바구니 비우기");
		System.out.println("3. 장바구니에 있는 물건 구매하기");
		System.out.println("4. 장바구니에 있는 물건 조회하기");

	}

	public static void makeBasket() { //3-1 장바구니에 담기
		
		System.out.println("\n장바구니에 담고싶은 물품명을 입력해주세요");
		System.out.print("> ");
		String buyitemName = mainLogic.Main.scan.nextLine();
		System.out.println("***\n물품의 수량을 입력해주세요.");
		System.out.print("> ");
		int buyitemAmount = Integer.parseInt(mainLogic.Main.scan.nextLine());
		
		
		Item buyItem = mainLogic.Main.items.get(buyitemName);
		int itemPrice = buyItem.getListPrice()*buyitemAmount;
		if(buyItem == null) {
			System.out.println("해당 물건은 다 팔렸거나 없습니다.");
		}else if(buyItem.getAmount()-buyitemAmount>=0) {//양수일때		
				buyItem.setAmount(buyItem.getAmount()-buyitemAmount);
				Controller.me.getBasket().add(buyItem);
					
		}else if(buyItem.getAmount()-buyitemAmount<0) {
			System.out.println("담고자 하는 수량만큼 물품이 없습니다.");
		}
		System.out.println("***\n장바구니에 추가되었습니다.***");
	}

	public static void setBasket() {//3-2장바구니 비우기
		System.out.println("***\n장바구니에서 삭제하고싶은 물품의 번호를 입력해주세요.");
		System.out.print("> ");
		int delItemIdx = Integer.parseInt(mainLogic.Main.scan.nextLine())-1;
		
		Item returnItem = Controller.me.getBasket().get(delItemIdx);//내장바구니에 물건
		Item toreturnItem = mainLogic.Main.items.get(returnItem.getItemName()); //목록에 있는 해당 물건
		
		toreturnItem.setAmount(returnItem.getAmount());
		Controller.me.getBasket().remove(delItemIdx);
	}

	public static void buyItem() {//3-3 물건구매
		System.out.println("***\n장바구니에서 구매하고자 하는 물품의 번호를 입력해주세요.***");
		System.out.print("> ");
		int delItemIdx = Integer.parseInt(mainLogic.Main.scan.nextLine())-1;
		
		Item basketItem = Controller.me.getBasket().get(delItemIdx);
		Item buyItem = mainLogic.Main.items.get(basketItem.getItemName());
		int itemPrice = basketItem.getListPrice()*basketItem.getAmount();
		
		
		if(buyItem == null) {
			System.out.println("해당 물건은 다 팔렸거나 없습니다.");
		}else if(Controller.me.getCash()-itemPrice>=0) {
			Controller.me.setCash(Controller.me.getCash()-itemPrice);	
			Controller.me.getBasket().remove(delItemIdx);				
			}else {System.out.println("물건을 구입하는데 캐시가 부족합니다.");}
			
	}
	
	public static void chkBasket() {//3-4 장바구니 조회하기
		System.out.println("***\n장바구니를 조회합니다***");
		for(int i=0;i<Controller.me.getBasket().size();i++) {
			int basketIdx = i;
			System.out.println(basketIdx+1+". "+Controller.me.getBasket().get(i));
		}

	}

	





}
