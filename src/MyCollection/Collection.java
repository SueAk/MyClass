package MyCollection;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();

		names.add("Vihan");
		names.add("Viyona");
		names.add("Vi & Vi");
		System.out.println("All names: " + names.toString());
		System.out.println("2nd Name: " + names.get(1));
	}
}
