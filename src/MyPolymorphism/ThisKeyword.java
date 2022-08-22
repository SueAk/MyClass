package MyPolymorphism;

public class ThisKeyword {
	int a, b;// Instant variable or class variable

	void getvalue(int a, int b)// method variable or external variable
	{

		this.a = a;
		this.b = b;
	}

	void printVlaue() {
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) {

		ThisKeyword tk = new ThisKeyword();
		tk.getvalue(10, 40);
		tk.printVlaue();

	}

}
