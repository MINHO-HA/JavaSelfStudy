package JavaExample_07_180617;

public class _03_Student {
	String name;
	int age;
	int studentNum;
	String major;
	
	_03_Student(String name, int age, int studentNum, String major){
		this.name=name;
		this.age=age;
		this.studentNum=studentNum;
		this.major=major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
