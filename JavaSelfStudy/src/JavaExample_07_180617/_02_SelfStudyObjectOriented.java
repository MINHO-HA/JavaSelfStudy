package JavaExample_07_180617;

import java.util.Scanner;

public class _02_SelfStudyObjectOriented {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum=sc.nextInt();
		
		_02_SelfStudyObjectOriented gugudan = new _02_SelfStudyObjectOriented();
		gugudan.gugudan(inputNum);
	}
		
		public void gugudan(int i) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	

}
