package q2;

public class gugudan_dowhile {
	public static void main(String[] args) {
		int j = 2;	
		do {
			System.out.println("****"+j+"****단");
			int i =1;
			do {	
				System.out.printf("%d X %d = %d\n",j,i,j*i);
				i++;
			}while(i<=9);
			j++;
		}while(j<=9);
		
	}
}
