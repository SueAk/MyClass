package MyIfElse;

import java.util.Scanner;

public class MaleFemale {

	public static void main(String[] args) {
		
		 Scanner obj = new Scanner(System.in);
				 System.out.println("Enter a number: ");
				 int a = obj.nextInt();
				// if a = 1, male; 
				 //else female

				if (a == 1) {
					System.out.println("You're a male");
				} else {
					System.out.println("You're a female");
				}

				//if (Male == true) {
					//System.out.println("You're a male");
				//}

				//else {
					//System.out.println("You're a female");
				//}
		obj.close();
	}

}
