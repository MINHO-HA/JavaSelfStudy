package JavaMiniProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


// if문 같고 else문 내용 다를때 연습 클래스(아직못끝냄)
public class PreferenceRepeatedIF {

	static Scanner sc = new Scanner(System.in);
	static ArrayList list = new ArrayList();
	
	public static void main(String[] args) throws IOException {
		
		int c;
		
		
		a();
		b();
		
	}
		public static void a() {
			abcd();
				System.out.println("Aa메소드");
			
		}
		
		public static void b() {
			abcd();
				System.out.println("Bb메소드");
			
		}
		
		public static void abcd() {
			if(list.size()==0) {
				System.out.println("ABCD메소드");
				
			}
			else {
				b();
			}
		}

	

}
