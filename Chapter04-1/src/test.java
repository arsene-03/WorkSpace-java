import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		//1.  1부터 100 까지 합을 구하세요.
		int sum =0;
		int count =0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			count++;
		}
		System.out.println("1. "+sum);
		
		
		
		//2. 1부터 100까지 7의 배수의 합을 구하세요

		sum =0;
		count =0;
		for(int i=1;i*7<=100;i++) {
			sum+=i*7;
			count++;
			
		}
		System.out.println("2. "+sum);
		
	

		//3. 1부터 100까지 7의 배수의 합의 평균을 구하세요
		
		double avg = sum/(double)count;
		System.out.println("3. "+avg);
		
		
		
		
		//4. 1부터 100까지의 합을 구하되 합계가 1000이 넘어서면 연산을 중단하고 그때의 합계를 출력해보세요
		// 그때의 항을 구하세요
		sum =0;
		count =0;
		int temp =0; //1000dl 넘어서는 순간의 k값을 저장하기 위한 변수
		for(int i=1;i<=100;i++) {
			sum+=i;
			count++;
			if(sum >= 1000) {
				temp=i;
				break;
			}
		}

		System.out.println("4: 합계: "+sum);
		System.out.println("    1000넘어 서는 순간의 항: "+temp+"\n");

		//5. 로그인 기능을 구현하세요
		//  저장된 아이디: green
		//  저장된 비밀번호: gr1234
		Scanner scan = new Scanner(System.in);
		
		String id = "green";
		String password = "gr1234";
		
		System.out.println("5. 로그인 기능구현");
		System.out.print(" ID: ");
		String userId = scan.nextLine();
		System.out.print(" PW: ");
		String userPassword = scan.nextLine();
		
		
		if(id.equals(userId)) {
			if(password.equals(userPassword)) {
				System.out.println("-----로그인 되었습니다.-----");
			}else {
				System.out.println("-----비밀번호 오류입니다-----");
			}
		}else {
			System.out.println("-----아이디가 존재하지 않습니다.-----"+"\n");
		}
		
		
			
		//6. 국어, 영어, 수학 점수를 입력받아서 총점과 평균을 구하는 프로그램을 만들어 봅시다
		
		System.out.println("6. 점수를 입력하세요");
		System.out.print("국어 > ");
		int koreanScore = Integer.parseInt(scan.nextLine());
		System.out.print("영어 > ");
		int englishScore = Integer.parseInt(scan.nextLine());
		System.out.print("수학 > ");
		int mathScore = Integer.parseInt(scan.nextLine());
		
		int sumScore = koreanScore+englishScore+mathScore;
		double avgScore = sumScore/3.0;
		
		System.out.printf("--> 총점: "+(int)sumScore +"점");
		System.out.printf("--> 평균: "+avgScore +"점"+"\n");
		System.out.println();
		
		
		
		//7. 구구단 짝수단을 출력하세요.
		System.out.println("7.짝수 구구단");
		System.out.println();
		
		for(int j=2;j<=9;j+=2) {
			System.out.printf("-----%d단-----\n",j);
			for(int k=1;k<=9;k++) {
				System.out.printf("%d x %d = %d\n",j,k,j*k);
			}
		}
		System.out.println();
	
		
		//8. 두개의 숫자를 입력받아서 두 수 사이의 합을 구하세요
		// 예, 3과 6을 받으면 3+4+5+6= 18 출력
		
		System.out.println("8. 숫자를 입력하세요");
		System.out.print("첫번째 숫자 > ");
		int firstNum = Integer.parseInt(scan.nextLine());
		System.out.print("두번째 숫자 > ");
		int secondNum = Integer.parseInt(scan.nextLine());
		System.out.print("두 수 사이의 총합 > ");
		
		sum=0;
		
		if(firstNum>secondNum) {
			for(int x= secondNum; x<=firstNum;x++) {
				sum+=x;
			}
		}else {
			for(int x= firstNum; x<=secondNum;x++) {
				sum+=x;
			}
		}
		
						
			System.out.println(sum);
		
		
		//9. 다음과 같은 ☆모양을 출력하세요. (이중반복을 이용)
			
			System.out.println();
			System.out.println("9. 모양 출력하기");
			
			for(int i=1;i<=5;i++) {
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
			
				System.out.println();
			}
		
		
		//10. 가위바위보 게임 가위바위보중 하나를 입력하면 컴퓨터가 생각한 가위바위보랑 비교해서 승,무,패를 출력
			
		
		








	}

}
