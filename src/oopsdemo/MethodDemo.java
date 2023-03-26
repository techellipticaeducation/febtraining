package oopsdemo;

public class MethodDemo {

	public static void main(String[] args) {
	
		MethodDemo d1 = new MethodDemo();
		for(int i = 1 ; i<=50;i++) {
			int squ = d1.provideMeSquare(i);
			System.out.println(i + " => " + squ);	
		}
		
	}
	
	// input = int value
	// return = square of that value (int)
	
	 int provideMeSquare (int a) {
		int square = a*a;
		return square;
	}
	
	// without any param - Non-param method
	static int getMeThisyear() {
		return 2023; 
	}
		
	// without any return type - void method
	static void getMeThisyear1() {
		return;	
	}
	
	static int provideMeCube (int a) {
		int cube = a*a*a;
		return cube;
	}
	
	static String ageGroup(int age) {
		if(age <= 18) {
			return "Child";
		}
		return "Adult";
	}
	
	
	// return keyword - it must be the last logical statement in method
	
	
}
