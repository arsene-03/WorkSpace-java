import java.util.Scanner;

public class Q09 {
	
	static String[] names = new String[] {"고길동","김길동","이길동","박길동","홍길동"};
	static int[][] score = new int[5][4];
							// 1행 국어 78,85,74,74,68
							// 2행 영어 64,71,69,77,95	
							// 3행 수학 82,64,57,95,84
							// 4행 총점 x,x,x,x,x
	static double[] avg = new double[5];
	static int[] ranking = new int[] {1,1,1,1,1};
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		13. 배열을사용해서학생성적을관리해봅시다
//		-학생5명의이름은고길동,김길동,이길동,박길동,홍길동
//		-각각학생의점수는국어,영어,수학3과목의점수를입력받는다.
//		-학생이름으로개개인의성적을조회한다. => 총점, 평균
//		-전체학생성적을과목별로조회한다.
//		-(추가)각학생의평균성적으로석차를만들어서조회한다.
//		
//		종료를선택하지않으면메뉴가반복적으로출력되도록하세요.
//		메뉴는성적입력, 성적조회, 석차조회,종료로만들고 
//		성적조회시개인별성적조회, 과목별성적조회를선택할수있도록제작하세요.
		
		boolean run = true;
		while(run){
			int selectNum = mainMenu();
			
			switch(selectNum) {
			case 1: // 성적입력
				intput();
				break;
			case 2: // 성적조회
				check();
				break;
			case 3: // 석차조회
				checkRanking();
				break;
			case 4: // 프로그램종료
				System.out.println("***프로그램을 종료합니다.***");
				run=false;
				break;
			default :
				System.out.println("잘못입력했습니다.");
				System.out.println("1~4번중 입력해 주세요.");
			}
		}
	}
	
	
	private static int mainMenu() {
		System.out.println("성적관리 프로그램");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 조회");
		System.out.println("3. 석차 조회");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택>");
		
		int selectNum = Integer.parseInt(scan.nextLine());
		return selectNum;
	}


	//성적조회 메서드
	private static void check() {
		while(true) {


			System.out.println("***성적조회***");
			System.out.println("1. 개인별 성적조회");
			System.out.println("2. 과목별 성적조회");
			System.out.println("3. 메인메뉴 돌아가기");
			System.out.print("> ");

			int selectNum = Integer.parseInt(scan.nextLine());

			switch(selectNum) {
			case 1://개인별 성적 => 학생 이름을 조회하는 메서드, 조회된 정보를통해서 성적을 출력하는메서드
				int studentIdex=studentSelect();
				if(studentIdex== -1) {
					System.out.println("학생 이름을 조회할 수없습니다.");
				}else {
					checkStudentScore(studentIdex);
				}
				
				break;
			case 2://과목별 성적
				subjectSelect();
				break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;//메서드 종료
				//break menu; whil문에 menu라고 지정해주고
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}
	}

	
	
	
	//성적조회메서드 -> 과목별 성적 메서드
	private static void subjectSelect() {
		System.out.println("조회하려는 과목을 입력하세요.");
		System.out.println("1. 국어"); // 국어점수의 배열번호 [0]
		System.out.println("1. 영어"); // 영어점수의 배열번호 [1]
		System.out.println("1. 수학"); // 수학점수의 배열번호 [2]
		System.out.print("> ");
		
		int subjectNum = Integer.parseInt(scan.nextLine());
		
		switch(subjectNum) {

		case 1:
		case 2:
		case 3:
			checkSubject(subjectNum);
			break;
		default:
			System.out.println("잘못입력했습니다.");
			System.out.println("성적 조회 메뉴로 돌아갑니다.");
		}
		
	}





	
	//선택한 과목의번호 : 인덱스번호
	//  국어 -> 1   :  0
	//  영어 -> 2   :  1  	
	//  수학 -> 3   :  2	

	//성적조회메서드 -> 과목별 성적 메서드 -> 입력받은 과목번호로(인덱스 번호) 과목당 총점과 평균 
	private static void checkSubject(int subjectNum) {
		int total =0; // 과목의 합계점수
		
		for(int i=0;i<score.length;i++) {
			total += score[i][subjectNum-1];
		}
		double avg = total/5.0; // 과목의 평균점수
		
		if(subjectNum==1) {
			System.out.println("전체 국어 총점: "+total);
			System.out.println("전체 국어 평균: "+avg);
		}else if(subjectNum==2) {
			System.out.println("전체 영어 총점: "+total);
			System.out.println("전체 영어 평균: "+avg);
		}else if(subjectNum==3) {
			System.out.println("전체 수학 총점: "+total);
			System.out.println("전체 수학 평균: "+avg);
		}
	}







	
	
	
	
	
	
	
	
	// 성적조회메서드 -> 학생 개인별 성적조회 메서드
	private static void checkStudentScore(int studentIdex) {
		System.out.println("학생 이름 : "+names[studentIdex]);
		System.out.println("국어 점수 : "+score[studentIdex][0]);
		System.out.println("영어 점수 : "+score[studentIdex][1]);
		System.out.println("수학 점수 : "+score[studentIdex][2]);
		System.out.println("총      점 : "+score[studentIdex][3]);
		System.out.println("평      균 : "+avg[studentIdex]);
		System.out.println("석      차 : "+ranking[studentIdex]);
	}

	
	






	// 성적조회메서드 -> 학생이름 입력받아서 해당 학생의 인덱스를 반환하는 메서드
	//만약 해당 학생 없다면 -1 반환
	private static int studentSelect() {
		int idx = -1;
		
		System.out.println("조회하고자 하는 학생의 이름을 입력하세요");
		System.out.print("> ");
		String name = scan.nextLine();
		for(int i=0;i<names.length;i++) {
			if(name.equals(names[i])) { //0~4
				idx = i;
				break;
			}
		}
		
		return idx;
	}







	//석차조회 메서드
	private static void checkRanking() {
		for(int i=0;i<ranking.length;i++) {
			System.out.println(names[i]+"학생의 석차 : "+ranking[i]+"등");
		}
	}

	
	
	
	
	
	//성적 입력 메서드
	private static void intput() {
		System.out.println("성적 정보를 입력하세요.");
		for(int i=0;i<names.length;i++) {
			System.out.println("\n"+names[i]+"학생");
			System.out.print("국어점수 > ");
			score[i][0]= Integer.parseInt(scan.nextLine());
			System.out.print("영어점수 > ");
			score[i][1]= Integer.parseInt(scan.nextLine());
			System.out.print("수학점수 > ");
			score[i][2]= Integer.parseInt(scan.nextLine());
			//학생의 총점
			score[i][3]= score[i][0]+score[i][1]+score[i][2];
			//학생의 평균
			avg[i] = score[i][3]/3.0;
			
			//석차
			for(int j=0;j<i;j++) {
				if(avg[i] < avg[j]) {
		       // 현재 입력받은 학생  기존의저장된 학생	
					ranking[i]++;
				}else {
					ranking[j]++;
				}
			}
		}
	}

	
	
	
	
	
	

}
