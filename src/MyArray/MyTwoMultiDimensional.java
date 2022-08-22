package MyArray;

public class MyTwoMultiDimensional {

	public static void main(String[] args) {
		int a[][] = new int[3][2];
		// if we know size of rows and columns then use this method
		a[0][0] = 100;// [row]
		a[0][1] = 200;// [columns]

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;
//-------------------------------------------------------
		// if we don't know size of array use this method

		// int a [][]={{100,200},{300,400},{500,600}};

		System.out.println("Number of Rows:" + a.length);
		System.out.println("Number of Columns:" + a[0].length);
//------------------------------------------------------------
		// Outer for loop represent Row AND
		// Inner for loop represent Columns
		// for (int i = 0; i<a.length; i++) //Outer Loop
		// {
		// for (int j=0;j<a[i].length; j++)//Inner Loop
		// {
		// System.out.println(a[i][j]);
		// }
		// }
//----------------------------------------------------------------	
		// read values using enhanced/each for loop
		for (int r[] : a) {
			for (int i : r) {
				System.out.println(i);

			}

		}

//-----------------------------------------------------------------		

	}

}
