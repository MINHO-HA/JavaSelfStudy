package JavaExample_01_180526;

public class _01_Practice {
	String id;
	String password;
	
	/*_01_Practice (String id, String password){
		this.id=id;
		this.password=password;
	}*/
	
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
