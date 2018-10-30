package JavaExample_02_180527;

public class _01_Student extends _01_People{
	
	public int studentNo;
	
	public _01_Student (String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
}
