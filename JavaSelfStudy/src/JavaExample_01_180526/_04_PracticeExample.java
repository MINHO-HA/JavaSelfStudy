package JavaExample_01_180526;

public class _04_PracticeExample {

	public static void main(String[] args) {
		_03_Practice account = new _03_Practice();
		
		account.setBalance(10000);
		System.out.println("현재잔고: "+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고: "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재잔고: "+account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재잔고: "+account.getBalance());

	}

}
