package JavaExample_04_180606;

public class _04_SelfStudySwitch {

	public static void main(String[] args) {
		/*
		 * Switch문은 if문과 마찬가지로 조건 제어문
		 * 하지만 Switch문은 변수에 어떤 값을 갖느냐에 따라 실행문이 선택된다.
		 * >> 변수에 값에 따라서 실행문이 결정되기 때문에 if문보다 코드가 간
		 */
		
		int num = (int)(Math.random()*6)+1;
		
		switch(num/*가로 안에는 변수 입력*/) {
			case 1:
				System.out.println("1번");
				break;
			case 2:
				System.out.println("2번");
				break;
			case 3:
				System.out.println("3번");
				break;
			case 4:
				System.out.println("4번");
				break;
			case 5:
				System.out.println("5번");
				break;
			default :
				System.out.println("6번");
				break;
		}	

	}

}
