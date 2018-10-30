package JavaExample_01_180526;

import java.util.Scanner;

public class _08_ExercisePage183 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum=0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택>");
			
			int selecNo = scan.nextInt();
			
			if(selecNo == 1) {
				System.out.println("학생수 입력: ");
				studentNum=scan.nextInt();
				scores = new int[studentNum];
			} else if(selecNo == 2) {
				for(int i=0; i<scores.length;i++) {
					System.out.println(i+1+"번째 학생 점수입력: ");
					scores[i]=scan.nextInt();
				} 
			} else if (selecNo == 3) {
				for(int i=0;i<scores.length;i++) {
					System.out.println(i+1+"번째 학생 점수: "+scores[i]);
				}
			} else if (selecNo == 4) {
				int max=0;
				int sum=0;
				double avg=0;
				int count=0;
				max=scores[0];
				for(int i=0;i<scores.length;i++) {
					count++;
					max=scores[i];
					sum+=scores[i];
					avg=sum/count;
					}
				System.out.println("최고점: "+max);
				System.out.println("평균점수 :"+avg);
				
			} else if (selecNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
