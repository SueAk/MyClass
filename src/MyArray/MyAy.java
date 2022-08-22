package MyArray;

import java.util.Arrays;
import java.util.Collections;

public class MyAy {

	public static void main(String[] args) {

		Integer[] marks = new Integer[5];
		marks[0] = 340;
		marks[1] = 400;
		marks[2] = 250;
		marks[3] = 150;
		marks[4] = 245;
		// int i;
		// for (i = 0; i<marks.length; i++) {
		// System.out.println(marks[i]);
		// }
		//System.out.println(Arrays.toString(marks));

		Arrays.sort(marks, Collections.reverseOrder());
		System.out.println(Arrays.toString(marks));
	}

}
