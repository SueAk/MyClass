package MyIfElse;

import java.util.Scanner;

public class MyIE {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = obj.nextInt();

		if (a % 2 == 0) {
			System.out.println("Given number is even number:");
		} else {
			System.out.println("Given number is odd numer:");
		}

		obj.close();
	}

}
