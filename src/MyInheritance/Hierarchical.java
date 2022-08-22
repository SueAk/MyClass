package MyInheritance;

class parent {
	int x;

	void display() {
		System.out.println(x);
	}
}

class child1  extends parent{
	int y;

	void print() {
		System.out.println(y);
	}
}

class child2 extends parent {
	int z;

	void show() {
		System.out.println(z);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		
		child1 ch1 = new child1();
		ch1.x=20;
		ch1.y=30;
		ch1.display();
		ch1.print();
		
		child2 ch2 =new child2();
		ch2.x=20;
		ch2.z=40;
		ch2.display();
		ch2.show();
		
		
		

	}

}
