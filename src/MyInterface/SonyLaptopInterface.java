package MyInterface;

public class SonyLaptopInterface implements LaptopInterface {

	public static void main(String[] args) {
		SonyLaptopInterface obj1 = new SonyLaptopInterface();
		obj1.displayTotalCost();
		obj1.getConfiguration();
		System.out.println("Laptop base price is: $" + LaptopInterface.basePrice);

	}

	public void getConfiguration() {
		System.out.println("This is get configuration method");

	}

	public void displayTotalCost() {
		System.out.println("This is display Total Cost method");

	}

}
