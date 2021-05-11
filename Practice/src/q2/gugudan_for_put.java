//package q2;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class gugudan_for_put {
//	public static Scanner scan = new Scanner(System.in);
//	public static void main(String[] args) {
//
//
//		
//			System.out.println("원하는 단을 입력하세요.");
//			System.out.print("> ");
//			int dan = Integer.parseInt(scan.nextLine());
//			System.out.println("숫자를 더 입력하시겠습니까?(y/n)");
//			System.out.println("두개 입력시 두 숫자사이의 구구단 모두 출력 / 하나만 입력시 해당 단만 출력");
//			System.out.print("> ");
//			String yn = scan.nextLine();
//
//			if (yn.equals("Y")||yn.equals("y")){
//				System.out.println("원하는 단을 입력하세요.");
//				System.out.println("> ");
//				int dan2 = number();Integer.parseInt(scan.nextLine());
//				List<Integer> dans = new ArrayList<>();
//				dans.add(dan);
//				dans.add(dan2);
//
//				if(dan>=dan2) {
//					for(int j=dan2;j<=dan;j++) {
//						System.out.println("***"+j+"단***");
//
//						for(int i=1;i<=9;i++) {
//							System.out.printf("%d X %d = %d\n",j,i,j*i);
//						}
//					}
//				}else if(dan<dan2) {
//					for(int j=dan;j<=dan2;j++) {
//						System.out.println("***"+j+"단***");
//
//						for(int i=1;i<=9;i++) {
//							System.out.printf("%d X %d = %d\n",j,i,j*i);
//						}
//
//					}
//				}else if(dans.size() == 1) {
//					for(int j=dan2;j<=dan;j++) {
//						System.out.println("***"+j+"단***");
//
//						for(int i=1;i<=9;i++) {
//							System.out.printf("%d X %d = %d\n",j,i,j*i);
//						}
//					}
//
//				}else if(yn.equals("N")||yn.equals("n")) {
//					for(int j=dan;j<=dan;j++) {
//						System.out.println("***"+j+"단***");
//
//						for(int i=1;i<=9;i++) {
//							System.out.printf("%d X %d = %d\n",j,i,j*i);
//						}
//
//					}
////				}
////			}
////		}catch(NumberFormatException err) {
////			System.out.println("\n잘못입력했습니다.");
////			System.out.println("숫자를 다시 입력해주세요\n");
////		}
////
////
////
////	}
////	private static int number() {
////		try {
////			
////		return 0;
////	}
//
//}
