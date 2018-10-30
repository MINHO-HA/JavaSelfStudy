package JavaExample_05_180609;

public class _08_CarExample {

	public static void main(String[] args) {
		
	_05_Car car = new _05_Car();  //car 객체생성
	
	for(int i=1; i<=10; i++) {
		int problemLocation = car.run();
	
	
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.frontLeftTire = new _06_HankookTire("1", 15);
			break;
		
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			car.frontRightTire = new _07_KumhoTire("2", 15);
			break;
		
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체");
			car.backLeftTire = new _06_HankookTire("3", 14);
			break;
		
		case 4:
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			car.backRightTire = new _07_KumhoTire("뒤왼쪽", 17);
			break;
		}
	
	System.out.println("----------------------------------------");

	}
	
	}

}
