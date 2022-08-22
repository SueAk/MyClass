package MyAbstractions;

public class AbstractDemo3 extends AbstractDemo2 {

	public static void main(String[] args) {
		AbstractDemo3 obj1 = new AbstractDemo3();
		obj1.display();
		obj1.display4();

	}

	@Override
	public void display3() {

	}

	@Override
	public void display4() {
		System.out.println("this is display4 method from demo4 class");

	}

	@Override
	public void display5() {

	}

}
