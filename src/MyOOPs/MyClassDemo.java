package MyOOPs;

public class MyClassDemo {

	public static void main(String[] args) {
		smartWatch s1 = new smartWatch();
		s1.getwatchinfo("iwatch", "Apple", 550);
		s1.displayWatchinfo();
	}
}

class smartWatch {
	String watchName;
	String brand;
	int cost;

	void displayWatchinfo() {
		System.out.println("Name of the Watch:" + watchName);
		System.out.println("Brand name:" + brand);
		System.out.println("Price of the watch" + cost);
	}

	void getwatchinfo(String name, String brand, int price) {
		this.watchName = name;
		this.brand = brand;
		this.cost = price;

	}
}
