package JavaExample_05_180609;

public class _15_Car {

	_12_Tire frontLeftTire = new _13_HankookTire();
	_12_Tire frontRightTire = new _13_HankookTire();
	_12_Tire backLeftTire = new _13_HankookTire();
	_12_Tire backRighttTire = new _13_HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRighttTire.roll();
	}
	
}
