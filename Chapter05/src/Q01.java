
public class Q01 {

	public static void main(String[] args) {
		// 1. 다음과 같은 배열이 있을때 arr[3].lenghth의 값은 얼마인가.

		int[][] arr= {
				{5,5,5,5,5},
				{10,10,10},
				{20,20,20,20},
				{30,30}
		};
		System.out.println("1. "+arr[3].length);
		System.out.println("-----------------");

		// 2. 배열에 담긴 값들의 합계를 구하는 프로그램을 작성하세요

		int[]arr2 = new int[] {10,15,47,23,51};
		int sum=0;
		for(int i=0;i<arr2.length;i++) {
			sum += arr2[i];
		}
		System.out.println("2. "+sum);
		System.out.println("-----------------");

		// 3. 다음 2차원 배열에 담긴 모든 값들의 총합과 평균을 구하는 프로그램을 완성하세요.

		int[][]arr3 = {
				{5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
		};
		sum=0;
		double avg = 0;
		int count = 0;
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				sum += arr3[i][j];
				count++;
			}
		}

		avg = sum / (double)count;
		System.out.println("3. 총합: "+sum);
		System.out.println("     평균: "+avg);
		System.out.println("-----------------");

		//4. 1과9사이의 숫자로 이루어진 3자리 숫자를 만들어 내는 프로그램을 완성하세요 단 숫자의 중복이 있어서는 안됩니다.


		int[] num = new int[3];

		mainLoop:for(int i=0;i<3;i++) { // 3번반복
			num[i] = (int)(Math.random()*9)+1;
			//비교: 이미 뽑았던 숫자 들과 비교: 중복 제거를 위한 비교
			for(int j=0;j<i;j++) {
				// 3번째 숫자를 뽑는 상황을 가정(i=3)
				// 3번 숫자는 어디까지 비교를 해야 할 것인가
				// 0~2번까지 비교
				if(num[i] == num[j]) {
					//방금 뽑은숫자 == 이미 뽑았던 숫자 => 중복발생
					// 중복발생 => 방금뽑은 숫자를 버리고 다시 숫자를 뽑아야함
					i--;
					continue mainLoop;

				} // => 같은 숫자가 아님 : 중복이 없음

			}

		}
		System.out.println("4. ");
		for(int i=0;i<num.length;i++) { // 숫자 3개를 출력
			System.out.println((i+1)+"번쨰 숫자: "+num[i]);
		}
		System.out.println("-----------------");


		//5. 최대값과 해당 인덱스를 구해서 출력해 봅시다

		int []arr4 = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int max = arr4[0];
		int min = arr4[0];
		int index1 = -1; // 인덱스를 기억하기 위한 변수 (절대 인덱스 번호로 나올 수 없는 숫자)
		int index2 = -1;
		for(int i=0;i<arr4.length;i++) {
			if(max<arr4[i]) {
				max = arr4[i];
				index1 = i;

			}
			if(min>arr4[i]) {
				min = arr4[i];
				index2 = i;
			}
		}
		System.out.println("5. ");
		System.out.println("가장 큰 수는: "+max);
		System.out.println("인덱스는: "+index1);
		System.out.println("가장 작은수는: "+min);
		System.out.println("인덱스는: "+index2);
		System.out.println("-----------------");

		//6. 로또 게임을 5번 해서 출력하세요(1부터 45사이 의 숫자 6개)
		System.out.println("6. ");
		int lotto[] = new int [6];

		for(int j=0;j<5;j++) {System.out.print("{");
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			System.out.print(" "+lotto[i]);

		}
		System.out.println(" }");
		}
		System.out.println("-----------------");

		//6-1 로또 한게임을 실행 할 때 중복되지 않도록 출력하세요
		System.out.println("6-1. ");

		for(int j=0;j<5;j++) {System.out.print("{");
		rand:for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int k=0;k<i;k++) {
				if(lotto[k]==lotto[i]) {
					i--;
					continue rand;
				}
			}
			System.out.print(" "+lotto[i]);

		}
		System.out.println(" }");
		}
		System.out.println("-----------------");

		//6-2 로또 번호를 중복되지 않게 뽑은 후 버블 정렬기법을 사용해서 오름차순으로 정렬하세요
		System.out.println("6-2. ");

		for(int j=0;j<5;j++) {System.out.print("{");
		rand:for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int k=0;k<i;k++) {
				if(lotto[k]==lotto[i]) {
					i--;
					continue rand;
				}	
			}
			for(i=0;i<lotto.length;i++)
			for(int h=0;h<lotto.length-1;h++) {
				count = num[i];
				if(num[i]>num[i+1]) {
					num[i] = num[i+1];
					num[i+1]=count;
				}
			}
			System.out.print(" "+lotto[i]);
		}
		System.out.println(" }");
		}
		System.out.println("-----------------");
		
		//7. 1부터 45사이 숫자중 1000번의 번호를 뽑은 후 가장 많이 나오는 것 부터 6개를 최종 번호로 출력하세요
		
		for(int i=0;i<1000;i++) {
			for(int j=0;j<lotto.length;j++) {
				lotto[i] = (int)(Math.random()*45)+1;
			}System.out.println(lotto[i]);
			
		}
		
		
		


		
		
		
		
		
		
		
	}

}
