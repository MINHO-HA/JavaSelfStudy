package JavaExample_04_180606;

import java.util.Scanner;

public class _08_SelfStudyDoWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String message;
		
		System.out.println("입력하는 메세지 출력하는 프로그램~");
		System.out.println("메세지를 입력해봐");
		System.out.println("q입력하면 종료되");
	
		do {
			System.out.println(">");
			message = scan.nextLine();
			System.out.println(message);
		} while( ! message.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
