package MySwitch;

import java.util.Scanner;

public class FirstSw {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = obj.nextInt();
		int b = a % 2;


		switch (b) {
		case 1:
			System.out.println("Odd number");
			break;
		case 0:
			System.out.println("Even number");
			break;
		default:
			System.out.println("Invalid number");
		}
		obj.close();
	}
}
