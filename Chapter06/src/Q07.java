
public class Q07 {

	public static void main(String[] args) {
//		7. 주어진 두 배열의 같은 위치의 숫자를 합쳐서 하나의 배열로 출력하는메소드를만드세요.
//		단, 같은 위치에 숫자가 없다 해당 해당 위치의 숫자를 그냥 출력하세요
		int[]arr1 = new int[] {78,54,89,57,84};
		int[]arr2 = new int[] {95,74,91,84};
		
		int[] arr3 = arrAdd(arr1, arr2);
		prt(arr3);
	}

	private static int[] arrAdd(int[] arr1, int[] arr2) {
		int[] result = null;
		
		if(arr1.length < arr2.length) { //arr2 가 더 기니까 arr2로 기준으로 반복
			result = new int[arr2.length];
			for(int i=0;i<arr2.length;i++) {
				if(i<arr1.length) {
					result[i]=arr1[i]+arr2[i]; 	
				}else {
					result[i]=arr2[i];
				}		
			}
		}else {//arr1 가 더 기니까 arr1로 기준으로 반복
			result = new int[arr1.length];
			for(int i=0;i<arr1.length;i++) {
				if(i<arr2.length) {
					result[i]=arr1[i]+arr2[i]; 	
				}else {
					result[i]=arr1[i];
				}	
			}
		}
		return result;
	}
	private static void prt(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			if(i == arr.length-1) {//i 가 인덱스 끝에 도달했을떄
				System.out.println(arr[i]);
			}else {
				System.out.print(arr[i]+",");
			}
			
		}
	}
}
