package JavaFirstProject;

import java.util.*;

public class _01_CatchAndLining {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("컴퓨터와 술래잡기 한판!");
		
		int[][] bingo = new int[5][5];
		int q = 1;
		int w = 2;
		
		
		int m = (int)(Math.random()*4);
		int n = (int)(Math.random()*4);
		bingo[m][n] = w;
		
		//System.out.println(bingo[0][1]);
		for(int i=0;i<5;i++) {
			System.out.println();
			for(int j=0;j<5;j++){
				System.out.print(bingo[i][j]+" ");
			} 
		}
		

		
		
		
		
		System.out.println();
		System.out.println("말을 놓으실 위치를 입력해주세요.");
		System.out.println("몇행?");
		int x = scan.nextInt();
		System.out.println("몇열?");
		int y = scan.nextInt();
		bingo[x][y] = q;
		
		for(int i=0;i<5;i++) {
			System.out.println();
			for(int j=0;j<5;j++){
				System.out.print(bingo[i][j]+" ");
			} 
			
		
		
		
		
		}
		
		
	}

}
