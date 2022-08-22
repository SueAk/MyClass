package MyOOPs;

public class MyStudent {
	int sid;
	String sName;
	char grade;

	MyStudent(int id, String name, char g) //Constructor
	{
		sid = id;
		sName = name;
		grade = g;
	}

	void getValues(int id, String name, char g)// methods
	// take the parameters and argument from main class
	{
		sid = id;
		sName = name;
		grade = g;
	}

	void display() // reference variable
	{
		System.out.println(sid + "  " + sName + "  " + grade);

	}

}
