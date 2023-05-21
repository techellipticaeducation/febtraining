package inheritance;

public class OverridingDemo1 {
public static void main(String[] args) {
	HDFCBank bank1 = new HDFCBank();
	bank1.showInterest();
	
}
}
// Method Overriding 
// Rule 1 - you cannot reduce visibility
// public > protected > default > private

// Rule2 - private method cannot be overridden (no compile error) - scope
// Rule3 - final method cannot overridden , constant (will get compile error) - 
// if class is final -> we cannot implement inheritance to that, IS-A Relation - block
// what is final keyword 
// variable -> we cannot update variable value
// method -> we cannot override
// class -> we cannot extend that class

// Rule 4 - returntype - method can return same class object or subclass(child class) 
// parent class is parent of all classes? - Object
class Y{}
class Z extends Y{}
// parent - Y, child - Z

class Bank{
	public Object showInterest() {
		System.out.println("Bank -> showInterest");
		return null;
	}
}

class HDFCBank extends Bank{
	public Y showInterest() {
		System.out.println("HDFCBank -> showInterest");
		return null;
	}
}

