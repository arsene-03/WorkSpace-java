
public class Array02 {

	public static void main(String[] args) {
		int[][] nums = new int[5][];

		nums[0]= new int[2];
		//int[] nums = new int [2];위와 아래가 같다.

		nums[1] = new int[3];
		nums[2] = new int[5];
		nums[3] = new int[7];
		nums[4] = new int[1];

		System.out.println("nums의 길이 : "+nums.length);
		System.out.println("nums[0]의 길이 : "+nums[0].length);
		System.out.println("nums[1]의 길이 : "+nums[1].length);
		System.out.println("nums[2]의 길이 : "+nums[2].length);
		System.out.println("nums[3]의 길이 : "+nums[3].length);
		System.out.println("nums[4]의 길이 : "+nums[4].length);

		nums[2][3] = 50;

		System.out.println("***********************************");

		//////////////////////////////////////////////////////////

		//자바 시험을 봤습니다.
		//1반 학생점수 87,71,64,82
		//2반 학생점수 92,88,73,61,79
		//3반 학생점수 78,53,99,87,64,75,51,93
		//하나의 배열에 담고 각 반별 합계와 평균을 구해보세요
		int []javaClass1= new int[] {87,71,64,82};
		int []javaClass2= new int[] {92,88,73,61,79};
		int []javaClass3= new int[] {78,53,99,87,64,75,51,93};

		int sum1=0, sum2=0, sum3=0;
		double avg1=0.0, avg2=0.0, avg3=0.0;

		for(int i=0;i<javaClass1.length;i++) { // 1반학생점수합계
			sum1 += javaClass1[i];
		}
		avg1 = sum1/(double)javaClass1.length;

		System.out.println("1반 학생 총점: "+sum1);
		System.out.println("1반 학생 평균: "+avg1);

		for(int i=0;i<javaClass2.length;i++) { // 2반학생점수합계
			sum2 += javaClass2[i];
		}
		avg2 = sum2/(double)javaClass2.length;

		System.out.println("2반 학생 총점: "+sum2);
		System.out.println("2반 학생 평균: "+avg2);

		for(int i=0;i<javaClass3.length;i++) { // 3반학생점수합계
			sum3 += javaClass3[i];
		}
		avg3 = sum3/(double)javaClass3.length;

		System.out.println("3반 학생 총점: "+sum3);
		System.out.println("3반 학생 평균: "+avg3);
		///////////////////////////////////////////////////////////////////////

		System.out.println("***********************************");

		int[][] javaClass = new int[3][];
		javaClass[0] = new int[] {87,71,64,82};
		javaClass[1] = new int[] {92,88,73,61,79};
		javaClass[2] = new int[] {78,53,99,87,64,75,51,93};

		sum1=0; sum2=0; sum3=0;
		avg1=0.0; avg2=0.0; avg3=0.0;

		for(int i=0;i<javaClass[0].length;i++) { // 1반학생점수합계
			sum1 += javaClass1[i];
		}
		avg1 = sum1/(double)javaClass[0].length;

		System.out.println("1반 학생 총점: "+sum1);
		System.out.println("1반 학생 평균: "+avg1);

		for(int i=0;i<javaClass[1].length;i++) { // 2반학생점수합계
			sum2 += javaClass2[i];
		}
		avg2 = sum2/(double)javaClass[1].length;

		System.out.println("2반 학생 총점: "+sum2);
		System.out.println("2반 학생 평균: "+avg2);

		for(int i=0;i<javaClass[2].length;i++) { // 3반학생점수합계
			sum3 += javaClass3[i];
		}
		avg3 = sum3/(double)javaClass[2].length;

		System.out.println("3반 학생 총점: "+sum3);
		System.out.println("3반 학생 평균: "+avg3);

		System.out.println("***********************************");

		int sum = 0;
		double avg = 0.0;

		for(int j=0;j<javaClass.length;j++) { // 3개의 반
			sum=0; avg=0.0;
			for(int i=0;i<javaClass[j].length;i++) { // 반별 합계와 평균
				sum += javaClass[j][i];
			}
			avg = sum/(double)javaClass[j].length;

			System.out.println((j+1)+"반 학생 총점: "+sum);
			System.out.println((j+1)+"반 학생 평균: "+avg);
		}

		System.out.println("***********************************");


		int[][] java = {
				       		{87,71,64,82},
				       		{92,88,73,61,79}, 
				       		{78,53,99,87,64,75,51,93}
		               };
		sum = 0;
		avg = 0.0;
		int studentCount = 0;
		for(int j=0;j<java.length;j++) { // 3개의 반
			for(int i=0;i<java[j].length;i++) { // 반별 합계와 평균
				sum += java[j][i];
			}
			studentCount+=java[j].length;//각 반별 인원수 합계
			
			
		}
		avg = sum/(double)studentCount;
		System.out.println("전체 학생 총점: "+sum);
		System.out.println("전체 학생 평균: "+avg);
		
		System.out.println("***********************************");
		
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("향상된 for문 = for -each문");
		int[] jsp = new int[] {10,20,30,40,50};
		sum=0;
		for(int i=0;i<jsp.length;i++) {//만복을 사용하기 위한 일반적인 for 문
			//java라는 배열의 요소를 하나씩 조회하세요.
			sum += jsp[i];
		}
		System.out.println("일반적인 for문: "+sum);
		sum=0;
		for(int n:jsp) { //향상된 for 문
			// jsp배열의 0번부터 순서대로 요소를 읽어와서 n에 담고 반복을 사용
			sum +=n;
		}
		System.out.println("향상된 for문: "+sum);

	}

}
