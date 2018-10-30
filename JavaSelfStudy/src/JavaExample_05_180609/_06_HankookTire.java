package JavaExample_05_180609;

public class _06_HankookTire extends _04_Tire{

	public _06_HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Hankook Tire 수명 : "+(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** "+location+"Hankook Tire 펑크 ***");
		} 	return false;
	}
}
