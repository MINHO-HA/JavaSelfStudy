package JavaExample_07_180617;

import java.util.Scanner;

public class _01_SelfStudySwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  

		int i=sc.nextInt();
		int result = i%2;
		switch(result) {
		
		
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		
	}

}
