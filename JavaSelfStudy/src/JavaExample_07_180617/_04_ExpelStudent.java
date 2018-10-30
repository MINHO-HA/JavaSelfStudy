package JavaExample_07_180617;

import java.util.ArrayList;

public class _04_ExpelStudent {

	ArrayList<_03_Student> expelStudents = new ArrayList<_03_Student>();
	
	_04_ExpelStudent(){
		
	}
	
	public void addExpelStudent(String name, int age, int studentNum, String major) {
		expelStudents.add(new _03_Student(name, age, studentNum, major));
	}
}
