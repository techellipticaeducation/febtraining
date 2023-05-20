package inheritance;

public class Test1 extends Test2{ // IS A RelationShip, Test1 IS A Test2
	
	int i = 30; // same class instance
	public void test6() {
		
		int i = 40; // local variable
		
//		Test2 t6 = new Test2();   // HAS-A RELATIONSHIP
//		System.out.println(t6.i);
//		
//		System.out.println(Test2.j);
		
		System.out.println(i); // 30 or 10
		System.out.println(this.i); // same class object
		System.out.println(super.i); // parent class object
		System.out.println(j);
		test1();
		test2();
		
		
		// Inheritance = parent complete property comes to child
		
		//Inheritance is unidirectional
		
	}
	
	public static void main(String[] args) {
	}
}

class Test2{
	int i = 10; // instance varibale - parent
	static int j;
	public void test1() {

	}
	public static void test2() {

	}
}

class Test3{
	int i = 10; // instance varibale - parent
	static int j;
	public void test1() {

	}
	public static void test2() {

	}
}