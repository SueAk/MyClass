package MyArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// How to declare array list

		 ArrayList list = new ArrayList();//we can store any type of elements
		// ArrayList<Integer> list = new ArrayList <<Integer> > ();// store only int

		//ArrayList<String> list = new ArrayList<String>();// String
//Adding value to ArrayList

		
		
		list.add("Amol");//0
		list.add("Vihan");//1
		list.add("Viyona");//2
		list.add("Supriya");//3
		list.add(100);
		list.add('v');
		
		//Size of ArrayList
		System.out.println(list.size());
		System.out.println("Before Removing elements :" + list);//
		
		//Remove an element
		list.remove(1);
		System.out.println(list.size());
		System.out.println("After Removing elements :" + list);//
		
		//Insert a new element into array list 
		list.add(3,"Katyare");;
		System.out.println(list.size());
		System.out.println("After insarting new elements :" + list);//	
		
		//read value from array list using foe loop
		//for (String s: list) 
		//{
		//	System.out.println(s);
		//}
		
		for (Object s: list) //object type variable can hold any type of value
			{
			System.out.println(s);
	}
	}

}
