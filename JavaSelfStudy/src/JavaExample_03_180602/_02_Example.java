package JavaExample_03_180602;

import java.util.*;

public class _02_Example {

	public static void main(String[] args) {
		Map<String, String> aa = new HashMap<String, String>();

		aa.put("손흥민", "183");
		aa.put("기성용", "191");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("축구선수 이름을 입력해봐~");
			String sp = scan.next();
			
			String height = aa.get(sp);
			if(height == null) {
				System.out.println("등록되지 않은 선수야~");
			} else {
				System.out.println(sp+"키는 "+height);
			}
		}
	}

}
