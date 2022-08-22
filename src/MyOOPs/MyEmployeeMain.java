package MyOOPs;

public class MyEmployeeMain {
	public static void main(String[] args) {
		// Objects-1
		MyEmployee obj = new MyEmployee();// creating object
		obj.eid = 101;
		obj.eName = "Vi";
		obj.Salary = 50000;
		obj.DepartNo = 02;
		obj.Designation = "Manager";
		obj.display();

		// Object-2
		MyEmployee emp2 = new MyEmployee();// creating object
		emp2.eid = 102;
		emp2.eName = "Via";
		emp2.Salary = 90000;
		emp2.DepartNo = 02;
		emp2.Designation = "CEO";
		emp2.display();

	}


}
