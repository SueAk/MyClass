package MyStaticNonStatic;

public class StaticExample {
	static int a = 10;// static variable
	int b = 20; // non-static variable

	static void m1()// static variable
	{
		System.out.println("this is m1 - Ststic method ");
	}

	void m2() {
		System.out.println("this is m2- Non-Static method ");
	}

	void m3() {
		System.out.println("this is m3- Non-Static method ");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();

	}

	public static void main(String[] args) {
		// static method can access only static stuff
		// if static method is in different class then to call this method we have to
		// use class name eg.StaticExample.m1();
		System.out.println(a);// you can call static method without creating an object
		m1();// you can call static method without creating an object

		// System.out.println(b);incorrect because b is non static method
		// m2();incorrect because m1 is non static method

		// static methods can also access non static stuff but through object.
		StaticExample se = new StaticExample();
		System.out.println(se.b);// non static method through called Object
		se.m2();// non static method through called Object
		se.m3();
	}

}
