package seleniumimplemention;

public class AbstractDemo {
public static void main(String[] args) {
	Car c1 = new Maruti();
	c1.brakes();
	c1.speed();
	
	Bank bank = new HDFC();
	bank.interestRate();
	//Car c2 = new Car(); // HAS-A RELATIONSHIP
	
}
}
// i want mandate rule - that child must override parent method
// abstract entity ka object - not possible 
//  abstract entity -> NO HAS-A RELATION , only IS-A Relationship
// HAS-A Relationship - not abstract 
// IS-A Relationship - not final

// abstraction
// abstract class - abstract and non-abstract (concrete ) -> partial abstraction
// interface - full abstraction
abstract class Car{
	public abstract void brakes();
	public void speed() {
		System.out.println("car class logic");
	}
	
}

class Maruti extends Car{
	public void brakes() {
		System.out.println("maruti brakes");
	}
}

interface Bank{
	int i = 10; // by default static and final 
	public void interestRate();
}

interface IndianBank{
	int i = 20;
	public void interestRate();	
}

class HDFC implements Bank,IndianBank {
	public void interestRate() {
		System.out.println(Bank.i);
		//Bank.i = 34;
	}
}


