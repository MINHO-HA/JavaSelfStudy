package JavaMiniProject;

import java.util.Comparator;

//ArrayList 객체정렬을 위한 클래스 -> Comparator를 구현하고 있음
public class MiniComparator implements Comparator<DateContent> {

	// date 값 비교 구문
	@Override
	public int compare(DateContent first, DateContent second) {
		double firstValue = Double.parseDouble(first.date);
		double secondValue = Double.parseDouble(second.date);

		// 오름차순 정렬
		if (firstValue > secondValue) {
			return 1;
		} else if (firstValue < secondValue) {
			return -1;
		} else {
			return 0;
		}
	}

}
