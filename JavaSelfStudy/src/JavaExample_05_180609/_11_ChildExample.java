package JavaExample_05_180609;

public class _11_ChildExample {

	public static void main(String[] args) {
		
		_09_Parent parent = new _10_Child();
		
		parent.field1 = "Messi";
		
		parent.method1();
		
		parent.method2();
		
		//_10_Child클래스에 있는 필드 field와 메소드 method3() 못불러온다.....
		// 이유는 자동타입변환되었기때문에.....
		//쓰게하기 위해선 자식클래스로 다시 강제타입변환해야된다.....
		/*			parent.field2 = "Ronaldo";
					parent.method3();					*/
		
		
		//이렇게 강제 타입변환하기
		_10_Child child = (_10_Child) parent;
		
		//강제타입변환후 _10_Child 클래스에 정의된 필드와 메소드 사용가
		child.field2 = "Neymar";
		child.method3();
		

	}

}
