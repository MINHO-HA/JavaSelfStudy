package JavaExample_04_180606;

public class _06_SelfStudyMultipleFor {

	public static void main(String[] args) {
		
		//구구단 만들기~
		
		for(int n=2;n<=9;n++) {
			System.out.println();
			System.out.println(n+"단");
			
			for(int m=1;m<=9;m++) {
				System.out.println(n+"x"+m+"="+n*m);
			}
		}

	}

}
