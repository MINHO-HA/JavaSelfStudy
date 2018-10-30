package JavaExample_04_180606;

public class _12_SelfStudyCar {

	//필드
	int gas;
	
	//메소드
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스 없네");
			return false;
		}
		System.out.println("가스 있네");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달리자 (가스잔량:"+gas+")");
				gas -= 1;
			} else {
				System.out.println("정지 (가스잔량:"+gas+")");
				return;
			}
		}
	}
}
