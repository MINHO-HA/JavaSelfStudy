package JavaMiniProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//메뉴클래스에 있는 메소드 구체화한 클래스
public class Method {
	// 날짜 내용등을 입력받기 위한 스캐너
	Scanner sc = new Scanner(System.in);

	// 날짜와 입력내용을 한 배열에 담기 위해 2개의 필드값을 가지는 클래스 타입의 ArrayList 배열 선언
	ArrayList<DateContent> list = new ArrayList<DateContent>();

	// ArrayList 정렬위해 생성한 MiniComparator 생성자 선언
	MiniComparator miniComparator = new MiniComparator();

	// 배열에있는 날짜 선택할 번호 필드선언
	int selectedNum;
	String willBeRepeated;

	/******************
	 * 1번 메모입력 메소드 *
	 ******************/
	// 날짜 잘못입력시 못받게하기 구현(나중에 생각해서 추가하기)(NOT DONE YET)
	public void inputMemo() {
		String content;
		String date;
		System.out.println("메모입력 메뉴입니다.");
		System.out.println();
		System.out.println("오늘의 날짜를 입력해주세요.");
		System.out.println();
		// 종료 미리받기(밑 while문과 if문의 제어문은 같다)

		boolean run = true;

		// 메모입력을 사용자가 종료문자열 'q'입력 전까지 계속 받기위한 while반복문

		while (run) {

			// 메모 다시입력 n or N 입력 전까지 do 안의 내용 반복
			do {
				System.out.println("예시)만약 오늘의 날짜가 2018년 06월 20일 일경우 20180620(6자리) 입력");
				System.out.println();
				System.out.println(">");
				date = sc.nextLine();

				// 입력받은 날짜의 자릿수가 8자리가 아니면 다시 입력해야하는 조건문
				if (date.length() == 8) {
					System.out.println("내용을 입력해주세요.");
					System.out.println(">");
					content = sc.nextLine();
					list.add(new DateContent(date, content));
					System.out.println("내용을 저장하였습니다.");
					System.out.println();
				} else {
					System.out.println("날짜입력 자릿수를 다시 한 번 확인해주세요.");
					System.out.println();
				}

				// 메모 입력 다시 할껀지 사용자한테 한번 더 묻기
				System.out.println("메모를 한번 더 입력하시겠습니까?(Y/N)");
				System.out.println(">");

				// y/n값받을 변수
				willBeRepeated = sc.nextLine();

				/*
				 * } else if (willBeRepeated.equals("n") || willBeRepeated.equals("N")) { run =
				 * false; } else { System.out.println("Y 혹은 N로 입력해주세요.");
				 */

			} while (!willBeRepeated.equals("n"));
			run = false;
		}
	}

	/******************
	 * 2번 메모꺼내기 메소드 *
	 ******************/
	public void outputMemo() {
		int selectedNum;

		// 사용자가 메모를 저장하지 않고 메모꺼내기 메소드를 실행하는 것을 방지하기 위한 if문 선언
		if (list.size() == 0) {
			System.out.println("저장하신 메모가 존재하지 않습니다.");
			System.out.println();
		} else {
			// 원하는 날짜 선택하는 int변수 선언

			System.out.println("메모꺼내기 메뉴입니다.");
			System.out.println();
			System.out.println("원하시는 날짜를 선택해주세요.");

			//MiniComparator클래스에서 override한 덕분에 list배열의 
			//date 스트링(숫자) 정렬가능
			Collections.sort(list, miniComparator);
			// ArrayList get메소드로 날짜 꺼내보기(여기서 date는 DateContent Class에 있는 값을 불러온다)
			for (int i = 0; i < list.size(); i++) {

				System.out.println(i + 1 + ". " + list.get(i).date);
			}
			System.out.println(">");
			// 원하는 날짜 입력받음
			selectedNum = sc.nextInt();

			// DateContent 클래스에 저장되어있는 원하는 날짜의 내용출력(이때 인덱스 번호는 선택한 날짜의 -1)
			System.out.println("저장된 내용입니다.");
			System.out.println();
			System.out.println(list.get(selectedNum - 1).content);
		}

	}

