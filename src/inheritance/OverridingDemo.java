package inheritance;

public class OverridingDemo {
	public static void main(String[] args) {
		SportCar m1 = new SportCar();
		m1.brakes();		
	}
}

class A {} 
class B extends A{}

// Overriding Concept
// If parent and child having same signature mehtod,
// then child class override parent class method


// Rule 1 - Visibility - You cannot reduce the method visibility  public < protected < default < private
// Rule 2 - Return Type , you can return either same return type of subclass
// Rule 3 - You cannot override private and final methods -  // constant - which cannot be change
 
class Car{
	public final void brakes() {
		System.out.println("Car -> Brakes");
	}
}

class SportCar extends Car{
	public void brakes1() {
		System.out.println("SportCar -> Brakes");
	}
}

class Merc extends SportCar{
	public void brakes1() {
		System.out.println("Merc -> Brakes");
	}
}

