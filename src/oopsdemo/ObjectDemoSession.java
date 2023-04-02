package oopsdemo;

public class ObjectDemoSession {

	public static void main(String[] args) {
		
		// to access static methods/variables, we need to use class.method name
//		B.sharedmethod();
		
		
	// to access non static method & instance variable , we need to 
	// create object first

//		for(int i = 1 ;i < 100 ; i++) {
//			B obj = new B(); 
//			obj.coremethod();	
//		}

//		obj.coremethod();
		
		B obj4 = new B();
		System.out.println( "obj4 : " + obj4);
		
		B obj5 = new B();
		System.out.println("obj5 : " +obj5);
		
		
		
		System.out.println("-------");
		obj5 = obj4;
		
		
		System.out.println( "obj4 : " + obj4);
		System.out.println("obj5 : " +obj5);
		
		B obj6 = new B();
		obj6.coremethod();
		obj6 = null;
		
		obj6.coremethod();
		
		
		// non ref object
		// garbage collection
		
	// jitni baar new keywork utne hi object banaenge 
		
		
		
		
//		obj.coremethod();
		
		// Object ?
		// 
		
		
	}
	
	
}
