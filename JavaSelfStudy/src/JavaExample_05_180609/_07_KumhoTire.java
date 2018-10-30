package JavaExample_05_180609;

public class _07_KumhoTire extends _04_Tire{

	public _07_KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Kumho Tire 수명 : "+(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** "+location+"Kumho Tire 펑크 ***");
		} 	return false;
	}
}
