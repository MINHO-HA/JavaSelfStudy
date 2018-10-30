package JavaExample_04_180606;

public class _13_SelfStudyCarExample {

	public static void main(String[] args) {
		
		_12_SelfStudyCar car = new _12_SelfStudyCar();
		
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		
		if(gasState) {
			System.out.println("출발");
			car.run();
		}
		
		if(car.isLeftGas()) {
			System.out.println("가스를 주입할 필요 없네");
		} else {
			System.out.println("가스를 주입해야해");
		}

	}

}
