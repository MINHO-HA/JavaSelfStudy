package JavaExample_05_180609;

public class _04_Tire {

	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public _04_Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명 : "+(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** "+location+" Tire 펑크 ***");
		} 	return false;
	}
}
