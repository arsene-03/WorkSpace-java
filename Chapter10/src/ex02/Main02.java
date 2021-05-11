package ex02;

public class Main02 { //상속의 특수한 예  => 추상클래스 

	public static void main(String[] args) {
		//Animal animal = new Animal(); 추상클래스 자체는 인스턴스 생성불가  
		Cat cat01 = new Cat();
		Dog dog01 = new Dog();
		
		cat01.sound();
		dog01.sound();
		
		////////////////////////////////
		
		Animal animal = null; // 추상클래스의 다형성 특징
		
		animal = new Cat();
		animal.sound();
		
		animal = new Dog();
		animal.sound();
		
		animalsound(new Cat());
		animalsound(new Dog());
		
		
		
	}
	private static void animalsound(Animal ani) {
		ani.sound();
		
	}
}
