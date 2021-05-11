import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//미리 저장된 id ,password
		String id = "green";
		String password ="1234";

		System.out.println("로그인 프로그램");
		System.out.print("아이디: ");
		String userId = scan.nextLine();
		System.out.print("비밀번호: ");
		String userPassword = scan.nextLine();

		if(id.equals(userId)) {
			if(password.equals(userPassword)) {
				System.out.println("로그인 되었습니다.");
			}else {
				System.out.println("잘못된 비밀번호 입니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다");
		}

		//		System.out.println("입력한 아이디: "+userId);
		//		System.out.println("입력한 비밀번호: "+userPassword);

		// 로그인 처리프로그램을 만들어봅시다.
		// 아이디가 틀린경우 "아이디가 존재하지 않습니다."
		// 비밀번호가 틀린경우 "잘못된 비밀번호 입니다."
		// 아이디, 비밀번호가 일치한 경우 "로그인 되었습니다."







	}

}
