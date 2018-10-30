package JavaExample_02_180527;

public class _01_StudentExample {

	public static void main(String[] args) {
		_01_Student student = new _01_Student("홍길동", "123456-123457", 1 );
		System.out.println("name: "+student.name);
		System.out.println("ssn: "+student.ssn);
		System.out.println("studentNo :" + student.studentNo);
	}

}
