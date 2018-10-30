package JavaExample_06_180610;

public class _01_StringSplitExample {

	public static void main(String[] args) {
		
		String text = "손흥민&이승우,기성용@이청용-조현우";
		
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
		
		

	}

}
