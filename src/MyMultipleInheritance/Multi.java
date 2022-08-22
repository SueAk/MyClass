package MyMultipleInheritance;

public class Multi implements Interface1, Interface2 {

	public static void main(String[] args) {
		Multi obj1 = new Multi();
		obj1.display();

	}

	@Override
	public void display() {

		Interface1.super.display();
		Interface2.super.display();
	}

}
