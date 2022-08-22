package MyPolymorphism;

public class MyOvTeacher {
	String name;
	int age;
	

	public void getDetails(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayDetails() {
		System.out.println("Teacher Name: "+ this.name);
		System.out.println("Teacher Age:" + this.age);
	}

}
