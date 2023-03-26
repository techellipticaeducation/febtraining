package oopsdemo;

public class BlocksInJava {
	
	// static variables
	// static blocks
	// static methods
	
//	object
	// instance variable
	// instance blocks
	// non-static method
	
	// what is the first block when java code executes	
	
	// framework - qa
	// setting xyz
	
	public static void main(String[] args) {
		System.out.println("main method block");
		BlocksInJava obj1= new BlocksInJava();
		BlocksInJava obj2= new BlocksInJava();
		BlocksInJava obj3= new BlocksInJava();
	}
	
	static int i = 10;
	
	static{
		System.out.println(i);
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");	
	}
	
}
