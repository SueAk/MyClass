package MyArray;

public class MyMethodDemo {

	public static void main(String[] args) {
		int[] numArray = { 55, 40, 80, 35, 20 };
		sumofArray(numArray);

	}

	public static void sumofArray(int[] Array1) {
		int sum = 0;
		int i;
		for (i = 0; i < Array1.length; i++) {
			sum = sum + Array1[i];

		}
		System.out.println("Sum of all integer" + sum);
	}
}