	/******************
	 * 3번 메모수정 메소드 *
	 ******************/
	public void modifyingMemo() {
		// 사용자가 수정시 입력하는 내용을 위해 String 변수 선언
		String content;

		// 사용자가 메모를 저장하지 않고 메모꺼내기 메소드를 실행하는 것을 방지하기 위한 if문 선언
		if (list.size() == 0) {
			System.out.println("저장하신 메모가 존재하지 않습니다.");
			System.out.println();
		} else {

			System.out.println("메모수정 메뉴입니다.");
			System.out.println();
			System.out.println("원하시는 날짜를 선택해주세요.");

			//MiniComparator 클래스에서 Override한 덕분 sort 메소드 객체 정렬가능
			Collections.sort(list, miniComparator);

			// 2번메소드의 ArrayList get메소드로 날짜 꺼내보기와 동일(여기서 date는 DateContent Class에 있는 값을 불러온다)
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + 1 + ". " + list.get(i).date);
			}
			System.out.println(">");
			// 원하는 날짜번호 선택 받기
			selectedNum = sc.nextInt();

			for (int i = 0; i < list.size(); i++) {
				System.out.println(selectedNum + "번의 내용");
				System.out.println();
				// DateContent 클래스에 저장되어있는 원하는 날짜의 내용출력(이때 인덱스 번호는 선택한 날짜의 -1)
				System.out.println(list.get(selectedNum - 1).content);
				// 반복문으로 인해 (ArrayList 배열의 사이즈만큼 반복되기 때문에) break로 횟수제한
				break;
			}

			System.out.println("수정하실 내용을 입력해주세요.");
			System.out.println(">");

			// 메소드 안에서 선언한 필드를 불러와 스캐너로 값 입력받음
			content = sc.next();

			// ArrayList set 메소드로 list 배열 인덱스번호 설정하여 그 인덱스에 있는 내용 수정하기
			// (여기서 포인트는 date값은 건들지않고 그대로 다시 출력되게 하는것이 포인트)
			// 그러므로 ArrayList.get 메소드로 날짜값은 입력받지 않고 불러왔다
			list.set(selectedNum - 1, new DateContent(list.get(selectedNum - 1).date, content));
			System.out.println("내용이 정상적으로 수정되었습니다.");
			System.out.println();
		}
	}

	/**************************
	 * 4번 메모파일로 출력하는 메소드 *
	 **************************/
	public void outputFile() throws IOException {
		// 파일명 선언위한 변수
		String fileName;
		// 사용자가 메모를 저장하지 않고 메모꺼내기 메소드를 실행하는 것을 방지하기 위한 if문 선언
		if (list.size() == 0) {
			System.out.println("저장하신 메모가 존재하지 않습니다.");
		} else {
			System.out.println("파일출력 메뉴입니다.");
			System.out.println();
			System.out.println("원하시는 날짜를 선택해주세요.");

			//MiniComparator 클래스에서 Override한 덕분 sort 메소드 객체 정렬가능
			Collections.sort(list, miniComparator);

			// 2번메소드의 ArrayList get메소드로 날짜 꺼내보기와 동일(여기서 date는 DateContent Class에 있는 값을 불러온다)
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + 1 + ". " + list.get(i).date);
			}

			System.out.println(">");
			// 원하는 날짜 선택받기
			selectedNum = sc.nextInt();

			for (int i = 0; i < list.size(); i++) {
				System.out.println(selectedNum + "번의 내용");
				// DateContent 클래스에 저장되어있는 원하는 날짜의 내용출력(이때 인덱스 번호는 선택한 날짜의 -1)
				System.out.println(list.get(selectedNum - 1).content);
				System.out.println();
				// 반복문으로 인해 (ArrayList 배열의 사이즈만큼 반복되기 때문에) break로 횟수제한
				break;
			}

			System.out.println("메모파일은 D드라이브의 memo폴더에 저장됩니다.");
			System.out.println();
			System.out.println("메모파일명을 영어로 입력해주세요");
			System.out.println();
			System.out.println(">");
			fileName = sc.next();

			// 파일 입출력을 위한 PrintWriter 생성자 선언(자동으로 메소드에 throws IOException 생성 - 사용하기위해서)
			// 경로는 미리 설정, 파일명은 위에 fileName 변수에 스캐너로 입력받음
			PrintWriter pw = new PrintWriter("D:/memo/" + fileName + ".txt");

			// 선택한번호의 저장내용 content 변수에 담기
			String content = list.get(selectedNum - 1).content;

			// 변수에
			pw.println(content);
			pw.close();
			System.out.println("해당내용이 성공적으로 입력하신 파일명과 함께 메모파일로 저장되었습니다.");
			System.out.println();
		}

	}

}
