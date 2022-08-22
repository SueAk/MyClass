package MyPrimeNumOrNot;

import java.util.Scanner;

public class MyPorNP {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = obj.nextInt();
		int temp;
		boolean isPrime = true;
		
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;

			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(" is a Prime Number");
		else
			System.out.println("is not a Prime Number");

		obj.close();
	}

}
