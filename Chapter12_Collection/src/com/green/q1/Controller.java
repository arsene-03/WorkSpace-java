//package com.green.q1;
//
//import java.util.Iterator;
//import java.util.TreeSet;
//
//import javax.swing.ViewportLayout;
//
//
//
//public class Controller {
//	public Controller(){
//		init();
//	}
//
//	private void init() {
//		
//		
//		while(true) {
//			int selectNum =View.main();
//			
//			switch(selectNum) {
//			case 1: // 게임수 입력
//				View.inputGameNumber();
//				break;
//			case 2: // 자동
//				View.gameAuto();
//				break;
//			case 3: // 수동
//				View.gameMenual();
//				break;
//			case 4: // 프로그램종료
//				break;
//				
//			}
//		}
//		
//		 
//		
//		
//		
//		//int gameCount = View.count();
//		for(int i=0;i<gameCount;i++) {
//			System.out.println("***"+(i+1)+"번째 게임***");
//		while(Main.lotto.size()<6) {
//			
//			int number = (int)(Math.random()*45)+1;	
//			Main.lotto.add(number);
//		}
//		System.out.print("{");
//		Iterator<Integer> itr = Main.lotto.iterator(); // 반복자 호출 => 1회용
//		
//		while(itr.hasNext()) {//다음에 꺼낼 데이터가 있는가?
//			Integer num = itr.next(); // 다음 데이터를 꺼내는 메서드
//			int cnt = 1;
//			if(cnt==6) {
//			System.out.print(num);
//			}else {
//				System.out.print(num+", ");
//				
//			}
//			cnt++;
//			
//			}
//		System.out.println("}");
//		Main.lotto.clear();
//		}
//	}
//	
//	
//	// Wrapper 클래스
//				// 기본타입의 데이터를 아무런 기능(메서드)를 가질 수없다.
//				// 기본타입의 데이터와 관련된 메서드 결합 => Wrapper클래스
//				// byte => Byte
//				// short => Short
//				// int => Integer ****
//				// long => Long
//				// float => Float
//				// double => Double
//				// boolean => Boolean
//				// char => Character  ****
//	
//	// int num = 100;
//	//Integer number = new Integer(num); ==> 박싱
//	//int result = number.intValue(); ==> 언박싱
//	//number = num;  // 자바 1.8에서는 Auto 박싱 언박싱이 실행됌
//	//result = number; // 자바 1.8에서는 Auto 박싱 언박싱이 실행됌 
//	
//	}
