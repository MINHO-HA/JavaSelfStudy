package JavaExample_05_180609;

public class _16_CarExample {

	public static void main(String[] args) {
		
		_15_Car mycar = new _15_Car();
		
		mycar.run();
		
		mycar.frontLeftTire = new _14_KumhoTire();
		mycar.frontRightTire = new _14_KumhoTire();
		
		mycar.run();

	}

}
