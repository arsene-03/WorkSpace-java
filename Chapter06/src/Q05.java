

public class Q05 {

	public static void main(String[] args) {
		// 주어진 배열을 입력받아서가장 큰 수를 반환하는메소드를만들어 보세요

		int []nums = new int []{78,54,89,57,84,95,74,91,84,67,52,94,82};

		//int []nums = null;

		int max =maxValue(nums);
		//       메서드 => 정수형 배열을 넣으면 최대값을 찾아내는 기능을 가진 메서드
		System.out.println("최대값: "+max);

	}

	private static int maxValue(int[] nums) {
		int max = 0;
		if(nums == null || nums.length ==0) {
			max = -9999;
		}else {
			for(int i=0;i<nums.length;i++) {
				if(max< nums[i]) {
					max=nums[i];
				}
			}
		}
		return max;
	}



}
