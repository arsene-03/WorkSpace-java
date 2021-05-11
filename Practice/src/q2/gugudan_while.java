package q2;

public class gugudan_while {

	public static void main(String[] args) {
		
		
		int j= 2; //=>단
		while(j<=9) {
			System.out.println("***"+j+"단***");
			int i= 1; //=>뒷자리
			while(i<=9) {
				System.out.printf("%d X %d = %d\n",j,i,j*i);
				i++;
			}
			j++;
		}
				

	}

}
