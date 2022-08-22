package MyOverloadings;

public class MyOverloadMainMethod {
	
	public void main (int x) {
		System.out.println(x);//1
	}
	
	public void main (int a, int b) {
		System.out.println(a+b);//2
	}
	

	public static void main(String[] args) {
		MyOverloadMainMethod omm = new MyOverloadMainMethod();
		omm.main(200);//1
		omm.main(200,450);//2
				
	}

}
