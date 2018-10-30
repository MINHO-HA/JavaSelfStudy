package JavaExample_01_180526;

import java.util.Scanner;

public class _02_PracticeExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id;
		String password;
		
		_01_Practice aa = new _01_Practice();
		
		System.out.println("아이디와 패스워드를 입력해주세요");
		boolean result = aa.login(id=scan.next(), password=scan.next());
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			aa.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}
}
