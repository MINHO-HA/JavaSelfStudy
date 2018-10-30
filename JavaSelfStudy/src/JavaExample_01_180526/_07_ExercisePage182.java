package JavaExample_01_180526;

public class _07_ExercisePage182 {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
	    int max=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
				
		}
		
		System.out.println("max: "+max );

	}

}
