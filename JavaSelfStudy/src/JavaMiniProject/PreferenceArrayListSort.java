package JavaMiniProject;

import java.util.ArrayList;
import java.util.Collections;

public class PreferenceArrayListSort {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("b,2");

		list.add("d");
		list.add("d");
		list.add("s");
		list.add("a");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
