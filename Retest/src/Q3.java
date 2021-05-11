
public class Q3 {

	public static void main(String[] args) {
		Customer customer = new Customer("green", "1234", "홍길동", 10000);
		
		customer.addBasket("연필", 1000);
		customer.addBasket("노트", 3000);
		customer.addBasket("지우개", 1000);
		customer.addBasket("필통", 2000);
		customer.addBasket("연필깎기", 4000);
		
		
		customer.pay();
		customer.removeBasket("연필깎기");
		customer.pay();
	}

}
