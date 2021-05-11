package ex02_clone;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(10,20);  //인스턴스 A
		            // point1 = 인스턴스 A
		Point point2 = point1;
					// point2 = 인스턴스 A
		System.out.println(point1.toString());
		System.out.println(point2.toString());
		System.out.println("-------------------------------");
		
		point2.x = 100;
		point2.y = 200;
		
		System.out.println(point1.toString());
		System.out.println(point2.toString());
		System.out.println("-------------------------------");

		// 인스턴스 복제
		Point point3 = (Point)point1.clone();
		System.out.println(point1.toString());
		System.out.println(point3.toString());
		
		System.out.println("-------------------------------");
		point3.x = 1000;
		point3.y = 2000;
		System.out.println(point1.toString());
		System.out.println(point3.toString());
		
	}

}
