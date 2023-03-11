package febtraining;

public class ComparisonOperator {
	public static void main(String[] args) {
		// Comparison operator

		// return - boolean

		// > < >= <= == !=
		int i = 5;
		int j = 10;

		//		System.out.println(i < j); // false
		//		System.out.println(i > j); // false
		//		System.out.println(i <= j); // true
		//		System.out.println(i >= j); // true
		//		System.out.println(i == j); // true
		//		System.out.println(i != j); // false
		//		

		// bitwise operator - not intelligent
		// OR and AND

		//		AND  &
		// true true = true 
		// true false = false
		// false false = false
		// false true = false

		boolean b1 = i < j; // true
		boolean b2 = i <= j; // true

//		System.out.println(b1 & b2);
//		System.out.println((i < j) & (i <= j));

		// Logical Operator
		//		AND - &&
//		System.out.println(b1 && b2);
//		System.out.println((i < j) && (i <= j));

		System.out.println(returnTrue() || returnTrue());

		// Logical operator is faster then bitwise operator 
		
		// |
		// true true = true
		// true false = true
		// false true = true
		// false false = false
		
		
	}
	
	public static boolean returnTrue() {
		System.out.println("i am in true method");
		return true;
	}
	public static boolean returnFalse() {
		System.out.println("i am in false method");
		return false;
	}
	
	
}
