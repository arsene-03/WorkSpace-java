import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Customer {
	private String userid;
	private String userPassword;
	private String userName;
	private int userCash;
	private Map<String,Integer> basket;
	
	
	public Customer(String userid, String userPassword, String userName, int userCash) {
		super();
		this.userid = userid;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userCash = userCash;
		this.basket = new HashMap<>();
	}
	
	public void pay() {
		if(this.userCash<sumPrice()) {
			System.out.println("잔액부족");
		}else {
			this.userCash=sumPrice();	
			System.out.println("결제완료");
		}
		
		
	}
	
	
	private Integer sumPrice() {
		Integer value = null;
		Set <String> keySet = basket.keySet();
		Iterator<String> keyItr = keySet.iterator();
		int sum =0;
		while(keyItr.hasNext()) {
			String key = keyItr.next();
			value = basket.get(key);
			
			sum+=value;
		}
		return sum;
		}

	public void removeBasket(String productName) {
		basket.remove(productName);
	}
	
	public void addBasket(String productName, int price) {
		basket.put(productName, price);
	}

	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserCash() {
		return userCash;
	}


	public void setUserCash(int userCash) {
		this.userCash = userCash;
	}
	
	
}
