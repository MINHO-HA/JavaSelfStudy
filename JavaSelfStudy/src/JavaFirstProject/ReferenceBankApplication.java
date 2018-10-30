package JavaFirstProject;

import java.util.Scanner;

public class ReferenceBankApplication {

	//account 클래스 타입의 accountArray 배열을 선언
		//타입 마음대로 설정 가능!!
		private static ReferenceAccount[] accountArray = new ReferenceAccount[100]; //전역으로 설정해서 이클래스에있는 모든 메소드에서 사용가능!!!!!!!!!!!!!!!!!!!!!
		private static Scanner scan = new Scanner (System.in);
		
		public static void main(String[] args) {
			
			
			
			boolean run = true;
			while(run) {
				System.out.println("-----------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("-----------------------------------------");
				System.out.println("선택> ");
				
				int selecNum = scan.nextInt();
				
				//메소드 호출
				if(selecNum==1) {
					createAccount();
				} else if (selecNum==2) {
					accountList();
				} else if (selecNum==3) {
					deposit();
				}else if (selecNum==4) {
					withdraw();
				} else if (selecNum==5) {
					run = false;
				}
			}
				System.out.println("프로그램 종료");
			 
			}
		
		
		
		
		
			//계좌 생성을 위한 creatAccount 메소드
			//계좌번호, 계좌주, 초기입금액을 입력받고 계좌가 생성되었습니다. 출력!
			//입력이 끝나면 다시 선택하는 내용이 출력되어 추가로 계좌생성이 가능함.
			private static void createAccount() {

					
					System.out.println("계좌번호 입력 : ");
					String ano=scan.next(); //계좌번호 입력을 위한 변수
					
					System.out.println("계좌주 : ");
					String owner=scan.next(); //계좌주 입력을 위한 변수
					
					System.out.println("초기입금액 : ");
					int balance=scan.nextInt(); //초기입금액 입력을 위한 변수
					
					//입력받은 값을 이용하여  Account 클래스에 대한 객체 생성!!!!!!!!!!!!!!!!<중요포인트!!!!!!!!!!!!!!! 
					ReferenceAccount ac = new ReferenceAccount(ano, owner, balance); 
					//입력 받은 값을 배열 변수에 하나씩 저장!!!
				
					for(int i=0;i<accountArray.length;i++) {
						if(accountArray[i] == null) {
							accountArray[i]=ac;
							//ac.getAno(), ac.getName(), ac.getBalance() 다포함해서 accountArray배열에 저장!!!!!
							System.out.println("결과: 계좌가 생성되었습니다.");
							break;
						}
					}
			}		
			
			//계좌목록을 보기 위한 메소드
			//입력된 고객의 계좌번호, 계좌주, 잔액을 모두 보여줌!!!
			private static void accountList() {
				
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
				
				for(int i=0;i<accountArray.length;i++) {
					
					//중요한거!!
					//Account 클래스 타입에 account 변수 선언!
					//accountArray 배열에 있는 내용을 담는다.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
					ReferenceAccount account = accountArray[i];
				
					
					if(account != null) { //어떤 내용이 있다면!!!!!
						System.out.print(account.getAno()+"  ");
						System.out.print(account.getOwner()+"  ");
						System.out.println(account.getBalance()+"  ");
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
				
				ReferenceAccount account = findAccount(ano);
					
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
				
				ReferenceAccount account = findAccount(ano);
				
				if(account==null) {
					System.out.println("계좌가 없습니다.");
					return;
				}
				int balance = account.getBalance()-money;
				account.setBalance(balance);
				System.out.println("예금 성공");
				System.out.println("잔액은 "+account.getBalance());
				
				
				
			}
			
			//고객이 입력한 계좌번호와 저장되어있는 계좌번호에 대해 일치여부를 판단하는 메소드!!!!!!!!!!!!!!
			//매개변수 String ano
			//리턴타입 : account 클래스
			private static ReferenceAccount findAccount(String ano) {
				
				//Account 클래스 타입의 변수 선언(처리가 끝난 후 리턴 값을 추가하기 위해)
				ReferenceAccount account = null;
				
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