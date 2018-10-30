package JavaExample_01_180526;

import java.util.Scanner;

public class _06_PracticeExample {

	private static _05_Practice[] accountArray = new _05_Practice[100];
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌 생성하기
	private static void createAccount(){
		System.out.println("계좌번호 : ");
		String ano=scan.next();
		
		System.out.println("예금 : ");
		String owner=scan.next();
		
		System.out.println("초기입금 : ");
		int balance=scan.nextInt();
		
		
		_05_Practice ac = new _05_Practice(ano, owner, balance) ; 
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=ac;
				System.out.println("계좌 생성");
				break;
			}
		}
	}
	
	
	private static void accountList(){
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		
		for(int i=0;i<accountArray.length;i++) {
			_05_Practice account = accountArray[i];
			if(account!=null) {
				System.out.print(account.getAno()+ "  ");
				System.out.print(account.getOwner()+ "  ");
				System.out.print(account.getBalance());
			}
		}
		
	}
	
	
	//예금처리를 위한 메소드
			//입금하고자 하는 계좌의 계좌번호와 입금액을 입력받아서
			//계좌번호 일치여부를 판단하고 기존 잔액에 입금액을 더해서 잔액으로 만든다.
			private static void deposit() {
				
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				
				System.out.println("계좌번호: ");
				String ano=scan.next(); //createAccount 메소드에 있는 ano와 동등한 입장이라 중복오류가 되지않는다!!!!!!!!!!!!!!!
				
				System.out.println("예금액 : ");
				int money=scan.nextInt();
				//Account 클래스 타입의 account 변수를 선언
				//우변의 내용 : findAccount 메소드를 호출하면서 매개변수는 ano로 넘김!!!!!!!!!!!
				
				_05_Practice account = findAccount(ano);
					
					if(account==null) {
						System.out.println("계좌가 없습니다.");
						return;
					}
					int balance = account.getBalance()+money;
					account.setBalance(balance);
					System.out.println("예금 성공");
					System.out.println("잔액은 "+account.getBalance());
				
			}
	
	
			private static void withdraw() {
				
				
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				
				System.out.println("계좌번호: ");
				String ano=scan.next();
				
				System.out.println("출금액 : ");
				int money=scan.nextInt();
				
				_05_Practice account = findAccount(ano);
				
				if(account==null) {
					System.out.println("계좌가 없습니다.");
					return;
				}
				int balance = account.getBalance()-money;
				account.setBalance(balance);
				System.out.println("예금 성공");
				System.out.println("잔액은 "+account.getBalance());
				
				
				
			}
	
	private static _05_Practice findAccount(String ano) {
		
		//Account 클래스 타입의 변수 선언(처리가 끝난 후 리턴 값을 추가하기 위해)
		_05_Practice account = null;
		
		for(int i=0;i<accountArray.length;i++) {
			
			if(accountArray[i]!=null) {
				
				//배열에 저장되어 있는 계좌번호를 임시로 저장하기 위한 변수
				String dbAno = accountArray[i].getAno();
				
				//검색된 계좌번호와 매개값으로 받은 ano가 일치하는지 판단
				if(dbAno.equals(ano)) {
					
					//일치하면 해당 인덱스에 있는 내용을 account 변수에 저장
					account = accountArray[i];
					
					break;
					
				}
			}
		}
		return account;
	}

}
