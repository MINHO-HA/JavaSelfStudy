package JavaExample_06_180610;

public class _02_StringBuilder {

	public static void main(String[] args) {
		
		String date = "ABC";
		date += "DEF";
		
		System.out.println(date);
		//문자열을 추가하고싶을때 위처럼 사용 가능하지만 컴퓨터 느려지게 한다
		//이유는 객체에 또다른 객체를 생성하기때문에...
		
		//StringBuilder사용해봐
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("99");
		sb.append("손흥민");
		System.out.println(sb);

		
		int i=3;
		String y="gg";
		System.out.println(Integer.toString(i)+y);
		//인트를 스트링으로 변환
		
		
		String x= "12";
		int j=3;
		
		System.out.println(x+j);
		
		System.out.println();
		
		
		
	}

}
