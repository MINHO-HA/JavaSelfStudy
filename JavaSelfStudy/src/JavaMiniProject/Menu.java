package JavaMiniProject;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	// Method클래스에 있는 구체화된 메소드를 불러오기 위해 생성자 선
	Method method = new Method();

	// 메뉴선택시 숫자를 받기 위해 스캐너 삽입
	Scanner sc = new Scanner(System.in);

	// 메뉴선택번호 필드선언
	int selectNum;

	public void menu() throws IOException {
		// try, catch에서 예외처리시 다시 try안으로 돌아오기 위해 while문 선언
		while (true) {

			// 예외처리 try
			try {

				// 메뉴 구현
				// boolean문과 while문을 결합하여 반복하며 메뉴 5번 선택시 false값을 리턴받아 프로그램 종료
				boolean run = true;
				while (run) {
					System.out.println();
					System.out.println("                   It's NOTE");
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("1.메모입력 | 2.메모꺼내기 | 3.메모수정 | 4.파일출력 | 5.사용종료");
					System.out.println("----------------------------------------------------");
					System.out.println();
					System.out.println(">");

					selectNum = sc.nextInt();

					// 메소드 호출 (각 번호안의 메소드는 Method Class에서 구현해놓음)
					if (selectNum == 1) {
						method.inputMemo();
					} else if (selectNum == 2) {
						method.outputMemo();
					} else if (selectNum == 3) {
						method.modifyingMemo();
					} else if (selectNum == 4) {
						method.outputFile();
					} else if (selectNum == 5) {
						run = false;
						System.out.println("프로그램이 종료되었습니다.");
						sc.close();
					} else {
						System.out.println("입력하신 메뉴번호를 다시 한 번 확인해주세요.");
						System.out.println();
					}

				}
				break;
				// catch문으로 예상되는 예외 잡아주기 -> 다시 메뉴 실행위해 스캐너 다시 선언
			} catch (InputMismatchException e) {
				System.out.println("입력하신 메뉴번호를 다시 한 번 확인해주세요.");
				
				//스캐너 버그로 인해 다시 초기화
				sc = new Scanner(System.in);

			}
		}
	}

}
