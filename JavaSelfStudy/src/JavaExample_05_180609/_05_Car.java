package JavaExample_05_180609;

public class _05_Car {
	
	//필드
	_04_Tire frontLeftTire = new _04_Tire("앞왼쪽", 6);
	_04_Tire frontRightTire = new _04_Tire("앞오른쪽", 2);
	_04_Tire backLeftTire = new _04_Tire("왼쪽", 3);
	_04_Tire backRightTire = new _04_Tire("뒤오른쪽", 4);
	
	
	//메소드
	int run() {
		System.out.println("자동차 달린다");
		if(frontLeftTire.roll() == false) {
			stop(); return 1;
		}
		if(frontRightTire.roll() == false) {
			stop(); return 2;
		}
		if(backLeftTire.roll() == false) {
			stop(); return 3;
		}
		if(backRightTire.roll() == false) {
			stop(); return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("차가 멈춤");
	}
}
