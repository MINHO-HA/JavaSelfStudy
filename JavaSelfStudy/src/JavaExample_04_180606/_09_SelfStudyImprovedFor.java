package JavaExample_04_180606;

import java.util.Calendar;

public class _09_SelfStudyImprovedFor {

	public static void main(String[] args) {
	 
		String[] array = new String[3];
		
		for(String num : array) {
			System.out.println(num);
		}
		
		Calendar now = Calendar.getInstance();
		
		int second = now.get(Calendar.SECOND);
		System.out.print(second);

	}

}
