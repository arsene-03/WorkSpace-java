package com.green.q2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class View {

	public static int main() throws NumberFormatException{ // 메인메뉴

		System.out.println("***영어 단어장 입력 프로그램***");
		System.out.println("1. 단어 입력하기");
		System.out.println("2. 단어 삭제하기");
		System.out.println("3. 단어 조회하기");
		System.out.println("4. 프로그램 종료");
		System.out.print("> ");
		int selectNum = Integer.parseInt(Main.scan.nextLine());

		return selectNum;
	}

	public static void userErr() { // 에러메시지

		System.out.println("\n***잘못입력했습니다***");
		System.out.println("   다시 입력해 주세요.\n");
	}

	public static void input() {//단어 등록

		System.out.println("\n***1. 단어 입력하기***");
		System.out.println("이미 등록된 단어의 경우 새로운 의미로 갱신됩니다.");
		System.out.println("영어 단어를 입력해주세요.");
		System.out.print("> ");
		String eng = Main.scan.nextLine();
		System.out.println("단어의 뜻을 입력해주세요.");
		System.out.print("> ");
		String kor = Main.scan.nextLine();

		Main.voca.put(eng,kor);
		System.out.println("\n'"+eng+"'"+"를 단어장에 등록했습니다.\n");
	}

	public static void inquiry() { // 단어 조회
		System.out.println("1. 특정단어 조회");
		System.out.println("2. 전체단어 조회");
		
		int selectInquiry = Integer.parseInt(Main.scan.nextLine());
		
		if(selectInquiry==1){
			System.out.println("***특정 단어를 조회합니다.***");
				searchEachWord();
		}else if(selectInquiry==2) {
			System.out.println("***전체 단어를 조회합니다**");
			searchAllWord();


		}else {
			userErr();
		}

	}

	private static void searchEachWord() {

		System.out.println("조회하고자 하는 단어를 입력해 주세요.");
		String engWord = Main.scan.nextLine();
		
		if(Main.voca.containsKey(engWord)) {
			System.out.println("뜻: "+Main.voca.get(engWord));
		}else {
			System.out.println("해당 단어는 등록되지 않았습니다.");
		}
		
		
	}

	private static void searchAllWord() {
		System.out.println("\n***등록된 단어 리스트***\n");
		int count = 0;
		Set<Map.Entry<String, String>> wordSet = Main.voca.entrySet();
		Iterator<Map.Entry<String, String>> wordItr = wordSet.iterator();
		
		while(wordItr.hasNext()) {
			Map.Entry<String, String> wordEntry = wordItr.next();
			String engWord = wordEntry.getKey();
			String korWord = wordEntry.getValue();
			count++;
			System.out.println(count+". "+engWord+": "+korWord);
		}
	}

	public static void delete() {
		
		System.out.println("1. 특정 단어 삭제");
		System.out.println("2. 전체 단어 삭제");
		int selectRemoveWords = Integer.parseInt(Main.scan.nextLine());
		
		if(selectRemoveWords==1){
			System.out.println("***특정 단어를 삭제합니다.***");
				delEachWord();
				System.out.println("삭제 했습니다.");
		}else if(selectRemoveWords==2) {
			System.out.println("***정말 모든 단어를 삭제합니까?**");
			System.out.println("(y/n");

			Main.voca.clear();
		}else {
			userErr();
		}
		
	}

	private static void delEachWord() { //특정단어삭제
		System.out.println("삭제할 단어를 입력해주세요");
		String eng = Main.scan.nextLine();
		Main.voca.remove(eng);
		
	}
	
	
	
	
	
	
	
}
