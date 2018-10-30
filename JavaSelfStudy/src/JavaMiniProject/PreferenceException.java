package JavaMiniProject;

import java.util.InputMismatchException;
import java.util.Scanner;
//Exception 연습 class(아직못끝냄)
public class PreferenceException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		while(true) {
			try {
				i = sc.nextInt();
				break;
			}
			catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("정수만 입력하세요");
			}
			
			
		}
		System.out.println(i);
	}

}
