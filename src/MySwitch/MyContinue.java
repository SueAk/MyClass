package MySwitch;

public class MyContinue {

	public static void main(String[] args) {
		// for(int i = 1; i<=10; i++ ) {
		// if (i==5)
		// {
		// continue;
		// }
		// System.out.println(i);

		// }

		for (int i = 1; i <= 10; i++) {
			if (i==1 || i == 3 || i == 5 || i == 7 || i == 9) {
				continue;
			}

			System.out.println(i);
		}
	}
}
