package MyConstructor;

public class ConstructorDemo {

	int x;
	int y;

	ConstructorDemo()// default constructor
	{
		x = 10;
		y = 20;

	}
	ConstructorDemo(int a, int b)  // parameterized constructor
	{
		x=a;
		y=b;
	}

	void display() 
	{
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		//default constructor
		ConstructorDemo Obj1 = new ConstructorDemo();// Invokes default constructor
		Obj1. display();

		 // parameterized constructor	
		ConstructorDemo Obj2 = new ConstructorDemo(100,200);// Invokes parameterized constructor
		Obj2. display();
		
	}

}
