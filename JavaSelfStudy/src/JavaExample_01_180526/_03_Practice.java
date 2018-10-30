package JavaExample_01_180526;

public class _03_Practice {

	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if(balance<=0 || balance>1000000) {
			return;
		} else {
			this.balance = balance;
		}
	}
	
	
	
}
