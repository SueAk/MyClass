package MyInheritance;

public class MultipleInheritance implements ABC, AXYZ {
	public void m1()

	{
		System.out.println(x);
	}

	public void m2()

	{
		System.out.println(y);
	}

	public static void main(String[] args) {

		MultipleInheritance obj = new MultipleInheritance();
		obj.m1();
		obj.m2();
	}
}