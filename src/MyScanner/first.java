package MyScanner;
import java.util.Scanner;
public class first {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter value for vairable a: ");
	int a = obj.nextInt();

	System.out.println("Enter value for vairable b: ");
	int b = obj.nextInt();
	
	System.out.println("Multiplication for given numbers: " + a * b );
	
	obj.close();
	}

}
