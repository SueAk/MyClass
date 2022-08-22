package MyStringMethods;

public class MyStringMethod {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = " World";

		// length of Strings(5)
		System.out.println(s.length());

		// Joining || concat of String s and s1
		System.out.println(s.concat(s1));

		// Trimming the string()
		String s3 = "          Hello World     ";
		System.out.println("Befor Trimming String is: " + s3);
		System.out.println("After Trimming String is: " + s3.trim());

		// charAt()
		s = "Hello";
		System.out.println(s.charAt(3));// return character based on index number. index number will start with 0

		// Contains()
		s = "Hello";
		System.out.println(s.contains("hel"));// case sensitive
		System.out.println(s.contains("Hel"));

		// comparing string equals() case sensitive
		s = "Hello";
		System.out.println(s.equals("Hello"));
		System.out.println(s.equals("hello"));

		// equalsIgnoreCase()
		System.out.println(s.equalsIgnoreCase("Hello"));// not case sensitive
		System.out.println(s.equalsIgnoreCase("hello"));

		// replace characters()
		s = "Hello";
		System.out.println(s.replace("e", "o"));
		System.out.println(s3.replace("World", "Me"));

		// Substring
		s = "Hello";
		System.out.println(s.substring(0, 3));// extracting substring from the main string

		// lowercase()
		s = "HELLO";
		System.out.println(s.toLowerCase());

		// uppercase()
		s = "hello";
		System.out.println(s.toUpperCase());

	}

}
