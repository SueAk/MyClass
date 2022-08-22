package MyOOPs;

public class MyStudentMain {

	public static void main(String[] args) {

		MyStudent stu = new MyStudent(23, "vi" ,'A');//(23."Vi",'A') because of [iii]assign values by using Constructor 

		// [i] assign values by using reference variable
		// stu.sid =23;
		// stu.sName="vi";
		// stu.grade='A';
		// stu.display();

		// [ii]assign values by using methods
		// stu.getValues(23, "Vi", 'A');
		// stu.display();

		stu.display();

	}

}
