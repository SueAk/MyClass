package MyOverloadings;

public class MyMethodOL {
	void add(int x, int y) {
		System.out.println(x + y);//1
	}

	void add(int x, double y) {
		System.out.println(x + y);//2
	}

	void add(double x, double y) {
		System.out.println(x + y);//3
	}

	void add(int x, int y, int z) {
		System.out.println(x + y + z);//4
	}

	public static void main(String[] args) {
		MyMethodOL mol = new MyMethodOL();
		mol.add(40,50);//1
		mol.add(30.5,40.7);//3
		mol.add(20,20.5);//2
		mol.add(20, 40, 60);//4
				

	}

}
