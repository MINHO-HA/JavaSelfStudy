package _181030;

public class _02_ExecutaionClass {

	public static void main(String[] args) {
		
		// 현재 클래스에서 한개의 클래스(_01_Student)를 두번 참조했기 때문에 두개의 객체만큼 메모리가 생성됨.
		_01_Student s1 = new _01_Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		_01_Student s2 = new _01_Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		
		System.out.println();
		System.out.println();
		
		// 또한 다른 클래스에 선언한 필드나 메소드를 사용하기위해선 무조건 객체 생성 필수!
		_03_Car car = new _03_Car();
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);

		
		System.out.println();
		System.out.println();
		
		//생성자 오버로딩
		//매개변수를 달리하는 생성자를 여러개 선언하는 것을 말함.
		_03_Car car2 = new _03_Car("300d");
		System.out.println(car2.model);
		_03_Car car3 = new _03_Car("700d", 400);
		System.out.println(car3.model);
		System.out.println(car3.maxSpeed);

		
	}

}
