package MyArray;

public class MySingleDimensionalArray {

	public static void main(String[] args) {
		// int a[] = new int[5];// declared array with size 5; starting index is 0; last
		// index is 4

		// storing || insarting value into array
		// a[0] = 110;
		// a[1] = 200;
		// a[2] = 300;
		// a[3] = 400;
		// a[4] = 500;
//-----------------------------------------------------------
		int a[] = { 100, 200, 300, 400, 500, 600 };// Declared an array without specifying size

		System.out.println("length of Array is: " + a.length);// print length || size of Array
//-------------------------------------------------------------
		System.out.println(a[3]); // read specific value only
//---------------------------------------------------------------
		//for // (int i= 0;i<a.length;i++)
		//(int i = 0; i <= a.length - 1; i++) {
			//System.out.println(a[i]);
		//}
//-------------------------------------------------------------------
		//read values using enhanced/each for loop
		for (int i: a) {
			System.out.println(i);
		}
		
		
		
		

	}

}
