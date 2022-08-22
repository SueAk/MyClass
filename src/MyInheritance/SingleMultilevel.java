package MyInheritance;

class A // A parent class for single class and Multilevel class
{
	int a;

	void display() {
		System.out.println(a);
	}
}

class B extends A // B Child class,A parent class Single class
{
	int b;

	void print() {
		System.out.println(b);
	}
}

class C extends B// A GrandParent B parent C child caled as Multilevel class
{
	int c;

	void show() {
		System.out.println(c);
	}
}

public class SingleMultilevel {

	public static void main(String[] args) {
		A aobj = new A();//A parent
		aobj.a = 20;//A
		aobj.display();//A

		B bobj = new B();// A Parent, B Child
		bobj.a = 50;//A
		bobj.b = 60;//B
		bobj.display();//A
		bobj.print();//B
		
		C cobj = new C();// A GrandParent , B Parent , C Child
		cobj.a=30;//A
		cobj.b=40;//B
		cobj.c=60;//C
		cobj.display();//A
		cobj.print();//B
		cobj.show();//C

	}

}
