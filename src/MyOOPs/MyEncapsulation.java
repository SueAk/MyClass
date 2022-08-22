package MyOOPs;

public class MyEncapsulation {
	 private String sname;
	private String city;

public void getStudentDetails(String name, String location) {
	this.sname = name;
	this.city = location;
}

public void displayStudentDetails() {
	System.out.println("Student Name:" + sname);
	System.out.println("Student Location:" + city);
}
}
