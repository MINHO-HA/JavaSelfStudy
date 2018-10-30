package JavaExample_05_180609;

public class _03_SupersonicAirplaneExample {

	public static void main(String[] args) {
		_02_SupersonicAirplane sa = new _02_SupersonicAirplane();
		
		sa.takeOff();
		
		//sa.flyMode = 1;
		sa.fly();
		
		sa.flyMode =2;
		sa.fly();
		
		sa.land();

	}

}
