package MyPolymorphism;

public class MyParentsOverrid extends MyOvTeacher {

	String empType;	
	public void getEmpTypes(String empType) {
		this.empType = empType;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Teacher Employment Type:" + this.empType );
	}
	public static void main (String[] args) {
		MyParentsOverrid m1 = new MyParentsOverrid();
		m1.getEmpTypes("FullTime");
		m1.getDetails("Vi", 30);
		m1.displayDetails();
	}
	}


