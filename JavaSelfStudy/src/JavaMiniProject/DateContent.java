package JavaMiniProject;

//Method class안에서 선언한 ArrayList의 각 배열에 두개의 값(date, content)를 담기위해 
// String date / String content필드값 가지는 클래스 선언
public class DateContent {

	String date;
	String content;

	// Method에서 값이 오면 현재 이 클래스에 넘어옴
	DateContent(String date, String content) {
		this.date = date;
		this.content = content;
	}

	
	
}
