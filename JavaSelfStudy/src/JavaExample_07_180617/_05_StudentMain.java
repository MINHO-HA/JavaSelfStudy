package JavaExample_07_180617;

import java.util.ArrayList;

public class _05_StudentMain {

	ArrayList<_03_Student> students = new ArrayList<_03_Student>();
	_04_ExpelStudent es = new _04_ExpelStudent();
	
	
	public static void main(String[] args) {
		
		_05_StudentMain sm = new _05_StudentMain();
	
		sm.add("호날두", 30, 20001111, "체육학과");
		sm.add("메시", 29, 20011111, "영어학과");
		
		System.out.println(sm.students.get(0).getName());
	}
	
	public void add(String name, int age, int studentNum, String major) {
		_03_Student student = new _03_Student(name, age, studentNum, major);
		students.add(student);
		System.out.println(name+"학생 정보 입력 성공");
	}

	
}
