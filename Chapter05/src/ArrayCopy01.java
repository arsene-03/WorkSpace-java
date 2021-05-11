
public class ArrayCopy01 {

	public static void main(String[] args) {
		System.out.println("****************");
		int[] oldNum = {2,5,9};
		int[] newNum = new int[5]; // {0,0,0,0,0}
		//복사안된
		for(int i=0;i<newNum.length;i++) {
			System.out.println(newNum[i]);
		}
		System.out.println("****************");

		//배열복사
		for(int i=0;i<oldNum.length;i++) {
			newNum[i] = oldNum[i];
		}
		
		//복사된 배열 출력
		for(int i=0;i<newNum.length;i++) {
			System.out.println(newNum[i]);
		}
		
		
		

	}

}
