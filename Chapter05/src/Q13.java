import java.util.Scanner;

public class Q13 {

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
		
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[] {"고길동","김길동","이길동","박길동","홍길동"};
							 // 인덱스번호    0      1       2      3      4   => 학생의 id
		int[] korScore = new int[5];
		int[] engScore = new int[5];
		int[] mathScore = new int[5];
		int[] sumScore = new int[5];
		double[] avgScore = new double[5];
		
		int[] ranking = new int[] {1,1,1,1,1};
		
		while(true) {
			System.out.println("**성적관리 프로그램**");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("선택> ");
			
			int selecNum = Integer.parseInt(scan.nextLine());
			
			if(selecNum==0) {// 더미 데이터 입력
				
				
			}else if(selecNum==1) {//성적입력
				System.out.println();
				System.out.println("***성적 정보를 입력하세요***.");
				for(int i=0;i<names.length;i++) {
				System.out.println(names[i]+"학생");
				
				System.out.print("국어점수 > ");
				korScore[i] = Integer.parseInt(scan.nextLine());
				
				System.out.print("영어점수 > ");
				engScore[i] = Integer.parseInt(scan.nextLine());
				
				System.out.print("수학점수 > ");
				mathScore[i] = Integer.parseInt(scan.nextLine());
				
				System.out.println();
				sumScore[i] = korScore[i]+engScore[i]+mathScore[i];
				avgScore[i] = sumScore[i]/3.0; 
				
				//석차를 구하는 코드
				
				for(int j=0;j<i;j++) {
					if(avgScore[i] < avgScore[j]) {
			       // 현재 입력받은 학생  기존의저장된 학생	
						ranking[i]++;
					}else {
						ranking[j]++;
					}
				}
				
				}					
				
			}else if(selecNum==2) {//성적조회
		  chkScore:	while(true) {
			  		System.out.println();
					System.out.println("**성적조회**");
					System.out.println("1. 개인별 성적 조회");
					System.out.println("2. 과목별 성적 조회");
					System.out.println("3. 이전 메뉴 돌아가기");
					System.out.print("선택 > ");
					
					int selectChkScore =Integer.parseInt(scan.nextLine());
					switch(selectChkScore) {
					case 1: // 개인별 성적조회
						System.out.println("\n조회할 학생의 이름을 입력하세요.");
						System.out.print("입력 > ");
						String chkName = scan.nextLine();
						int idx =-1; // 해당 학생의 인덱스 번호
						for(int i=0;i<names.length;i++) {
							if(chkName.equals(names[i])) {
								idx = i;
								break;
							}
						}
						if(idx == -1) {
							System.out.println("학생 정보를 찾을 수 없습니다");
						}else {
							System.out.println("\n"+names[idx]+" 학생 성적정보");
							System.out.println("국어점수: "+korScore[idx]);
							System.out.println("영어점수: "+engScore[idx]);
							System.out.println("수학점수: "+mathScore[idx]);
							System.out.println("충     점: "+sumScore[idx]);
							System.out.println("평     균: "+avgScore[idx]);
						}
						
						break;
					case 2: //과목별 성적조회
						System.out.println("\n조회 하려는 과목을 선택하세요");
						System.out.println("1. 국어점수");
						System.out.println("2. 영어점수");
						System.out.println("3. 수학점수");
						System.out.print("선택 > ");
						int seclectSubjectNum =Integer.parseInt(scan.nextLine());
						
						int[] Score;
						String subject="";
						
						if(seclectSubjectNum==1) {
							Score = korScore;
							subject = "국어";
						}else if(seclectSubjectNum==2) {
							Score = engScore;
							subject = "영어";
						}else if(seclectSubjectNum==3) {
							Score = mathScore;
							subject = "수학";
						}else {
							System.out.println("잘못입력했습니다.");
							break;
						}
						
						int sum=0;
						double avg = 0.0;
						
						for(int i=0;i<Score.length;i++) {
							sum+=Score[i];
						}
						avg = sum/(double)Score.length;
						
						System.out.println(subject+"과목의 총점: "+sum);
						System.out.println(subject+"과목의 총점: "+avg);
						
						
						break;
					case 3://이전 메뉴 돌아가기 => while문 종료
						break chkScore;
					default:
						System.out.println("잘못 입력했습니다.");
						System.out.println("다시 확인해주세요.");
					}
					
				}
			
			}else if(selecNum==3) {//석차조회
				for(int i=0;i<ranking.length;i++) {
					System.out.println(names[i]+"학생의 석차 : "+ranking[i]+"등");
				}
			}else if(selecNum==4) {
				System.out.println("**프로그램을 종료합니다.**");
				System.exit(0);
			}else {
				System.out.println("\n**잘못 입력했습니다.**");
				System.out.println("**다시 확인해 주세요.**\n");
			}
				
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
