package JavaMiniProject;

import java.util.ArrayList;
import java.util.Scanner;
//ArrayList 연습 class
public class PreferenceArrayList {

	public static void main(String[] args) {
		ArrayList<DateContent> list = new ArrayList<DateContent>();
		Scanner sc = new Scanner(System.in);
		String date;
		String content;
		
		for(int i=0; i<list.size();i++) {
		System.out.println("날짜");
		date = sc.nextLine();
		System.out.println("내용");
		content = sc.nextLine();
		}
		
		
		//DateContent dt = new DateContent(date, content);
		
		//list.add(new DateContent(date, content));
		System.out.println("리스트배열 첫번째값");
		System.out.println(list.get(0).date);
		System.out.println(list.get(0).content);
		System.out.println("리스트배열 두번째값");
		System.out.println(list.get(1).date);
		System.out.println(list.get(1).content);

		System.out.println("0번 인덱스 내용수정");
		content = sc.nextLine();
		//list.set(0, new DateContent(date, content));
		
	
	
		System.out.println("다시 리스트배열 첫번째값");
		System.out.println(list.get(0).date);
		System.out.println(list.get(0).content);
		System.out.println("다시 리스트배열 두번째값");
		System.out.println(list.get(1).date);
		System.out.println(list.get(1).content);


	}

}
