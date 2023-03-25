package oopsdemo;

public class VariableDemo {
	
	int i = 10; // instance - until Object there
	static int s = 20; // static - until your jvm is there
	
	public void test1() {
		
		System.out.println(i);
		System.out.println(s);
		
//		variable hiding
		int i = 30;   // local variable
		System.out.println(i);
		System.out.println(this.i);
	}
	// if you are using instance variable inside your method .
	// always use this keyword
	
	public static void test2() {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
//		VariableDemo d1 = new VariableDemo();
//		d1.test1();
		
		VariableDemo.test2();
		
	}
	
	// static method don't allow instance variables
	
	
	// static 
	// instance
	
	
	
}
