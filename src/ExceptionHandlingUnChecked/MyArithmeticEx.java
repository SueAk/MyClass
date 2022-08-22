package ExceptionHandlingUnChecked;

public class MyArithmeticEx {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Progran is in progress");

		int a = 100;
		//System.out.println(a/0);// Throw Arithmetic Exception
		
		
		String s=null;
		//System.out.println(s.length());// Throw NullPointer Exception
		
		String x="abc";
		//int i=Integer.parseInt(x);// Throw NumberFormatException
		
		int arr[]= new int[5];
        arr[10]=50;//Throw ArrayIndexOutOfBoundsException
        

		
		
		
		
				
		
		
		
		System.out.println("Program is complited");
		System.out.println("Program is exited");
	}

}
