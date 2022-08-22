package MyOverriding;

class Bank// parent class
{
	double rateOfInterest() {// All body contain are same that is called Overriding
		return 0;
	}
}

class SBI extends Bank // child
{
	double rateOfInterest() { // All body contain are same that is called Overriding
		return 10.5;
	}
}

class BOFA extends Bank// child
{
	double rateOfInterest() {// All body contain are same that is called Overriding
		return 9.90;
	}
}

class HDFC extends Bank// child
{
	double rateOfInterest() {// method of definition should not change but body of definition should change
		return 11.5;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());

		BOFA bofa = new BOFA();
		System.out.println(bofa.rateOfInterest());

		HDFC hdfc = new HDFC();
		System.out.println(hdfc.rateOfInterest());

	}

}
