package ExceptionHandlingUnChecked;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		try {
			System.out.println("Enter value for x: ");
			int x = obj.nextInt();
			System.out.println("Enter value for y: ");
			int y = obj.nextInt();
			System.out.println("Division for given number: "+ x/y);
		}catch(Exception e) {
			System.out.println("Exception occurred");
			System.out.println("Exception message:" + e.getMessage());
		}finally {
			obj.close();
			}
		System.out.println("This is the end of program");

	}

}
