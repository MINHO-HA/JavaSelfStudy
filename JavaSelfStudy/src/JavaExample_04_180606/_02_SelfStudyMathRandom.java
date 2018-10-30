package JavaExample_04_180606;

public class _02_SelfStudyMathRandom {

	public static void main(String[] args) {
		
		int dice = (int)(Math.random()*6)+1;
		
		if(dice==1) {
			System.out.println(dice+" 1번 나옴");
		} else if (dice==2) {
			System.out.println(dice+" 2번 나옴");
		} else if (dice==3) {
			System.out.println(dice+" 3번 나옴");
		} else if (dice==4) {
			System.out.println(dice+" 4번 나옴");
		} else if (dice==5) {
			System.out.println(dice+" 5번 나옴");
		} else {
			System.out.println(dice+" 6번 나옴");
		}
		
	}

}
