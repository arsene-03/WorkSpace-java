
public class Q2 {
	static String[] wishList= new String [6];
	public static void main(String[] args) {
		wishList = new String[] {"TV","냉장고","세탁기","에어컨","컴퓨터","전자레인지"};
		int[] prices = new int [] {240,250,120,75,100,25};
		int random = (int) (Math.random()*5+1);
		
		System.out.println("***조건2***");
		for(int i=0;i<prices.length;i++) {
			System.out.print(prices[i]+" ");	
		}
		System.out.println();
		
		
		rMethod(random);
		
		
		maxMethod(prices);
		
		String[] puchased =puchasedMethod(prices);
		
		System.out.println("\n***조건5***");
		for(int i=0;i<puchased.length;i++) {
			System.out.print(puchased[i]+" ");
		}
	}

	private static String[] puchasedMethod(int[] prices) {//조건5
		int sum=0;
		double avg = 0;
		for(int i=0;i<prices.length;i++) {
			sum += prices[i];
		}
		avg = sum/prices.length;
		int amount = 0;
		for(int i=0;i<prices.length;i++) {
			if(avg>prices[i]) {
				amount++;
			}
		}
		String[] puchased = new String[amount];
		int idx = -1;
		for(int i=0;i<prices.length;i++) {
			if(avg>prices[i]) {
				idx++;
				puchased[idx] = wishList[i];
			}
		}
		return puchased;
	}

	private static void maxMethod(int[] prices) { //조건 4
		String product = "";
		int max = 0;
		int idx = -1;
		for(int i=0;i<prices.length;i++) {		
			if(max<prices[i]) {
				max = prices[i];
				idx=i;
				 product = wishList[i];
			}
		}
		
		System.out.println("\n***조건4***");
		System.out.println("가장 비싼 품목은");
		System.out.println("품목: "+product+"/가격: " +max);
	}

	private static void rMethod(int random) {//조건3
		String product = wishList[random];
		System.out.println("\n***조건3***");
		System.out.println("품목 : "+product);
		
	}

	

}
