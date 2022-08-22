package MyOverloadings;

public class MyConstructorsOL {

	MyConstructorsOL(int a, int b) {
		System.out.println(a + b);//1
	}

	MyConstructorsOL(int a, double b) {
		System.out.println(a + b);//2
	}

	MyConstructorsOL(double a, int b) {
		System.out.println(a + b);//3
	}

	MyConstructorsOL(int a, int b, int c) {
		System.out.println(a + b + c);//4
	}
	public static void main(String[] args) {
		
		MyConstructorsOL col = new MyConstructorsOL(20,40);//1
		//MyConstructorsOL col1 = new MyConstructorsOL(20,40.5);//2
		//MyConstructorsOL col2 = new MyConstructorsOL(20.6,30);//3
		//MyConstructorsOL col4 = new MyConstructorsOL(20,40,60);//4
		
	}

}
