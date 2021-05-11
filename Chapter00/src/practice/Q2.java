package practice;

public class Q2 {

	public static void main(String[] args) {
	
//		int j =2;
//		while(j<10) {
//			System.out.printf("***%d***",j);
//			System.out.println();
//			int i=1;
//			while(i<9) {
//				System.out.println(j+"x"+i+"="+j*i);
//				i++;
//			}
//			j++;
//		}
		
		
		int j =2;
		do {
			
			System.out.println("***"+j+"단***");
			
			int i =1;
			do {
				
				System.out.println(j+"X"+i+"="+j*i);
				i++;
			}while(i<9);
			j++;
		}while(j<9);
	}

}
