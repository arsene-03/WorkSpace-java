package q2;

public class gugudan_for_even {

	public static void main(String[] args) {
		for(int j=2;j<=9;j++) {
			if(j%2==0) {
				System.out.println("***"+j+"단***");	
			}
			
			for(int i=1;i<=9;i++) {
			if(i%2==0) {
				System.out.printf("%d X %d = %d\n",j,i,j*i);
			}
				
			}
		}

	}

}
