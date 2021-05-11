import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 과제: 학생수를 입력받고 각 학생의 java 점수를 입력받아서 총점과 평균으로 구하는 프로그램을 만들어 봅시다.
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		boolean run = true;
		
		while(run){
			System.out.println("성적 프로그램");
			System.out.println("1. 학생 수 입력");
			System.out.println("2. 점수 입력");
			System.out.println("3. 성적조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("> ");
			
			int selectNum = Integer.parseInt(scan.nextLine());
			
			switch(selectNum) {
			case 1: //학생수 입력
				System.out.println("학생 수를 입력하세요");
				int studentNum = Integer.parseInt(scan.nextLine());
				score = new int [studentNum];
				break;
			case 2: //점수 입력받기
				if(score == null) {
					System.out.println("학생 수를 먼저 입력하세요.");
				}else {
					System.out.println("점수를 입력해 주세요");
					for(int i=0;i<score.length;i++) {
						System.out.println((i+1)+"번쨰 학생 점수");
						score[i] = Integer.parseInt(scan.nextLine());
					}
				}
				break;
			case 3: // 성적조회
				if(score == null) {
					System.out.println("학생 수를 먼저 입력하세요.");
				}else {
					int sum = 0;
					double avg = 0.0;
					for(int i=0;i<score.length;i++) {
						sum+=score[i];
					}
					avg= sum/(double)score.length;
					System.out.println("총점 : "+sum);
					System.out.println("평균 : "+avg);
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("잘못 입력했습니다. \n다시 확인해주세요");
			}
		}
	
	
			

	}

}
